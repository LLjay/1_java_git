package com.light.TestLight;

public class Member {
	
	private String userName;
	private String userGrade;
	
	public Member() {
		super();
	}
	
	public Member(String userName, String userGrade) {
		super();
		this.userName = userName;
		this.userGrade = userGrade;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserGrade() {
		return userGrade;
	}
	
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	
	@Override
	public String toString() {
		return "환영합니다, " + userGrade + " " + userName + "님.";
	}
	
	

	

}
