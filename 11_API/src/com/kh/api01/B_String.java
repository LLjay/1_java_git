package com.kh.api01;

import java.util.StringTokenizer;

public class B_String {
	public void method01() {
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1.toString());
		System.out.println(str2);
		// String 클래스에 toString 메소드가 이미 오버라이딩 되어 있음 (실제 담긴 문자열을 반환하도록)
		
		System.out.println(str1 == str2); // false (주소값 비교라서)
		
		System.out.println(str1.equals(str2));
		// String 클래스에 equals 메소드는 이미 오버라이딩 되어 있음 (주소값 비교가 아닌 담긴 문자열을 비교하도록)
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		// String 클래스에 hashCode 메소드가 이미 오버라이딩 되어 있음 (주소값이 아닌 문자열을 가지고 만들도록)
		
		// 해쉬코드는 특정한 값을 넣었을 때 한 글자가 바뀌었는지를 알기 위한 것?
		// 해쉬알고리즘은 블록 체인에 가장 많이 씀
		// => 유일성을 체크하기 위한 것, 해쉬코드로 표현해 같냐 다르냐를 비교하기 위한 메소드
		// => 아마 같은 hello이기 때문에 같은 해쉬코드가 나오는 것
		// 그래서 해쉬코드는 사실상 주소값이 아님
		
		// 주소값에 대한 해시코드가 알고 싶다면 identityHashCode 메소드를 이용해야 한다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println();
		
		// 2. 문자열을 리터럴 값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시 시 상수풀(String Pool) 영역에 올라감
		// String Pool 특징 : 동일한 문자열을 가질 수 없다
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3.hashCode() == str4.hashCode());
		
		System.out.println(str3 == str4);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		str4 = "hi";
		System.out.println(System.identityHashCode(str4));

		// String 클래스 == 불변 클래스(변하지 않는 클래스)
		// 변경이 가능하지만 수정되는 개념이 아니라 새로 생성하여 교체하는 개념
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경 되는 게 아님
		// 새로운 곳을 참조하도록 함 (새로운 주소값 부여받음 == 주소값 변경)
		
		str4 = "hello";
		System.out.println(System.identityHashCode(str4));
		
	}

	public void method02() {
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 변환형
		
		// 1. 문자열.charAt(int index) : char
		// 	  문자열에서 전달 받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		// 	  문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		// 둘이 다름, concat은 새로운 객체를 만들어서 넣어주는 것
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		// str2와 str3에 담긴 문자열은 일치하나 담겨있는 주소값은 다르다.
		System.out.println("str2와 str3는 일치하는가 : " + (str2 == str3));
		
		// 3. 문자열.equals(Object obj) : boolean
			// obj가 매개변수로 받아주는 것
		// 	  문자열과 전달된 또다른 문자열을 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등 비교
		System.out.println("str2와 str3는 일치하는가 : " + (str2.equals(str3)));
		
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello라는 문자열이 포함되어 있습니까? : " + str1.contains("Hello"));
		// CharSequence 는 매개변수, String 안에 포함?
		System.out.println("str1에 Bye라는 문자열이 포함되어 있습니까? : " + str1.contains("Bye"));
		
		// 5. 문자열.length() : int
		//	  문자열의 길이를 반환하는 메소드
		System.out.println("str1의 길이 : " + str1.length());

		// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex 위치에서부터 끝까지 문자열 추출해서 리턴
		// 	  문자열.substring(int beginIndex, int endIndex) : String
		// 	  => 문자열의 beginIndex 위치에서부터 endIndex - 1 위치까지 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 5));
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		// 	  문자열에서의 oldChar 문자를 newChar 문자로 변환한 새 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
//		str1 = str1.replace('l', 'c'); // 대입해야 값이 바뀜
		System.out.println("str1 : " + str1);
		
		// 8. 문자열.toUpperCase() : String => 문자열을 다 대문자로 변경한 새 문자열 리턴
		// 	  문자열.toLowerCase() : String => 문자열을 다 소문자로 변경한 새 문자열 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
//		System.out.println("계속 하시겠습니까? (y/n)");
//		char ch = new java.util.Scanner(System.in).next().toUpperCase().charAt(0); // 'N' 'Y'
		// 체인 형식으로 엮어서 사용 가능, 하지만 헷갈리니까 나눠줌
		// 한 번 쓸 거면 이런 식으로 써도 되지만 나눠주기
		// 변수는 저장해서 계속 쓰려고 만드는 것
		
		// 9. 문자열.trim() : String
		// 	  문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		// 아이디 뒤에 공백을 넣어서 안 된다고 하는 경우 많음 => trim 사용해서 공백 제거
		String str6 = "   JA   VA   ";
		System.out.println(str6.trim());
		
		// 이름을 보면 기능이 유추 되도록 한 게 이름을 잘 지은 메소드
		// => 따라서 기능을 하나만 넣어줌
		// => 모듈화
		
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 인덱스 : " + arr[i]);
//		}
		
//		int i = 0;
//		for (char ch1 : arr) {
//			System.out.println(i++ + "번째 인덱스 : " + ch1);
//		}
//		
		// 문자의 집합을 문자열로 합쳐주는 것, 10번을 되돌려놓는 것
		// 11. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
		
	}

	public void method03() {
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
//		String str = ""; // 없어도 1이 나옴, 무조건 한 번은 쪼개기 때문에 배열의 길이가 1이 나옴
		// 구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1 : 분리된 문자열들을 String[] 배열에 차곡차곡 담고자
		// 		  String 클래스에 제공하는 split 메소드 이용
		// 		  문자열.split(구분자) : String[]
		
//		String[] arr = str.split(",");
//		
//		System.out.println("배열의 길이 : " + arr.length);
//		
//		for (String a : arr) {
//			System.out.println(a);
//		}
		
		// 방법2 : 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때
		// java.util.StringTokenizer 클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ",");
		// 토큰 = 문자 하나하나를 토큰이라고 함
		// 문자열 하나하나를 토큰처럼 생각해서 반점 기준 하나씩 빼서 넘겨옴
		// 배열은 인덱스로 접근, 이 함수는 값을 순서대로 빼는 것
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		
//		for (int i = 0; i < stn.countTokens(); i++) {
//			System.out.println(stn.nextToken());
//		} // => 카운트가 줄어들기 때문에 불가능함
		
//		int num = stn.countTokens();
//		
//		for (int i = 0; i < num; i++) {
//			System.out.println(stn.nextToken());
//		}
//		
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken()); // NoSuchElementException 발생 (더이상 요소가 없습니다)
		
		/*
		 * 반복하여 처음부터 끝까지 출력하는 방법
		 * 방법 1.
		 */

		int count = stn.countTokens();
		for (int i = 0; i < count; i++) {
			System.out.println(stn.nextToken());
		}
		
		// 방법 2.
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		// hasMoreTokens가 꺼낼 토큰이 남아있으면 true 반환, 없으면 false 반환
		
	}

	
}
