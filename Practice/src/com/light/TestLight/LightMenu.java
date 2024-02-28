package com.light.TestLight;

import java.util.ArrayList;
import java.util.Scanner;

public class LightMenu {
	
	Scanner sc;
	LightController lc;
	
	public LightMenu() {
		sc = new Scanner(System.in);
		lc = new LightController();
	}
	
	public void memberCheck() {
		System.out.print("이름 입력 : ");
		String userName = sc.next();
		
		while(true) {
			System.out.print("등급(관리자, 회원) 입력 : ");
			String userGrade = sc.next();
			sc.nextLine();
			
			Member mem = new Member(userName, userGrade);
			lc.insertMember(mem);
			
			if (!(mem.getUserGrade().equals("관리자") || mem.getUserGrade().equals("회원"))) {
				System.out.println("등급이 올바르지 않습니다. 다시 입력하세요.");
				continue;
			} else {
				System.out.println(mem.toString());
				System.out.println();
				
				if (mem.getUserGrade().equals("관리자")) {
					mainMenuManager();
					return;
				} else if (mem.getUserGrade().equals("회원")) {
					mainMenuMem();
					return;
				}
			}
			
//			if (mem.getUserGrade().equals("관리자")) {
//				System.out.println(mem.toString());
//				System.out.println();
//				mainMenuManager();
//				return;
//			} else if (mem.getUserGrade().equals("회원")) {
//				System.out.println(mem.toString());
//				System.out.println();
//				mainMenuMem();
//				return;
//			} else {
//				System.out.println("등급이 올바르지 않습니다. 다시 입력하세요.");
//			}
		}
			
	}
	
	public void mainMenuManager() {
		while(true) {
			System.out.println("==== 조명기 정보 프로그램 ====");
			System.out.println("1. 장비 정보 조회");
			System.out.println("2. 조명기 관리");
			System.out.println("3. 장비 반입/반출 관리");
			System.out.println("4. 장비 수량/전력/무게 계산");
			System.out.println("9. 프로그램 종료");

			System.out.print("번호 입력 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.lightDeviceMenu();
				break;
			case 2 :
				this.lightDeviceManager();
				break;
			case 3 :
				this.lightInOut();
			case 4 :
				this.calcMenu();
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				break;
			}
		}
	}
	
	public void mainMenuMem() {
		
	}
	
	public void lightDeviceMenu() {
		System.out.println("==== 장비 정보 조회 ====");
		System.out.println("1. 전체 장비 리스트 조회");
		System.out.println("2. 장비 검색");
		System.out.println("9. 메인 메뉴로 돌아가기");
		System.out.print("번호 입력 : ");
		
		while(true) {
			System.out.print("번호 입력 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
			
				break;
			case 2 :
				
				break;

			case 9 :
				return;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				break;
			}
		}
	}
	
	public void lightDeviceManager() {
		while(true) {
			System.out.println("==== 조명기 관리 ====");
			System.out.println("1. 장비 등록");
			System.out.println("2. 장비 총수량 수정");
			System.out.println("3. 장비 삭제");
			System.out.println("9. 메인 메뉴로 돌아가기");
			System.out.print("번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.registDevice();
				break;
			case 2 : 
				this.editDevice();
				break;
			case 3 : 
				this.deleteDevice();
				break;
			case 9 :
				return;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				break;
			}
		}
		
	}

	public void registDevice() {
		int menuNum;
		do {
		System.out.println("====등록할 장비 종류====");
		System.out.println("1. Convention");
		System.out.println("2. Moving Spot");
		System.out.println("3. Moving Wash");
		System.out.println("번호 입력 : ");
		
		menuNum = sc.nextInt();
		sc.nextLine();
		} while(menuNum >= 4);
		
		ArrayList<LightDevice> lList = new ArrayList<>();
		int count = 0;
		
		String product, manufacture, powerSource;
		int power, weight, totalQty, xlr, chNum, goboNum, flowerNum;
		boolean flower;
		
		System.out.print("장비명 : ");
		product = sc.nextLine().trim();
		
		System.out.print("제조사 : ");
		manufacture = sc.nextLine().trim();
		
		System.out.print("전력량(watt) : ");
		power = sc.nextInt();
		
		System.out.print("무게(kg) : ");
		weight = sc.nextInt();
		
		System.out.print("총수량 : ");
		totalQty = sc.nextInt();
		sc.nextLine();
		
		if (menuNum == 1) {
			lList.add(lc.registConvention(product, manufacture, power, weight, totalQty));
		} else if (menuNum == 2 || menuNum == 3) {
			System.out.print("램프/LED : ");
			powerSource = sc.nextLine().trim();
			
			System.out.print("DMX pin(3/5) : ");
			xlr = sc.nextInt();
			
			System.out.print("채널 번호 : ");
			chNum = sc.nextInt();
			switch(menuNum) {
			case 2 : 
				System.out.print("고보 수량 : ");
				goboNum = sc.nextInt();
				sc.nextLine();
				lList.add(lc.registSpot(product, manufacture, power, weight, totalQty, powerSource, xlr, chNum, goboNum));
				break;
			case 3 : 
				System.out.print("Flower 유(1 입력)/무(0 입력) : ");
				flowerNum = sc.nextInt();
				sc.nextLine();
				flower = flowerNum == 1 ? true : false;
				lList.add(lc.registWash(product, manufacture, power, weight, totalQty, powerSource, xlr, chNum, flower));
			}
		}
		
		System.out.println("-장비 등록 완료-");
		System.out.println(lList.get(lList.size()-1));
	}

	public void editDevice() {
		String lName;
		int lNum, editNum;
		ArrayList<LightDevice> lList = new ArrayList<>();
		
		System.out.print("수량 수정할 장비명 검색 : ");
		lName = sc.nextLine().trim();
		
		lList.addAll(lc.searchLight(lName));
		
		for (int i = 0; i < lList.size(); i++) {
			System.out.println((i+1) + ". " + lList.get(i));
		}
		
		System.out.println("수정할 장비 번호 입력 : ");
		lNum = sc.nextInt();
		
		System.out.println("수정 수량 입력 : ");
		editNum = sc.nextInt();
		sc.nextLine();
		
		lc.changeTotalQty(lList.get(lNum-1), editNum);
		
		System.out.println("-수정 완료-");
		System.out.println(lList.get(lNum-1));
		
	}
	
	public void deleteDevice() {
		String lName;
		int lNum;
		ArrayList<LightDevice> lList = new ArrayList<>();
	
		System.out.print("삭제할 장비명 검색 : ");
		lName = sc.nextLine().trim();
		
		lList.addAll(lc.searchLight(lName));
		
		for (int i = 0; i < lList.size(); i++) {
			System.out.println((i+1) + ". " + lList.get(i));
		}
		
		System.out.println("삭제할 장비 번호 입력 : ");
		lNum = sc.nextInt();
		sc.nextLine();
		
		lc.deleteDevice(lList.get(lNum-1), lNum-1);
		
		System.out.println("-삭제 완료-");
	}
	
	
	
	public void lightInOut() {
		System.out.println("1. 장비 등록");
	}
	
	public void calcMenu() {
		System.out.println("1. 장비 등록");
	}
}
