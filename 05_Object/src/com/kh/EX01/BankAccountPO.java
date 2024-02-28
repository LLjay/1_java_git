package com.kh.EX01;

import java.util.Scanner;

public class BankAccountPO {
	// 필드
	static int balance = 0; // 예금 잔액
	// 필드에서 선언 해줬으므로 이 클래스의 어디에서나 사용할 수 있는 변수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		deposit(num1 = sc.nextInt()); // 입금 진행
		checkMyBalance(); // 잔액 확인
		withdraw(num2 = sc.nextInt()); // 출금 진행
		checkMyBalance(); // 잔액 확인
	}
	
	public static int deposit(int amount) { // 입금
		balance += amount;
		return balance;
	}
	
		public static int withdraw(int amount) { // 출금
			balance -= amount;
			return balance;
	}
		
		public static int checkMyBalance() { // 예금 조회
			System.out.println("잔액 : " + balance);
			return balance;
	}

}
