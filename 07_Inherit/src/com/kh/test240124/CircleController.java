package com.kh.test240124;

public class CircleController {
	
	// 내 예시
//	private Circle c = new Circle();
//	private final float PI = 3.14f;
//	
//	public String calcArea(int x, int y, int radius) {
//		return "x 좌표 : " + x + "\ny 좌표 : " + y + "\nradius : " + radius + 
//				"\n면적 : " + (PI * radius * radius);
//	}
//	
//	public String calcCircum(int x, int y, int radius) {
//		return "x 좌표 : " + x + "\ny 좌표 : " + y + "\nradius : " + radius + 
//				"\n둘레 : " + (PI * radius * 2);
//	}
	
	  
	
	// 강사님 예시
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * c.getRadius() * c.getRadius(); // Math.PI로 파이값 가져올 수 있음, PI 대문자 => 스태틱으로 선언 => 정적 메모리니까 가져올 수 있는 것
		return "면적 : " + c.toString() + "/" + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = Math.PI * 2 * c.getRadius(); // Math.PI로 파이값 가져올 수 있음, PI 대문자 => 스태틱으로 선언 => 정적 메모리니까 가져올 수 있는 것
		return "둘레 : " + c.toString() + "/" + circum;
	}

}
