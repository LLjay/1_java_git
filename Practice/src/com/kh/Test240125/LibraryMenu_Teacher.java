package com.kh.Test240125;

import java.util.Scanner;

public class LibraryMenu_Teacher {

	LibraryController lc;
	Scanner sc;
	// 생성자 안에서 하는 이유 => 모든 필드의 초기화는 생성자에서 할 것
	// 생성자 안에서 명시적으로 초기화 해줄 것
	
	public LibraryMenu_Teacher() {
		lc = new LibraryController();
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		String name;
		int age;
		char gender;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next().toLowerCase().charAt(0);
		// LowerCase는 무조건 소문자로 만들어줌, UpperCase는 무조건 대문자로 만들어줌
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
//		for ( ; ; ) 도 사용 가능하긴 함
		while(true) {
			System.out.println("=====메인 메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			// if (bList[i] == null { break; } 등
			if (bList[i] != null) { // 이런 경우는 실행 시에 발견 되는 오류, 습관적으로 null이 아니라는 조건을 붙여주는 게 좋음
				System.out.println(i + "번 도서 : " + bList[i].toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		
		for (int i = 0; searchList[i] != null; i++) {
			System.out.println(i + "번 도서 : " + searchList[i].toString());
		}
	}
	
	
	public void rentBook() {
		this.selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if (result == 0) {
			System.out.println("성공적으로 대여 되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
		
	}
	
	
}
