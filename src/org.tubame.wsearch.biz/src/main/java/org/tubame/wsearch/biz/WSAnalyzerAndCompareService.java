/*
 * WSAnalyzerAndCompareService.java
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
package org.tubame.wsearch.biz;

import org.tubame.wsearch.biz.model.PhaseInbound;
import org.tubame.wsearch.biz.model.PhaseOutbound;

/**
 * It is a service class of the comparison process for the porting library and
 * analysis Migrated project.<br/>
 * Order to perform in WSearchAnalyzeAndCompareProcessor class analysis, the
 * comparison process, no special treatment in this class.<br/>
 */
public class WSAnalyzerAndCompareService implements WSPhaseService {

    /**
     * Constructor.<br/>
     * No operation.<br/>
     */
    public WSAnalyzerAndCompareService() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public PhaseOutbound execute(PhaseInbound inbound) {
        return null;
    }

}
