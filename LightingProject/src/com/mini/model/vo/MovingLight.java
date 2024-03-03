package com.mini.model.vo;

public class MovingLight extends Lighting{
	
	private String mode;
	private int chNum;
	
	public MovingLight() {
		super();
	}
	
	public MovingLight(String product, double weight, int totalQty, String manufacture, 
						int power, String species, String mode, int chNum) {
		super(product, weight, totalQty, manufacture, power, species);
		this.mode = mode;
		this.chNum = chNum;
	}
}
