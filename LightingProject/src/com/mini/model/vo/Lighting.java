package com.mini.model.vo;

public class Lighting extends Device{

	private String manufacture;
	private int power;
	private String species;
	
	public Lighting() {
		super();
	}

	public Lighting(String product, double weight, int totalQty, String manufacture, int power, String species) {
		super(product, weight, totalQty);
		this.manufacture = manufacture;
		this.power = power;
		this.species = species;
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return super.toString() + "Lighting [manufacture=" + manufacture + ", power=" + power + ", species=" + species + "]";
	}
	
	
	
}
