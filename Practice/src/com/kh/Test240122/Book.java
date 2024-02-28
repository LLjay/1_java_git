package com.kh.Test240122;

public class Book {
	// 필드
	private String bookName;
	private int bookNum;
	private String writer;
	private String bookTheme;
	private int bookEA;
	
	// 생성자
	public Book (String bookName, int bookNum, String writer, String bookTheme, int bookEA) {
		this.bookName = bookName;
		this.bookNum = bookNum;
		this.writer = writer;
		this.bookTheme = bookTheme;
		this.bookEA = bookEA;
	}
	
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	@Override
	public String toString() {
		return "bookName=" + bookName + ", bookNum=" + bookNum + ", writer=" + writer + ", bookTheme=" + bookTheme
				+ ", bookEA=" + bookEA;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBookTheme() {
		return bookTheme;
	}

	public void setBookTheme(String bookTheme) {
		this.bookTheme = bookTheme;
	}

	public int getBookEA() {
		return bookEA;
	}

	public void setBookEA(int bookEA) {
		this.bookEA = bookEA;
	}

}
