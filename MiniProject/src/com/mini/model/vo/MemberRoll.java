package com.mini.model.vo;

public class MemberRoll {
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
		if (this.mem.getUserName() != null) {
			return this.pro.toString() + " / " + this.roll + " : " + this.mem.getUserName();
		} else {
			return this.pro.toString();
		}
	}
	
	
}
