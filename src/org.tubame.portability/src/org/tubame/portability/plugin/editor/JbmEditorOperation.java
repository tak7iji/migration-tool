/*
 * JbmEditorOperation.java
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
package org.tubame.portability.plugin.editor;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Point;

/**
 * Interface when the Editor is operated from outside such as Action or menu.<br/>
 */
public interface JbmEditorOperation {
    /**
     * Get the coordinates of the mouse right click.<br/>
     * 
     * @return Click coordinate
     */
    public Point getMouseClickPoint();

    /**
     * Get the selected object in the editor.<br/>
     * 
     * @return Selected object
     */
    public Object getSelectionObject();

    /**
     * Get the tree view on the data.<br/>
     * 
     * @return Tree view
     */
    public TreeViewer getTreeViewer();

    /**
     * When data changes, then Call this method to set whether it has been
     * changed in the Editor on.<br/>
     * 
     * @param isUpdate
     *            Change flag
     * 
     */
    public void setDirty(boolean isUpdate);
}
