package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;
import com.kh.view.MemberMenu;

// Controller : View를 통해서 사용자가 요청한 기능에 대해서 처리하는 담당
//				해당 메소드로 전달된 데이터[가공 처리 후] dao로 전달하며 호출
//				dao로부터 반환 받은 결과 성공인지 실패인지 판단 후 응답 화면 결정(view 메소드 호출)
public class MemberController {
	// MemberMenu에서 이미 MemberController 객체를 생성 했기 때문에 서로 반복적으로 생성하게 됨
	// 따라서 그냥 사용할 때마다 new MemberMenu로 생성하는 것
	
	// 사용자의 추가 요청을 처리해주는 메소드
	// @param userId ~ hobby : 사용자가 입력했던 정보들이 담겨있는 매개변수
	
	public void insertMember(String userId, String userPwd, String userName, String gender, 
							 String age, String email, String phone, String address, String hobby) {
		
		// view로부터 전달 받은 값을 바로 dao 쪽으로 전달 X
		// 어딘가(Member 객체(VO))에 담아서 전달
		// 프론트는 어차피 여러 개를 나눠서 쏴줄 거고 그걸 컨트롤러에서 정리해주면 됨
		
		// 방법 1) 기본 생성자로 생성 후 각 필드마다 setter를 이용해서 데이터 저장
		// 방법 2) 매개변수 있는 생성자로 전부 전달해서 생성
		
		Member m = new Member(userId, userPwd, userName, gender, Integer.parseInt(age), email, phone, address, hobby);
		
		int result = new MemberDao().insertMember(m);
		
		if (result > 0) { //완료
			new MemberMenu().displaySuccess("성공적으로 회원이 추가되었습니다.");
			// 객체 자체의 다른 함수를 호출하는 것이므로 
			// 저 함수의 반환을 프론트에 보내도 되지만 성공 메소드 자체를 재활용 할 것이기 때문에 그냥 객체 생성해줌
		} else { //실패
			new MemberMenu().displayFail("회원 추가 실패하였습니다.");
		}
	}
	
	/**
	 * 사용자 모두를 조회하는 메소드
	 * 
	 */
	
	public void /*여기서 다 처리해주면 됨*/ selectList() {
		ArrayList<Member> list = new MemberDao().selectList();
		
		// 조회된 결과에 따라서 사용자가 보게 될 응답화면 지정
		if (list.isEmpty()) { // list가 비어있는 경우
			new MemberMenu().displayNoData("전체 조회 결과가 없습니다.");
		} else { // 조회된 데이터가 있을 경우
			new MemberMenu().displayMemberList(list);
		}
	}
	
	public void updateMember(String userId, String userPwd, 
			String email, String phone, String address) {
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPwd(userPwd);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		
		int result = new MemberDao().updateMember(m);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보 변경되었습니다.");
		} else {
			new MemberMenu().displayFail("회원정보 변경에 실패하였습니다.");
		}
	}
	
	public void deleteMember(String userId) {
		int result = new MemberDao().deleteMember(userId);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보 삭제 되었습니다.");
		} else {
			new MemberMenu().displayFail("회원 정보 삭제에 실패했습니다.");
		}
	}
}
