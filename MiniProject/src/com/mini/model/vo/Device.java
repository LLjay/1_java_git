package com.mini.model.vo;

public class Device {
	private int dvNo;
	private String category;
	private String dvName;
	private int totalQty;
	
	public Device() {
		super();
	}

	public Device(String category, String dvName, int totalQty) {
		super();
		this.category = category;
		this.dvName = dvName;
		this.totalQty = totalQty;
	}

	public Device(int dvNo, String category, String dvName, int totalQty) {
		super();
		this.dvNo = dvNo;
		this.category = category;
		this.dvName = dvName;
		this.totalQty = totalQty;
	}

	public int getDvNo() {
		return dvNo;
	}

	public void setDvNo(int dvNo) {
		this.dvNo = dvNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDvName() {
		return dvName;
	}

	public void setDvName(String dvName) {
		this.dvName = dvName;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	@Override
	public String toString() {
		return "[" + dvNo + "] 종류 : " + category + " / 장비명 : " + dvName + " / 총수량 : " + totalQty;
	}
	
	
	
	
}
