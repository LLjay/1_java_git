package com.kh.test240124;

public class RectangleController {
	// 내 예시
//	private Rectangle r = new Rectangle();
//	
//	public String calcArea(int x, int y, int width, int height) {
//		return "x : " + x + "\ny : " + y + "\nwidth : " + width + 
//				"\nheight : " + height + "\n면적 : " + height*width;
//	}
//	
//	public String calcPerimeter(int x, int y, int width, int height) {
//		return "x : " + x + "\ny : " + y + "\nwidth : " + width + 
//				"\nheight : " + height + "\n둘레 : " + (2 * (height+width));
//	}
	
	// 강사님 예시
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width); // 하거나
		
//		r = new Rectangle(x, y, width, height); // 생성자 만들어서 넣거나
		
		int area = r.getWidth() * r.getHeight();
		return "면적 : "+ r.toString() + "/" + area;
	}

	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int area = 2 * (r.getWidth() + r.getHeight());
		return "둘레 : " + r.toString() + "/" + area;
	}
}