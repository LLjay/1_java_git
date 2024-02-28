package com.kh.Test240122;

import java.util.Scanner;

public class Run_library {
	public static void main(String[] args) {
	
		// 1. 도서 등록 프로그램
		// 2. 도서 목록 출력
		// 3. 도서 탐색
		// 9. 종료
		
		Scanner sc = new Scanner(System.in);
		
		Library[] book = new Library[100];
		int count = 0;
		
		System.out.println("1. 도서 등록 프로그램");
		System.out.println("도서 제목 : ");
		String bkName = sc.nextLine();
		
		System.out.println("도서 번호 : ");
		int bkNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.println("도서 장르 : ");
		String genre = sc.nextLine();
		
		book[count] = new Library(bkName, bkNum, writer, genre);
		System.out.println("등록 완료 : " + book[count++]);
		
		
		System.out.println("2. 도서 목록 출력");
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				System.out.println(book[i].toString());
			}
		}
		
		
		System.out.println("3. 도서 탐색");
		System.out.println("검색할 도서 제목 : ");
		String title = sc.nextLine();
		
		if 
		
		
	}

}
