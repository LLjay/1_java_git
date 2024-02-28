package com.kh.EX02;

import java.util.Scanner;

// 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 객체를 만들기 위한
// 클래스를 작성하라
// 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get 해줄 수 있도록 작성하라
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	
	private String name;
	private int age;
	private int mathScore;
	private int engScore;
	private int koreanScore;
	public int evg;
	
	
	public Student (String name, int age, int mathScore, int engScore, int koreanScore) {
//		this(name, age, mathScore, engScore, koreanScore); // => 기본 생성자 만들었을 때
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.koreanScore = koreanScore;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMathScore() {
		return this.mathScore;
	}
	
	public int getEngScore() {
		return this.engScore;
	}
	
	public int getKoreanScore() { 
		return this.koreanScore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public void setKoreangScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	
	public int getEvg(int engScore, int koreanScore, int mathScore) {
		int evg = (this.engScore + this.koreanScore + this.mathScore) / 3;
		return evg;
	}
	
	

	

}
