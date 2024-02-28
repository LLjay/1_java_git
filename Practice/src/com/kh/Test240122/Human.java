package com.kh.Test240122;

public class Human {
	String name;
	int money;
	static int count=0;
	
	public Human (String name, int money) {
		this.name = name;
		this.money = money;
		this.count++;
	}
	
	// buy라는 메소드 작성
	// TV 객체를 넘겨 받아 구매가 가능하다면 구매가 가능합니다.
	// money가 부족하다면 예산 초과입니다 출력
	
	// 내 예시
//	public void buy (int price) {
//		if (price <= this.money) {
//			System.out.println("구매가 가능합니다.");
//		} else {
//			System.out.println("예산 초과입니다.");
//		}
//	}
	// 강사님 예시
	public void buy(TV tv) {
		if (tv.getPrice() > this.money) {
			System.out.println("예산 초과입니다.");
		} else {
			System.out.println("구매가 가능합니다.");
		}
	}
}
