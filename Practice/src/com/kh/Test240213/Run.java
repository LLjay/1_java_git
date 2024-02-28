package com.kh.Test240213;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 홀수 짝수 출력하기
		// 랜덤으로 숫자 5개 입력 받아 출력하기
		// 랜덤으로 숫자 10개 입력 받아 짝수만 출력하기
//		int[] random = new int[10];
//		for (int i = 0; i < random.length; i++) {
//			random[i] = sc.nextInt();
//		}
//		for (int i = 0; i < random.length; i++) {
//			if (random[i] % 2 == 0) {
//				System.out.println(random[i]);
//			}
//		}
		// 문자열 입력 받아서 문자열 한 글자씩 출력하기
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
			System.out.println(c);
		}
		// 문자열(영단어) 입력 받아서 문자열 첫 글자 대문자로 변경하기
		
//		System.out.print("문자열 입력 : ");
//		String str = sc.next();
//		sc.nextLine();
//		
//		String newStr = str.replace(str.charAt(0), str.toUpperCase().charAt(0));
//		System.out.println(newStr);
		
		// 오버라이딩, 오버로딩에 대한 문제
		// 상속 관계에 있는 클래스 2개를 제공해주고 오버라이딩 된 메소드 출력 시 어떤 결과가 출력되는가?
		// 클래스 하나 주어진 상태에서 해당 클래스를 상속 받는 새로운 클래스를 만들고 다음과 같은 결과가 되도록 오버라이딩 해라
		// 똑같은 이름의 메소드 10개 정도 제공해주고 에러가 발생하는 이유를 기술해라
		
		// void sample(int n); -> sample(3); sample(5, 7.0); 해당 코드가 문제가 되지 않도록 코드를 수정해라
		
		// 배열 -> 길이가 정해져 있는 것 -> 배열의 범위를 초과하는 코드 조심
		// 배열을 제공하고 모든 객체를 출력해라
		// 다형성 -> 다운캐스팅 조심
		// Human을 담을 수 있는 ArrayList 1개를 생성하고 임의로 Human 객체 5개를 생성해서 담아라
		// 단 해당 List에는 Human 객체만 담을 수 있게 구성하세요.
		
//		ArrayList<Human> arr = new ArrayList();
//		arr.add(new Human("전은지", 30));
//		arr.add(new Human("이지수", 27));
		
		// ArrayList<Human> arr = new ArrayList<>();
		// arr.add(new Human("전은지"));
		// arr.add("이지수");
		
		// 파일에 내용 작성하기, 파일로부터 내용 가져오기
		// 파일에 객체 정보 저장하기(직렬화), 파일로부터 객체 정보 가져오기(역직렬화) // 객체 캐스팅 하라는 것?
		
		File f = new File("Test.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// UDP 또는 TCP에서 클라이언트, 서버 구성하게
	}

}
