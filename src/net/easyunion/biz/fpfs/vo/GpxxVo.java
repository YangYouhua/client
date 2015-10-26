package net.easyunion.biz.fpfs.vo;

import java.io.Serializable;

public class GpxxVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4971701785859371372L;
	
	private String fpDm;
	private Long kgsl;//可购数量
	private Long kfsl;//库房数量
	private String fpQh;
	private String jyxx = "";//校验信息，如果为为空则通过检查，否则失败
	
	
	public String getFpDm() {
		return fpDm;
	}
	public void setFpDm(String fpDm) {
		this.fpDm = fpDm;
	}
	public Long getKgsl() {
		return kgsl;
	}
	public void setKgsl(Long kgsl) {
		this.kgsl = kgsl;
	}
	public Long getKfsl() {
		return kfsl;
	}
	public void setKfsl(Long kfsl) {
		this.kfsl = kfsl;
	}
	public String getFpQh() {
		return fpQh;
	}
	public void setFpQh(String fpQh) {
		this.fpQh = fpQh;
	}
	/**
	 * @return the jyxx
	 */
	public String getJyxx() {
		return jyxx;
	}
	/**
	 * @param jyxx the jyxx to set
	 */
	public void setJyxx(String jyxx) {
		this.jyxx = jyxx;
	}
	
	

}