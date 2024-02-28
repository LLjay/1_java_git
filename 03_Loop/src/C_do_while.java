import java.util.Scanner;
import java.lang.Math;

public class C_do_while {
	/* 
	 * do-while문
	 * 
	 * do {
	 * 		반복적으로 실행할 코드
	 * } while(조건식); // ; 없으면 계속 돌아감
	 * 
	 * 처음에 무조건 실행코드 실행**
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> false일 경우 실행코드 실행 X => 반복문 탈출
	 * 
	 * 기존의 for/while문과의 차이점
	 * -> for/while문 같은 경우 처음 수행될 때 조건 검사 후 true일 경우 반복 코드를 실행
	 * -> 하지만 do-while일 경우 첫 실행은 조건 검사 없이 무조건 실행한다.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 이걸 먼저 쓰고 ctrl shift o 하면 자동 import
		// 1부터 사용자가 입력한 수까지의 총 합계
		
		int num, sum = 0;
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
//		int i = 1;
//		while (i <= num) { // 1 2 3 4 5
//			sum += i;
//			i++; // sum += i++; => 로 해도 무방
//		}
		
		int i = 1;
		do { // 1 2 3 4 5
			sum += i;
			i++; // sum += i++; => 로 해도 무방
		} while (i <= num);
		
		// do-while은 while과 같은데 다만 첫 시작을 조건 검사 없이 들어감
		
		System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
		
		
		
	}

}
