package com.kh.Test240125;

public class Member {
	
	 // 내 예시
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {
		super();
	}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 강사님 예시
//	private String name;
//	private int age;
//	private char gender;
//	private int couponCount;
//	
//	public Member() {
//		super();
//	}
//
//	public Member(String name, int age, char gender) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.couponCount = 0;
//	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	
	
	

}
