import java.util.Scanner;
import java.lang.Math;

public class D_break {
	
	/*
	 * break;  : 반복문 안에서 사용되는 분기문
	 * 			 break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 			   -> 조건과 상관 없이 강제로
	 * 
	 * 유의사항 : switch문 안의 break;는 단지 switch문 만을 빠져나가는 구문이다.
	 * 			-> 가장 가까운 '반복문'을 반드시 하나만 빠져나갈 수 있음
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 횟수를 정해놓고 하는 반복문은 for가 효율적, while은 상대적으로 비효율적
		// 하지만 break;를 만나면 while문이 조금 더 효과적
		
		// 랜덤값(1~100)을 발생시키고 그 랜덤값을 출력(이 과정을 계속 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 (3으로 나누면 나머지가 0) 반복문을 종료해라(탈출해라)
		
//		while(true) {
//			int random = (int)(Math.random() * 100 + 1);
//			
//			System.out.println(random);
//			
//			if (random % 3 == 0) {
//				break;
//			}
//		}
		
//		int random = 1;
//		while(random % 3 != 0) {
//			random = (int)(Math.random() * 100 + 1);
//			
//			System.out.println(random);
//		}
		
		
		// while은 조건식이 거짓일 때 멈추는데 true가 조건이면 절대 거짓이 될 수 없으므로 무한반복
		
		// 클래스 중에 상수처럼 쓸 수 있는 것들이 있음 - 실행 시 미리 메모리를 잡아주는 객체가 있음, 거기에 random이 포함되어 따로 import를 하지 않아도 사용 가능
		// random처럼 특별히 조건이 없어도 사용할 수 있는 클래스가 있음 - 예외사항
		
		// for문은 이미 횟수/범위를 지정해놓고 사용하기 때문에 조건을 걸어서 break;를 걸어주는 경우가 거의 없음
		
		// ======================================================================================
		
		
		// 사용자에게 문자열을 입력 받아 해당 문자열의 길이를 출력 (이 과정 반복)
//		 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 탈

		// 내 예시
//		while(true) {
//			System.out.println("문자열 입력 : ");
//			String word = input.next();
//			
//			 if (word.equals("exit")) {
//				 break;
//			 } else {
//				 System.out.println(word.length());
//			 }
//		}
		
//		while(true) {
//			System.out.println("문자열 입력 : ");
//			String word = input.next();
//			
//			System.out.println(word.length());
//			 if (word.equals("exit")) {
//				 break;
//			 } // -> 순서 이상
//		}
		
		// 강사님 예시
		 String str;
		 
		 while(true) {
			 System.out.print("문자열 입력 : ");
			 str = input.next();
		 
			 if (str.equals("exit")) { // 입력 받은 문자열과 exit 비교
				 break; // 반복문 탈출
			 } else { // else는 생략 가능
			 System.out.println("길이 : " + str.length()); // 입력 받은 문자열의 길이 출력
			 }
		 }
		
	}

}
