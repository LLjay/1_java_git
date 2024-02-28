package com.kh.Test240123;

import java.util.Scanner;

public class StudentManagement { // 학생 관리 프로그램
	
	Scanner sc;
	Student[] stArr; // 학생 목록
	
	public StudentManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.stArr = new Student[100];
	}
	
	public void startProgram() {
		
		int select = 0;
		while(select != 9) {
			select = this.printMenu();
			
			switch(select) {
			case 1 : // 성적입력
				this.insertScore();
				break;
			case 2 : // 모든 학생 성적 확인
				this.printScore();
				break;
			case 3 :
				this.searchScore();
				break;
			case 4 : // 마지막으로 저장된 정보 삭제
				this.lastScoreDelete();
				break;
			case 5 : // 마지막으로 저장된 정보 삭제
				this.printGradeByCondition();
				break;
			case 9 :
//				this.logOff();
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
		}
	}
	public int printMenu() {
		System.out.println("=========성적관리 프로그램=========");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 확인");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 마지막 저장 정보 삭제");
		System.out.println("5. 조건 검색");
		System.out.println("9. 종료");
		System.out.print("메뉴를 입력하세요 : ");
		int select = sc.nextInt();
		sc.nextLine();
		return select;
	}
	
	public void insertScore() {
		String name;
		int mathScore, koreanScore, engScore;
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("수학 성적 입력 : ");
		mathScore = sc.nextInt();
		
		System.out.print("국어 성적 입력 : ");
		koreanScore = sc.nextInt();
		
		System.out.print("영어 성적 입력 : ");
		engScore = sc.nextInt();
		
		int i = 0;
		boolean isTrue = false; // 중복이 존재하면 true/존재하지 않으면 false로 유지
	
		while(stArr[i] != null) {
			if(stArr[i++].getName().equals(name)) {
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				isTrue = true;
				break;
			}
		}
		
		if (!isTrue) {
			stArr[i] = new Student(name, mathScore, koreanScore, engScore);
			System.out.println("성적 저장 완료 : " + stArr[i++].toString());
		}
	}
	
	public void printScore() {
		for (int i = 0; stArr[i] != null; i++) {
			System.out.println(stArr[i].toString());
		}
		
		if (stArr[0] == null) {
			System.out.println("입력된 성적이 없습니다.");
		}
	} 

	public void searchScore() {
		
		String name;
		System.out.println("이름 입력 : ");
		name = sc.next();
		
		int i = 0;
		boolean isTrue = false;
		
		while(stArr[i] != null) {
			if(stArr[i].getName().equals(name)) {
				System.out.println(stArr[i].toString());
				isTrue = true;
				break;
			}
			i++; // 이거 어떻게 하지?
		}
		
		if (!isTrue) {
			System.out.println("해당 이름으로 검색되는 학생 없음");
		}
	}
	
	public void lastScoreDelete() {
		if (stArr[0] == null) {
			System.out.println("삭제할 성적이 없습니다.");
			return;
		}
		
		for(int i = 1; i < stArr.length; i++) {
			if(stArr[i] == null) {
				System.out.println("삭제정보 : " + stArr[i-1].toString());
				stArr[i-1] = null;
				break;
				// return; 가능
			}
		}
	}
	
	public void printGradeByCondition() {
		// 1. 평균 2. 수학 3. 국어 4. 영어
		// 다른 번호 입력 시 잘못 입력하셨습니다. 출력하고 성적 관리 프로그램으로 돌아가기.
		// 삭제할 조건 입력 : 1
		// 기준 점수 (이상) : 50 
		// 기준 점수 (이하) : 30
		// 50 이상 30 이하의 평균 학생 출력
		
		int num, maxScore, minScore;
		
		System.out.println("=====조건 검색=====");
		System.out.println("1. 평균");
		System.out.println("2. 수학");
		System.out.println("3. 국어");
		System.out.println("4. 영어");
		System.out.println("조건 입력 : ");
		num = sc.nextInt();
		
		System.out.print("기준 점수(이상) : ");
		maxScore = sc.nextInt();
		
		System.out.print("기준 점수(이하) : ");
		minScore = sc.nextInt();
		
		// 내 예시
		if (stArr[0] == null) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		switch(num) {
		case 1 : 
			for (int i = 0; i < stArr.length; i++) {
				if (stArr[i] == null) {
					break;
				} else if (stArr[i].evarage() >= minScore && stArr[i].evarage() <= maxScore) {
					System.out.println(stArr[i].getName());
				} else {
					System.out.println("해당하는 학생이 없습니다.");
					break;
				}
			} break;
		case 2 : 
			for (int i = 0; i < stArr.length; i++) {
				if (stArr[i] == null) {
					break;
				} else if (stArr[i].getMathScore() >= minScore && stArr[i].getMathScore() <= maxScore) {
					System.out.println(stArr[i].getName());
				} else {
					System.out.println("해당하는 학생이 없습니다.");
					break;
				}
			} break;
		case 3 : 
			for (int i = 0; i < stArr.length; i++) {
				if (stArr[i] == null) {
					break;
				} else if (stArr[i].getKoreanScore() >= minScore && stArr[i].getKoreanScore() <= maxScore) {
					System.out.println(stArr[i].getName());
				} else {
					System.out.println("해당하는 학생이 없습니다.");
					break;
				}
			} break;
		case 4 : 
			for (int i = 0; i < stArr.length; i++) {
				if (stArr[i] == null) {
					break;
				} else if (stArr[i].getEngScore() >= minScore && stArr[i].getEngScore() <= maxScore) {
					System.out.println(stArr[i].getName());
				} else {
					System.out.println("해당하는 학생이 없습니다.");
					break;
				}
			} break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		//강사님 예시
		
//		switch(num) {
//		case 1 : 
//			for (int i = 0; stArr[i] != null; i++) {
//				double evarage = stArr[i].evarage();
//				if (minScore <= evarage && maxScore >= evarage) {
//					System.out.println(stArr[i].toString());
//				}
//			}
//		}
	}
	
	public void logOff() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	
}
