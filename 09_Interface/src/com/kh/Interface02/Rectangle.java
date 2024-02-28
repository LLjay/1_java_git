package com.kh.Interface02;

public class Rectangle implements Shape {
	
	private int weight;
	private int height;
	
	public Rectangle(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.weight * this.height;
	}
	
	

}
