package com.kh.Test2402072;

public class Fruit extends Farm {
	private String name;

	public Fruit() {
		super();
	}

	public Fruit(String kind, String name) {
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
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fruit) {
			Fruit f = (Fruit)obj;
			
			if (super.getKind().equals(f.getKind()) &&
					this.getName().equals(f.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
