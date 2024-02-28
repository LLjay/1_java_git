package com.kh.object;
/*
 * 	*클래스의 구조
 * 
 *  옵션 class 이름 {
 *  	// 필드 영역
 *  		{사용할 데이터들을 선언하는 영역}
 *  
 *  	// 생성자 영역
 *  		{데이터를 초기화 해주는 특수 목적의 메소드인 생성자를 정의하는 영역}
 *  	
 *  	// 메소드 영역
 *  		{클래스의 기능을 정의하는 영역}
 *  }
 *  
 *  # 접근제한자 : 해당 구조에 접근할 수 있는 범위를 제한한다
 *  	public > protected > default > private
 *  
 *  클래스에 사용 가능한 접근제한자 2가지
 *  - default, public // 안 쓰면 디폴트, 기술한다면 퍼블릭
 *  
 *  필드에서 또는 메소드에서 사용할 수 있는 접근제한자 4가지
 *  - public : 어디서든(같은 패키지건 다른 패키지건) 모두 접근 가능 // 패키지는 폴더
 *  - protected : 같은 패키지에서 또는 다른 패키지일 경우 상속 구조(부모자식 관계)에서만 접근
 *  - default : 같은 패키지에서만 접근 가능 // 아무것도 쓰지 않는 것
 *  - private : 오직 해당 클래스에서만 접근 가능
 *  
 *  위에서 아래로 내려올수록 접근할 수 있는 범위가 좁아짐
 */


public class Student { // 학생을 추상화해서 만든 클래스다.
	
	// 필드 영역
	// 접근제한자 자료형 변수명; (선언)
	/*
	 * 필드를 public 접근제한자로 작성
	 * => 필드에 직접적으로 접근해서 값을 대입하거나 값을 가져올 수 있음
	 * => 외부에서 함수로 값을 변경하거나 조회 권한이 없는 사람이 값을 쉽게 가져올 수 있음
	 * 	-> 캡슐화를 진행함
	 */

	private String name;
	private int age; // 나이는 1년 1살씩 증가
	private double height;
	public static int count=0;
	
	// 생성자 영역
	// 매개변수가 있는 생성자 작성 시 기본 생성자 생성은 안 해준다.
	public Student() {
		this("입력안됨", 0, 0);
//		this.name = "입력안됨";
//		this.age = 0;
//		this.height = 0.;
	}
	// 접근제한자 클래스명(초기화 하고자 하는 값을 담은 매개변수) {초기화}
	public Student(String name, int age, double height) {
		this.name = name; // name = name 하면 이 안의 name 변수만 도니까 this로 필드에 있는 name 지정
		this.age = age > 0 ? age : 1; // 조건처리를 해놨는데 수정될 수 있음
		this.height = height;
		this.count++;
	}
	
	public Student(String name, int age) {
		this(name, age, 0); // => 밑에 명시한 것과 똑같은 말
//		this.name = name;
//		this.age = age;
//		this.height = 0;
		
	} // 대부분 코드는 명시적인 걸 좋아함, 나중에 데이터량이나 코드량이 많아지면 알아보기 힘듦 => 유추가 아리까리한 경우는 그냥 다 써주는 게 좋음

	
	// getter, setter
	// getter : 해당 필드에 값을 가지고 오기 위한 메소드
	// setter : 해당 필드에 값을 대입 시키기 위한 메소드
	
	public int getAge() { // getter는 형식 정해져 있음 get + 변수이름
		return this.age;
	}
	
	public String getName() {
		return this.name;
	
	public void setAge(int age) {
		this.age = age;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void ageUp() {
		this.age += 1;
	} // 
	
	// 메소드 영역
	/*
	 * <표현법>
	 * 접근제한자 메소드명(매개변수) {
	 * 		기능 코드
	 * }
	 * 
	 * 매개변수 : 해당 메소드 호출 시 전달값(인자)을 받아주기 위한 변수 선언문(해당 메소드 내에서만 사용 가능)
	 */
	
	public void print() {
		System.out.println("안녕하세요. " + this.age + "살 " + this.name + "입니다.");
	}
	
	// 메소드 오버로딩
	// 동일한 이름의 메소드가 있을 때 매개변수의 개수 또는 자료형에 따라서 메소드를 구분할 수 있다.
	public void print(String gender) {
		System.out.println("안녕하세요. " + this.age + "살 " + this.name + "이고 성별은 " + gender + "입니다.");
	}


}
