package com.kh.object;

public class Coffee {

	// 필드 영역
	
	private int menuNum;
	private String cfName;
	private int price;
	private int count;
	private char temperature;
	
	public Coffee (String cfName, int price, int count, char temperature) {
		this.cfName = cfName;
		this.price = price;
		this.count = count;
		this.temperature = temperature;
	}
	
	public Coffee (String cfName, int price, int count) {
//		this(cfName, price, count, 'n');
		this.cfName = cfName;
		this.price = price;
		this.count = count;
		this.temperature = 0;
	}

	public String getCfName() {
		return this.cfName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public char getTemperature() {
		return this.temperature;
	}
	
	public int count() {
		return this.count;
	}
	
	public void setCfName(String cfName) {
		this.cfName = cfName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTemperature(char temperature) {
		this.temperature = temperature;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
//	public String menuSelect(int menuNum) {
//		
//		switch(menuNum) {
//		case 1 : 
//			menuNum = 1;
//			break;
//		case 2 :
//			menuNum = 2;
//			break;
//		case 3 :
//			menuNum = 3;
//			break;
//		case 4 :
//			menuNum = 4;
//			break;
//		case 5 :
//			menuNum = 5;
//			break;
//		case 6 :
//			menuNum = 6;
//			break;
//		}


	public int onePrice(int count) { // 이건 이미 초기화 값이 있... 아 모르겟네
		int onePrice = this.price * count;
		return onePrice;
	}
	
	
}
