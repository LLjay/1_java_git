package com.light.exception;

import java.util.Scanner;

public class Exception {
	
	Scanner sc;
	
	public Exception() {
		
	}
	
	public Exception(Scanner sc) {
		sc = new Scanner(System.in);
	}
	
	public void example01(int size) {
		try {
		int[] arr = new int[size];
//		try { // try가 여기에 있는 경우 음수를 넣었을 때 이미 배열 사이즈를 정하는 과정에서 에러가 나기 때문에 예외 처리 범위에서 벗어나 처리가 안 되는 것
		// 100보다 작은 값은 사이즈로 지정을 할 수는 있는데 100번째 값을 출력하라고 하니 오류가 나는 것
			System.out.println(arr[100]);
		} catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			System.out.println("입력할 수 없는 값입니다.");
		}
//		} finally {
//			sc.close();
//		}
		System.out.println("끝");
	}

}
