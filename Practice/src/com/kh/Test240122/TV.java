package com.kh.Test240122;

public class TV {
	
	String tvName;
	int tvYear;
	int tvSize;
	private int price;

	public TV (String tvName, int tvYear, int tvSize, int price) {
		this.tvName = tvName;
		this.tvYear = tvYear;
		this.tvSize = tvSize;
		this.price = price;
	}
	
	public int getPrice () {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show () {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n", this.tvName, this.tvYear, this.tvSize);
//		return tvName;
	} 
	// 프린트 하라는 함수 자체가 String 형은 아니므로 반환 불가능
	// show라는 함수 자체가 프린트를 해주므로 함수만 사용하면 프린트 가능
}
