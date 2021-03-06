/*
 * KnowhowDataConvert.java
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
package tubame.knowhow.plugin.logic.convert;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import tubame.knowhow.biz.model.generated.knowhow.Appropriate;
import tubame.knowhow.biz.model.generated.knowhow.Category;
import tubame.knowhow.biz.model.generated.knowhow.CheckItem;
import tubame.knowhow.biz.model.generated.knowhow.KnowhowInfomation;
import tubame.knowhow.biz.model.generated.knowhow.LineNumberInfomation;
import tubame.knowhow.biz.model.generated.knowhow.PortabilityKnowhow.CategoryList;
import tubame.knowhow.biz.model.generated.knowhow.PortabilityKnowhow.KnowhowList;
import tubame.knowhow.biz.model.generated.knowhow.PortabilityKnowhow.SearchInfomationList;
import tubame.knowhow.biz.model.generated.knowhow.SearchInfomation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tubame.knowhow.biz.model.LineNumberEnum;

import tubame.knowhow.plugin.model.view.CategoryViewType;
import tubame.knowhow.plugin.model.view.CheckItemViewType;
import tubame.knowhow.plugin.model.view.KnowhowViewType;
import tubame.knowhow.plugin.model.view.PortabilityKnowhowListViewData;
import tubame.knowhow.plugin.model.view.PortabilityKnowhowListViewOperation;
import tubame.knowhow.plugin.model.view.SearchInfoViewType;

/**
 * converted each item to the know-how XML data.<br/>
 * Converted the know-how XML data to each item information that is registered
 * in the know-how entry view.<br/>
 * JDK7<br/>
 * 
 */
public class KnowhowDataConvert {
    /** Logger */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(KnowhowDataConvert.class);
    /** Category List */
    private CategoryList categoryList = new CategoryList();
    /** Know-how list */
    private KnowhowList knowhowList = new KnowhowList();
    /** Search information list */
    private SearchInfomationList searchInfomationList = new SearchInfomationList();
    /** Grant No map data and each key of know-how / category */
    private Map<String, BigInteger> knowhowNoMap = new LinkedHashMap<String, BigInteger>();

    /**
     * Convert to the know-how XML data.<br/>
     * Convert each item information that is registered in the know-how entry
     * view to the know-how XML data.<br/>
     * 
     * @param inputKnowhowEntry
     *            Know-how entry information
     */
    public void convert(
            List<PortabilityKnowhowListViewOperation> inputKnowhowEntry) {
        KnowhowDataConvert.LOGGER.debug("[inputKnowhowEntry]"
                + inputKnowhowEntry);
        for (PortabilityKnowhowListViewOperation knowhowListViewOperation : inputKnowhowEntry) {

            if (knowhowListViewOperation.isCategory()) {
                convertCategory(knowhowListViewOperation);
                if (!knowhowListViewOperation.getChildList().isEmpty()) {
                    convert(knowhowListViewOperation.getChildList());
                }

            } else if (knowhowListViewOperation.isKnowhow()) {
                convertKnowhow(knowhowListViewOperation);
            }
        }
    }

    /**
     * Convert know-how information to XML data know-how.<br/>
     * 
     * @param knowhowListViewOperation
     *            PortabilityKnowhowListViewOperation
     */
    private void convertKnowhow(
            PortabilityKnowhowListViewOperation knowhowListViewOperation) {
        KnowhowInfomation knowhowInfomation = new KnowhowInfomation();
        PortabilityKnowhowListViewData knowhowListViewData = (PortabilityKnowhowListViewData) knowhowListViewOperation;
        KnowhowViewType knowhowType = (KnowhowViewType) knowhowListViewData
                .getKnowhowViewType();
        knowhowInfomation.setKnowhowDetailRefKey(knowhowType
                .getKnowhowDetailRefKey());
        knowhowInfomation.setKnowhowId(knowhowType.getRegisterKey());
        knowhowInfomation.setKnowhowName(knowhowType.getRegisterName());
        knowhowInfomation.setKnowhowNo(obtainKnowhowNo(knowhowType
                .getRegisterKey()));
        convertCheckItem(knowhowInfomation,
                knowhowListViewOperation.getChildList());
        knowhowList.getKnowhowInfomations().add(knowhowInfomation);
    }

