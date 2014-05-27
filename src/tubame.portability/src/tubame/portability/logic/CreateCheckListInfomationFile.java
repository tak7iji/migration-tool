/*
 * CreateCheckListInfomationFile.java
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
package tubame.portability.logic;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import tubame.knowhow.biz.logic.converter.PortabilityKnowhowConverter;
import tubame.knowhow.biz.model.generated.knowhow.Category;
import tubame.knowhow.biz.model.generated.knowhow.Chapter;
import tubame.knowhow.biz.model.generated.knowhow.CheckItem;
import tubame.knowhow.biz.model.generated.knowhow.ChildChapter;
import tubame.knowhow.biz.model.generated.knowhow.KnowhowInfomation;
import tubame.knowhow.biz.model.generated.knowhow.SearchInfomation;

import tubame.portability.exception.JbmException;
import tubame.portability.model.CheckListInformation;
import tubame.portability.util.StringUtil;
import tubame.portability.util.resource.ApplicationPropertyUtil;
import tubame.portability.util.resource.MessageUtil;

/**
 * Make the generation of checklist information know-how from an XML file XML.<br/>
 */
public class CreateCheckListInfomationFile {
	/**
	 * Heading tag information list
	 */
	private static List<Chapter> chapterList = null;

	/**
	 * Map of the category list
	 */
	private static Map<String, Category> categoryMap = null;

	/**
	 * Map of know-how list
	 */
	private static Map<String, KnowhowInfomation> knowhowMap = null;

	/**
	 * Map of search information
	 */
	private static Map<String, SearchInfomation> searchInfoMap = null;

	/**
	 * Attributes of XML (checkListInfomation)
	 */
	private static final String ROOT_ELEMENT = "checkListInformation";
	/**
	 * Attributes of XML (description)
	 */
	public static final String DESCRIPTION = "description";
	/**
	 * Attributes of XML (no)
	 */
	public static final String NO = "no";
	/**
	 * Attributes of XML (big: large item)
	 */
	public static final String BIG = "big";
	/**
	 * Attributes of XML (middle: in item)
	 */
	public static final String MIDDLE = "middle";
	/**
	 * Attributes of XML (visualConfirm: visual confirmation)
	 */
	public static final String VISUAL_CONFIRM = "visualConfirm";
	/**
	 * Attributes of XML (hearingConfirm: Confirmation hearing)
	 */
	public static final String HEARING_CONFIRM = "hearingConfirm";
	/**
	 * Attributes of XML (searchProcess: Search Procedure)
	 */
	public static final String SEARCH_PROCESS = "searchProcess";
	/**
	 * Attributes of XML (portabilityFactor: transplant factor)
	 */
	public static final String PORTABILITY_FACTOR = "portabilityFactor";
	/**
	 * Attributes of XML (degreeDetail: difficulty details)
	 */
	public static final String DEGREE_DETAIL = "degreeDetail";
	/**
	 * Attributes of XML (appropriateContents: recorded required)
	 */
	public static final String APPROPPRIATE = "appropriateContents";
	/**
	 * Attributes of XML (Investigation: line census method)
	 */
	public static final String INVESTIGATION = "Investigation";
	/**
	 * Attributes of XML (lineNumber: number of lines)
	 */
	public static final String LINE_NUMBER = "lineNumber";
	/**
	 * Attributes of XML (lineNumberContents: line number basis)
	 */
	public static final String LINE_NUMBER_CONTENTS = "lineNumberContents";

	/**
	 * Line number calculation flag
	 */
	private static boolean calculationFlag;

