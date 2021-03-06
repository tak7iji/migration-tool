/*
 * JbmEditorSortListener.java
 * Created on 2013/06/28
 *
 * Copyright (C) 2011-2013 Nippon Telegraph and Telephone Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tubame.portability.plugin.editor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.model.DifficultyEnum;
import tubame.portability.model.JbmEditorEnum;
import tubame.portability.model.JbmEditorMigrationRow;
import tubame.portability.plugin.action.ConfirmItemChangeAction;

/**
 * The ascending or descending order for the column below.<br/>
 * <br/>
 * No<br/>
 * Hits<br/>
 * Degree of difficulty (Low > Middle > High > Unknown)<br/>
 * Visual confirmation status (unconfirmed> confirmed (on transplant)> Confirmed
 * (porting required))<br/>
 * Bearings situation (unconfirmed> confirmed (on transplant)> Confirmed
 * (porting required))<br/>
 * 
 * @param <U>
 */
public class JbmEditorSortListener<U> implements SelectionListener {
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(JbmEditorSortListener.class);

    /**
     * Sort type
     */
    private int sortType = -1;

    /**
     * Last column sort value
     */
    private String previousValue;

    /**
     * View
     */
    private final MigrationEditorOperation editorOperation;

    /**
     * Constructor.<br/>
     * 
     * @param editorOperation
     *            Editor screen
     */
    public JbmEditorSortListener(MigrationEditorOperation editorOperation) {
        super();
        this.editorOperation = editorOperation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void widgetDefaultSelected(SelectionEvent e) {
        // no operation
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void widgetSelected(SelectionEvent e) {
        TreeColumn column = (TreeColumn) e.widget;
        LOGGER.debug("sort:" + column);
        Tree tree = column.getParent();
        TreeItem[] treeItems = tree.getItems();
        TreeColumn[] columns = tree.getColumns();
        tree.setSortColumn(column);
        int numOfColumns = columns.length;
        int columnIndex = IntStream.range(0, numOfColumns)
                .filter(n -> column.equals(columns[n])).findFirst().getAsInt();
        // Determination of the sort type
        setSortType(column.getText());
        // Sort run
        sort(column, tree, treeItems, numOfColumns, columnIndex);
    }

    /**
     * Sorting of each column.<br/>
     * After sorting, reflected in screen.<br/>
     * 
     * @param column
     *            Target column
     * @param tree
     *            Tree
     * @param treeItems
     *            Tree items
     * @param numOfColumns
     *            Whole number of columns
     * @param columnIndex
     *            Target column Index
     */
    private void sort(TreeColumn column, Tree tree, TreeItem[] treeItems,
            int numOfColumns, int columnIndex) {
        tree.setSortDirection(sortType);
        Function<TreeItem, ?> keyExtractor = t -> {
            String keyString = t.getText(columnIndex).trim();
            Object key = keyString;
            switch (JbmEditorEnum.get(columnIndex)) {
            case INDEX_NO:
                break;
            case HIT_NUM:
                key = Integer.valueOf(keyString);
                break;
            case DIFFICULTY:
                key = DifficultyEnum.get(keyString).getSortWeight();
                break;
            case VISUAL_CONFIRM_STATSU_ITEM:
            case HIARING_STATUS:
                key = ConfirmItemChangeAction.OK.equals(keyString) ? 1 : 0;
                break;
            case LINE_NUM:
                key = Optional.ofNullable(keyString).map(Integer::valueOf).orElse(-1);
                break;
            default:
                break;
            }
            return key;
        };

        ToIntBiFunction<String[], String[]> arrayComparator = (a1, a2) -> {
            OptionalInt ret = IntStream
                    .range(0, Integer.min(a1.length, a2.length))
                    .map(i -> Integer.compare(Integer.parseInt(a1[i]),
                            Integer.parseInt(a2[i]))).filter(r -> r != 0)
                    .findFirst();
            return (ret.isPresent()) ? ret.getAsInt() : Integer.compare(
                    a1.length, a2.length);
        };

        ToIntBiFunction<String, String> numComparator = (v1, v2) -> {
            // null, blank check
            Predicate<String> tester = v -> Optional.ofNullable(v).orElse("")
                    .isEmpty();
            boolean isNullOrEmpty1 = tester.test(v1);
            boolean isNullOrEmpty2 = tester.test(v2);
            if (isNullOrEmpty1 | isNullOrEmpty2) {
                return Boolean.compare(isNullOrEmpty2, isNullOrEmpty1);
            }

            // Separated by a hyphen-separated
            String[] temp1 = v1.split("-");
            String[] temp2 = v2.split("-");

            UnaryOperator<String[]> conv = a -> (!temp1[0].equals(temp2[0])) ? a[0]
                    .split("\\.") : Arrays.copyOfRange(a, 1, a.length);
            // Compare chapter number
            return arrayComparator.applyAsInt(conv.apply(temp1),
                    conv.apply(temp2));
        };

        Comparator<TreeItem> comp2 = Comparator.comparing(keyExtractor,
                (v1, v2) -> {
                    if (v1 instanceof Integer) {
                        return Integer.compare((Integer) v1, (Integer) v2);
                    }
                    return numComparator.applyAsInt((String) v1, (String) v2);
                });

        Arrays.sort(treeItems, sortType == SWT.UP ? comp2.reversed() : comp2);

        TreeViewer treeViewer = editorOperation.getTreeViewer();
        // Reflected in the tree treeItems that are sorted
        Arrays.stream(treeItems).forEach(
                t -> {
                    TreeItem item = new TreeItem(tree, SWT.NONE);
                    item.setText(IntStream.range(0, numOfColumns)
                            .mapToObj(t::getText).toArray(String[]::new));
                    item.setImage(IntStream.range(0, numOfColumns)
                            .mapToObj(t::getImage).toArray(Image[]::new));
                    item.setFont(t.getFont());

                    swapTreeItemChild(t, item);
                    t.dispose();
                });
        // After being sorted, since the the first level only is displayed,
        // is performed the first level minute loop to re-display
        @SuppressWarnings("unchecked")
        List<JbmEditorMigrationRow> topList = (List<JbmEditorMigrationRow>) editorOperation
                .getTreeViewer().getInput();
        topList.forEach(e -> treeViewer.refresh(e));
    }

    /**
     * Set child level when sorting.<br/>
     * 
     * @param treeItems
     *            Tree items
     * @param treeItemParent
     *            Parent tree
     * @param count
     *            Counter value
     */
    private void swapTreeItemChild(TreeItem treeItem, TreeItem treeItemParent) {
        treeItemParent.setData(treeItem.getData());
        new TreeItem(treeItemParent, SWT.NONE);
        return;
    }

    /**
     * Set the sort type.<br/>
     * Set member variable (sortType / previousValue) the type of sort to do
     * next.<br/>
     * 
     * @param clickTargetName
     *            Click column name
     */
    private void setSortType(String clickTargetName) {
        if (clickTargetName.equals(previousValue)) {
            // If the same
            if (sortType == -1) {
                // Descending order if it is the first click
                sortType = SWT.UP;
            } else {
                if (sortType == SWT.DOWN) {
                    sortType = SWT.UP;
                } else {
                    sortType = SWT.DOWN;
                }
            }
        } else {
            // The descending order if not the same as the previous column
            sortType = SWT.UP;
        }
        previousValue = clickTargetName;
    }
}
