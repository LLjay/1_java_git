package com.kh.Test240208;

import java.util.List;
import java.util.Scanner;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.addList();
				break;
			case 2 : 
				this.addAtZero();
				break;
			case 3 : 
				this.printAll();
				break;
			case 4 : 
				this.searchMusic();
				break;
			case 5 : 
				this.removeMusic();
				break;
			case 6 : 
				this.setMusic();
				break;
			case 7 : 
				this.ascTitle();
				break;
			case 8 : 
				this.descSinger();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
		
	public void addList() {
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		if (mc.addList(m) == 1) {
			System.out.println("추가 성공.");
		} else {
			System.out.println("추가 실패.");
		}
	}
	
	public void addAtZero() {
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		if (mc.addAtZero(m) == 1) {
			System.out.println("추가 성공.");
		} else {
			System.out.println("추가 실패.");
		}
		
	}
	
	public void printAll() {
		List<Music> list = mc.printAll();
		
		for (Music m : list) {
			System.out.println(m);
		}
	}
	
	public void searchMusic() {
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music m = mc.searchMusic(title);
		
		if (m != null) {
			System.out.println(m);
		} else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music m = mc.removeMusic(title);
		
		if (m != null) {
			System.out.println(m + "을 삭제 했습니다.");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}
		
	}
	
	public void setMusic() {
		System.out.print("검색할 곡 명 : ");
		String oldTitle = sc.nextLine();
		
		System.out.print("수정할 곡 명 : ");
		String newTitle = sc.nextLine();
		
		System.out.print("수정할 가수 명 : ");
		String newSinger = sc.nextLine();
		
		Music m = new Music(newTitle, newSinger);
		
		
		if (mc.setMusic(oldTitle, m) != null) {
			System.out.println(m + "의 정보가 변경 되었습니다.");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}
	
	public void ascTitle() {
		if (mc.ascTitle())
	}
	
	public void descSinger() {
		
	}

}
