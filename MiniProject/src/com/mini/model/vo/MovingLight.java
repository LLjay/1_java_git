package com.mini.model.vo;

public class MovingLight extends Lighting {
	private String lamp;
	
	public MovingLight() {
		super();
	}
	
	public MovingLight(String category, String dvName, int totalQty, String manufacture, 
						int power, double weight, String lamp) {
		super(category, dvName, totalQty, manufacture, power, weight);
		this.lamp = lamp;
	}

	public String getLamp() {
		return lamp;
	}

	public void setLamp(String lamp) {
		this.lamp = lamp;
	}

	@Override
	public String toString() {
		return super.toString() + " / 램프 : " + lamp;
	}
	
	
}
