package tubame.portability.biz.logic;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.digester3.Digester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import tubame.portability.biz.model.knowhow.Category;
import tubame.portability.biz.model.knowhow.Chapter;
import tubame.portability.biz.model.knowhow.KnowhowInfomation;
import tubame.portability.biz.model.knowhow.PortabilityKnowhow;
import tubame.portability.biz.model.knowhow.SearchInfomation;
import tubame.portability.biz.model.knowhow.PortabilityKnowhow.CategoryList;
import tubame.portability.biz.model.knowhow.PortabilityKnowhow.KnowhowList;
import tubame.portability.biz.model.knowhow.PortabilityKnowhow.SearchInfomationList;
import tubame.portability.exception.JbmException;

public class PortabilityKnowhowParser {
	
    private static final Logger LOGGER = LoggerFactory
            .getLogger(PortabilityKnowhowParser.class);

    private List<Chapter> chapterList;
    public List<Chapter> getChapterList() {
		return chapterList;
	}

	public Map<String, Category> getCategoryMap() {
		return categoryMap;
	}

	public Map<String, KnowhowInfomation> getKnowhowMap() {
		return knowhowMap;
	}

	public Map<String, SearchInfomation> getSearchInfoMap() {
		return searchInfoMap;
	}

	public PortabilityKnowhow getPortabilityKnowhow() {
		return portabilityKnowhow;
	}

	private Map<String, Category> categoryMap = new LinkedHashMap<String, Category>();
    private Map<String, KnowhowInfomation> knowhowMap = new LinkedHashMap<String, KnowhowInfomation>();
    private Map<String, SearchInfomation> searchInfoMap = new LinkedHashMap<String, SearchInfomation>();
    private PortabilityKnowhow portabilityKnowhow;
    
	public void parse(String filePath) throws JbmException {
		try {
			LOGGER.info("Start parsing");
			Digester digester = new Digester();
	
			
			LOGGER.info("Set Namespace");
			digester.setNamespaceAware(true);
			digester.setRuleNamespaceURI("http://generated.model.biz.knowhow.tubame/knowhow");
			
			LOGGER.info("Parse Root");
			digester.addObjectCreate("PortabilityKnowhow", tubame.portability.biz.model.knowhow.PortabilityKnowhow.class);
			LOGGER.info("Parse CategoryList");
			addCategoryListRule(digester);
			LOGGER.info("Parse ChapterList");
			addChapterListRule(digester);		
			LOGGER.info("Parse KnowhowList");
			addKnowhowListRule(digester);
			LOGGER.info("Parse SearchInfomationList");
			addSearchInfomationListRule(digester);
			
			LOGGER.info("Generate PortabilityKnowhow");
			PortabilityKnowhow portabilityKnowhow = digester.parse(new File(filePath));
			LOGGER.info(portabilityKnowhow.toString());
			
			createCategoryMap(portabilityKnowhow.getCategoryList());
			createKnowhowMap(portabilityKnowhow.getKnowhowList());
			createSearchInfoMap(portabilityKnowhow.getSearchInfomationList());
			chapterList = portabilityKnowhow.getChapterList().getChapters();
		} catch (Exception e) {
			throw new JbmException(e.getMessage());
		}
	}

    private void createCategoryMap(CategoryList categoryList) {
        for (Category category : categoryList.getCategories()) {
            categoryMap.put(category.getCategoryId(), category);
        }
    }

    private void createKnowhowMap(KnowhowList knowhowList) {
        for (KnowhowInfomation knowhow : knowhowList.getKnowhowInfomations()) {
            knowhowMap.put(knowhow.getKnowhowId(), knowhow);
        }
    }

    private void createSearchInfoMap(SearchInfomationList searchInfomationList) {
        for (SearchInfomation searchInfo : searchInfomationList
                .getSearchInfomations()) {
            searchInfoMap.put(searchInfo.getSearchInfoId(), searchInfo);
        }
    }
	
