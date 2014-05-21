/*
 * PythonUtil.java
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
package tubame.portability.util;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.util.resource.ApplicationPropertyUtil;

/**
 * Utility class that manages the operation of external execution module Python.<br/>
 * Utility to manage the path module name of the Python.<br/>
 */
public class PythonUtil {
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(PythonUtil.class);

    /**
     * Character code of Python modules
     */
    public static final String PYTHON_CHARACTOR_CODE = "Shift-Jis";

    /**
     * Constructor.<br/>
     * It can not be instantiated from another class.<br/>
     * 
     */
    private PythonUtil() {
        super();
    }

    /**
     * Get the path of (exe) execution module of Python.<br/>
     * 
     * @return Path of Python executable EXE
     * @throws IOException
     *             plugin directory acquisition failure
     */
    public static String getPythonExePath() throws IOException {
        String temp = ApplicationPropertyUtil.PYTHON_RUNTIME_PATH;
        if (!new File(temp).isAbsolute()) {
            temp = PluginUtil.getResolvedPluginDir() + temp;
        }
        LOGGER.info(temp);
        return temp;
    }

    /**
     * Get the path of porting Python module search item.<br/>
     * 
     * @return Path of Python executable EXE
     * @throws IOException
     *             plugin directory acquisition failure
     */
    public static String getPythonSearchModulePath() throws IOException {
        String temp = PluginUtil.getResolvedPluginDir()
                + ApplicationPropertyUtil.PYTHON_SEARCH_MODULE_PATH;
        LOGGER.info(temp);
        return temp;
    }

    /**
     * Get the path of the search keyword file.<br/>
     * 
     * @param keywordFile
     *            Search Keyword files
     * @return Keyword file full path
     * @throws IOException
     *             plugin directory acquisition failure
     */
    public static String getSearchKeywordFilePath(String keywordFile)
            throws IOException {
//        String filePath = PluginUtil.getResolvedPluginDir() + keywordFile;
        String filePath = ProjectUtil.getCurrentProjectPath() + keywordFile;
        LOGGER.info(filePath);
        return filePath;
    }
}
