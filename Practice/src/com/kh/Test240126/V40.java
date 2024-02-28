package com.kh.Test240126;

public class V40 extends SmartPhone implements NotePen {
	// 무조건 extends 먼저 써줘야함
	
	public V40 () {
		super.setMaker("LG");
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "1200만, 1600만 트리플 카메라";
	}
	
	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}

	@Override
	public String printInformation() {
		return "V40은 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n" 
				+ makeCall() + takeCall() + picture()
				+ charge() + touch()
				+ "블루투스 탑재 펜 여부 : " + bluetoothPen();
	}
	
}
