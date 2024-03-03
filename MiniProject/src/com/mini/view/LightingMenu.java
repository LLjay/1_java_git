package com.mini.view;

import java.util.List;
import java.util.Scanner;

import com.mini.controller.LightingController;
import com.mini.model.vo.Device;
import com.mini.model.vo.Line;
import com.mini.model.vo.Member;

public class LightingMenu {
	
	Scanner sc = new Scanner(System.in);
	LightingController lc = new LightingController();
	Member user = new Member();
	
	// 시작메뉴
	/**
	 * 로그인, 회원가입 기능이 있는 시작 메뉴
	 */
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
		System.out.print("아이디 : ");
		String id = sc.nextLine().trim();
			
		System.out.print("비밀번호 : ");
		String password = sc.nextLine().trim();
			
		user = lc.logIn(id, password);
		
		if (user != null) {
			switch(user.getUserGrade().trim()) {
			case "관리자" :
				this.managerMainMenu();
				break;
			case "회원" :
				this.memberMainMenu();
				break;
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
		
		lc.signUp(id, password, userName);
		
	}
	
	
	
	// 메인메뉴
	
	/**
	 * 관리자 등급의 멤버에게 출력되는 메인메뉴
	 */
	public void managerMainMenu() {
		while(true) {
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회 및 관리");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 공연 정보 관리");
			System.out.println("4. 어시스턴트 정보 관리");
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
				this.productionMenu();
				break;
			case 4 :
				this.memberRollMenu();
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
	
	/**
	 * 회원 등급의 멤버에게 출력되는 메인메뉴
	 */
	public void memberMainMenu() {
		while(true) {
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 공연 정보 조회");
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
				this.productionMenu();
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
	
	
	// 1. 장비 조회 및 관리
	
	/**
	 * 관리자 등급의 멤버에게 출력되는 장비 조회 및 관리 메뉴
	 */
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
				this.selectDeviceList();
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

	/**
	 * 회원 등급의 멤버에게 출력되는 장비 조회 메뉴
	 */
	public void memberDeviceMenu() {
		while(true) {
			System.out.println("=====장비 조회=====");
			System.out.println("1. 전체 장비 리스트 조회");
			System.out.println("2. 장비 검색");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectDeviceList();
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
	
	/**
	 * 전체 장비 리스트 요청 메소드
	 */
	public void selectDeviceList() {
		System.out.println("=====전체 장비 리스트 조회=====");
		lc.selectDeviceList();
	}
	
	/**
	 * 장비명을 받아 컨트롤러에 전달 및 검색 요청 메소드
	 */
	public void searchDevice() {
		System.out.print("장비명 검색 : ");
		String dvName = sc.nextLine();
		
		lc.searchDevice(dvName);
	}
	
	/**
	 * 장비 정보를 받아 장비 등록 요청 메소드
	 */
	public void registDevice() {
		System.out.println("-장비 종류 선택-");
		System.out.println("1. MovingLight 2. Convention 3. Line");
		System.out.println("종류 번호 입력 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1 :
			this.registMovingLight();
			break;
		case 2 :
			this.registConvention();
			break;
		case 3 :
			this.registLine();
			break;
		default :
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");

		}
	}
	
	public void registMovingLight() {
		System.out.print("장비명 : ");
		String dvName = sc.nextLine().toLowerCase().trim();
		
		System.out.print("총수량 : ");
		int totalQty = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제조사 : ");
		String manufacture = sc.nextLine().toLowerCase().trim();
		
		System.out.print("전력(watt) : ");
		int power = sc.nextInt();
		sc.nextLine();
		
		System.out.print("무게(kg) : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("램프 : ");
		String lamp = sc.nextLine();
		
		lc.registMovingLight(dvName, totalQty, manufacture, power, weight, lamp);
		
	}
	
	public void registConvention() {
		System.out.print("장비명 : ");
		String dvName = sc.nextLine().toLowerCase().trim();
		
		System.out.print("총수량 : ");
		int totalQty = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제조사 : ");
		String manufacture = sc.nextLine().toLowerCase().trim();
		
		System.out.print("전력(watt) : ");
		int power = sc.nextInt();
		sc.nextLine();
		
		System.out.print("무게(kg) : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		lc.registConvention(dvName, totalQty, manufacture, power, weight);
		
	}
	
	public void registLine() {
		System.out.print("장비명 : ");
		String dvName = sc.nextLine().toLowerCase().trim();
		
		System.out.print("총수량 : ");
		int totalQty = sc.nextInt();
		sc.nextLine();
		
		lc.registLine(dvName, totalQty);
	}
	
	public void deleteDevice() {
		
	}
	
	public void editDevice() {
		
	}
	
	
	//====================================================================================
	
	// 2. 장비 반입/반출 관리
	
	public void InOutMenu() {
		while(true) {
			System.out.println("=====장비 반입/반출 관리=====");
			System.out.println("1. 전체 반입/반출 리스트 조회");
			System.out.println("2. 반입/반출 등록");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				
				break;
			case 2 :
				this.registInOut();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void registInOut() {
//		System.out.print();
	}

	// =======================================================================================
	
	
	public void productionMenu() {
		while(true) {
			System.out.println("=====공연 조회=====");
			System.out.println("1. 전체 공연 조회");
			System.out.println("2. 공연 검색");
			System.out.println("3. 공연 정보 등록");
			System.out.println("4. 어시스턴트 등록");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectDeviceList();
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
	
	
	public void memberRollMenu() {
		while(true) {
			System.out.println("=====어시스턴트 관리=====");
			System.out.println("1. 공연별 어시스턴트 조회");
			System.out.println("2. 어시스턴트 등록");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :

				break;
			case 2 :
				this.registMemRoll();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void registMemRoll() {
		System.out.print("회원 검색 : ");
		String userName = sc.nextLine().trim();
		
		System.out.print("공연명 검색 : ");
		String proTitle = sc.nextLine().trim();
		
		System.out.println("담당 역할 : ");
		String roll = sc.nextLine().trim();
		
		lc.registMemRoll(userName, proTitle, roll);
		
	}
	
	
	public void memberManageMenu() {
		
	}
	
	public void myPage() {
		
	}

	
	
	//----------------------------------------------------------------------------------------------
	
	/**
	 * 처리 성공 시 뜨는 구문
	 */
	
	public void successProcess(String message) {
		System.out.println(message);
	}
	
	/**
	 * 처리 실패 시 뜨는 구문
	 */
	public void failProcess(String message) {
		System.out.println(message);
	}
	
	/**
	 * List에 담긴 Device 클래스 정보를 출력하는 메소드
	 */
	public void printDeviceList(List<Device> list) {
		for (Device d : list) {
			System.out.println(d);
		}
	}
}