	/**
	 * Convert to the checklist information know-how from an XML file XML.<br/>
	 * 
	 * @param convert
	 *            PortabilityKnowhowConverter
	 * @throws JbmException
	 *             Portable study tool exception
	 */
	public static void xmlToXml(PortabilityKnowhowConverter convert,
			String projectPath) throws JbmException {
		XMLOutputFactory factory = XMLOutputFactory.newInstance();

		String xmlOutPath = projectPath
				+ ApplicationPropertyUtil.CHECK_LIST_INFORMATION_FILE_PATH;

		BufferedOutputStream bos = null;
		XMLStreamWriter writer = null;
		try {
			bos = new BufferedOutputStream(
					new FileOutputStream(xmlOutPath));
			writer = factory.createXMLStreamWriter(bos, ApplicationPropertyUtil.CHARSET_XML);

			Map<String, CheckListInformation> xmlList = null;

			// Map generation of each knowhow list
			convert.createProtabilityKnowhow();
			chapterList = convert.getChapterList();
			categoryMap = convert.getCategoryMap();
			knowhowMap = convert.getKnowhowMap();
			searchInfoMap = convert.getSearchInfoMap();

			// Get the contents of the checkListInfomation.xml
			xmlList = getCheckListInfoData();

			// Start XML Writing
			writer.writeStartDocument(ApplicationPropertyUtil.CHARSET_XML, "1.0");

			// Create checkListInformation node, add to document
			writer.writeStartElement(ROOT_ELEMENT);

			for (Map.Entry<String, CheckListInformation> xml : xmlList
					.entrySet()) {
				// description
				writer.writeStartElement(DESCRIPTION);
				writer.writeAttribute(NO, xml.getKey());

				// Large category
				writer.writeStartElement(BIG);
				writer.writeCharacters(xml.getValue().getBigText());
				writer.writeEndElement();

				// Intermediate category
				writer.writeStartElement(MIDDLE);
				writer.writeCharacters(xml.getValue().getMiddleText());
				writer.writeEndElement();

				// Visual confirmation
				writer.writeStartElement(VISUAL_CONFIRM);
				writer.writeCharacters(xml.getValue().getCheckEyeText());
				writer.writeEndElement();

				// Confirmation hearing
				writer.writeStartElement(HEARING_CONFIRM);
				writer.writeCharacters(xml.getValue().getHearingText());
				writer.writeEndElement();

				// Search procedure
				writer.writeStartElement(SEARCH_PROCESS);
				writer.writeCharacters(xml.getValue().getSearchText());
				writer.writeEndElement();

				// Porting factor
				writer.writeStartElement(PORTABILITY_FACTOR);
				writer.writeCharacters(xml.getValue().getFactorText());
				writer.writeEndElement();

				// Difficulty details
				writer.writeStartElement(DEGREE_DETAIL);
				writer.writeCharacters(xml.getValue().getDegreeDetailText());
				writer.writeEndElement();

				// Required fields recorded
				writer.writeStartElement(APPROPPRIATE);
				writer.writeCharacters(xml.getValue().getAppropriateText());
				writer.writeEndElement();

				// Investigative method
				writer.writeStartElement(INVESTIGATION);
				writer.writeCharacters(xml.getValue().getInvestText());
				writer.writeEndElement();

				// Number of lines
				writer.writeStartElement(LINE_NUMBER);
				writer.writeCharacters(xml.getValue().getLineNumberText());
				writer.writeEndElement();

				// Line number basis
				writer.writeStartElement(LINE_NUMBER_CONTENTS);
				writer.writeCharacters(xml.getValue()
						.getLineNumberContentsText());
				writer.writeEndElement();

				// End of description
				writer.writeEndElement();
			}

			// End of checkListInformation
			writer.writeEndElement();

			// End of Document
			writer.writeEndDocument();

			writer.flush();
		} catch (Exception e) {
			throw new JbmException(MessageUtil.ERR_CONVERT_KNOWHOW_XML, e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (XMLStreamException e) {
				}
			}
		}
	}

	/**
	 * Get the information of the parent checklist information XML.<br/>
	 * 
	 * @return Map<String, CheckListInformation>
	 */
	private static Map<String, CheckListInformation> getCheckListInfoData() {
		Map<String, CheckListInformation> listMap = new LinkedHashMap<String, CheckListInformation>();
		String big;

		// 1.ChapterList
		for (Chapter chapter : chapterList) {
			calculationFlag = false;
			// <Large item>
			big = chapter.getChapterName();

			// 2.ChildChapter
			List<ChildChapter> children = chapter.getChildChapters();
			getChildrenInfoData(children, listMap, big);
		}
		return listMap;
	}

