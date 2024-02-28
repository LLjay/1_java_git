package com.kh.B_Stream;

import java.io.Serializable;

public class Produce implements Serializable { // serial 인터페이스는 안에 아무것도 없음, 그냥 체킹용도로 쓴 것, 사용자가 직렬화 한다고 선언했다는 사실을 확인
	private String name;
	private int price;
	
	public Produce () {
		
	}

	public Produce(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produce [name=" + name + ", price=" + price + "]";
	}

	
	
	

}
