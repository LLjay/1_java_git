package com.kh.Test2401262;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		super();
	} // 추상 클래스인데 생성자가 프로텍트, 나는 상속 아니면 생성을 할 수 없게 만들겠다.
	
	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();

}
