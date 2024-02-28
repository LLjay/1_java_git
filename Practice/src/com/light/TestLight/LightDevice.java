package com.light.TestLight;

public class LightDevice {
	
	private String product;
	private String manufacture;
	private int power;
	private float weight;
	private int totalQty;
	private int outQty = 0;
	private int inQty = 0;
	
	
	public LightDevice() {
		super();
	}

	public LightDevice(String product, String manufacture, int power, float weight, int totalQty) {
		super();
		this.product = product;
		this.manufacture = manufacture;
		this.power = power;
		this.weight = weight;
		this.totalQty = totalQty;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getOutQty() {
		return outQty;
	}

	public void setOutQty(int outQty) {
		this.outQty = outQty;
	}

	public int getInQty() {
		return inQty;
	}

	public void setInQty(int inQty) {
		this.inQty = inQty;
	}

	@Override
	public String toString() {
		return "장비명 : " + product + " / 제조사 : " + manufacture + " / 총전력 : " + power + "W / 무게 : " + weight + "kg / 총수량 : " + totalQty + "EA";
	}
	
	
	
	

}
