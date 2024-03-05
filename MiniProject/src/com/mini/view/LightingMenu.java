package com.mini.view;

import java.util.List;
import java.util.Scanner;

import com.mini.controller.LightingController;
import com.mini.model.vo.Device;
import com.mini.model.vo.InOutList;
import com.mini.model.vo.Member;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.Production;

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
			System.out.println();
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회 및 관리");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 공연 정보 관리");
			System.out.println("8. 회원 관리");
			System.out.println("9. 마이페이지");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
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
				this.managerProductionMenu();
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
	
	/**
	 * 회원 등급의 멤버에게 출력되는 메인메뉴
	 */
	public void memberMainMenu() {
		while(true) {
			System.out.println();
			System.out.println("=====Lighting Program=====");
			System.out.println("1. 장비 조회");
			System.out.println("2. 장비 반입/반출 관리");
			System.out.println("3. 공연 정보 조회");
			System.out.println("9. 마이페이지");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
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
				this.memberProductionMenu();
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
			System.out.println();
			System.out.println("=====장비 조회 및 관리=====");
			System.out.println("1. 전체 장비 리스트 조회");
			System.out.println("2. 장비 검색");
			System.out.println("3. 장비 등록");
			System.out.println("8. 장비 삭제");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
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
			System.out.println();
			System.out.println("=====장비 조회=====");
			System.out.println("1. 전체 장비 리스트 조회");
			System.out.println("2. 장비 검색");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
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
		lc.selectDeviceList();
	}
	
	/**
	 * 장비명을 받아 컨트롤러에 전달 및 검색 요청 메소드
	 */
	public void searchDevice() {
		System.out.print("장비명 검색 : ");
		String dvName = sc.nextLine();
		
		lc.selectDeviceByName(dvName);
	}
	
	/**
	 * 장비 정보를 받아 장비 등록 요청 메소드
	 */
	public void registDevice() {
		System.out.println("-장비 종류 선택-");
		System.out.println("1. MovingLight 2. Convention 3. Line");
		System.out.print("종류 번호 입력 : ");
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
	
	/**
	 * 삭제하고자 하는 장비명을 검색해 번호를 받아 삭제 요청을 보내는 메소드
	 */
	public void deleteDevice() {
		System.out.print("장비명 검색 : ");
		String dvName = sc.nextLine();
		
		List<Device> list = lc.selectDeviceByName(dvName);
		
		System.out.print("삭제하고자 하는 장비 번호 선택 : ");
		int dvNum = sc.nextInt();
		sc.nextLine();
		
		lc.deleteDevice(list.get(dvNum - 1));
	}
	

	
	
	//====================================================================================
	
	// 2. 장비 반입/반출 관리
	
	public void InOutMenu() {
		while(true) {
			System.out.println();
			System.out.println("=====장비 반입/반출 관리=====");
			System.out.println("1. 전체 반입/반출 리스트 조회");
			System.out.println("2. 반입/반출 등록");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectInOutList();
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
	
	public void selectInOutList() {
		lc.selectInOutList();
	}
	
	public void registInOut() {
		System.out.print("공연명 검색 : ");
		String proTitle = sc.nextLine().trim();
		
		List<Production> list1 = lc.selectProductionByKeyword(proTitle);
		
		System.out.print("공연 선택(번호 입력) : ");
		int proNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("장비명 검색 : ");
		String dvName = sc.nextLine().trim();
		
		List<Device> list2 = lc.selectDeviceByName(dvName);
		
		System.out.print("공연 선택(번호 입력) : ");
		int dvNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반출 수량 : ");
		int outQty = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반입 수량 : ");
		int inQty = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반출일 입력(YYYY-MM-DD 형식) : ");
		String outDate = sc.nextLine();
		
		System.out.print("반입일 입력(YYYY-MM-DD 형식) : ");
		String inDate = sc.nextLine();
		
		System.out.print("비고 : ");
		String memo = sc.nextLine();
		
		lc.registInOut(list1.get(proNum-1), list2.get(dvNum-1), outQty, inQty, outDate, inDate, memo);
		
	}

	// =======================================================================================
	
	// 3. 공연 정보 관리
	
	/**
	 * 관리자용 공연 메뉴
	 */
	public void managerProductionMenu() {
		while(true) {
			System.out.println();
			System.out.println("=====공연 정보 관리=====");
			System.out.println("1. 전체 공연 및 어시스턴트 조회");
			System.out.println("2. 공연 검색");
			System.out.println("3. 공연 정보 등록");
			System.out.println("4. 어시스턴트 등록");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectMemRollList();
				break;
			case 2 :
				this.selectProductionByKeyword();
				break;
			case 3 :
				this.registProduction();
				break;
			case 4 :
				this.registMemRoll();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	/**
	 * 회원용 공연 메뉴
	 */
	public void memberProductionMenu() {
		while(true) {
			System.out.println();
			System.out.println("=====공연 조회=====");
			System.out.println("1. 전체 공연 및 어시스턴트 조회");
			System.out.println("2. 공연 검색");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectMemRollList();
				break;
			case 2 :
				this.selectProductionByKeyword();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	/**
	 * 전체 공연 정보를 조회하는 메소드
	 */
	public void selectMemRollList() {
		lc.selectMemRollList();
	}
	
	/**
	 * 특정 키워드로 공연명을 검색하는 메소드
	 */
	public void selectProductionByKeyword() {
		System.out.print("검색할 공연명 키워드 입력 : ");
		String keyword = sc.nextLine();
		
		lc.selectProductionByKeyword(keyword);
	}
	
	/**
	 * 공연 정보를 등록하는 메소드
	 */
	public void registProduction() {
		System.out.println("-공연 종류 선택-");
		System.out.println("1. 뮤지컬 2. 연극 3. 직접입력");
		System.out.print("번호 선택 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		String category = null;
		
		switch(menuNum) {
		case 1 : 
			category = "뮤지컬";
			break;
		case 2 :
			category = "연극";
			break;
		case 3 : 
			System.out.print("종류 입력 : ");
			category = sc.nextLine();
			break;
		default : 
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}
		
		System.out.print("공연명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("극장 입력 : ");
		String theatre = sc.nextLine();
		
		System.out.print("개막일 입력(YYYY-MM-DD 형식) : ");
		String opening = sc.nextLine();
		
		System.out.print("폐막일 입력(YYYY-MM-DD 형식) : ");
		String closing = sc.nextLine();
		
		lc.registProduction(category, title, theatre, opening, closing);
	}
	
	/**
	 * 공연별 어시스턴트 정보를 등록하는 메소드
	 */
	public void registMemRoll() {
		System.out.print("회원 검색 : ");
		String userName = sc.nextLine().trim();
		
		List<Member> list1 = lc.selectMemberByName(userName);
		
		System.out.print("회원 선택(번호 입력) : ");
		int userNum = sc.nextInt();
		sc.nextLine();
		
		// 겹침
		System.out.print("공연명 검색 : ");
		String proTitle = sc.nextLine().trim();
		
		List<Production> list2 = lc.selectProductionByKeyword(proTitle);
		
		System.out.print("공연 선택(번호 입력) : ");
		int proNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("담당 역할 : ");
		String roll = sc.nextLine().trim();
		
		lc.registMemRoll(list1.get(userNum-1), list2.get(proNum-1), roll);
		
	}
	
	
	
	// 8. 회원 관리 메뉴
	public void memberManageMenu() {
		
	}
	
	
	
	
	// 9. 마이페이지
	
	
	public void myPage() {
		while(true) {
			System.out.println("=====" + user.getUserName() + "님의 마이페이지=====");
			System.out.println("ID : " + user.getUserId());
			System.out.println("등급 : " + user.getUserGrade());
			System.out.println("현재 포인트 : " + user.getUserPoint());
			System.out.println();
			System.out.println("1. 내 공연 정보");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 :
				this.selectMyMemRollList();
				break;
			case 0 :
				return;
			default :
				System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void selectMyMemRollList() {
		lc.selectMyMemRollList(user);
	}

	
	
	//----------------------------------------------------------------------------------------------
	
	/**
	 * 처리 성공 시 뜨는 구문
	 */
	
	public void displaySuccess(String message) {
		System.out.println(message);
	}
	
	/**
	 * 처리 실패 시 뜨는 구문
	 */
	public void displayFail(String message) {
		System.out.println(message);
	}
	
	/**
	 * List에 담긴 Device 클래스 정보를 출력하는 메소드
	 */
	public void displayDeviceList(List<Device> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i+1) + "] " + list.get(i));
		}
	}
	
	/**
	 * List에 담긴 Production 클래스 정보를 출력하는 메소드
	 */
	public void displayProductionList(List<Production> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i+1) + "] " + list.get(i));
		}
	}
	
	/**
	 * List에 담긴 Member 클래스 정보를 출력하는 메소드
	 */
	public void displayMemberList(List<Member> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i+1) + "] " + list.get(i));
		}
	}
	
	/**
	 * List에 담긴 MemberRoll 클래스 정보를 출력하는 메소드
	 */
	public void displayMemRollList(List<MemberRoll> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i+1) + "] " + list.get(i));
		}
	}
	
	/**
	 * List에 담긴 InOutList 클래스 정보를 출력하는 메소드
	 */
	public void displayInOutList(List<InOutList> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i+1) + "] " + list.get(i));
		}
	}
}

