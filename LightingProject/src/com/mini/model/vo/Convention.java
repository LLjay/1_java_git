package com.mini.model.vo;

public class Convention extends Lighting{
	
	public Convention() {
		super();
	}
	
	public Convention(String product, double weight, int totalQty, String manufacture, int power, String species) {
		super(product, weight, totalQty, manufacture, power, species);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
