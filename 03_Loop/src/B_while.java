import java.util.Scanner;
import java.lang.Math;

public class B_while {
	/*
	 * while문
	 * 
	 * [초기식;] => 생략 가능
	 * while(조건식) {
	 * 		반복적으로 실행할 코드; (실행문)
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 해당 코드를 실행한다.
	 * 
	 * 조건식 검사 --> true일 경우 실행 코드 실행
	 * 조건식 검사 --> true일 경우 실행 코드 실행
	 * 조건식 검사 --> false일 경우 실행 코드 실행 X => 반복문 탈출
	 * 
	 */
	public static void main(String[] args) {
//		int num;
//		for (num = 0; num < 5; num++) {
//			System.out.println("안녕하세요.");
//		}
		
		// while문은 기본적으로 조건식 밖에 없음, 초기식이 필요하다면 바깥에서
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("안녕하세요.");
//			i++; // ex) i += 2;
//		}
		
		// 1에서부터 10 사이의 홀수 만을 출력
		// 1 3 5 7 9
		
		// 내 예시
//		int num = 1;
//		
//		while (num <= 10000) {
//			if (num % 2 == 1) {
//				System.out.print(num + " ");
//			}
//			num++;
//		}
		
		// 강사님 예시
		
//		int num = 1;
//		while (num <= 10000) {
//			System.out.print(num + " ");
//			num += 2;
//		}
		
		// 일정한 규칙을 가지고 범위 내의 결과를 얻고 싶을 때 => 반복문
		// 어떠한 조건을 만족하는 결과를 얻고 싶을 때 => 조건문
		
		// 숫자가 정해진 곳에서는 for문이 좋음 (while은 초기식 적는 곳이 따로 없어 누락할 위험성)
		
// ======================================================================================
		
		// 1부터 랜덤값(1~100 사이)까지의 합계를 출력
		// 1에서부터 xx까지의 총 합계 : xxxx
		
		// 내 예시
//		int num = 1;
//		int sum = 0;
//		int n;
//		
//		n = (int)(Math.random() * 100 + 1);
//		
//		while (num <= n) {
//			sum += num;
//			num++;
//		}
//		
//		System.out.println("1에서부터 " + n + "까지의 총 합계 : " + sum);
//		System.out.printf("1에서부터 %d까지의 총 합계 : %d", n, sum);
//		
		// 강사님 예시
		
//		int random = (int)(Math.random() * 100 + 1);
//		int sum = 0;
//		
//		for (int i = 1; i <= random; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// ======================================================================================
		
		// 사용자에게 문자열을 입력 받아
		// 해당 문자열의 짝수 자리 글자만 출력
		// 문자열 입력 : hello
		// el
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String word = sc.next();
		
		// 내 예시
//		int num = 0;
//		
//		while (num < word.length()) { // num <= word.length()일 경우 012345까지의 자릿수인데 5에 해당하는 문자가 없어 오류가 나는 것
//			if (num % 2 == 1) {
//				System.out.print(word.charAt(num) + " ");
//			}
//			num++;
//		}
		
		// 강사님 예시
		
		int num = 1;
		while (num < word.length()) { // num <= word.length()일 경우 012345까지의 자릿수인데 5에 해당하는 문자가 없어 오류가 나는 것
				System.out.print(word.charAt(num) + " ");
			}
			num += 2;
		}

//		while (num < word.length()) {
//			System.out.print(word.charAt(num++) + " ");
//		} // ++num은 안 됨 => 먼저 숫자 출력 이후에 더하고 싶은 것이므로
		
		
		
		
	}

}
