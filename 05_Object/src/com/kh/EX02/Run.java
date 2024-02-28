package com.kh.EX02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		// choi 객체 생성 최지원, 15살, 영어 : 60점, 수학 : 70점, 국어 : 80점
		// kim 객체 생성 김도헌, 17살, 영어 : 95점, 수학 : 85점, 국어 : 80점
//		
//		Student choi = new Student("최지원", 15, 60, 70, 80);
//		Student kim = new Student("김도헌", 17, 95, 85, 80);
		
		// choi의 모든 과목의 평균을 출력하라
		
//		int evar1 = (choi.getMathScore() + choi.getEngScore() + choi.getKoreanScore()) / 3;
//		System.out.println(choi.getName() + "님의 평균 : " + evar1);
//		
//		// kim의 모든 과목의 평균을 출력하라
//		
//		int evar2 = (kim.getMathScore() + kim.getEngScore() + kim.getKoreanScore()) / 3;
//		System.out.println(kim.getName() + "님의 평균 : " + evar2);
//		// => 여러 번 활용할 기능이라면 이걸 메소드로 만들면 됨
//		
//		System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg);
//		System.out.println(kim.getName() + "님의 평균 : " + kim.getEvg);

		// 사용자로부터 이름, 나이, 영어 수학 국어점수를 입력 받아
		// 평균을 구하고 출력하는 프로그램 작성
		// ex) 이름 : 최지원
		// 		나이 : 15
		// 		영어 : 80
		// 		수학 : 100
		// 		국어 : 75
		// 최지원님의 평균은 입니다.
		
		// 내 예시
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		int age = sc.nextInt();
//		int engScore = sc.nextInt();
//		int mathScore = sc.nextInt();
//		int koreanScore = sc.nextInt();
//		
//		choi
		
		
		// 강사님 예시
//		Scanner sc = new Scanner(System.in);
//		String name;
//		int age, en, ko, math;
//		
//		System.out.print("이름 : ");
//		name = sc.next();
//		
//		System.out.println("나이 : ");
//		age = sc.nextInt();
//		
//		System.out.println("영어점수 : ");
//		en = sc.nextInt();
//		
//		System.out.println("국어점수 : ");
//		ko = sc.nextInt();
//		
//		System.out.println("수학점수 : ");
//		math = sc.nextInt();
//		
//		Student st1 = new Student(name, age, math, en, ko);
//		
//		System.out.println(st1.getName() + "님의 평균 : " + st1.getEvg());
		
		
		
		// kh 대학교, evgCut : 75, enCut : 60, koCut : 60으로 객체 생성
		
//		University kh = new University("kh대학교", 75, 60, 60);
//		Student choi = new Student("최지원", 15, 60, 70, 80);
		
		// choi 학생 객체는 kh대학교에 입학이 가능한지 검사하여
		// 가능하다면 "합격입니다"
		// 불가능하다면 "불합격입니다"
		// 를 출력하는 프로그램 작성
		
		// 내 예시
//		if (choi.getEngScore() >= kh.getEnCut() &&
//				choi.getKoreanScore() >= kh.getKoCut() &&
//				choi.getEvg(60, 80, 70) >= kh.getEvgCut()) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}

		// 강사님 예시
		// choi 학생의 평균이 kh대학교의 평균컷보다 높은지
		// 학생의 각각의 점수는 kh대학교의 각각의 컷보다 높은지
		
	
		NumberPrinter.showDouble(0.3);
		
		
		
	}

}
