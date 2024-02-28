package com.light.jlab;

public class LightingDevice {
	private String lightName;
	private String manufacture;
	private String purpose;
	private int totalEA;
	
	public LightingDevice(String lightName, String manufacture, String purpose, int totalEA) {
		this.lightName = lightName;
		this.manufacture = manufacture;
		this.purpose = purpose;
		this.totalEA = totalEA;
	}

	public String getLightName() {
		return lightName;
	}

	public void setLightName(String lightName) {
		this.lightName = lightName;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getTotalEA() {
		return totalEA;
	}

	public void setTotalEA(int totalEA) {
		this.totalEA = totalEA;
	}

	@Override
	public String toString() {
		return "[lightName=" + lightName + ", manufacture=" + manufacture + ", purpose=" + purpose
				+ ", totalEA=" + totalEA + "]";
	}
	
	
	
	

}
