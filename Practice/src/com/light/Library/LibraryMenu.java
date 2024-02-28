package com.light.Library;

import java.util.Scanner;

public class LibraryMenu {
	
	Scanner sc;
	LibraryController lc = new LibraryController();
	
	public LibraryMenu () {
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		// 이 필드 전체에서 필요한 객체의 속성이 아니니까.
		// 그냥 매개변수로 받아줄 변수인데 굳이 필드에 명시해줄 필요가 없다.
		// 인덱스 번호 i 같은 걸 필드에 명시해주진 않으니까.
		// 이 메소드 바깥을 나가도 전혀 상관 없는 값이다.
		
		String name;
		int age;
		char gender;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		System.out.println("=====메뉴=====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.println("메뉴 번호 : ");
		
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1 :
			System.out.println(lc.myInfo().toString());
		case 2 : 
			selectAll();
		case 3 :
			searchBook();
		case 4 :
			rentBook();
		case 9 : 
		default :
		}
		
	}

}
