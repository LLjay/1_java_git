package com.kh.Test240126;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker;
	
	public SmartPhone() {
//		this.maker = " "; // 어차피 구현이 불가능하므로 이걸 쓰는 의미가 없음
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public abstract String printInformation();

}
