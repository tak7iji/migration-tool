/*
 * SearchToolWithProgress.java
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
package tubame.portability.logic.search;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.plugin.wizard.AbstractSearchToolWithProgress;
import tubame.portability.util.PythonUtil;
import tubame.portability.util.resource.MessageUtil;

/**
 * Class to perform the search process.<br/>
 * Delegated to {@link AbstractSearchToolWithProgress} is the actual processing.<br/>
 * This class provides the acquisition of Python path, get the Python module,
 * progress title, <br/>
 * the search results file acquisition function.<br/>
 */
public class SearchToolWithProgress extends AbstractSearchToolWithProgress {
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(SearchToolWithProgress.class);

    /**
     * Constructor.<br/>
     * Constructor reference of {@link AbstractSearchToolWithProgress}<br/>
     * 
     * @param target
     *            Search directory
     * @param keywordFilePath
     *            Search files
     * @param outFilePath
     *            Search result output destination file path
     */
    public SearchToolWithProgress(String target, String keywordFilePath,
            String outFilePath, String projectPath) {
        super(target, keywordFilePath, outFilePath, projectPath);
    }

    public SearchToolWithProgress(String target, String keywordFilePath,
            String outFilePath) {
        super(target, keywordFilePath, outFilePath);

        LOGGER.debug("[target]" + target + "[keywordFilePath]"
                + keywordFilePath + "[outFilePath]" + outFilePath);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPythonExePath() throws IOException {
        return PythonUtil.getPythonExePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPythonModulePath() throws IOException {
        return PythonUtil.getPythonSearchModulePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProgressTitle() {
        return MessageUtil.INF_SEARCH_RUNNING;
    }

}
