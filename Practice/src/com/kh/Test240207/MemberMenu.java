package com.kh.Test240207;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
System.out.println("========== KH 사이트 ==========");
		
		while(true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.joinMemberShip();
				break;
			case 2 : 
				this.logIn();
				this.memberMenu();
				break;
			case 3 : 
				this.sameName();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
		
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.changePassword();
				break;
			case 2 : 
				this.changeName();
				break;
			case 3 : 
				System.out.println("로그아웃 되었습니다.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void joinMemberShip() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine().trim();
			
			System.out.print("이름 : ");
			String name = sc.nextLine().trim();
			
			Member mem = new Member(password, name);
			
			if (mc.joinMembership(id, mem)) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void logIn() {
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine().trim();
			
			String mem = mc.logIn(id, password);
			
			if (mem != null) {
				System.out.println(mem + "님, 환영합니다!");
				return;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();
			
			System.out.print("전 비밀번호 : ");
			String oldPass = sc.nextLine().trim();
			
			System.out.print("새 비밀번호 : ");
			String newPass = sc.nextLine().trim();
			
			if (mc.changePassword(id, oldPass, newPass)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine().trim();
			
			String oldName = mc.logIn(id, password);
			
			if (oldName != null) {
				System.out.println("현재 저장된 이름 : " + oldName);
				
				System.out.println("변경할 이름 : ");
				String name = sc.nextLine();
				
				mc.changeName(id, password, name);
				System.out.println("이름 변경에 성공하였습니다.");
				return;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
	
		TreeMap result = mc.sameName(name);
		if (result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		} else {
			for (Object entry : result.entrySet()) {
				Map.Entry<String, String> en = (Entry)entry;
				System.out.println(en.getValue() + "-" + en.getKey());
			}
		}
		
	}
}

