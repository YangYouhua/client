package net.easyunion.biz.fpfs.vo;

import java.io.Serializable;

public class BsxxVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8039732265156111611L;

	private String fpDm;
	private String fpQh;
	private String fpZh;
	private String je;
	private String se;
	private String fptkzt;// 发票填开状态
	private String kprqQ;
	private String kprqZ;
	private String fs;
	private String nsrsbh;
	private String fpzlDm;
	private String lrrDm;
	private String swjgDm;
	private String djxh;

	public String getDjxh() {
		return djxh;
	}

	public void setDjxh(String djxh) {
		this.djxh = djxh;
	}

	public String getLrrDm() {
		return lrrDm;
	}

	public void setLrrDm(String lrrDm) {
		this.lrrDm = lrrDm;
	}

	public String getSwjgDm() {
		return swjgDm;
	}

	public void setSwjgDm(String swjgDm) {
		this.swjgDm = swjgDm;
	}

	public String getFpzlDm() {
		return fpzlDm;
	}

	public void setFpzlDm(String fpzlDm) {
		this.fpzlDm = fpzlDm;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getFpDm() {
		return fpDm;
	}

	public void setFpDm(String fpDm) {
		this.fpDm = fpDm;
	}

	public String getFpQh() {
		return fpQh;
	}

	public void setFpQh(String fpQh) {
		this.fpQh = fpQh;
	}

	public String getFpZh() {
		return fpZh;
	}

	public void setFpZh(String fpZh) {
		this.fpZh = fpZh;
	}

	public String getJe() {
		return je;
	}

	public void setJe(String je) {
		this.je = je;
	}

	public String getSe() {
		return se;
	}

	public void setSe(String se) {
		this.se = se;
	}

	/**
	 * 记得要与研究结果转换
	 * 
	 * @return
	 */
	public String getFptkzt() {
		return fptkzt;
	}

	public void setFptkzt(String fptkzt) {
		this.fptkzt = fptkzt;
	}

	public String getKprqQ() {
		return kprqQ;
	}

	public void setKprqQ(String kprqQ) {
		this.kprqQ = kprqQ;
	}

	public String getKprqZ() {
		return kprqZ;
	}

	public void setKprqZ(String kprqZ) {
		this.kprqZ = kprqZ;
	}

	public String getFs() {
		return fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public boolean equals(Object other) {
		if (other == null)
			return false;

		try {
			BsxxVo _other = (BsxxVo) other;

			if (getFpDm().equals(_other.getFpDm())
					&& getFpQh().equals(_other.getFpQh())
					&& getFpZh().equals(_other.getFpZh())
					&& getFpzlDm().equals(_other.getFpzlDm())) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public int hashCode() {
		return (getFpDm() + getFpQh() + getFpZh() + getFpzlDm()).hashCode();
	}

	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append(" [发票种类代码 ] ：" + getFpzlDm());
		buff.append(" [发票代码]:" + getFpDm());
		buff.append(" [发票起号]:" + getFpQh());
		buff.append(" [发票止号]:" + getFpZh());
		buff.append(" [开票日期起]:" + getKprqQ());
		buff.append(" [开票日期止]:" + getKprqZ());
		return buff.toString();
	}

}
