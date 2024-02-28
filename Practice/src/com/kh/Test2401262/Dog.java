package com.kh.Test2401262;

public class Dog extends Animal {
	
//	final String PLACE = "애견카페";
	public static final String PLACE = "애견카페";
	// 사용성에 static이나 그냥 변수나 차이는 없음, 하지만
	// 객체를 생성할 때마다 final 변수를 만들어 공간을 차지하기보다
	// static에 한 번 만들어놓고 사용하는 게 훨씬 효율적임
	
	private int weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
//		PLACE = "애견카페"; // 여기서 초기화 해주면 기본 생성자 사용 시 상수 정의가 사라짐
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	} // 상수니까 값 바꿔주는 set는 없고 get만 있음
	// 어차피 안 변하는 값이니까 굳이 게터 안 쓰고 값에 직접 접근해서 써도 됨

	@Override // 반드시 오버라이드 해야함, 추상 메소드가 존재하므로 실제 정의 해줘야 함
	public void speak() {
		// 내 예시
//		System.out.println(super.toString() + 
//				" 몸무게는 " + weight + "kg 입니다.");
		System.out.println(super.toString() + 
				" 몸무게는 " + this.getWeight() + "kg 입니다.");
	}

	
	
	


}
