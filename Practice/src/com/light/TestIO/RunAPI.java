package com.light.TestIO;

import java.util.Scanner;

public class RunAPI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		sc.nextLine();
		
		String newStr = str.replace(str.charAt(0), str.toUpperCase().charAt(0));
		System.out.println(newStr);
		
		
//		for (int i = 0; i < str.length(); i++) {
//			if (i == 0) {
//				System.out.print(str.toUpperCase().charAt(i));
//			} else {
//				System.out.print(str.charAt(i));
//			}
//		}
		
		
		
		
		
		
		
		
		String[] arr = str.split(",");
		
		for (String a : arr) {
		}
		
//		System.out.println(str.toUpperCase().charAt(0));
		
	}

}