    /**
     * Converted check item information to the know-how XML data.<br/>
     * 
     * @param knowhowInfomation
     *            Know-how information
     * @param childList
     *            List<PortabilityKnowhowListViewOperation>
     */
    private void convertCheckItem(KnowhowInfomation knowhowInfomation,
            List<PortabilityKnowhowListViewOperation> childList) {
        BigInteger checkItemNo = new BigInteger("0");
        for (PortabilityKnowhowListViewOperation knowhowListViewOperation : childList) {
            checkItemNo = createNumber(checkItemNo);
            CheckItem checkItem = new CheckItem();
            PortabilityKnowhowListViewData knowhowListViewData = (PortabilityKnowhowListViewData) knowhowListViewOperation;
            CheckItemViewType checkItemType = (CheckItemViewType) knowhowListViewData
                    .getKnowhowViewType();
            checkItem.setCheckItemNo(checkItemNo);
            checkItem.setCheckItemId(checkItemType.getRegisterKey());
            checkItem.setSearchExistance(checkItemType.isSearchExistance());
            checkItem.setCheckItemName(checkItemType.getRegisterName());
            checkItem.setSearchProcess(checkItemType.getSearchProcess());
            checkItem.setPortabilityDegree(checkItemType
                    .getDegreeVariableViewToXml());
            checkItem.setDegreeDetail(checkItemType.getDegreeDetail());
            checkItem
                    .setPortabilityFactor(checkItemType.getPortabilityFactor());
            checkItem.setVisualConfirm(checkItemType.getVisualConfirm());
            checkItem.setHearingConfirm(checkItemType.getHearingConfirm());
            if (!knowhowListViewOperation.getChildList().isEmpty()) {
                checkItem.setSearchRefKey(checkItemType.getSearchRefKey());
                convertSearchInfo(knowhowListViewOperation.getChildList());
            }
            knowhowInfomation.getCheckItems().add(checkItem);
        }
    }

    /**
     * Convert search information to the know-how XML data.<br/>
     * 
     * @param childList
     *            List<PortabilityKnowhowListViewOperation>
     */
    private void convertSearchInfo(
            List<PortabilityKnowhowListViewOperation> childList) {

        for (PortabilityKnowhowListViewOperation knowhowListViewOperation : childList) {
            SearchInfomation searchInfomation = new SearchInfomation();
            PortabilityKnowhowListViewData knowhowListViewData = (PortabilityKnowhowListViewData) knowhowListViewOperation;
            SearchInfoViewType searchInfoType = (SearchInfoViewType) knowhowListViewData
                    .getKnowhowViewType();

            searchInfomation.setSearchInfoId(searchInfoType.getRegisterKey());
            searchInfomation.setFileType(searchInfoType.getFileType());
            searchInfomation.setSearchKey1(searchInfoType.getSearchKeyword1());
            searchInfomation.setSearchKey2(searchInfoType.getSearchKeyword2());
            searchInfomation.setPythonModule(searchInfoType.getPythonModule());
            searchInfomation
                    .setLineNumberInfomation(convertLineNumbrInfo(searchInfoType));
            searchInfomation.setAppropriate(convertAppropriate(searchInfoType));

            searchInfomationList.getSearchInfomations().add(searchInfomation);
        }
    }

    /**
     * Convert line number calculation information to the know-how XML data.<br/>
     * 
     * @param searchInfoType
     *            Search information
     * @return Line number calculation information
     */
    private Appropriate convertAppropriate(SearchInfoViewType searchInfoType) {
        Appropriate appropriate = new Appropriate();
        appropriate
                .setLineNumberAppropriate(searchInfoType.isAppropriateLine());
        appropriate.setAppropriateContents(searchInfoType
                .getAppropriateContext());
        return appropriate;
    }

