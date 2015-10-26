package net.easyunion.common.util;

import java.util.UUID;

public class UUIDUtil {
	
	/**
	 * 英文小写的UUID
	 * @return
	 */
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	
	/**
	 * 英文大写的UUID
	 * @return
	 */
	public static String getUUIDToCase(){
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid.toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(getUUID().toUpperCase());
	}

}
