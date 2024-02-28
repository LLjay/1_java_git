package com.kh.EX01;

public class BankAccount {
	// 필드(클래스의 데이터를 정의하는 곳)
	int balance = 0;
	String accNumber;
	String ssNumber;
	
	// 생성자(데이터 초기화를 위한 특수목적 메소드)
	// 생성자의 특징 : 생성자는 class와 이름이 동일한 메소드이다.
	// 반환형이 존재하지 않는다.
	// 아무것도 만들지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다.
	
//	public BankAccount() {
//		System.out.println("객체생성");
//	} // => 생성자. new BankAccount로 객체 생성 시 아무것도 정해주지 않으면 컴퓨터가 자동으로 생성자를 생성.

	public BankAccount(String acc, String ss, int bal) {
		System.out.println("객체생성");
//		accNumber = acc;
//		ssNumber = ss;
//		balance = bal;
		
		this(accNumber, ssNumber, 0);
		
		//this() => 생성자에서 다른 생성자를 호출해주는 것
		// 항상 최상단에 위치해 있어야 한다.
		
//		this.accNumber = accNumber;
//		this.ssNumber = ssNumber;
//		this.balance = balance;
		
		// this => 객체 자체에 필드값에 접근하는 방법
		
	} // 초기 데이터를 받아줄 매개 변수가 없어 에러남
	// 기본 생성자 = 아무것도 쓰지 않은 생성자
	
	
	// 데이터 초기값 세팅을 위한 메소드 생성
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) { // 입금
		balance += amount;
		return balance;
	}
	
		public int withdraw(int amount) { // 출금
			balance -= amount;
			return balance;
	}
		
		public int checkMyBalance() { // 잔액 조회
			System.out.println("잔액 : " + balance);
			return balance;
	}
	
		public boolean balanceEquals(BankAccount act01) { // balan
			if (balance == act01.balance) {
				return true;
			} else {
				return false;
			}
		}
}