    /**
     * Converted line number information to the know-how XML data.<br/>
     * 
     * @param searchInfoType
     *            Search information
     * @return Line number information
     */
    private LineNumberInfomation convertLineNumbrInfo(
            SearchInfoViewType searchInfoType) {
        LineNumberInfomation lineNumberInfomation = new LineNumberInfomation();
        convertLineNumber(searchInfoType, lineNumberInfomation);
        lineNumberInfomation.setLineNumberContents(searchInfoType
                .getLineNumberContents());
        lineNumberInfomation
                .setInvestigation(searchInfoType.getInvestigation());

        return lineNumberInfomation;
    }

    /**
     * Converted XML data line number to the know-how.<br/>
     * 
     * @param searchInfoType
     *            Search information
     * @param lineNumberInfomation
     *            Line number information
     */
    private void convertLineNumber(SearchInfoViewType searchInfoType,
            LineNumberInfomation lineNumberInfomation) {
        if (searchInfoType.getUnKnownLine().equals(
                LineNumberEnum.Empty.getName())) {
            lineNumberInfomation.setLineNumber(searchInfoType.getLineNumber());
        } else {
            lineNumberInfomation.setLineNumber(searchInfoType.getUnKnownLine());
        }
    }

    /**
     * Converted category information to the know-how XML data.<br/>
     * 
     * @param knowhowListViewOperation
     *            Category information
     */
    private void convertCategory(
            PortabilityKnowhowListViewOperation knowhowListViewOperation) {
        Category category = new Category();
        PortabilityKnowhowListViewData knowhowListViewData = (PortabilityKnowhowListViewData) knowhowListViewOperation;
        CategoryViewType categoryType = (CategoryViewType) knowhowListViewData
                .getKnowhowViewType();
        category.setCategoryId(categoryType.getRegisterKey());
        category.setCategoryName(categoryType.getRegisterName());
        category.setAppropriate(categoryType.isAppropriateFlag());
        category.getKnowhowRefKeies().addAll(categoryType.getKnowhowRefKeies());
        categoryList.getCategories().add(category);
        setKnowhowNoMap(categoryType.getKnowhowRefKeies());
    }

    /**
     * Get the know-how from No ID.<br/>
     * Get the No of interest from the data stored in the knowhowNoMap.<br/>
     * 
     * @param registerKey
     *            know-how ID
     * @return Know-how No
     */
    private BigInteger obtainKnowhowNo(String registerKey) {
        for (Map.Entry<String, BigInteger> entry : knowhowNoMap.entrySet()) {
            if (entry.getKey().equals(registerKey)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /**
     * Add the No and key to the Map from know-how reference key.<br/>
     * 
     * @param knowhowRefKeies
     *            Reference key know-how
     */
    private void setKnowhowNoMap(List<String> knowhowRefKeies) {
        BigInteger initNo = new BigInteger("0");
        for (String knowhowRefKey : knowhowRefKeies) {
            initNo = createNumber(initNo);
            knowhowNoMap.put(knowhowRefKey, initNo);
        }
    }

    /**
     * Generate the No of items.<br/>
     * 
     * @param itemNo
     *            Items No
     * @return Updated items No
     */
    private BigInteger createNumber(BigInteger itemNo) {
        int tempNo = itemNo.intValue();
        return BigInteger.valueOf(tempNo + 1);
    }

    /**
     * Get categoryList.<br/>
     * 
     * @return categoryList
     */
    public CategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * Get knowhowList.<br/>
     * 
     * @return knowhowList
     */
    public KnowhowList getKnowhowList() {
        return knowhowList;
    }

    /**
     * Get searchInfomationList.<br/>
     * 
     * @return searchInfomationList
     */
    public SearchInfomationList getSearchInfomationList() {
        return searchInfomationList;
    }
}
