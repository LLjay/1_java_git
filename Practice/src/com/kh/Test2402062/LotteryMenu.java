package com.kh.Test2402062;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.insertObject();
				break;
			case 2 : 
				this.deleteObject();
				break;
			case 3 : 
				this.winObject();
				break;
			case 4 : 
				this.sortedWinObject();
				break;
			case 5 : 
				this.searchWinner();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.print("추첨자 이름 : ");
			String name = sc.nextLine().trim();
			
			System.out.print("추첨자 핸드폰 번호 : ");
			String phone = sc.nextLine().trim();
			
			Lottery l = new Lottery(name, phone);
//			if (lc.insertObject(l) == false) {
			if (!lc.insertObject(l)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--; // 아~~~ 조건으로 넣어도 저 메소드가 실행 되어야 논리값 결과가 나오니까 실행을 한 후에 비교하는 거구나
			}
		}
		
		System.out.println(num + "명 추가 완료되었습니다.");
		System.out.println(lc.printLottery());
		
	}
	
	public void deleteObject() {
		System.out.println("삭제할 추첨자 이름 : ");
		String name = sc.nextLine().trim();
		
		System.out.println("삭제할 추첨자 번호 : ");
		String phone = sc.nextLine().trim();
		
		Lottery l = new Lottery(name, phone);
		
		boolean isTrue = lc.deleteObject(l);
		
		if (isTrue == true) {
			System.out.println("삭제 완료되었습니다.");
		} else if (isTrue == false) {
			System.out.println("존재하지 않는 대상입니다.");
		}
//		System.out.println(lc.printLottery());
	}
	
	public void winObject() {
		System.out.println(lc.winObject());
//		HashSet winSet = lc.winObject();
//		if (winSet != null) {
//			System.out.println(winSet);
//		} else {
//			System.out.println("당첨 결과가 없습니다.");
//		}
		// 강사님 예시
//		HashSet<Lottery> winSet = lc.winObject();
//		if (winSet != null) {
//			System.out.println(winSet);
//		} else {
//			System.out.println("당첨 결과가 없습니다.");
//		}
	}
	
	public void sortedWinObject() {
//		System.out.println(lc.sortedWinObject());
		
		TreeSet<Lottery> sortedList = lc.sortedWinObject();
		if (sortedList.isEmpty()) {
			System.out.println("당첨 결과가 없습니다.");
		} else {
			Iterator<Lottery> it = sortedList.iterator();
			
			while(it.hasNext()) {
				Lottery l = it.next();
				System.out.println(l);
			}
		}
	}
	
	public void searchWinner() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("핸드폰 번호");
		String phone = sc.nextLine();
		
//		boolean isTrue = lc.searchWinner(new Lottery(name, phone));
//		
//		if (isTrue == true) {
//			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
//		} else if (isTrue == false) {
//			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
//		}
		
		Lottery l = new Lottery(name, phone);
		
		if (lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		} // true가 나오니까 else로 넘어가지 않고 false로 나오면 else로 넘어감
		
	}

}
