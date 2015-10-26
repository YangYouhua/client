package net.easyunion.biz.fpfs.vo;

import java.io.Serializable;

public class YjResultVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7611947159808361722L;
	
	private boolean isOk;
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isOk() {
		return isOk;
	}
	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

}
