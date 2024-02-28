package com.mini.model.vo;

import java.util.HashMap;

public class Device {
	private String product;
	private double weight;
	private int totalQty;
	
	public Device() {
		super();
	}

	public Device(String product, double weight, int totalQty) {
		super();
		this.product = product;
		this.weight = weight;
		this.totalQty = totalQty;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	@Override
	public String toString() {
		return "Device [product=" + product + ", weight=" + weight + ", totalQty=" + totalQty + "]";
	}
	
	

}
