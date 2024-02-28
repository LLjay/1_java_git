package com.kh.Test240125;

public class LibraryController_Teacher {
	private Member mem = null;
	private Book[] bList; // 생성자 만들 때 만들어도 됨

	public LibraryController(Mem) {
			new CookBook("백종원의 집밥", "백종원", "tvN", true), 
			new AniBook("한번 더 해요", "미티", "원모어", 19), 
			new AniBook("루피의 원피스", "루피", "japan", 12), 
			new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false), 
			new CookBook("최현석 날 따라해봐", "최현석", "소금책", true)
		};
//	insertMember(null); -> Member mem = null; 성립
//	insertMember(new Member();) -> Member mem = new Member(); 성립
	
//	public void insertMember(Member mem) {
//	}
//		
//		
//		
//		return new Member;
////		Member m = new Member();
////		return m;
	
	public Book[] searchBook(String keyword) {
		Book[] tmpArr = new Book[5];
		int count = 0;
//		bList 안의 도서들과 keyword를 비교하여 포함하고 있는 경우 tmpArr에 담기
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				tmpArr[count++] = bList[i];
			}
		}
		return tmpArr;
	}
	
	public int rentBook (int index) {
		int result = 0;
		
		// Book -> 상속 관계 중에 AniBook이 존재하니?
		// Book, AniBook, CookBook
		if (bList[index] instanceof AniBook) {
			AniBook aniBook = (AniBook)bList[index]; // 가독성을 좋게 만드는 법, 괄호나 긴 단어가 읽기 불편하게 만듦
			if (mem.getAge() < aniBook.getAccessAge()) { // 회원의 나이가 적을 경우
				result = 1;
		}
	} else if ((bList[index]) instanceof CookBook){ // 나중에 항목이 더 추가될 경우가 있을 수 있으므로 else 말고 예외처리 해주는 게 좋음
		CookBook cookBook = (CookBook)bList[index];
		if (cookBook.isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
	}
		return result;
}
}
