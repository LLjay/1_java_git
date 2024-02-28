package com.kh.Test240122;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 정수 n(2~9)을 입력 받아 2부터 n까지 중 짝수의 구구단을 출력하는 함수를 작성하세요.
		// 만약 2~9 사이의 값을 입력하지 않았다면 다시 입력하세요를 반복합니다.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수(2~9)를 입력하세요. : ");
//		int num;
//		
//		while(true) {
//			num = sc.nextInt();
//		
//			if (num >=2 && num <= 9) {
//				break;
//			} else {
//				System.out.println("다시 입력하세요. : ");
//			}
//		}
		
//		for (int i = 2; i < 9; i += 2) {
//			System.out.printf("%d * %d = %d\n", num, i, (num*i));
//		}
		
		
		// 강사님 예시
		
//		for (int i = 2; i <= num; i++) {
//			if (i % 2 == 0) {
//				for (int j = 1; j < 10; j++) {
//					System.out.printf("%d * %d = %d\n", i, j, (i*j));
//				}
//				System.out.println();
//			}
//		}
		
		// 정수 num을 입력 받아 크기가 num인 정수형 배열을 만들고 1~100 사이의 랜덤값으로 모든 배열의 값을 대입합니다.
		// 이후 모든 배열의 홀수 인덱스의 값을 더한 값을 구하세요.
		
//		System.out.print("정수를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//			if (i % 2 != 0) {
//				sum += arr[i];
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 != 0) {
//				System.out.println(arr[i]);
//			}
//		}
//		System.out.println(sum);
//		
		// 정수 num 입력 받아 배열 만들기
		// 0 ~ (num - 1 또는 배열의 길이 - 1)까지 반복하며 Math.random() * 100 + 1 값 대입해주기
		// 변수 sum 만들고 전체 배열 반복하며 인덱스 i가 i % 2 = 1인 값 더하기
		// 더한 값 출력
		
//		System.out.print("정수를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//		}
//		
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (i % 2 == 1) {
//				sum += arr[i];
//			}
//		}
//		System.out.println(sum);
//		
//		// 다음과 같은 코드를 실행 했을 때 예시와 같은 결과가 출력 되도록 TV 클래스를 작성하세요.
//		// TV myTV = new TV("삼성", 2020, 65);
//		// myTV.show();
//		// => 삼성에서 만든 2020년형 65인치 TV
		
//		TV myTV = new TV("삼성", 2020, 65, 100000);
//		myTV.show();
		
//		TV myTV2 = new TV("LG", 2024, 85, 200000);
//		myTV2.show();
		
		// one이라는 Human 객체를 생성하고
		// 해당 객체로 myTV와 myTV2 구매가 가능한지 확인

		
		// 내 예시
//		Human one = new Human("솔", 150000);
//		one.buy(myTV.getPrice());
//		one.buy(myTV2.getPrice());
		
		
		// 강사님 예시
//		Human one = new Human("솔", 150000);
//		one.buy(myTV);
//		one.buy(myTV2);
		
//		Human choi = new Human("최지원", 15000);
//		System.out.println(choi.count);
//		
//		Human kim = new Human("김지원", 15000);
//		System.out.println(kim.count);
		
		
// ==========================================================================
	
		/*
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
		 * 해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성할 Book 클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자.
		 * 
		 * Book book1 = new Book(초기화 변수);
		 */
		
		// 사용자로부터 정보를 입력 받아
		// book 객체를 생성하고 생성된 객체의 toString 메소드를 호출하여 정보를 확인해주세요.
		
//		String bookName, writer, bookTheme;
//		int bookNum, bookEA, count = 0;
//		boolean tobeContinued = true;
//		
//		Book[] bookArr = new Book[3];
//		
//		while(tobeContinued) {
//			
//			System.out.println("==============도서관리 프로그램==============");
//			System.out.println("1. 도서등록");
//			System.out.println("2. 도서목록출력");
//			System.out.println("9. 종료");
//			System.out.println("메뉴 선택()");
//			menu = sc.nextInt();
//			
//			switch(menu) {
//			case 1 :
//			case 2 :
//			case 9 :
//			}
//			
//			System.out.println("책 이름, 책 번호, 저자, 장르, 권 수를 입력하세요.");
//			
//			bookName = sc.nextLine();
//			
//			bookNum = sc.nextInt();
//			sc.nextLine();
//			
//			writer = sc.nextLine();
//			
//			bookTheme = sc.nextLine();
//			
//			bookEA = sc.nextInt();
//			sc.nextLine();
//			
//	//		Book book1 = new Book(bookName, bookNum, writer, bookTheme, bookEA);
//	//		System.out.println(book1.toString());
//			
//			bookArr[count] = new Book(bookName, bookNum, writer, bookTheme, bookEA);
//			System.out.println("도서 등록 완료 : " + bookArr[count].toString());
//			
//			// 문자열.toLowerCase() => 모든 문자를 소문자로 변경
//			System.out.println("계속 등록하시겠습니까?(y/n) : ");
//			tobeContinued = sc.next().toLowerCase().charAt(0) == 'y' ? true : false;
//			sc.nextLine();
//		}
//		
//		
//		// 배열 bookArr에 등록된 모든 도서정보 출력
//		// =================등록된 도서정보=================
//		// 
//		
//		System.out.println("=================등록된 도서정보=================");
//		
//		for (int i = 0; i < bookArr.length && bookArr[i] != null; i++) {
//			if (bookArr[i] == null) {
//			System.out.println(bookArr[i].toString());
//			}
//		} // 저장되지 않은 번호가 있기 때문에 오류남
		
		
		
		
		
		
		
		
		int count = 0;
		int menu = 0;
		
		Book[] bookArr = new Book[3];
		
		while(menu != 9) {
			
			System.out.println("==============도서관리 프로그램==============");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("3. 도서탐색");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택()");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : {
				System.out.println("책 이름, 책 번호, 저자, 장르, 권 수를 입력하세요.");
				
				String bookName = sc.nextLine();
				
				int bookNum = sc.nextInt();
				sc.nextLine();
				
				String writer = sc.nextLine();
				
				String bookTheme = sc.nextLine();
				
				int bookEA = sc.nextInt();
				sc.nextLine();
				
		//		Book book1 = new Book(bookName, bookNum, writer, bookTheme, bookEA);
		//		System.out.println(book1.toString());
				
				bookArr[count] = new Book(bookName, bookNum, writer, bookTheme, bookEA);
				System.out.println("도서 등록 완료 : " + bookArr[count++].toString());
			} break; //중괄호로 영역을 나눠주면 그 다음에 쓸 bookName은 영향 받지 않음
			case 3 : 
				System.out.println("=================도서검색=================");
				System.out.println("검색할 도서 제목 : ");
				String bookName = sc.nextLine();
				Book target = null;
				
				for (int i = 0; i < bookArr.length; i++) {
					if (bookArr[i] == null) {
						break;
					} else if (bookArr[i].getTitle().equals(bookName)) { // Book 배열 요소에 있는 제목이 입력 받
						target = bookArr[i];
						break;
					}
				}
				if (target == null) {
					System.out.println("동일한 제목의 도서가 없습니다.");
				} else { 
					System.out.println("검색 도서 정보 : ");
					target.toString();
				}
				
			} break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");

		}
		// 배열 bookArr에 등록된 모든 도서정보 출력
		// =================등록된 도서정보=================
		// 
		
	
		
		
	}

}
