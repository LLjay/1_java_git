package com.kh.Test2402072;

public class Vegetable extends Farm{
	private String name;

	public Vegetable() {
		super();
	}

	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vegetable) {
			Vegetable v = (Vegetable)obj;
			
			if (super.getKind().equals(v.getKind()) &&
					this.getName().equals(v.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
