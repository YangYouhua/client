package net.easyunion.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import net.easyunion.biz.fpfs.vo.NsrxxVo;

public class BeanXmlUtil {
	
	public static String toXmlString(Object obj){
		try {
			StringBuffer buff = new StringBuffer();
			
			Class<?> clazz = obj.getClass();
			Field[] fields = obj.getClass().getDeclaredFields();//获得属性
			
			for (Field field : fields) {
				String fieldName = field.getName();
				
				PropertyDescriptor pd = null;
				try{
					pd = new PropertyDescriptor(fieldName,
							clazz);
				}catch(Exception ex){
					continue;
				}
				buff.append("<" + fieldName + ">");
				Method getMethod = pd.getReadMethod();//获得get方法
				String value = (String)getMethod.invoke(obj);//执行get方法返回一个Object
				buff.append(value);
				buff.append("</" + fieldName + ">");
			}
			return buff.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
//	public static void main(String[] args){
//		NsrxxVo nsrxxVo = new NsrxxVo();
//		nsrxxVo.setNsrmc("test");
//		nsrxxVo.setNsrsbh("123456789");
//		nsrxxVo.setGprIdCard("123456789");
//		nsrxxVo.setGprmc("测试");
//		nsrxxVo.setNsrlx("1");
//		
//		System.out.println(toXmlString(nsrxxVo));
//	}
	
}

