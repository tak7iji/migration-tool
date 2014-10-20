/*
 * ConvertSearchToolWithProgress.java
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
import tubame.portability.util.CsvUtil;
import tubame.portability.util.FileUtil;
import tubame.portability.util.PythonUtil;
import tubame.portability.util.StringUtil;
import tubame.portability.util.resource.MessageUtil;

/**
 * Class for converting search process.<br/>
 * The actual processing is delegated to {@link AbstractSearchToolWithProgress}.<br/>
 * This class provides the acquisition of Ptyhon path, get the Python module,
 * progress title, <br/>
 * the search results file acquisition function.<br/>
 */
public class ConvertSearchToolWithProgress extends
        AbstractSearchToolWithProgress {
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(ConvertSearchToolWithProgress.class);

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
    public ConvertSearchToolWithProgress(String target, String keywordFilePath,
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

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isTargetFilePath(String line) {
        if (CsvUtil.parseCsv(line).size() < 2) {
            return false;
        }
        if (!FileUtil.fileExists(CsvUtil.getSpecificColumn(line, 1))) {
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected StringBuilder createAddColums(String line) {
        String factor = ""; // Porting factor
        String detail = ""; // Degree of difficulty
        String lineNum = ""; // Number of lines
        String lineNumContents = ""; // Line number basis
        String totalLine = "0"; // Total line

        // Add the initial value data of the check list for the Python execution
        // result,
        // to set the null at read the CSV
        StringBuilder addColums = new StringBuilder();
        addColums.append(StringUtil.CSV_DELIMITER);
        addColums.append(factor);
        addColums.append(StringUtil.CSV_DELIMITER);
        addColums.append(detail);
        addColums.append(StringUtil.CSV_DELIMITER);
        addColums.append(lineNum);
        addColums.append(StringUtil.CSV_DELIMITER);
        addColums.append(lineNumContents);
        addColums.append(StringUtil.CSV_DELIMITER);
        addColums.append(totalLine);

        return addColums;
    }

}
