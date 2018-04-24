/**
 * 文件名：Base64.java
 * 版权：Copyright 2014 EasyUnion
 * 描述：<描述>
 * 修改人：bony
 * 修改时间：2014年7月30日
 * 修改内容：<修改内容>
 */
package net.easyunion.common.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * @author bony
 *
 */
public class Base64Util {
    
	public static String decodeGbk(String arg) {
        try {
            return new String(Base64.decodeBase64(arg),"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
	
    public static String decode(String arg) {
        try {
            return new String(Base64.decodeBase64(arg),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String encode(String arg) {
        try {
            return Base64.encodeBase64String(arg.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String encodeGbk(String arg){
    	try {
            return Base64.encodeBase64String(arg.getBytes("gbk"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

}
