package com.kh.api01;

public class C_Wrapper {
	
	/*
	 * #Wrapper 클래스
	 * => 기본자료형을 객체로 포장해줄 수 있는 클래스
	 * 
	 * 		기본자료형		<-->	Wrapper 클래스
	 * 		boolean				Boolean
	 * 		char				Character
	 * 		byte				Byte
	 * 		short				Short
	 * 		int					Integer
	 * 		long				Long
	 * 		float				Float
	 * 		double				Double
	 * 
	 * => 기본자료형을 객체로 표현해야 할 경우
	 * 		- 메소드 호출해야 할 때
	 * 		=> 메소드의 매개변수로 기본자료형이 아닌 객체타입만 요구될 때
	 * 		=> 다형성을 적용시키고 싶을 때
	 */
	
	public void method01() {
		// Boxing : 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
//		System.out.println(num1.equals(num2)); // equals를 사용하고 싶을 때
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1 // 가끔 노랗게 지향 안 한다고 경고문 뜸
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1);
		System.out.println(i2); // 오버라이딩 되어 있기 때문에 10, 15 값이 나올 수 있음
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1 반환, 뒤쪽이 크면 -1 반환, 같으면 0 반환
		
		// 2. 객체 생성 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체 생성을 통해서 반드시 변환해야 하는 경우 -> 문자열을 Integer 타입으로 변환하고 싶을 때
		Integer i4 = new Integer("123"); // "123" => 123 으로 바꿈
		// Integer i4 = "123"; 형태는 불가능, 무조건 생성자로 전달 해줘야 바꿔줌
		
		// UnBoxing : Wrapper 클래스 자료형 -> 기본자료형
		
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해서 가능
		int num3 = i3.intValue(); // i3 -> num3
		int num4 = i4.intValue();
		
		// 2. 메소드 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		
		System.out.println("==============");
		
		// 기본자료형 <--> String 왔다갔다 하는 경우가 매우 많음
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2); // 문자열이니까 문자열로 붙는다 1015.5
		
		// 1. String -> 기본자료형
		// 		"10" -> 10
		// 		"15.5" -> 15.5
		// 해당 Wrapper 클래스.parsexxx() 사용
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		// 2. 기본자료형 -> String
		// 		10	-> "10"
		// 		15.5 -> "15.5"
//		String strI = i + "";
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		
	}

}
