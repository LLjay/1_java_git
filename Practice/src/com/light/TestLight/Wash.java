package com.light.TestLight;

public class Wash extends MovingLight {
	
	private boolean flower;
	
	public Wash() {
		super();
	}

	public Wash(String product, String manufacture, int power, float weight, int totalQty, String powerSource, int xlr, int chNum, boolean flower) {
		super (product, manufacture, power, weight, totalQty, powerSource, xlr, chNum);
		this.flower = flower;
	}

	public boolean isFlower() {
		return flower;
	}

	public void setFlower(boolean flower) {
		this.flower = flower;
	}

	@Override
	public String toString() {
		return super.toString() + " / Flower 유무 : " + flower;
	}
 
	
}
