package com.mini.model.vo;

public class Lighting extends Device {
	private String manufacture;
	private int power;
	private double weight;
	
	public Lighting() {
		super();
	}

	public Lighting(String category, String dvName, int totalQty, String manufacture, int power, double weight) {
		super(category, dvName, totalQty);
		this.manufacture = manufacture;
		this.power = power;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + " / 제조사 : " + manufacture + " / 전력(watt) : " + power + 
					" / 무게(kg) : " + weight;
	}
	
	

}
