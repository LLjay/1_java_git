package com.kh.Test240126;

public interface Phone {
	
//	static final char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	/*static final*/ char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	// 인터페이스에서는 변수는 무조건 스태틱 상수이기 때문에 생략해도 상관 없음
	String makeCall();
	String takeCall();
	
}
