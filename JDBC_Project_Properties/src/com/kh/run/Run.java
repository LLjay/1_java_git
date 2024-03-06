package com.kh.run;

import com.kh.view.MemberMenu;

public class Run {

	public static void main(String[] args) {
		/*
		 * M(Model) : 데이터 처리 담당(데이터를 담기 위한 클래스(VO), 데이터들이 보관된 공간(DB)과 직접적으로 접근해서 데이터 주고 받기(dao))
		 *  // 데이터를 실제 담고 있는 애들을 모델에 둘 것임
		 * V(View) : 화면 담당(사용자가 보게 되는 시각적인 요소, 출력 및 입력)
		 * C(Controller) : 사용자의 요청을 처리해주는 역할
		 * 
		 *  // 나중에 가면 Service라는 항목이 추가될 것 (비지니스 로직?)
		 *  // Service의 역할은 View와 Controller를 분리해주는 것
		 */
		
		// view가 나중에 프론트로 바뀌면 아예 다른 코드가 됨, 그걸 받아주는 게 컨트롤러
		// dao에 전달값과 함께 요청을 보내주면 데이터 처리 해주는 것
		new MemberMenu().mainMenu();
	}

}
