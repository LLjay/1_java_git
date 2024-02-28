package com.kh.Test2402062;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {
		super();
	}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public int hashCode() {
		String str = this.name + this.phone;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isFalse = false;
		if (obj instanceof Lottery) {
			Lottery lo = (Lottery)obj;
			
			if (this.getName().equals(lo.getName()) &&
					this.getPhone().equals(lo.getPhone())) {
				return isFalse = true;
			}
		} else {
			return isFalse;
		}
		return isFalse;
	}
	
	

}
