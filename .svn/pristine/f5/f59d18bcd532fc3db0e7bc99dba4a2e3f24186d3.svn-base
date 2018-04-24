package net.easyunion.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	private static PropertiesUtil propertitesUtil = null;
	private static Properties pro = null;
	
	private PropertiesUtil(){
		pro = new Properties();
		InputStream in = getClass().getResourceAsStream("/config.properties");
		try {
			pro.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static PropertiesUtil getInstance(){
		if (propertitesUtil == null){
			propertitesUtil = new PropertiesUtil();
		}
		return propertitesUtil;
	}
	
	public String getProperties(String target){
		return pro.getProperty(target);
	}
	
	public static void main(String[] args) {
		String url = PropertiesUtil.getInstance().getProperties("fwsk.url");
		
		System.out.println(url);
	}


}
