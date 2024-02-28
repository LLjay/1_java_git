import java.util.Scanner;

public class B_switch01 {
	
	/*
	 * switch문도 if문과 동일하게 조건문이다.
	 * 
	 * if문과의 "차이점"
	 *  > if문은 조건식을 자유롭게 기술할 수 있다. (결과가 논리값이기만 하면 됨)
	 *    switch문은 동등비교로만 수행된다.
	 *  > 실행할 구문만 실행하고 자동으로 빠져나오지 못한다. (직접 break; 문을 작성해야 한다.)
	 *  
	 *  [표현법]
	 *  switch(비교대상(정수, 문자, 문자열)) {
	 *  case 값1 : 실행코드1; break;
	 *  case 값2 : 실행코드2; break;
	 *  ...
	 *  default : 위의 값들이 모두 일치하지 않았을 때 실행하는 코드; // default도 else처럼 써주지 않아도 됨
	 *  }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * 정수를 입력 받아
		 * 1일 경우 "빨간색입니다."
		 * 2일 경우 "파란색입니다."
		 * 3일 경우 "초록색입니다."
		 * 다른 경우 모두 "잘못 입력하였습니다."
		 */
		
//		int num;
//		
//		 System.out.print("정수(1~3) : ");
//		 num = sc.nextInt();
//		 sc.nextLine();
		 
//		 switch(num) {
//		 case 1 :
//			 System.out.println("빨간색입니다.");
//			 break;
//		 case 2 : 
//			 System.out.println("파란색입니다.");
//			 break;
//		 case 3 : 
//			 System.out.println("초록색입니다.");
//			 break;
//		 default : 
//		 	 System.out.println("잘못 입력하였습니다.");
//		 }
//		 =====> 이런 경우는 나중에 추가해서 끼워넣을 때 사람도 힘들고 컴퓨터도 연산이 많아지기 때문에 스위치문이 좋음
		 
//		//내 예시
//		 if (num >= 1 && num <= 3) { 
//			 if (num == 1) {
//				 System.out.println("빨간색입니다.");
//			 } else if (num == 2) {
//				 System.out.println("파란색입니다.");
//			 } else if (num == 3) {
//				 System.out.println("초록색입니다.");
//			 }
//		 } else {
//			 System.out.println("잘못 입력하였습니다.");
//		 }
//		 
//		 //강사님 예시
//		 if (num == 1) {
//			 System.out.println("빨간색입니다.");
//		 } else if (num == 2) {
//			 System.out.println("파란색입니다.");
//		 } else if (num == 3) {
//			 System.out.println("초록색입니다.");
//		 } else {
//			 System.out.println("잘못 입력하였습니다.");
//		 }
//=======================================================================
	
		 // 과일을 구매하는 프로그램을 작성해봅시다.
		 // 구매하고자 하는 과일을 입력하면
		 // 그에 맞는 가격이 출력되는 프로그램을 작성해주세요.
		 // 구매하고자 하는 과일(사과(1000), 바나나(2000), 딸기(3000)) 입력 : ()
		 // xx의 가격은 xxxx입니다. (잘못 입력하였습니다.)
	
//		 String fruit;
//		 int price;
//		 
//		 System.out.print("구매하고자 하는 과일 (사과, 바나나, 딸기) 입력 : ");
//		 fruit = sc.next();
//		 sc.nextLine();
//		 
//		 switch(fruit) {
//		 case "사과" :
//			 price = 1000;
//			 break;
//		 case "바나나" : 
//			 price = 2000;
//			 break;
//		 case "딸기" :
//			 price = 3000;
//			 break;
//		 default :
//			 price = 0;
//			 System.out.println("잘못 입력하였습니다.");
//		 }
//		 
//		 if (price != 0) {
//		 System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
//		 }
		 
//		 
//		 if (fruit.equals("사과")) {
//			 price = 1000;
//		 } else if (fruit.equals("바나나")) {
//			 price = 2000;
//		 } else if (fruit.equals("딸기")) {
//			 price = 3000;
//		 } else {
//			 price = 0;
//			 System.out.println("잘못 입력하였습니다.");
//		 }
//		 
//		 if (price != 0) {
//			 System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
//			 }
		
		
// ====================================================================
		
		// 1, 3, 5, 7, 8, 10, 12 => 31일
		// 4, 6, 9, 11 => 30일
		// 2 => 28일 또는 29일
		
		int month, day;
		
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			day = 31;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			day = 30;
		case 2 :
			day = 28;
			break;
		default :
			day = 0;
			System.out.println("1~12까지만 입력 가능합니다.");
			return;
		}
		
		System.out.println(month + "월은 " + day + "일까지입니다.");
		 
		// 여러가지 결과를 가지고 한 가지 코드를 수행해야 할 때
		
	}
}
