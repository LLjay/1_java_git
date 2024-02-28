package com.kh.inherit01;

public class BusinessMan extends Man {
	
	String company;
	String position;
	
	public BusinessMan() {
		System.out.println("BusinessMan 객체 생성");
	}
	
	public BusinessMan(String name, String company, String position) {
		super(name); // 인자로 문자열 하나를 전달 받을 수 있는 부모 생성자
//		super.name = name;
		this.company = company;
		this.position = position;
	}



	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName(); // 내 안에 있는 메소드만 이렇게 객체 없이 그대로 사용 가능
	}
	

}
