package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		
		// 내 예시
//		
//		StringTokenizer stn = new StringTokenizer(str, ",");
//		int num = stn.countTokens();
//		String[] arr = new String[num];
//		String result = "";
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = stn.nextToken().trim();
//		}
//		
//		for (int i = 0; i < num; i++) {
//			result += arr[i];
//		}
//		
//		return result;
		
		// 강사님 예시
		
		StringTokenizer tk = new StringTokenizer(str);
		String newStr = " ";
		while(tk.hasMoreTokens()) {
			newStr += tk.nextToken();
		}
		return newStr.toString();
		// split으로 해도 됨
	}

	public String firstCap(String input) {
		
		// 내 예시
//		String str1 = input.toUpperCase().substring(0, 1);
//		String str2 = input.substring(0, input.length());
//		return str1.concat(str2);
		
		// 첫 글자만 대문자로 바꾼 문자열 반환
		// 강사님 예시
		
		if (input == null || input.isEmpty()) {
			return input;
		} // 다시 가져가라고 예외처리
		return (input.substring(0, 1).toUpperCase()) + (input.substring(1));
	}  // substring
	
	public int findChar(String input, char one) {
		// 내 예시
//		char[] arr = input.toCharArray();
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == one) {
//				count++;
//			}
//		}
//		return count;
		
		
		// 강사님 예시
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		
		for (char c : input.toCharArray()) {
			if (c == one) {
				count++;
			}
		}
		return count;
		
	}
}
