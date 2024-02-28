package com.kh.exception01;

import java.util.Scanner;

public class Run {
	
	/*
	 * #에러 종류
	 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결이 안 됨 => 심각한 에러
	 * - 컴파일 에러 : 소스코드 문법 상의 오류 => 빨간 줄로 애초에 오류로 알려준다.(개발자의 실수) => 발견과 해결이 쉽다.
	 * - 런타임 에러 : 코드 상으로 문제가 없는데 프로그램 실행 중에 발생하는 에러(사용자의 실수일 수도 있고 개발자가 예측 가능하지만 처리를 안 해놓은 에러)
	 * - 논리 에러 : 문법적으로도 문제 없고 실행 했을 때도 문제는 없지만 프로그램 의도와 맞지 않는 동작이나 결과가 나타나는 에러
	 * 
	 * 컴파일 에러, 런타임 에러, 논리 에러 같은 개발자가 예측하여 수정할 수 있는 에러들을 가지고 작업
	 * => 이런 것들을 "예외" 라고 함 => Exception
	 * 
	 * 이런 "예외"가 "발생"했을 경우에 대해서 "처리" 하는 방법을 "예외처리" 라고 함
	 * 
	 * #예외처리를 하는 목적
	 * - 예외처리를 하지 않고 그대로 예외가 발생 되는 경우 프로그램이 비정상적으로 종료될 수 있음
	 * 
	 * #예외처리 방법
	 * 1. try~catch문 이용
	 * 2. throws를 이용(떠넘기기 == 위임한다)
	 */
	
	public static void main(String[] args) {
		RunException ex = new RunException();
//		ex.method01();
//		ex.method02();
//		try {
//			ex.method03();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
//		try {
//			ex.method04();
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		// finally : // try - catch의 결과와 상관 없이 try - catch의 모든 과정이 끝났을 때 무조건 실행하는 구문
		// try, catch는 무조건 하나만 실행됨, 오류가 나거나 안 나거나, finally는 결과 상관없이 실행

//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			int num = sc.nextInt();
//			sc.close();
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//		} finally {
//			sc.close();
//		}
		
		// 코드 작성은 가독성이 중요함. close가 try 구문 안에 있으면 그건 구문 것이라는 것, 한묶음
		// 스트림 사용 시 무조건 close 사용해야 함
		// 외부와 연결되는 통로는 다 쓰고나서 무조건 닫아줘야 함
		
		// try-with-resources구문
		
		try(Scanner sc = new Scanner(System.in)){ // 원래 괄호가 없음, 스캐너를 close 하는 구문을 따로 작성하지 않고 for문의 int i 처럼 지역변수로 선언해서 넣어줄 수도 있음
			sc.next();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
}
