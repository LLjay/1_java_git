package com.kh.api01;

public class Re_Wrapper {
	public void wrapper() {
		
		// #### Boxing ####
		// 1. 객체 생성 구문을 통한 방법
		int num1 = 10;
		int num2 = 20;
		
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		// 오버라이딩 되어 있기 때문에 num1, num2의 값 10, 15가 나옴
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		
		
		// 2. 객체 생성 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		int num3 = 30;
		Integer i3 = num3;
		
		Integer i4 = 40;
		System.out.println(i4);
		
		
		// # 객체 생성을 해야 하는 경우 => 문자열을 Integer 타입으로 변환하고 싶을 때
		Integer i5 = new Integer("123");
		System.out.println(i5);
		
		Boolean i6 = new Boolean(true);
		System.out.println(i6);
		
		
		
		
		// #### Unboxing ####
		// 1. Wrapper 클래스에서 제공하는 xxxValue() 메소드 사용
		
		System.out.println(i1.intValue());
		int num7 = i2.intValue();
		
		
		// 2. 메소드를 사용하지 않고 바로 대입 (AutoUnBoxing)
		int num8 = i1;
		
		
		
		// #### String <--> 기본자료형 ####
		// 1. String -> 기본자료형 ("10" -> 10)
		// Wrapper 클래스에서 제공하는 parsexxx() 메소드 사용
		
		String str1 = "10";
		String str2 = "15.5";
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i);
		System.out.println(d);
		
		System.out.println(str1 + str2);
		System.out.println(str1 + i);
		System.out.println(i + d);
		
		String str3 = "-4";
		String str4 = "404.0";
		String str5 = "A";
		String str6 = "true";
		
		int n1 = Integer.parseInt(str3);
		double n2 = Double.parseDouble(str4);
		
		System.out.println(n1 + n2);
		
		// char는 parsexxx() 메소드가 없다
		// => split 메소드 혹은 StringTokenizer 사용 가능
		
		Boolean b1 = Boolean.parseBoolean(str5);
		Boolean b2 = Boolean.parseBoolean(str6);
		
		System.out.println(b1);
		System.out.println(b2);
		
		// 2. 기본 자료형 -> String (10 -> "10")
		// String 클래스의 valueOf() 메소드 사용
		
		System.out.println(String.valueOf(n1));
		
		System.out.println(String.valueOf(b1));
		System.out.println(String.valueOf(b2));
		
		char c1 = 'A';
		
		System.out.println(String.valueOf(c1));

		System.out.println(String.valueOf(n2));
		
		int num10 = 5;
		String str7 = String.valueOf(num10);
		System.out.println(str7);
	}
}
