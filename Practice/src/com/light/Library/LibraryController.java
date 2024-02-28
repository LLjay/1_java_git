package com.light.Library;

public class LibraryController {
	Member mem = null;
	Book[] bList = new Book[5];
	
	public void insertMember(Member mem) {
		this.mem = mem;
	} 
	
	public Member myInfo() {
		return this.mem;
	}

}
