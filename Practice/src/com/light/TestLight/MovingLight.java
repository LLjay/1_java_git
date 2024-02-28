package com.light.TestLight;

public class MovingLight extends LightDevice {
	
	private int xlr;
	private int chNum;
	
	public MovingLight() {
		super();
	}

	public MovingLight(String product, String manufacture, int power, float weight, int totalQty, String powerSource, int xlr, int chNum) {
		super(product, manufacture, power, weight, totalQty);
		this.xlr = xlr;
		this.chNum = chNum;
	}

	public int getXlr() {
		return xlr;
	}

	public void setXlr(int xlr) {
		this.xlr = xlr;
	}

	public int getChNum() {
		return chNum;
	}

	public void setChNum(int chNum) {
		this.chNum = chNum;
	}

	@Override
	public String toString() {
		return super.toString() + " / DMX pin : " + xlr + "pin / 채널 번호 : " + chNum + "ch";
	}
	
	

}
