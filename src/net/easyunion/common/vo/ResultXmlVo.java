package net.easyunion.common.vo;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;

public class ResultXmlVo {
	
	public boolean result;
	public Document doc;
	public String message;
	public List<Map<String, Object>> list;
	
	
	
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
