package net.easyunion.common.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocTool {

	public static String getChildValue(Document doc,int i,String tagName){
		Node node = doc.getElementsByTagName(tagName).item(i);
		if(null == node){
			return "";
		}else{
			if(node.getFirstChild() == null){
				return "";
			}else{
				return node.getFirstChild().getNodeValue();
			}
		}
	}
	
	public static String getChildValue(NodeList nodeList,int i){
		Node node = nodeList.item(i).getFirstChild();
		if(null == node){
			return "";
		}else{
			return node.getNodeValue();
		}
	}
	
	/**
	 * 解析xml获取Document对象
	 * @param docXml
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static Document getDocument(String docXml) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		InputStream in_withcode =  new ByteArrayInputStream(docXml.getBytes("UTF-8"));   
		Document document = db.parse(in_withcode);
		return document;
	}
}
