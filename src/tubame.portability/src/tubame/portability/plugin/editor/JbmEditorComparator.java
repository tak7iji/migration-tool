/*
 * JbmEditorComparator.java
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

import java.util.Optional;
import java.util.function.ToIntBiFunction;

import tubame.portability.model.DifficultyEnum;
import tubame.portability.model.JbmEditorEnum;
import tubame.portability.plugin.action.ConfirmItemChangeAction;
import tubame.portability.util.StringUtil;

/**
 * Sort implementation class of JBM editors.<br/>
 * Comparison of each column.<br/>
 */
public class JbmEditorComparator extends AbstractEditorComparator {

    /**
     * Serial version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.<br/>
     * 
     * @param asc
     * @see {@link AbstractEditorComparator#AbstractEditorComparator(boolean, String, int)}
     * @param column
     * @see {@link AbstractEditorComparator#AbstractEditorComparator(boolean, String, int)}
     * @param columnIndex
     * @see {@link AbstractEditorComparator#AbstractEditorComparator(boolean, String, int)}
     */
    public JbmEditorComparator(/* boolean asc,*/ String column, int columnIndex) {
        super(/*asc,*/ column, columnIndex);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int jbmEditorCompare(int index, String value1, String value2) {
        int nRet = 0;
        // "No"
        ToIntBiFunction<String, String> numComparator = (v1, v2) -> {
            // null, blank check
            boolean isNullOrEmpty1 = Optional.ofNullable(v1).orElse("").equals("");
            boolean isNullOrEmpty2 = Optional.ofNullable(v2).orElse("").equals("");
            if (isNullOrEmpty1 | isNullOrEmpty2) {
                return Boolean.compare(isNullOrEmpty2, isNullOrEmpty1);
            }

            // Separated by a hyphen-separated
            String[] temp1 = v1.split(StringUtil.HYPHEN);
            String[] temp2 = v2.split(StringUtil.HYPHEN);

            // Compare chapter number
            if (!temp1[0].equals(temp2[0])) {
                // Chapter number is a mismatch
                // Comparison by dividing a period separated the chapter number
                String[] chapNo1 = temp1[0].split("\\.");
                String[] chapNo2 = temp2[0].split("\\.");
                int len = chapNo1.length <= chapNo2.length ? chapNo1.length
                        : chapNo2.length;
                for (int i = 0; i < len; i++) {
                    int ret = Integer.compare(Integer.parseInt(chapNo1[i]),
                            Integer.parseInt(chapNo2[i]));
                    if (ret != 0) {
                        return ret;
                    }
                }
                if (chapNo1.length < chapNo2.length) {
                    // If the chapter number of Target 1 is short, Target 2 is large
                    return -1;
                } else if (chapNo1.length > chapNo2.length) {
                    // If the chapter number of Target 2 is shorter, Target 1 is
                    // greater
                    return 1;
                }
            } else {
                // Chapter numbers match
                // Compare lower No
                int len = temp1.length <= temp2.length ? temp1.length
                        : temp2.length;
                for (int i = 1; i < len; i++) {
                    int ret = Integer.compare(Integer.parseInt(temp1[i]),
                            Integer.parseInt(temp2[i]));
                    if (ret != 0) {
                        return ret;
                    }
                }
                if (temp1.length < temp2.length) {
                    // If Target 1 is short, Target 2 is large
                    return -1;
                } else if (temp1.length > temp2.length) {
                    // If Target 2 is a short, Target 1 is greater
                    return 1;
                }
            }

            // Exact match
            return 0;
        };
        
        ToIntBiFunction<String, String> lineNumComparator = (v1, v2) -> {
            int nRet2 = 0;
            String data1 = v1 != null && !v1.isEmpty() ? v1 : "-1";
            String data2 = v2 != null && !v2.isEmpty() ? v2 : "-1";
            boolean isNumber1 = true;
            boolean isNumber2 = true;
            int num1 = 0;
            int num2 = 0;
            try {
                num1 = Integer.valueOf(data1);
            } catch (NumberFormatException e) {
                isNumber1 = false;
            }
            try {
                num2 = Integer.valueOf(data2);
            } catch (NumberFormatException e) {
                isNumber2 = false;
            }
            // Both numbers
            if (isNumber1 && isNumber2) {
                nRet2 = Integer.compare(num1, num2);
            }
            // Both string
            else if (!isNumber1 && !isNumber2) {
                nRet2 = data1.compareTo(data2);
            }
            // Left-hand side is a string
            else if (!isNumber1) {
                nRet2 = 1;
            }
            // Right-hand side is a string
            else {
                nRet2 = -1;
            }
            return nRet2;
        };
        
        if (index == JbmEditorEnum.INDEX_NO.getCode()) {
            return numComparator.applyAsInt(value1, value2);
        }
        // "Count"
        if (index == JbmEditorEnum.HIT_NUM.getCode()) {
            return Integer.compare(Integer.parseInt(value1),
                    Integer.parseInt(value2));
        }
        // "Degree of difficulty"
        if (index == JbmEditorEnum.DIFFICULTY.getCode()) {
            return Integer.compare(DifficultyEnum.get(value1).getSortWeight(),
                    DifficultyEnum.get(value2).getSortWeight());
        }
        // Visual confirmation" or "confirmation hearing"
        if (index == JbmEditorEnum.VISUAL_CONFIRM_STATSU_ITEM.getCode()
                || index == JbmEditorEnum.HIARING_STATUS.getCode()) {
            int data1 = 2;
            int data2 = 2;
            if (ConfirmItemChangeAction.OK.equals(value1)) {
                data1 = 1;
            }
            if (ConfirmItemChangeAction.OK.equals(value2)) {
                data2 = 1;
            }
            if (ConfirmItemChangeAction.NG.equals(value1)) {
                data1 = 0;
            }
            if (ConfirmItemChangeAction.NG.equals(value2)) {
                data2 = 0;
            }
            return Integer.compare(data1, data2);
        }
        // Number of lines
        if (index == JbmEditorEnum.LINE_NUM.getCode()) {
            return lineNumComparator.applyAsInt(value1, value2);
        }
        return nRet;
    }
}
