package net.easyunion.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUtil {
	
	/**
	 * xml转List<Map<String, Object>>
	 * @param doc
	 * @param nodeName
	 * @param type 1 转大小写  2 不转大小写
	 * @return
	 */
	public static List<Map<String, Object>> getListMap(Document doc, String nodeName, String type){
		List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
		
		NodeList nodeList = doc.getElementsByTagName(nodeName);
		for (int i=0;i<nodeList.getLength();i++){
			NodeList childNodes  = nodeList.item(i).getChildNodes();
			Map<String, Object> map = new HashMap<String, Object>();
			for(int j=0;j<childNodes.getLength();j++){
				if(childNodes.item(j).getNodeType()==Node.ELEMENT_NODE){
					String value = "";
					if(childNodes.item(j).getFirstChild()!=null){
						if(StringUtils.isNotEmpty(childNodes.item(j).getFirstChild().getNodeValue()) && !"null".equals(childNodes.item(j).getFirstChild().getNodeValue())){
							value = childNodes.item(j).getFirstChild().getNodeValue().trim();
						}
					}
					if("1".equals(type)){
						map.put(childNodes.item(j).getNodeName().toLowerCase(), value);
					}else{
						map.put(childNodes.item(j).getNodeName(), value);
					}
				}
			}
			resList.add(map);
			
		}
		
		return resList;
	}
	
	/**
	 * map转xml
	 * @param list
	 * @param nodeName
	 * @param childName
	 * @return
	 */
	public static String getMapForXml(List<Map<String, Object>> list, String nodeName, String childName){
		StringBuffer sb = new StringBuffer();
		
		if(list!=null && list.size()>0){
			sb.append("<").append(nodeName).append(">");
			for(Map<String, Object> map : list){
				sb.append("<").append(childName).append(">");
				for(String key : map.keySet()){
					sb.append("<").append(key).append(">");
					sb.append(map.get(key)+"");
					sb.append("</").append(key).append(">");
				}
				sb.append("</").append(childName).append(">");
			}
			sb.append("</").append(nodeName).append(">");
		}
		
		return sb.toString();
	}
	/**
	 * 获取界面form内容转xml
	 * @param map
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String getMapToXml(Map<String, String[]> map){
		StringBuffer sb = new StringBuffer();
		Set set = map.keySet();
		for(Iterator iter = set.iterator(); iter.hasNext();)
		  {
			String key = (String)iter.next();
			sb.append("<").append(key).append(">").append(map.get(key)[0]).append("</").append(key).append(">"); 
			System.out.println(key+"-------------"+map.get(key)[0]);
		  }
		return sb.toString();
		 
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "JBR_DM";
		System.out.println(str.toLowerCase());
	}
	
}
