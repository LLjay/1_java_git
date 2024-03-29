package com.kh.Test2402072;

public class Run {
	/*
	 * MVC패턴 : 각 클래스마다 역할(데이터, 화면, 요청처리)을 부여해서 작업하기 위한 것
	 * 			=> 유지보수가 용이함
	 * // 나누지 않으면 나중에 어디 가서 어떤 오류를 해결해야 하는지 찾기 어려워짐
	 * 
	 * -M(Model) : 데이터를 담당하는 역할
	 * 		데이터들을 담기 위한 클래스, 비즈니스 로직 처리하기 위한 클래스,
	 * 		데이터가 보관되어 있는 보관함과 연결해서 입출력을 해주기 위한 클래스
	 * // valueObject => vo, 데이터베이스에서 가져온 데이터들을 자바 코드에 띄우기 위해 vo에 저장, 모델의 역할
	 * // 패키지 안의 model이라는 곳에 클라이언트, 데이터베이스에서 받아온 데이터를 저장할 것
	 * 
	 * -V(View) : 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인 요소(출력문, 입력문)
	 * // => 나중에 프론트 영역이 될 것
	 * 
	 * -C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할
	 * 	// 요청 받는 곳을 따로 둠 (서비스라는 레이어?)
	 * 
	 * 레이어를 나누는 이유는 유지보수하기 쉽기 때문
	 * MVC패턴 말고도 요새 다른 패턴이 많아지고 있음
	 * 프론트 영역이 넓어지고 있음, 원래는 브라우저에서 구현 가능한 게 얼마 없었음
	 * 싱글페이지 어플리케이션? 그걸 가능하게 하는게 자바 스크립트고 좀 더 편하게 만들어놓은 게 리액트
	 * 
	 * 대용량 메모리, 비즈니스 로직을 관리하는데 유용한 MVC패턴
	 * 
	 */

	public static void main(String[] args) {
		new FarmMenu().mainMenu();
	}

}
