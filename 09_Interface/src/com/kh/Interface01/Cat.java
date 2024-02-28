package com.kh.Interface01;

public class Cat implements Animal, Baby {

	@Override
	public void move() {
		System.out.println("사뿐사뿐 움직입니다.");
	}

	@Override
	public void eat() {
		System.out.println("냠냠 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("캬악!@!");
	}
	
}
