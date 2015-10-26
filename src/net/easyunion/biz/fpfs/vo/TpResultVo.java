package net.easyunion.biz.fpfs.vo;

import java.io.Serializable;

public class TpResultVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8841352331222377745L;
	
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
