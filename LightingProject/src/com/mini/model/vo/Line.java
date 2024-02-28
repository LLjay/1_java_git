package com.mini.model.vo;

public class Line extends Device{
	private int limit;

	public Line() {
		super();
	}

	public Line(String product, double weight, int totalQty, int limit) {
		super(product, weight, totalQty);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return super.toString() + "Line [limit=" + limit + "]";
	}
	
	

}
