package com.light.TestAnimal;

public class Dog extends Animal implements Speak {
	
	final String PLACE = "애견카페";
	int weight;
	
	public Dog() {
		super();
	}


	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	

}
