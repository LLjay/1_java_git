import java.util.Scanner;

public class E_continue {
	
	/*
	 * continue;  : 반복문 안에 기술되는 구문
	 * 				continue; 코드를 실행 시 그 뒤의 코드를 실행하지 않고 곧바로 다시 반복문의 상단으로 이동
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1부터 10까지의 홀수 출력
//		
//		for (int i = 1; i < 11; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i + " ");
//			}
//		}
		
//		for (int i = 1; i < 11; i++) {
//			if (i % 2 == 0) { // 만약 i가 짝수일 때
//				continue; // 반복문 내의 뒤의 구문들은 실행되지 않고 반복문 위로 올라감(for : 증감식, while : 조건식)
//			}
//			System.out.println(i + " "); // continue 해당되면 여길 실행하지 않고 다시 반복문 시작으로 올라감
//		}
//	}
		
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 덧셈 연산
		
		// 내 예시
//		int num, sum = 0;
//		
//		for (num = 1; num <= 100; num++) {
//			if (num % 6 == 0) {
//				continue;
//			}
//			sum += num;
//		}
//		System.out.println(sum);
		
		int num, sum = 0;
		
		for (num = 1; num <= 100; num++) {
			if (num % 6 != 0) {
				sum += num;
			}
		}
		System.out.println(sum);

	}
}
