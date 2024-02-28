package com.kh.Test2402072;

// Model : VO (value object) 데이터를 저장하는 객체
public class Farm{
	private String kind;

	public Farm() {
		super();
	}

	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return kind + ": ";
	}

	@Override
	public int hashCode() {
		return this.kind.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Farm) {
			Farm f = (Farm)obj;
			
			if (this.getKind().equals(f.getKind())) {
				return true;
			}
		}
		return false;
	}
	
	

}
