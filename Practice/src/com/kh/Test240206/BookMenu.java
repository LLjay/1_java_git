package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library==");
		
		while(true) {
			System.out.println();
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
//				insertBook();
				this.insertBook(); // 꼭 this 붙여줄것~~~
				break;
			case 2 : 
//				selectList();
				this.selectList();
				break;
			case 3 : 
//				searchBook();
				this.searchBook();
				break;
			case 4 : 
//				deleteBook();
				this.deleteBook();
				break;
			case 5 : 
//				ascBook();
				this.ascBook();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void insertBook() {
		System.out.print("===== 새 도서 추가 =====");
		System.out.print("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine().trim();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine().trim();
		
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int cNum = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		String category = null;
		// 기본 자료형은 선언만으로도 되는데 왜 참조변수는 null을 꼭 명시해줘야 하지?
		// 어차피 똑같은 거 아닌가?
		// 사용자가 예외가 발생할 수 있다는 것을 인지하고 null값을 의도적으로 넣지 않으면
		// 컴퓨터가 예외가 발생할 수 있다고 고지해줘야 하기 때문에 오류가 남
		// 컴파일러 입장에서는 초기화를 안 해줬으므로 값이 없는데 들어갈 수 있다고 알려주는 것
		// default를 넣거나 초기화를 해주거나 둘 중 하나
		
		switch(cNum) {
		case 1 : 
			category = "인문";
			break;
		case 2 :
			category = "자연과학";
			break;
		case 3 : 
			category = "의료";
			break;
		case 4 : 
			category = "기타";
			break;
		}
		
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
		
	}
	
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> bookList = bc.selectList();
		
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
//			for (int i = 0; i < bookList.size(); i++) {
//				System.out.println(bookList.get(i));
//			}
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색할 도서 명 : ");
		String title = sc.nextLine().trim();
		
//		ArrayList searchList = bc.searchBook(title);
		ArrayList<Book> searchList = bc.searchBook(title);
		
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine().trim();
		
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine().trim();
		
		Book removeBook = bc.deleteBook(title, author);
		
		if (removeBook == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else if (removeBook != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		
		
	}
	
	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
	}
}
