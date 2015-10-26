package net.easyunion.biz.fpfs.vo;

import java.io.Serializable;

public class GpResultVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7965383706255418564L;
	
	private boolean isOk;
	private String msg;
	private Long lgbhs;//领购本行数
	
	
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
	public Long getLgbhs() {
		return lgbhs;
	}
	public void setLgbhs(Long lgbhs) {
		this.lgbhs = lgbhs;
	}

}
