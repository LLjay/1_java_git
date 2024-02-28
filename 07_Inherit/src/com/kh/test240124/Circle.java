package com.kh.test240124;

public class Circle extends Point {
	
	// 내 예시
	private int radius;
	// private final float PI = 3.14f;

	public Circle() {
		super();
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	} // 처음에 이런 식으로 나오는 이유는 기본 생성자가 있는 경우 그게 우선시되므로
	  // 안 나오면 직접 써주면 됨

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + radius;
	}
	
	
	
	

}
