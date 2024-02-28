package com.mini.view;

import java.util.Scanner;

import com.mini.controller.LightingController;
import com.mini.model.vo.Member;

public class LightingMenu {
	Scanner sc = new Scanner(System.in);
	LightingController lc = new LightingController();
	
	public void startMenu() {
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			if (menuNum == 1) {
				this.logIn();
			} else if (menuNum == 2) {
				this.signUp();
			} else {
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void logIn() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine().trim();
			
			Member mem = lc.logIn(id, password);
			
			if (mem != null) {
				switch(mem.getUserGrade()) {
				case "관리자" :
					this.managerMainMenu(mem);
					break;
				case "회원" :
					this.memberMainMenu(mem);
					break;
				}
			} else if (mem == null) {
				System.out.println("철자가 틀렸거나 없는 정보입니다. 다시 입력하세요.");
			}
		}

	}
	
	public void signUp() {
		
		String id, password, passwordRe, userName, res;
		Member mem = null;
		
		System.out.println("-----회원 정보 입력-----");
		System.out.print("아이디 : ");
		id = sc.nextLine().trim();
		
		while(true) {
			System.out.print("비밀번호 : ");
			password = sc.nextLine().trim();
			
			System.out.print("비밀번호 확인 : ");
			passwordRe = sc.nextLine().trim();
			
			if(password.equals(passwordRe)) {
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			}
		}
		
		System.out.print("사용자명 : ");
		userName = sc.nextLine().trim();
		
		while(true) {
			System.out.print("관리자 계정으로 가입하시겠습니까?(y/n) : ");
			res = sc.next();
			sc.nextLine();
			
			if(res.toLowerCase().charAt(0) == 'y' || res.toLowerCase().charAt(0) == 'n') {
				break;
			} else {
				System.out.println("잘못된 답변입니다. 다시 입력하세요.");
			}
		}
		
		if (res.toLowerCase().charAt(0) == 'y') {
			mem = new Member(id, password, userName, "관리자");
		} else if (res.toLowerCase().charAt(0) == 'n') {
			mem = new Member(id, password, userName, "회원");
		}
		
		if(lc.signUp(mem)) {
			System.out.println("가입을 환영합니다, " + userName + "님.");
		} else {
			System.out.println("이미 가입된 아이디입니다. 다시 입력하세요.");
		}
	}
	
	
	//====================================================================================
	

	public void managerMainMenu(Member mem) {
		System.out.println("환영합니다, 관리자 " + mem.getUserName() + "님.");
		
		while(true) {
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회 및 관리");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 장비 수량/전력/무게 계산");
			System.out.println("8. 회원 관리");
			System.out.println("9. 마이페이지");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.managerDeviceMenu();
				break;
			case 2 :
				this.InOutMenu();
				break;
			case 3 :
				this.calcMenu();
				break;
			case 8 :
				this.memberManageMenu();
				break;
			case 9 :
				this.myPage();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
		
	}
	
	public void memberMainMenu(Member mem) {
		System.out.println("환영합니다, 회원 " + mem.getUserName() + "님.");
		while(true) {
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회 및 관리");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 장비 수량/전력/무게 계산");
			System.out.println("9. 마이페이지");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.memberDeviceMenu();
				break;
			case 2 :
				this.InOutMenu();
				break;
			case 3 :
				this.calcMenu();
				break;
			case 9 :
				this.myPage();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	
	//====================================================================================
	

	public void managerDeviceMenu() {
		while(true) {
			System.out.println("=====장비 조회 및 관리=====");
			System.out.println("1. 전체 장비 리스트 조회");
			System.out.println("2. 장비 검색");
			System.out.println("3. 장비 등록");
			System.out.println("8. 장비 삭제");
			System.out.println("5. 장비 총수량 수정");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.println("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.checkDeviceList();
				break;
			case 2 :
				this.searchDevice();
				break;
			case 3 :
				this.registDevice();
				break;
			case 8 :
				this.deleteDevice();
				break;
			case 9 :
				this.editDevice();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}

	public void memberDeviceMenu() {
		while(true) {
			System.out.println("=====장비 조회 및 관리=====");
			System.out.println("1. 전체 장비 리스트 조회");
			System.out.println("2. 장비 검색");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.println("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.checkDeviceList();
				break;
			case 2 :
				this.searchDevice();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void checkDeviceList() {
		System.out.println("=====전체 장비 리스트 조회=====");
		lc.checkDeviceList();
		
	}
	
	public void searchDevice() {
		
	}
	
	public void registDevice() {
		
	}
	
	public void deleteDevice() {
		
	}
	
	public void editDevice() {
		
	}
	
	
	//====================================================================================
	
	
	public void InOutMenu() {
		
	}

	public void calcMenu() {
		
	}
	
	public void memberManageMenu() {
		
	}
	
	public void myPage() {
		
	}

}
