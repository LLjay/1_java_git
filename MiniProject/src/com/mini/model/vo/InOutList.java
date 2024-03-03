package com.mini.model.vo;

import java.sql.Date;

public class InOutList {
	private int inOutNo;
	private Production pro;
	private Device device;
	private int outQty;
	private int inQty;
	private Date outDate;
	private Date inDate;
	private String memo;
	
	public InOutList() {
		super();
	}

	public InOutList(Production pro, Device device, int outQty, int inQty, Date outDate, Date inDate, String memo) {
		super();
		this.pro = pro;
		this.device = device;
		this.outQty = outQty;
		this.inQty = inQty;
		this.outDate = outDate;
		this.inDate = inDate;
		this.memo = memo;
	}

	public InOutList(int inOutNo, Production pro, Device device, int outQty, int inQty, Date outDate, Date inDate, String memo) {
		super();
		this.inOutNo = inOutNo;
		this.pro = pro;
		this.device = device;
		this.outQty = outQty;
		this.inQty = inQty;
		this.outDate = outDate;
		this.inDate = inDate;
		this.memo = memo;
	}

	public int getInOutNo() {
		return inOutNo;
	}

	public void setInOutNo(int inOutNo) {
		this.inOutNo = inOutNo;
	}

	public Production getPro() {
		return pro;
	}

	public void setPro(Production pro) {
		this.pro = pro;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public int getOutQty() {
		return outQty;
	}

	public void setOutQty(int outQty) {
		this.outQty = outQty;
	}

	public int getInQty() {
		return inQty;
	}

	public void setInQty(int inQty) {
		this.inQty = inQty;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "[" + inOutNo + "] 공연명 : " + pro.getTitle() + " / 장비명 : " + device.getDvName() + " / 반출수량 : " + outQty
				+ " / 반입수량 : " + inQty + " / 반출일 : " + outDate + " / 반입일 : " + inDate + " / 비고 : " + memo;
	}
	
	
}
