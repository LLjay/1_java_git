package com.kh.Test240125;

import java.util.Scanner;

public class LibraryMenu {
	
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름, 나이, 성별(m/f)을 입력하세요. : ");
		String name = sc.next();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("=====메인 메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				System.out.println(lc.myInfo()); // toString값은 생략되어 있으면 무조건 나옴
				break;
			case 2 :
				selectAll();
				// this.selectAll();
				break;
			case 3 :
				searchBook();
				// this.searchBook();
				break;
			case 4 : 
				rentBook();
				// this.rentBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				sc.close(); // 안 쓰니까 무조건 명시적으로 닫아주기
				return;
			default :
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
				break; // 어차피 디폴트 하면 스위치문 끝나므로 break; 안 넣어도 됨
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = /*이 사이는*/ new Book[5];
		bList = /*생략 가능*/ lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] searchList = /*이 사이는*/ new Book[5];
		searchList = /*생략 가능*/ (lc.searchBook(keyword));
		
		for (int i = 0; i < searchList.length; i++) {
			if (searchList[i] != null) {
			System.out.println(searchList[i].toString());
			}
		}
	}
	
	public void rentBook() {
		Book[] bList = new Book[5];
		bList = lc.selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int bookNum = sc.nextInt();
		
		int result = lc.rentBook(bookNum);
		
		if (result == 0) {
			System.out.println("성공적으로 대여 되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}

}