	private void addSearchInfomationListRule(Digester digester) {
		digester.addObjectCreate("PortabilityKnowhow/SearchInfomationList", tubame.portability.biz.model.knowhow.PortabilityKnowhow.SearchInfomationList.class);
		digester.addSetNext("PortabilityKnowhow/SearchInfomationList", "setSearchInfomationList");
		
		digester.addObjectCreate("PortabilityKnowhow/SearchInfomationList/SearchInfomation", tubame.portability.biz.model.knowhow.SearchInfomation.class);
		digester.addSetNext("PortabilityKnowhow/SearchInfomationList/SearchInfomation", "setSearchInfomation");
	
		digester.addSetProperties("PortabilityKnowhow/SearchInfomationList/SearchInfomation");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/FileType", "fileType");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/SearchKey1", "searchKey1");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/SearchKey2", "searchKey2");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/PythonModule", "pythonModule");
		
		digester.addObjectCreate("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation", tubame.portability.biz.model.knowhow.LineNumberInfomation.class);
		digester.addSetNext("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation", "setLineNumberInfomation");

		digester.addSetProperties("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation/LineNumber", "lineNumber");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation/LineNumberContents", "lineNumberContents");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/LineNumberInfomation/Investigation", "investigation");
	
		digester.addObjectCreate("PortabilityKnowhow/SearchInfomationList/SearchInfomation/Appropriate", tubame.portability.biz.model.knowhow.Appropriate.class);
		digester.addSetNext("PortabilityKnowhow/SearchInfomationList/SearchInfomation/Appropriate", "setAppropriate");

		digester.addSetProperties("PortabilityKnowhow/SearchInfomationList/SearchInfomation/Appropriate");
		digester.addBeanPropertySetter("PortabilityKnowhow/SearchInfomationList/SearchInfomation/Appropriate/AppropriateContents", "appropriateContents");
	}

	private void addKnowhowListRule(Digester digester) {
		digester.addObjectCreate("PortabilityKnowhow/KnowhowList", tubame.portability.biz.model.knowhow.PortabilityKnowhow.KnowhowList.class);
		digester.addSetNext("PortabilityKnowhow/KnowhowList", "setKnowhowList");
		
		digester.addObjectCreate("PortabilityKnowhow/KnowhowList/KnowhowInfomation", tubame.portability.biz.model.knowhow.KnowhowInfomation.class);
		digester.addSetNext("PortabilityKnowhow/KnowhowList/KnowhowInfomation", "setKnowhowInfomation");
		
		digester.addSetProperties("PortabilityKnowhow/KnowhowList/KnowhowInfomation");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/KnowhowNo", "knowhowNo");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/KnowhowName", "knowhowName");
		
		digester.addObjectCreate("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem", tubame.portability.biz.model.knowhow.CheckItem.class);
		digester.addSetNext("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem", "setCheckItem");
		
		digester.addSetProperties("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/CheckItemNo", "checkItemNo");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/CheckItemName", "checkItemName");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/SearchProcess", "searchProcess");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/PortabilityFactor", "portabilityFactor");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/PortabilityDegree", "portabilityDegree");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/DegreeDetail", "degreeDetail");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/VisualConfirm", "visualConfirm");
		digester.addBeanPropertySetter("PortabilityKnowhow/KnowhowList/KnowhowInfomation/CheckItem/HearingConfirm", "hearingConfirm");
	}

	private void addChapterListRule(Digester digester) {
		digester.addObjectCreate("PortabilityKnowhow/ChapterList", tubame.portability.biz.model.knowhow.PortabilityKnowhow.ChapterList.class);
		digester.addSetNext("PortabilityKnowhow/ChapterList", "setChapterList");
		
		digester.addObjectCreate("PortabilityKnowhow/ChapterList/Chapter", tubame.portability.biz.model.knowhow.Chapter.class);
		digester.addSetNext("PortabilityKnowhow/ChapterList/Chapter", "setChapter");
		
		digester.addBeanPropertySetter("PortabilityKnowhow/ChapterList/Chapter/ChapterNo", "chapterNo");
		digester.addBeanPropertySetter("PortabilityKnowhow/ChapterList/Chapter/ChapterName", "chapterName");
		
		digester.addObjectCreate("*/Chapter/ChildChapter", tubame.portability.biz.model.knowhow.ChildChapter.class);
		digester.addSetNext("*/Chapter/ChildChapter", "setChildChpater");

		digester.addBeanPropertySetter("*/Chapter/ChildChapter/ChildCapterNo", "childCapterNo");
		digester.addBeanPropertySetter("*/Chapter/ChildChapter/ChapterCategoryRefKey", "chapterCategoryRefKey");

		digester.addObjectCreate("*/ChildChapter/ChildChapter", tubame.portability.biz.model.knowhow.ChildChapter.class);
		digester.addSetNext("*/ChildChapter/ChildChapter", "setChildChpater");
		
		digester.addBeanPropertySetter("*/ChildChapter/ChildChapter/ChildCapterNo", "childCapterNo");
		digester.addBeanPropertySetter("*/ChildChapter/ChildChapter/ChapterCategoryRefKey", "chapterCategoryRefKey");
	}

	private void addCategoryListRule(Digester digester) {
		digester.addObjectCreate("PortabilityKnowhow/CategoryList", tubame.portability.biz.model.knowhow.PortabilityKnowhow.CategoryList.class);
		digester.addSetNext("PortabilityKnowhow/CategoryList", "setCategoryList");

		digester.addObjectCreate("PortabilityKnowhow/CategoryList/Category", tubame.portability.biz.model.knowhow.Category.class);
		digester.addSetNext("PortabilityKnowhow/CategoryList/Category", "setCategory");
		
		digester.addSetProperties("PortabilityKnowhow/CategoryList/Category");
		digester.addBeanPropertySetter("PortabilityKnowhow/CategoryList/Category/CategoryName", "categoryName");
		digester.addCallMethod("PortabilityKnowhow/CategoryList/Category/KnowhowRefKey", "setKnowhowRefKey", 0);
	}

}
