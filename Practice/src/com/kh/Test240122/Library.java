package com.kh.Test240122;

public class Library {
	
	private String bkName;
	private int bkNum;
	private String writer;
	private String genre;
	
	public Library(String bkName, int bkNum, String writer, String genre) {
		this.bkName = bkName;
		this.bkNum = bkNum;
		this.writer = writer;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "bkName=" + bkName + ", bkNum=" + bkNum + ", writer=" + writer + ", genre=" + genre + "]";
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public int getBkNum() {
		return bkNum;
	}

	public void setBkNum(int bkNum) {
		this.bkNum = bkNum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	

}
