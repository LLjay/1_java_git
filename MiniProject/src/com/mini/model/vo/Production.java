package com.mini.model.vo;

import java.sql.Date;

public class Production {
	private int proNo;
	private String category;
	private String title;
	private String theatre;
	private Date opening;
	private Date closing;
	
	public Production() {
		super();
	}

	public Production(String category, String title, String theatre, Date opening, Date closing) {
		super();
		this.category = category;
		this.title = title;
		this.theatre = theatre;
		this.opening = opening;
		this.closing = closing;
	}

	public Production(int proNo, String category, String title, String theatre, Date opening, Date closing) {
		super();
		this.proNo = proNo;
		this.category = category;
		this.title = title;
		this.theatre = theatre;
		this.opening = opening;
		this.closing = closing;
	}

	public int getProNo() {
		return proNo;
	}

	public void setProNo(int proNo) {
		this.proNo = proNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheatre() {
		return theatre;
	}

	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}

	public Date getOpening() {
		return opening;
	}

	public void setOpening(Date opening) {
		this.opening = opening;
	}

	public Date getClosing() {
		return closing;
	}

	public void setClosing(Date closing) {
		this.closing = closing;
	}

	@Override
	public String toString() {
		return "[" + proNo + "] 종류 : " + category + " / 공연명 : " + title + " / 극장 : " + theatre
				+ " / 개막일 : " + opening + " / 폐막일 : " + closing;
	}
	
	

}
