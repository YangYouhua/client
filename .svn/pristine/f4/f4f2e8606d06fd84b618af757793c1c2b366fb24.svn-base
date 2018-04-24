package net.easyunion.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class StringUtil {

	/**
	 * 
	 * @param o
	 * @return
	 */
	public static String validate(Object o){
		return o==null?"":o.toString();
	}
	
	public static String getTime(Date dt ,String str ) {
		SimpleDateFormat df=new SimpleDateFormat(str);
		return df.format(dt);
	}
	
	@SuppressWarnings("rawtypes")
	public static Map<String, Object> toMapLowerCase(Map<String, Object> map){
	    Map<String, Object> mapLowerCase=new HashMap<String, Object>();
		for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry entry = (Map.Entry) iterator.next();
			String key = StringUtil.validate(entry.getKey());
			key=key.toLowerCase();
			String val = StringUtil.validate(entry.getValue());
			mapLowerCase.put(key,val);
		}
		return mapLowerCase;
	}
	
	public static boolean isNumeric(String str){
		  for (int i = 0; i < str.length(); i++){
		   System.out.println(str.charAt(i));
		   if (!Character.isDigit(str.charAt(i))){
		    return false;
		   }
		  }
		  return true;
		 }
	
	public static List<Map<String, Object>> toListMapLowerCaseListMap(List<Map<String, Object>> list){
		for (int i = 0; i < list.size(); i ++){
			list.set(i, toMapLowerCaseNoValidate(list.get(i)));
		}
		return list;
	}
	
	@SuppressWarnings("rawtypes")
	public static Map<String, Object> toMapLowerCaseNoValidate(Map<String, Object> map){
        Map<String, Object> mapLowerCase=new HashMap<String, Object>();
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = StringUtil.validate(entry.getKey());
            key=key.toLowerCase();
            mapLowerCase.put(key,entry.getValue());
        }
        return mapLowerCase;
    }
	
	public static String arrToString(Object [] obj){
		 String str="";
		 if(obj.length>0){
			 for (int i = 0; i < obj.length; i++) {
				 if(i==0){
					 str=validate(obj[i]);
				 }else{
					 str=str+"#"+validate(obj[i]); 
				 }
			 }
		 }
		 return str;
	}
	
	 public static boolean isEmpty(Object o){
	        return null == o || "".equals(o.toString());
	    }
	public static String getUUID(){
		String str = UUID.randomUUID().toString();
		return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
	}
	
	public static String getOrderSn(){
		String str = UUID.randomUUID().toString();
		return "EU" + ((int)(Math.random()*900)+100) + System.currentTimeMillis();
	}
}	
