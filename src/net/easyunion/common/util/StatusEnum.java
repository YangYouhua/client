package net.easyunion.common.util;

public enum StatusEnum {
	
	
	unstart(1), start(2), success(3), fail(4), finished(34);
	
	private Integer value;

	private StatusEnum(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}

}
