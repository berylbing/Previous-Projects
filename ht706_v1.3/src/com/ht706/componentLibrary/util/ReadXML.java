package com.ht706.componentLibrary.util;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 *  从jbpm配置文件中读取相应的属性

 * @Time: 2010-10-12
 */
public class ReadXML {
	
	/**
	 * 从文件读取XML，输入文件名，返回XML文档
	 */
    public Document read(String fileName) throws DocumentException {
    	SAXReader reader = new SAXReader();
    	Document document = reader.read(new File(fileName));
    	return document;
    }
	
    /**
     * 取得Root节点
     * @param doc
     * @return Root节点
     */
	public Element getRootElement(Document doc){
		return doc.getRootElement();
    }
	
	/**
	 * 得到该配置文件的描述信息
	 * @return task节点名称的list
	 */
	public String getTaskDescription(String fileName)
	{
		String description = "";
		Element root = null;
		try {
			root = this.getRootElement(read(fileName));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		description = root.attributeValue("description");
		return description;
	}
	
	/**
	 * 得到所有task节点的名称
	 * @return task节点名称的list
	 */
	public List<String> getAllTaskName(String fileName) {
		List<String> allTaskName = new ArrayList<String>();
		Element root = null;
		try {
			root = this.getRootElement(read(fileName));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String foo = "task";
		
		/*// 枚举所有子节点
		for (Iterator i = root.elementIterator(); i.hasNext();) {
			Element element = (Element) i.next();
			System.out.println(element.getName());
		}*/
		// 枚举名称为task的节点
		for (Iterator i = root.elementIterator(foo); i.hasNext();) {
			Element element = (Element) i.next();
			String value = element.attributeValue("assignee");
			
			if (value != null && !value.trim().startsWith("#"))
			{
				allTaskName.add(value);
	//			System.out.println(value);
			}
		}
		
		return allTaskName;
	}
	
	/**
	 * 得到foo节点下attribute的值
	 * @param fileName
	 * @return
	 */
	public List<String> getAllValues(String fileName, String foo, String attribute) {
		List<String> allTaskName = new ArrayList<String>();
		Element root = null;
		try {
			root = this.getRootElement(read(fileName));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Iterator i = root.elementIterator(foo); i.hasNext();) {
			Element element = (Element) i.next();
			String value = element.attributeValue(attribute);
			allTaskName.add(value);
		}
		
		return allTaskName;
	}
	
	/**
	 * 从jbpmFileName中读取配置的工作流文件名称
	 * @return
	 */
	public List getFileName()
	{
		return getAllValues(getPath() + "jbpmFileName.xml", "fileName", "resource");
	}
	
	/**
	 * 得到jpdl.xml文件的路径
	 * @return  path
	 */
	public String getPath() {
		URL base = ReadXML.class.getResource("");
		String path = null;
		try {
			path = new File(base.toURI().getPath(), "../../../../").getCanonicalPath() + "\\";
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(path);
		return path;
	}
	
	
	public static void main(String[] args) {
		ReadXML xml = new ReadXML();
		//System.out.println(ClassLoader.getSystemResource(""));  
		URL base = ReadXML.class.getResource("");
		String path = null;
		try {
			try {
				path = new File(base.toURI().getPath(), "../../../../").getCanonicalPath();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(path);
		String fileName = path + "\\jbpmFileName.xml";
		System.out.println(fileName);     
		xml.getAllTaskName(fileName);
	}

}
