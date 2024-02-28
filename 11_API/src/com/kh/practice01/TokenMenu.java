package com.kh.practice01;

import java.util.Scanner;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	

	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.tokenMenu();
//				tokenMenu();
				break;
			case 2 :
				this.inputMenu(); // 명시적으로 꼭 써줄 것!
//				inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void tokenMenu() {
//		String str = "JavaProgram";
//		char[] arr = new char[str.length()];
//		
//		System.out.println("토큰 처리 전 글자 : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(str.toCharArray());
//			System.out.println(" ");
//		}
//		
//		System.out.println("토큰 처리 전 글자 개수 : " + arr.length);
//		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
//		System.out.println("토큰 처리 후 글자 개수 : " + tc.afterToken(str).length());

		
		// 강사님 예시
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String strAfter = tc.afterToken(str);
		
		System.out.println("토큰 처리 전 글자 : " + strAfter);
		System.out.println("토큰 처리 전 개수 : " + strAfter.length());
		System.out.println("모두 대문자로 변환 : " + strAfter.toUpperCase());
	}
	
	public void inputMenu() {
		
//		System.out.println("문자열을 입력하세요 : ");
//		String input = sc.nextLine();
//		
//		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));

		System.out.println("문자열을 입력하세요. : ");
		String str = sc.next();
		
		str = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + str);
		
		System.out.println("찾을 문자 하나를 입력하세요. : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("문자가 들어간 개수 : " + ch + " " + tc.findChar(str, ch));
		
	
	}

}
