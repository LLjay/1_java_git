package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookController {
	
	List<Book> list = new ArrayList();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
//		list.add(bk);
		this.list.add(bk); // 다 this 명시~~~~
	}
	
	public ArrayList selectList() {
		return (ArrayList)list;
	}

	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		
//		for(int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTitle().contains(keyword)) {
//			searchList.add(list.get(i));
//			}
//		}
		
		for (Object obj : list) {
			if (obj instanceof Book) {
				Book book = (Book)obj; // 아무리 코드가 확장돼도 이게 북이라는 확신이 있으면 써도 되는데 어떻게 확장될지 모르므로 그냥 써주는게 나음
				
				if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
					searchList.add(book);
				}
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// index로 제거, obj로 제거
//		Book removeBook = null;
//		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getTitle().equals(title) &&
//				list.get(i).getAuthor().equals(author)) {
//				removeBook = list.get(i);
//				list.remove(i);
//			}
//		}
//		return removeBook;
		
		for (Object obj : this.list) {
			if (obj instanceof Book) {
				Book book = (Book)obj;
				if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
					list.remove(book);
					return book;
				}
			}
		}
		
		return null;
	}
	
	public int ascBook() {
//		int num = 0;
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < i; j++) {
//				num = list.get(i).getTitle().compareTo(list.get(j).getTitle());
//				if (num == 1) {
//					 list.add(list.get(i));
//				}
//			}
//		}
//
//		return 1;
		
		/*
		 * 문자열.compareTo => 두 문자열이 동일한 경우 : 0 반환
		 * 					  사전적으로 먼저 위치한 문자열이 앞에 나온 경우 : 음수 반환
		 * 					  사전적으로 먼저 위치한 문자열이 뒤에 나온 경우 : 양수 반환
		 */
		try {
			this.list.sort((obj1, obj2) -> ((Book)obj1).getTitle().compareTo(((Book)obj2).getTitle()));
			return 1;
		} catch (Exception e) {
			return 0;
		}
			//
//		this.list.sort(new Comparator<Book>() {
//			@Override
//			public int compare(Book obj1, Book obj2) {
//				return obj1.getTitle().compareTo(obj2.getTitle());
//			}
//		});
		
	}
	
	
}
