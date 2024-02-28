import java.util.*;

public class A_if01 {
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행 (위->아래, 왼->오)
	 * 단, 이 순차적인 흐름을 바꾸고자 할 때 제어문이라는 걸 이용해서 직접 제어가 가능
	 * 
	 * 선택적으로 실행 시키고자 한다면 => 조건문
	 * 반복적으로 실행 시키고자 한다면 => 반복문
	 * 그 외의 흐름 제어 => 분기문
	 * 
	 * #조건문
	 * "조건식"을 통해 참 또는 거짓을 판단하여 참일 경우 그에 해당하는 코드를 실행
	 * 
	 * 조건식의 결과는 true/false 여야 한다.
	 * 보통 조건식에서는 비교연산자(대조, 동등), 논리연산자(&&, ||)를 주로 사용한다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * #if문 단독으로 사용하는 경우
		 * 
		 * if(조건식) {
		 * 		... 실행문
		 * }
		 * 
		 * => 조건식이 true일 경우 => 중괄호 블럭 안의 코드를 실행
		 * => 조건식이 false일 경우 => 중괄호 블럭 안의 코드를 무시하고 넘어감
		 * 
		 * 조건식은 논리값이어야 함
		 * 
		 * 
		 */
		/*
//		==============================================================
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num > 0) {
			System.out.println("양수이다.");
		}
//		System.out.println(num);
		
		if (num < 0) {
			System.out.println("음수이다.");
		}
		
		*/
//		==============================================================
		
		/*
		 * #if - else문
		 * 
		 * if(조건식) {
		 * 		...실행문 1
		 * } else {
		 * 		...실행문 2
		 * }
		 * 
		 * 조건식의 결과가 참(true)일 경우 실행 코드 1 수행 후 if-else문 빠져나감
		 * 단, 결과가 거짓(false)일 경우 무조건 실행 코드 2를 수행
		 */
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num > 0) {
//			System.out.println("양수이다.");
//		} else {
//			if (num < 0) {
//				System.out.println("음수이다.");
//			} else {
//				System.out.println("0이다.");
//			}
//		}
		
//		================================================================
		
		/* 
		 * if-else if문
		 * 
		 * 같은 비교대상으로 여러 개의 조건을 제시해야 될 경우
		 * 
		 * if(조건식) {
		 * 		...실행문1
		 * } else if(조건식2) {
		 * 		...실행문2
		 * } else if(조건식3) {
		 * 		...실행문3
		 * } else {
		 * 		위의 조건들이 다 false일 경우 실행할 코드
		 * 
		 * else는 있어도 되고 없어도 됨?
		 */
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num > 0) {
			System.out.println("양수이다.");
		} else if (num < 0) {
			System.out.println("음수이다.");
		} else {
			System.out.println("0이다.");
		}
	}
}
