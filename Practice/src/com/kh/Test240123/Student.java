package com.kh.Test240123;

public class Student {
	private String name;
	private int mathScore;
	private int koreanScore;
	private int engScore;
	
	public Student(String name, int mathScore, int koreanScore, int engScore) {
		this.name = name;
		this.mathScore = mathScore;
		this.koreanScore = koreanScore;
		this.engScore = engScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public float evarage() {
//		float total = this.mathScore + this.koreanScore + this.engScore;
//		return total / 3;
		
		// total 거칠 필요가 없음
		return ((float)this.mathScore + (float)this.koreanScore + (float)this.engScore) / 3.0f;
		
	}

	@Override
	public String toString() {
		return "[name=" + name + ", mathScore=" + mathScore + ", koreanScore=" + koreanScore + ", engScore="
				+ engScore + ", evarage = " + this.evarage() + "]";
	}
	
	
	
	
	
	

}