	/**
	 * Get the child hierarchical data of checklist information.<br/>
	 * 
	 * @param children
	 *            Child hierarchical data
	 * @param listMap
	 *            Map<String, CheckListInformation>
	 * @param big
	 *            Large category
	 */
	private static void getChildrenInfoData(List<ChildChapter> children,
			Map<String, CheckListInformation> listMap, String big) {
		String childChapNo;
		BigInteger knowhowNo;
		BigInteger checkItemNo;
		String mid;
		String visual;
		String hearing;
		String proc;
		String factor;
		String detail;

		String lineNum;
		String lineNumContent;
		String invest;

		String approp;

		for (ChildChapter childChapter : children) {
			// No (heading No. Category No)
			childChapNo = childChapter.getChildCapterNo();

			String cateRefKey = childChapter.getChapterCategoryRefKey();
			// 3.CategoryList
			for (Map.Entry<String, Category> category : categoryMap.entrySet()) {
				// Mapping and determination of CategoryList ChapterList
				String categoryId = category.getKey();
				if (cateRefKey.equals(categoryId)) {
					if (!category.getValue().isAppropriate()) {
						calculationFlag = true;
					}

					for (String knowhowRefKey : category.getValue()
							.getKnowhowRefKeies()) {
						// <Active items>
						mid = category.getValue().getCategoryName();

						// 4.KnowhowList
						for (Map.Entry<String, KnowhowInfomation> knowhow : knowhowMap
								.entrySet()) {

							// Mapping and determination of KnowhowList
							// CategoryList
							String knowhowId = knowhow.getKey();
							if (knowhowRefKey.equals(knowhowId)) {
								// No (know-how No)
								knowhowNo = knowhow.getValue().getKnowhowNo();

								// 5.CheckItem
								for (CheckItem checkItem : knowhow.getValue()
										.getCheckItems()) {

									// No (check item No)
									checkItemNo = checkItem.getCheckItemNo();
									// <Visual confirmation>
									visual = checkItem.getVisualConfirm();
									// <Hearing Contents>
									hearing = checkItem.getHearingConfirm();
									// <Search procedure>
									proc = checkItem.getSearchProcess();
									// <Transplant factor>
									factor = checkItem.getPortabilityFactor();
									// <Difficulty details>
									detail = checkItem.getDegreeDetail();

									String searchRefKey = checkItem
											.getSearchRefKey();

									// Decision of whether or not search
									// information registration
									if (searchRefKey == null) {
										// Skip search for information without
										// registration
										continue;
									}

									// 6.SearchInfomationList
									for (Map.Entry<String, SearchInfomation> search : searchInfoMap
											.entrySet()) {

										String searchInfoId = search.getKey();
										// Mapping and determination of
										// SearchInfomationList KnowhowList
										if (searchRefKey.equals(searchInfoId)) {
											// <Number of lines>
											lineNum = CreateCheckListInfomationFile
													.getLineNum(search);
											// <Line number basis>
											lineNumContent = search.getValue()
													.getLineNumberInfomation()
													.getLineNumberContents();
											// Line census method>
											invest = search.getValue()
													.getLineNumberInfomation()
													.getInvestigation();
											// Recorded Required fields>
											if (!search.getValue()
													.getAppropriate()
													.isLineNumberAppropriate()) {
												// If there is no line number
												// calculation and set the
												// non-calculated description
												approp = search
														.getValue()
														.getAppropriate()
														.getAppropriateContents();
											} else {
												// When there is a number of
												// lines calculated and set to
												// an empty
												approp = StringUtil.EMPTY;
											}
											/**
											 * It contains the contents of
											 * CheckListInfomation.xml
											 */
											String no = childChapNo + "-"
													+ knowhowNo + "-"
													+ checkItemNo;
											CheckListInformation xmlValue = new CheckListInformation(
													big, mid, visual, hearing,
													proc, factor, detail,
													approp, invest, lineNum,
													lineNumContent);
											listMap.put(no, xmlValue);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
			List<ChildChapter> moreChildren = childChapter.getChildChapters();
			if (moreChildren.size() > 0) {
				getChildrenInfoData(moreChildren, listMap, big);
			} else {
				calculationFlag = false;
			}
		}
	}

	/**
	 * Get the number of lines.<br/>
	 * 
	 * @param search
	 *            Search Info Map
	 * @return Number of lines
	 */
	private static String getLineNum(Entry<String, SearchInfomation> search) {
		if (!calculationFlag
				&& search.getValue().getAppropriate().isLineNumberAppropriate()) {
			return search.getValue().getLineNumberInfomation().getLineNumber();
		}
		return "0";
	}
}
