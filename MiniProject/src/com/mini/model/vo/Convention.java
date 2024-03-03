package com.mini.model.vo;

public class Convention extends Lighting {
	
	public Convention() {
		super();
	}

	public Convention(String category, String dvName, int totalQty, String manufacture, 
						int power, double weight) {
		super(category, dvName, totalQty, manufacture, power, weight);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
