package com.light.TestLight;

public class Spot extends MovingLight {
	
	private int goboNum;
	
	public Spot() {
		super();
	}

	public Spot(String product, String manufacture, int power, float weight, int totalQty, String powerSource, int xlr, int chNum, int goboNum) {
		super (product, manufacture, power, weight, totalQty, powerSource, xlr, chNum);
		this.goboNum = goboNum;
	}

	public int getGoboNum() {
		return goboNum;
	}

	public void setGoboNum(int goboNum) {
		this.goboNum = goboNum;
	}

	@Override
	public String toString() {
		return super.toString() + " / 고보 개수 : " + goboNum + "EA";
	}
	
	

}
