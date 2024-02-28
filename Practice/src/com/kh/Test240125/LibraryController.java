package com.kh.Test240125;

public class LibraryController {
	// 클래스는 정의하는 곳, 코드 구현 영역이 아님
	
	Member mem = null;
	
	Book[] bList = {
		new CookBook("백종원의 집밥", "백종원", "tvN", true), 
		new AniBook("한번 더 해요", "미티", "원모어", 19), 
		new AniBook("루피의 원피스", "루피", "japan", 12), 
		new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false), 
		new CookBook("최현석 날 따라해봐", "최현석", "소금책", true)
	};
	
	

	
	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		return this.mem;
	}
	// Member m = new Member();
	// return m;
	
	public Book[] selectAll() {
		return this.bList;
	}
	// Book[] b = new Book[10];
	// return b;
	
	public Book[] searchBook(String keyword) {
		Book[] bArr = new Book[5];
		
		for (int i = 0; i < bList.length; i++) {
			if ((bList[i].getTitle()).contains(keyword)) { // 특정 단어를 포함하는 걸 어떻게 코드로 풀지?
					bArr[i] = bList[i];
				}
			}
		return bArr;
	} // 배열은 띄엄띄엄 담으면 안 됨, 순서대로 넣는 게 기본
	
	// Book[] b = new Book[10];
	// return b;
	
	public int rentBook (int index) {
		
		int result = 0;
		
		if (bList[index] instanceof AniBook) {
			if (((AniBook)bList[index]).getAccessAge() <= mem.getAge()) {
				result = 0;
			} else {
				result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).isCoupon()) {
				result = 2;
				mem.setCouponCount(mem.getCouponCount()+1);
			} 
		}
		return result;
	}
}