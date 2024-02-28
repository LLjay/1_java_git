package com.kh.Test2402072;

public class Nut extends Farm {
	private String name;

	public Nut() {
		super();
	}

	public Nut(String kind, String name) {
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
		return super.toString() + ": " + this.name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Nut) {
			Nut n = (Nut)obj;
			
			if (super.getKind().equals(n.getKind()) &&
					this.getName().equals(n.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
