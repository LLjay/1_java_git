package com.kh.Test240123;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 사용자로부터 이름 수학 국어 영어 점수를 입력 받아
		// 평균을 실수로 구하세요.
		
		// 위에서 입력 받은 정보로 객체를 생성할 수 있는 Student 클래스를 작성하세요.
		// 평균을 구하는 메소드를 포함하여 작성합니다.
		
		// 해당 프로그램을 작성합니다.
		// =========성적관리 프로그램=========
		// 1. 성적 입력
		// 2. 성적 확인
		// 3. 학생 성적 검색
		// 9. 종료
		// 메뉴를 입력하세요 : 1
		// -> 1번 입력 시 입력 받아 객체 배열에 저장(이름 중복저장 안 됨)
		// -> 2번 입력 시 객체 배열에 저장된 모든 객체 정보 표시
		// -> 3번 입력 시 이름을 입력 받아 해당 이름의 학생 검색 후 정보 출력
		// -> 9번 입력 시 종료
		
//		Scanner sc = new Scanner(System.in);
//		int menuNum, count = 0;
//		Student[] miraeSchool = new Student[100];
//		boolean tobeContinued1 = true;
//		boolean tobeContinued2 = true;
//		
//		while(tobeContinued1) {
//		System.out.println("=========성적관리 프로그램=========");
//		System.out.println("1. 성적 입력");
//		System.out.println("2. 성적 확인");
//		System.out.println("3. 학생 성적 검색");
//		System.out.println("9. 종료");
//		System.out.print("메뉴를 입력하세요 : ");
//		menuNum = sc.nextInt();
//		sc.nextLine();
//		
//		switch(menuNum) {
//		case 1 : {
////			while(tobeContinued2) {
//				System.out.print("이름 입력 : ");
//				String name = sc.nextLine();
//				
//				System.out.print("수학 성적 입력 : ");
//				int mathScore = sc.nextInt();
//				
//				System.out.print("국어 성적 입력 : ");
//				int koreanScore = sc.nextInt();
//				
//				System.out.print("영어 성적 입력 : ");
//				int engScore = sc.nextInt();
//				
//				
//				
//				miraeSchool[count] = new Student(name, mathScore, koreanScore, engScore);
//				System.out.println(miraeSchool[count++].toString());
//				break;
////				char reply;
////				System.out.println("등록을 계속 하시겠습니까?(y/n) : ");
////				reply = sc.next().charAt(0);
////				
////				if (reply == 'n') {
////					tobeContinued2 = false;
////					}
////				
////				}
//			}
//		case 2 :
//			for (int i = 0; i < miraeSchool.length; i++) {
//				if (miraeSchool[i] == null) {
//					break;
//				} else {
//					System.out.println(miraeSchool[i].toString());
//				}
//			}
//			break;
//		case 3 : {
//			System.out.println("학생 성적을 검색 : ");
//			String name = sc.nextLine();
//			
//			for (int i = 0; i < miraeSchool.length; i++) {
//				if (miraeSchool[i] == null) {
//					break;
//				} else if (name.equals(miraeSchool[i].getName())) { // String은 이퀄...
//					System.out.println(name + "의 성적 : " + miraeSchool[i].toString());
//				}
//			}
//			break;
//		}
//		case 9 : 
//			System.out.println("프로그램을 종료합니다.");
//			tobeContinued1 = false;
//			break;
//		}
//			
//	}	
		
		
		
		
		
		
		
		
		// 강사님 예시
		
//		Scanner sc = new Scanner(System.in);
//		
//		Student[] stArr = new Student[100];
//		int select = 0, index = 0;
//		
//		while(select != 9) {
//			System.out.println("=========성적관리 프로그램=========");
//			System.out.println("1. 성적 입력");
//			System.out.println("2. 성적 확인");
//			System.out.println("3. 학생 성적 검색");
//			System.out.println("9. 종료");
//			System.out.print("메뉴를 입력하세요 : ");
//			select = sc.nextInt();
//			
//			switch(select) {
//			case 1 : {
//				String name;
//				int mathScore, koreanScore, engScore;
//				System.out.print("이름 입력 : ");
//				name = sc.next();
//				
//				System.out.print("수학 성적 입력 : ");
//				mathScore = sc.nextInt();
//				
//				System.out.print("국어 성적 입력 : ");
//				koreanScore = sc.nextInt();
//				
//				System.out.print("영어 성적 입력 : ");
//				engScore = sc.nextInt();
//				
//				int i = 0;
//				boolean isTrue = false; // 중복이 존재하면 true/존재하지 않으면 false로 유지
//			
//				while(stArr[i] != null) {
//					if(stArr[i++].getName().equals(name)) {
//						System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
//						isTrue = true;
//						break;
//					}
//				}
//				
//				if (!isTrue) {
//					stArr[index] = new Student(name, mathScore, koreanScore, engScore);
//					System.out.println("성적 저장 완료 : " + stArr[index++].toString());
//				}
//			} break;
//				
//			case 2 : {
//				for (int i = 0; stArr[i] != null; i++) {
//					System.out.println(stArr[i].toString());
//				}
//			} break;
//			
//			case 3 : {
//				String name;
//				System.out.println("이름 입력 : ");
//				name = sc.next();
//				
//				int i = 0;
//				boolean isTrue = false;
//				
//				while(stArr[i] != null) {
//					if(stArr[i].getName().equals(name)) {
//						System.out.println(stArr[i].toString());
//						isTrue = true;
//						break;
//					}
//					i++; // 이거 어떻게 하지?
//				}
//				
//				if (!isTrue) {
//					System.out.println("해당 이름으로 검색되는 학생 없음");
//				}
//			} break;
//			case 9 : 
//				System.out.println("프로그램을 종료합니다.");
//				return; // while(true)여도 메인 메소드 탈출하므로 종료됨
//			}
//		}
		
		// 이거나
		StudentManagement st = new StudentManagement();
		st.startProgram();
		
		// 이거나
		new StudentManagement().startProgram();
		
	}
}
