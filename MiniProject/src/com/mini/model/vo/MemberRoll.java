package com.mini.model.vo;

public class MemberRoll {
	private int rollNo;
	private Member mem;
	private Production pro;
	private String roll;
	
	public MemberRoll() {
		super();
	}

	public MemberRoll(Member mem, Production pro, String roll) {
		super();
		this.mem = mem;
		this.pro = pro;
		this.roll = roll;
	}

	public MemberRoll(int rollNo, Member mem, Production pro, String roll) {
		super();
		this.rollNo = rollNo;
		this.mem = mem;
		this.pro = pro;
		this.roll = roll;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Production getPro() {
		return pro;
	}

	public void setPro(Production pro) {
		this.pro = pro;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "[" + rollNo + "] 담당자 : " + mem.getUserName() + " / 공연명 : " + pro.getTitle() + " / 역할 : " + roll;
	}
	
	
}
