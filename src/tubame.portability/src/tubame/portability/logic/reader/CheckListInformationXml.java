/*
 * CheckListInformationXml.java
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
package tubame.portability.logic.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.SAXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.exception.JbmException;
import tubame.portability.logic.CheckListInformationElements;
import tubame.portability.util.resource.ApplicationPropertyUtil;
import tubame.portability.util.resource.MessageUtil;

/**
 * Get a variety of description read, in XPATH the checklist information in XML
 * format.<br/>
 * Self Plugin / xml / checkListInformation.xml XML file (application properties
 * described).<br/>
 */
public class CheckListInformationXml implements CheckListInformationReader {

	private Map<String, String[]> map;

	private String projectPath;

	/**
	 * Adapter for speed improvement
	 */
	private static Map<String, String> checkEyeDescriptionList = new HashMap<String, String>();

	/**
	 * Adapter for speed improvement
	 */
	private static Map<String, String> hearingDescriptionList = new HashMap<String, String>();

	/**
	 * Logger
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CheckListInformationXml.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBigDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.big);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMiddleDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.middle);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getCheckEyeDescription(String no) throws JbmException {
		if (CheckListInformationXml.checkEyeDescriptionList.containsKey(no)) {
			return CheckListInformationXml.checkEyeDescriptionList.get(no);
		}
		String result = getText(no,
				CheckListInformationElements.visualConfirm);
		CheckListInformationXml.checkEyeDescriptionList.put(no, result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getHearingDescription(String no) throws JbmException {
		if (CheckListInformationXml.hearingDescriptionList.containsKey(no)) {
			return CheckListInformationXml.hearingDescriptionList.get(no);
		}
		String result = getText(no,
				CheckListInformationElements.hearingConfirm);
		CheckListInformationXml.hearingDescriptionList.put(no, result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getSearchDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.searchProcess);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFactorDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.portabilityFactor);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDegreeDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.degreeDetail);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAppropriateDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.appropriateContents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getInvestigationDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.Investigation);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLineNumberDescription(String no) throws JbmException {
		return getText(no, CheckListInformationElements.lineNumber);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLineNumberContentsDescription(String no)
			throws JbmException {
		return getText(no, CheckListInformationElements.lineNumberContents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void clearAdapter() {
		checkEyeDescriptionList.clear();
		hearingDescriptionList.clear();
	}

	/**
	 * If the document and map does not exist, <br/>
	 * after generating an instance, <br/>
	 * get the value of the location in the map.<br/>
	 * 
	 * @param location
	 *            Location
	 * @return Acquisition value at map
	 * @throws JbmException
	 *             map acquisition failure
	 */
	private String getText(String no, CheckListInformationElements lineNumberContents) throws JbmException {
		if (map == null) {
			throw new JbmException("getText" + MessageUtil.ERR_CONVERT_FILE_CLOSE);
		}
		return map.get(no)[lineNumberContents.ordinal()].trim();
	}

	/**
	 * Instantiation of the document and map.<br/>
	 */
	public void setInitila() throws ParserConfigurationException, SAXException,
			IOException {
		Path path = Paths.get(this.projectPath, ApplicationPropertyUtil.CHECK_LIST_INFORMATION_FILE_PATH);
		if (!Files.exists(path)) {
			LOGGER.warn("setInitila" + MessageUtil.ERR_CONVERT_FILE_CLOSE);
			return;
		}
		LOGGER.debug("CheckListInformationFile: "+path.toString());
		
		XMLInputFactory factory = XMLInputFactory.newInstance();
		String source = new String(Files.readAllBytes(path), ApplicationPropertyUtil.CHARSET_XML);

		map = new HashMap<String, String[]>(countDescription(factory, source));
		parseXML(factory, source);
	}

	private int countDescription(
			XMLInputFactory factory, String source) {
		int count = 0;
		XMLStreamReader reader = null;
		try {
			reader = factory.createXMLStreamReader(new BufferedReader(new StringReader(source)));
			
			
			while (reader.hasNext()) {
				reader.next();
				switch (reader.getEventType()) {
				case XMLStreamReader.START_ELEMENT:
					if (CheckListInformationElements.description.name().equals(reader
							.getLocalName())) {
						count++;
					}
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
			}
		}
		LOGGER.debug("Count of CheckListInformation nodes: " + count);
		return count;
	}

	@Override
	public void setProjectPath(String path) {
		this.projectPath = path;
	}

	private void parseXML(XMLInputFactory factory, String source) throws FactoryConfigurationError {
		XMLStreamReader reader = null;
		try {
			reader = factory.createXMLStreamReader(new BufferedReader(new StringReader(source)));

			String no;
			String[] elms;
			while (reader.hasNext()) {
				reader.next();
				switch (reader.getEventType()) {
				case XMLStreamReader.START_ELEMENT:
					if (CheckListInformationElements.description.name().equals(reader
							.getLocalName())) {
						no = reader.getAttributeValue(null,
								CheckListInformationElements.no.name());
						elms = addElms(reader);
						map.put(no, elms);
					}
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
			}
		}
	}

	private String[] addElms(XMLStreamReader reader)
			throws Exception {
		String[] elms = new String[CheckListInformationElements.size()];
		boolean end = false;
		String elm = null;
		String data = "";
		while (reader.hasNext() && end != true) {
			switch (reader.getEventType()) {
			case XMLStreamReader.START_ELEMENT:
				elm = reader.getLocalName();
				break;
			case XMLStreamReader.END_ELEMENT:
				if (CheckListInformationElements.description.name().equals(reader
						.getLocalName())) {
					end = true;
					continue;
				}
				elms[CheckListInformationElements.valueOf(elm).ordinal()] = data;
				data = "";
				break;
			case XMLStreamReader.CHARACTERS:
				data = reader.getText();
				break;
			}
			reader.next();
		}
		return elms;
	}
}
