package com.kh.Interface01;

public class Dog implements Animal, Baby {// 이 줄만 쓴 상태면 오류 남, 아직 오버라이딩이 안 되어 있어서

	// 무조건 오버라이딩으로 가져와야 구현된 메소드로 가능
	
	@Override
	public void move() {
		System.out.println("촐랑촐랑 뜁니다.");
	}

	@Override
	public void eat() {
		System.out.println("챱챱챱 먹습니다.");		
	}

	@Override
	public void makeSound() {
		System.out.println("월월월 짖습니다.");		
	} 

}
