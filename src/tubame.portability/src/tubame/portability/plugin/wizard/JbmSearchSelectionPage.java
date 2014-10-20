/*
 * JbmSearchSelectionPage.java
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
package tubame.portability.plugin.wizard;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tubame.portability.logic.reader.CheckListInformationXml;
import tubame.portability.util.FileUtil;
import tubame.portability.util.PluginUtil;
import tubame.portability.util.StringUtil;
import tubame.portability.util.resource.ApplicationPropertyUtil;
import tubame.portability.util.resource.MessageUtil;
import tubame.portability.util.resource.ResourceUtil;

/**
 * Wizard page class of search input screen.<br/>
 * Define screen label message page.<br/>
 */
public class JbmSearchSelectionPage extends AbstractJbmSelectionPage {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(JbmSearchSelectionPage.class);

	/**
	 * Resources to be processed
	 */
	private IResource resource;

	/**
	 * Jbm path of the file to be output
	 */
	private Text outJbmFileText;

	/**
	 * Know-how XML file path
	 */
	private Combo knowhowText;

	/**
	 * Constructor.<br/>
	 * Initializes the resource to be processed.<br/>
	 * 
	 * @param resource
	 *            Resources to be processed
	 */
	public JbmSearchSelectionPage(IResource resource) {
		this.resource = resource;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getTargetText() {
		return resource.getProject().getName() + FileUtil.FILE_SEPARATOR
				+ resource.getProjectRelativePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getConfirmString() {
		return MessageUtil.QUE_SEARCH_UPDATE_CONFIRM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getKnowhowXmlFileLabelString() {
		return ResourceUtil.SELECT_KNOWHOW_XML_FILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getReferenceButtonLabelString() {
		return ResourceUtil.REFERENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getErrorFileUpdateConfirm() {
		return MessageUtil.INF_SEARCH_CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getOutFilePath() {
		return StringUtil.getText(outJbmFileText);
	}

	/**
	 * Get the know-how XML file path.<br/>
	 * 
	 * @return knowhowXmlText Know-how XML file path
	 */
	public String getKnowhowXmlFilePath() {
		return StringUtil.getText(knowhowText);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitleMessage() {
		return ResourceUtil.WIZ_TITLE_SEARCH;
	}

	/**
	 * Get the path of jbm file to be output.<br/>
	 * 
	 * @return outJbmFileText Jbm path of the file to be output
	 */
	public String getOutJbmFileText() {
		return StringUtil.getText(outJbmFileText);
	}

	/**
	 * Get jbm default file name.<br/>
	 * 
	 * @return Jbm default file name
	 */
	public String getDefaultJbm() {
		return ApplicationPropertyUtil.DEFAULT_JBM_NAME;
	}

	/**
	 * Get the know-how default XML file name.<br/>
	 * 
	 * @return Jbm default file name
	 */
	public String getDefaultXml() {
		return ApplicationPropertyUtil.DEFAULT_KNOWHOW_FILE_NAME;
	}

	/**
	 * Get the extension of the search results file.<br/>
	 * 
	 * @return Extension name of the search results file
	 */
	public String getSearchExtension() {
		return FileUtil.getJbmSuffix();
	}

	/**
	 * Get the extension of know-how xml file.<br/>
	 * 
	 * @return Extension name of the search results file
	 */
	public String getKnowhowExtension() {
		return FileUtil.getXmlSuffix();
	}

	/**
	 * Get the wording of the error If you do not want to search results file
	 * output destination specified.<br/>
	 * 
	 * @return Error message when you do not want to search results file output
	 *         destination specified
	 */
	public String getErrorFileNotValueString() {
		return MessageUtil.ERR_JBM_NOT_ENTERED;
	}

	/**
	 * Get the wording of the error if you do not specify the know-how XML file.<br/>
	 * 
	 * @return Error message when you do not specify the know-how XML file
	 */
	public String getErrorFileNotValueStringKnowhowXml() {
		return MessageUtil.ERR_KNOWHOW_XML_NOT_ENTERED;
	}

	/**
	 * Get the wording of the error if the file format of the search results
	 * file output destination is not correct.<br/>
	 * 
	 * @return Error message if the file format of the search results file
	 *         output destination is not correct
	 */
	public String getErrorFileNotJbm() {
		return MessageUtil.ERR_JBM_NOT_EXTENSION;
	}

	/**
	 * Get the wording of the error if the file format of know-how XML file is
	 * incorrect.<br/>
	 * 
	 * @return Error message if the file format of know-how XML file is
	 *         incorrect
	 */
	public String getErrorFileNotKnowhowXml() {
		return MessageUtil.ERR_KNOWHOW_NOT_EXTENSION;
	}

	/**
	 * Get the wording of the error if the project name in the search results
	 * file output destination does not exist.<br/>
	 * 
	 * @return Error message if the project name in the search results file
	 *         output destination does not exist
	 */
	public String getErrorProjectNotValue() {
		return MessageUtil.ERR_PROJECT_NOT_VALUE;
	}

	/**
	 * Get the wording of the error if the project name of know-how XML file
	 * does not exist.<br/>
	 * 
	 * @return Error message if the project name of know-how XML file does not
	 *         exist
	 */
	public String getErrorProjectNotValueKnowhowXml() {
		return MessageUtil.ERR_PROJECT_NOT_VALUE_KNOWHOW_XML;
	}

	/**
	 * Get the wording of the error if the project of the search results file
	 * output destination is not open.<br/>
	 * 
	 * @return Error message when the project of the search results file output
	 *         destination is not open
	 */
	public String getErrorProjectNotOpen() {
		return MessageUtil.ERR_PROJECT_NOT_OPEN;
	}

	/**
	 * Get the wording of the error if the project know-how of the XML file is
	 * not open.<br/>
	 * 
	 * @return Error message when project know-how of the XML file is not open
	 */
	public String getErrorProjectNotOpenKnowhowXml() {
		return MessageUtil.ERR_PROJECT_NOT_OPEN_KNOWHOW_XML;
	}

	/**
	 * File path of the search results file destination is get the wording of
	 * the error invalid.<br/>
	 * 
	 * @return File path of the search results file destination is the wording
	 *         of the error invalid
	 */
	public String getErrorFilePathInvalid() {
		return MessageUtil.ERR_FILEPATH_INVALID;
	}

	/**
	 * Get the wording of the error if the know-how XML file does not exist.<br/>
	 * 
	 * @return The wording of the error if the know-how XML file does not exist
	 */
	public String getErrorFileNotFoundKnowhowXml() {
		return MessageUtil.ERR_READ_KNOWHOW_XML;
	}

	/**
	 * Get search results file selection label string to be displayed in this
	 * screen.<br/>
	 * 
	 * @return Search result file selection label string
	 */
	public String getOutFileLabelString() {
		return ResourceUtil.SELECT_FILE_SEARCH_RESULT;
	}

	/**
	 * Get the title of the screen.<br/>
	 * 
	 * @return Title of the screen
	 */
	public String getDialogTitle() {
		return ResourceUtil.DIALOG_INFO_SEARCH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addControl(Composite composite) {
		// Know-how XML selection area
		setKnowhowXmlFileArea(composite);

		// Search result output destination selection area
		setOutJbmFileArea(composite);

		setPageComplete(false);
		super.textValidate();
	}

	/**
	 * Create a search result file output destination.<br/>
	 * 
	 * @param container
	 *            Container
	 */
	private void setOutJbmFileArea(Composite container) {
		Group group = new Group(container, SWT.SHADOW_NONE);
		group.setText(getOutFileLabelString());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setLayout(new GridLayout(2, false));

		// Search results file output destination selection text
		outJbmFileText = new Text(group, SWT.BORDER);
		outJbmFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Get the project
		outJbmFileText.setText(resource.getProject().getName()
				+ FileUtil.FILE_SEPARATOR + getDefaultJbm());
		addModifiListener(outJbmFileText);

		// Search results file output destination selection button
		Button button = new Button(group, SWT.NULL);
		button.setText(getReferenceButtonLabelString());

		button.addSelectionListener(new BrowseOutputJbmButtonSelectionListener(
				outJbmFileText));

	}

	/**
	 * Create a know-how XML file selection area.<br/>
	 * 
	 * @param container
	 *            Container
	 */
	private void setKnowhowXmlFileArea(Composite container) {
		Group group = new Group(container, SWT.SHADOW_NONE);
		group.setText(getKnowhowXmlFileLabelString());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setLayout(new GridLayout(2, false));

		// XML know-how selected text
		GridData gridDataDirectory = new GridData(GridData.FILL_HORIZONTAL);
		knowhowText = new Combo(group, SWT.READ_ONLY);
		knowhowText.setLayoutData(gridDataDirectory);

		// Set initial value to the project name that is selected in the
		// Explorer currently
		final String projectName = resource.getProject().getName();
		try {
			resource.getProject().accept(new IResourceVisitor() {
				public boolean visit(IResource resource) throws CoreException {
					switch (resource.getType()) {
					case IResource.FILE:
						if("xml".equals(resource.getFileExtension())){
							String fileName = projectName+FileUtil.FILE_SEPARATOR+resource.getProjectRelativePath().toOSString();
							if(isValidPortabilityKnowhowXml(fileName)) knowhowText.add(fileName);
						}
						break;
					default:
						break;
					}
					return true;
				}

				private boolean isValidPortabilityKnowhowXml(String xmlFile) {
					boolean result = false;
			        XMLInputFactory factory = XMLInputFactory.newInstance();
			        BufferedInputStream stream = null;
			        XMLStreamReader reader = null;
					try {
						stream = new BufferedInputStream(new FileInputStream(PluginUtil.getWorkspaceRoot() + FileUtil.FILE_SEPARATOR + xmlFile));
				        reader = factory.createXMLStreamReader(stream);
				 
				        for (; reader.hasNext(); reader.next()) {
				            int eventType = reader.getEventType();
				 
				            if (eventType == XMLStreamConstants.START_ELEMENT) {
				            	if (reader.getLocalName().equals("PortabilityKnowhow")) {
				            		result = true;
				            	}
				            	break;
				            }
				        }
					} catch (Exception ex) {
					} finally {
				        try {
							if (reader != null)reader.close();
						} catch (XMLStreamException e) {
						}
					}
					return result;
				}
			}, IResource.DEPTH_ONE, false);
		} catch (CoreException e) {
		}
		knowhowText.select(0);
		knowhowText.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				knowhowText.setText(knowhowText.getItem(knowhowText.getSelectionIndex()));
                setPageComplete(textValidate());
				LOGGER.info("Get selected item: "+getKnowhowXmlFilePath());
			}
		});
//		knowhowText.setText(resource.getProject().getName()
//				+ FileUtil.FILE_SEPARATOR + getDefaultXml());
//		addModifiListener(knowhowText);

		// Search target folder selection button
//		Button Button = new Button(group, SWT.NULL);
//		Button.setText(getReferenceButtonLabelString());
		// Set the operation when the button is pressed
//		Button.addSelectionListener(new BrowseFileButtonSelectionListener(this,
//				knowhowText, getKnowhowExtension()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean addTextvalidate() {
		// Check of know-how XML file /////////////////////////////////////
		// Not entered check
		if (StringUtil.isEmpty(getKnowhowXmlFilePath())) {
			setErrorMessage(getErrorFileNotValueStringKnowhowXml());
			return false;
		}
		// Extension check
		if (!StringUtil.isFileExtension(getKnowhowXmlFilePath(),
				getKnowhowExtension())) {
			setErrorMessage(getErrorFileNotKnowhowXml());
			return false;
		}
		// Project reality check
		if (!PluginUtil.projectExists(getKnowhowXmlFilePath())) {
			setErrorMessage(getErrorProjectNotValueKnowhowXml());
			return false;
		}
		// Project open check
		if (!isProjectOpen(getKnowhowXmlFilePath(),
				getErrorProjectNotOpenKnowhowXml())) {
			return false;
		}
		// Search results file existence check
		if (!FileUtil.fileExists(getKnowhowXmlFilePath())) {
			setErrorMessage(getErrorFileNotFoundKnowhowXml());
			return false;
		}

		// Check the search results file output destination
		// //////////////////////////////////
		// Not entered check
		if (StringUtil.isEmpty(getOutJbmFileText())) {
			setErrorMessage(getErrorFileNotValueString());
			return false;
		}
		// Extension check
		if (!StringUtil.isFileExtension(getOutJbmFileText(),
				getSearchExtension())) {
			setErrorMessage(getErrorFileNotJbm());
			return false;
		}
		// Project reality check
		if (!PluginUtil.projectExists(getOutJbmFileText())) {
			setErrorMessage(getErrorProjectNotValue());
			return false;
		}
		// Project open check
		if (!isProjectOpen(getOutJbmFileText(), getErrorProjectNotOpen())) {
			return false;
		}

		// Search results file existence check
		if (!FileUtil.getFile(getOutJbmFileText()).exists()) {
			// If the file path is invalid
			if (!FileUtil.isInputFileNormal(getOutJbmFileText())) {
				setErrorMessage(getErrorFilePathInvalid());
				return false;
			}
		}
		return true;
	}

	/**
	 * If the output destination entered already exists, overwrite confirmation
	 * dialog is displayed.<br/>
	 * If the output destination entered already exists, you can view the
	 * overwrite confirmation dialog.<br/>
	 * The return false if the selected No, true if it is bur selected in the
	 * dialog.<br/>
	 * The return false if Cancel is selected.<br/>
	 * 
	 * @return true:It was bur selected in the dialog false:No is selected
	 */
	public boolean checkFileUpdate() {
		// Overwrite warning
		if (FileUtil.getFile(getOutJbmFileText()).exists()) {
			if (!PluginUtil.viewQuestionDialog(getDialogTitle(),
					getConfirmString())) {
				setErrorMessage(getErrorFileUpdateConfirm());
				return false;
			}
		}
		return true;
	}
}
