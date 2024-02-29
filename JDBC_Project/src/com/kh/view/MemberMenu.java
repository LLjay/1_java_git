package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

// View : 사용자가 보게 될 시각적인 요소(화면) 출력 및 입력

public class MemberMenu {
	
	// Scanner 객체 생성(전역으로 다 입력 받을 수 있도록 하기 위해)
	private Scanner sc = new Scanner(System.in);
	
	// MemberController 객체 생성(전역에서 바로 요청할 수 있도록) // 전역은 이 클래스 안에서 라는 말
	private MemberController mc = new MemberController();
	
	// 백오피스, 관리자단
	// 코드를 다 뜯어고치는 것보다 백오피스에서 설정을 바꿔주는 게 편할 수 있음
	// 처음에 어떤 화면이 띄워져야 하지를 생각해야 함
	
	/*
	 * 사용자가 보게 될 첫 화면(메인 화면)
	 */
	
	public void mainMenu() {
		while(true) {
			System.out.println("=======회원관리 프로그램=======");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
//			System.out.println("3. 회원 아이디 검색");
//			System.out.println("4. 회원 이름으로 키워드 검색");
			System.out.println("3. 회원 정보 변경");
			System.out.println("4. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				this.insertMember();
				break;
			case 2 :
				mc.selectList(); // 회원정보 내놔!
				break;
			case 3 :
				// userId
				// 패스워드, 이메일, 전화번호, 주소
				this.updateMember();
				break;
			case 4 :
				mc.deleteMember(this.inputMember());
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 0 :
				System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void insertMember() {
		System.out.println("회원 추가");
		// id~취미까지 입력 받기
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("성별(M, F) : ");
		String gender = sc.nextLine().toUpperCase();
		
		System.out.print("나이 : ");
		String age = sc.nextLine();
		// 어차피 프론트 단에서 String으로 올 확률이 굉장히 큼
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("전화번호(- 빼고 입력) : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("취미(, 로 이어서 작성) : ");
		String hobby = sc.nextLine();
		
		// 회원추가 요청 == Controller 메소드 요청
		mc.insertMember(userId, userPwd, userName, gender, age, email, phone, address, hobby);
	}
	
	public void updateMember() {
		System.out.println("\n=====회원정보 변경=====");
		
		// (어떤 회원인지 찾기 위한) 아이디, 비밀번호, 이메일, 전화번호, 주소
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("변경할 비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("변경할 이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("변경할 전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("변경할 주소 : ");
		String address = sc.nextLine();
		
		mc.updateMember(userId, userPwd, email, phone, address);
	}
	
	public String inputMember() {
		System.out.print("아이디 입력 : ");
		String userId = sc.nextLine();
		
		return userId;
	}
	
	
	//--------------------------------응답화면------------------------------
	/**
	 * 서비스 요청 처리 후 성공 했을 경우 사용자가 보게 될 응답 화면
	 * @param message : 객체 별 성공 메세지
	 */
	
	public void displaySuccess(String message) {
		System.out.println("\n서비스 요청 성공 : " + message);
	}
	
	/**
	 * 서비스 요청 처리 후 실패 했을 경우 사용자가 보게 될 응답 화면
	 * @param message : 객체 별 실패 메세지
	 */
	
	public void displayFail(String message) {
		System.out.println("\n서비스 요청 실패 : " + message);
	}
	
	/**
	 * 조회 서비스 요청 시 조회 결과가 없을 때 사용자가 보게 될 응답 화면
	 * @param message : 조회 결과에 대한 응답 메세지
	 */
	
	public void displayNoData(String message) {
		System.out.println("\n" + message);
	}
	
	/**
	 * 조회 서비스 요청 시 결과가 여러 행일 경우 보게 될 응답 화면
	 * @param message : 조회 결과에 대한 응답 메세지
	 */
	
	public void displayMemberList(ArrayList<Member> list) {
		
		// for loop
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); // 어차피 toString() 메소드 자동 호출
//		}
		
		// for each
		for (Member m : list) {
			System.out.println(m);
		}
	}

}
