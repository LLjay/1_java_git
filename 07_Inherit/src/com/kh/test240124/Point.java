package com.kh.test240124;

public class Point {
	
	//내 예시
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point() {
//		super();
	}

	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	// getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return x + ", " + y;
	}
	
	
	
	
	
	
	
	

}
