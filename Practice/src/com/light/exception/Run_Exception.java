package com.light.exception;

import java.util.Scanner;

public class Run_Exception {
	public static void main(String[] args) {
		
		Exception ex = new Exception();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		ex.example01(num);
	}
//	 ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스로 제시하면서 접근했을 때 발생하는 에러
		// NegativeArraySizeException : 
}
