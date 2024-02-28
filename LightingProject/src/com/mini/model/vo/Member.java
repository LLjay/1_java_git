package com.mini.model.vo;

import java.io.Serializable;

public class Member implements Serializable {
	private String userID;
	private String userPassword;
	private String userName;
	private String userGrade;
//	private int userPoint;
	
	public Member() {
		super();
	}

	public Member(String userID, String userPassword, String userName, String userGrade) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userGrade = userGrade;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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
		return "Member [userID=" + userID + ", userPassword=" + userPassword + ", userName=" + userName + ", userGrade="
				+ userGrade + "]";
	}

}
