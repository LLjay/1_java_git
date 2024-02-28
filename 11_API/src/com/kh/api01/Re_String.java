package com.kh.api01;

public class Re_String {
	
	public void String() {
		
		String str1 = "Hello World";
//		
//		char ch = str1.charAt(3);
//		System.out.println(ch);
//		
//		String str2 = str1.concat(" the wind blow");
//		System.out.println(str2);
		
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		// 둘이 다름, concat은 새로운 객체를 만들어서 넣어주는 것
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		// str2와 str3에 담긴 문자열은 일치하나 담겨있는 주소값은 다르다.
		System.out.println("str2와 str3는 일치하는가 : " + (str2 == str3));
	
		// equals 메소드의 매개변수는 Object obj이다.
		// 주소값이 아닌 실제 문자열 값을 가지고 동등비교 해주는 메소드
		
		// CharSequence
		
		System.out.println(str1.substring(6));
		System.out.println(str2.substring(5, 14));
	}

}
