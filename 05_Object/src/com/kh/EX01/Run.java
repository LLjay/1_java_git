package com.kh.EX01;

public class Run {

	public static void main(String[] args) {
		// 두 개의 인스턴스가 생성된다. = 인스턴스 객체가 생성된다.
//		BankAccount yoon = new BankAccount(); // myAcnt1라는 BankAccount의 참조변수 생성
//		BankAccount choi = new BankAccount();
//
//		// 각각의 인스턴스를 대상으로 예금 진행
//		yoon.deposit(5000);
//		choi.deposit(3000);
//		
//		// 각각의 인스턴스를 대상으로 출금 진행
//		yoon.withdraw(2000);
//		choi.withdraw(2000);
//		
//		// 각각의 인스턴스 객체의 잔액을 조회
//		yoon.checkMyBalance();
//		choi.checkMyBalance();
//		
////		"안녕".equals("하이");
//		
//		String st = new String("안녕");
//		String st2 = new String("호우");
//		
//		lee == choi; => 성립할 수가 없는 문장
		
//		BankAccount choi = new BankAccount();
//		choi.initAccount("12-456-78", "123456-789456", 10000);
//		
//		BankAccount park = new BankAccount();
//		choi.initAccount("12-446-78", "122256-789456", 10000);
	
		BankAccount choi = new BankAccount("12-456-78", "123456-789456", 10000);
		// => 만들어둔 생성자의 변수에 값을 넣어 초기화 해줌과 동시에 객체 생성
		
	}

}
