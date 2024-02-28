import java.util.Scanner;
import java.lang.Math;

public class Mexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자를 입력 받아서 홀수 자리 문자만 출력
		
//		String word;
//		int num;
//		
//		System.out.println("문자열 입력 : ");
//		word = sc.next();
//		
//		for (num = 0; num < word.length(); num++) {
//			if (num % 2 == 0) {
//				System.out.println(word.charAt(num));
//			}
//		}

	// ==============================================================
		
//		String str;
//		int num;
//		
//		System.out.println("문자열 입력 : ");
//		str = sc.next();
//		
//		// int는 문자열의 순서를 매칭 시키기 위한 숫자
//		
//		for (num = 0; num < word.length(); num++) {
//			System.out.println(word.charAt());
//		}
		
// ==============================================================
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
				
		// 내 예시
//		int i, j, num1, num2;
//				
//		num = sc.nextInt();
//				
//		for (i = 1; i <= num1; i++) {
//					for (j = 1; j <= num2; j++)
//		}
		
		// 중첩 시에 2번, 많으면 3번 정도 중첩이면 해결됨, 4번은 다시 찾아볼 것
		// 가로줄은 행 세로줄은 열
		
//		int i, j, num1, num2;
//		// 무조건 큰 것에서 작은 것으로 세분화 => 행이 더 큼
//		// 열의 숫자들은 행 안에서 반복되어 증감하는 숫자들
//		// 따라서 행을 먼저 설정해주고 그 다음에 열을 설정
//		System.out.print("행 개수를 입력하세요.");
//		num1 = sc.nextInt();
//		
//		System.out.print("열 개수를 입력하세요.");
//		num2 = sc.nextInt();
//		
//		for (i = 1; i <= num1; i++) {
//			for (j = 1; j <= num2; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//// ==============================================================
//			
//		// 2부터 입력한 값까지 배수를 한 가지씩 출력
//		
//		int n1 = sc.nextInt();
//		
//		
//		while(num <= n1)
//		while(true) {
//			int random = (int)(Math.random() * 100 + 1);
//			
//			System.out.println(random);
//			
//			if (random % num == 0) {
//				break;
//			}
//	}
		
		// ==============================================================
		
//		char ch1, ch2;
//		
//		ch1 = 'A';
//		ch2 = 'B';
//		
//		System.out.println(Character.toString(ch1) + Character.toString(ch2));
		
		// ==============================================================
	
		// 입력 받은 문자열을 랜덤한 횟수만큼 출력하세요. (횟수는 7부터 140으로 제한)
		
//		String word;
//		int time, num;
//		
//		System.out.print("문자열을 입력하세요. : ");
//		word = sc.nextLine();
//		
//		num = (int)(Math.random() * 144 + 7);
//		
//		for (time = 0; time < num; time++) {
//			System.out.println(word);
//		}
//		System.out.println(time);
		
		
				// 0.0 ~ 0.9999 -> () * (최대값 - 횟수의 최소값에서 1을 뺀 값) + 최소값
				// ex) 3 ~ 150 범위 : (int)(Math.random() * (150 - (3-1)) + 3) => 148 * 0.99999999 + 3 => 147.9852 + 3 => 150.9852
				
		// ==============================================================
		
		// 1부터 10 사이의 홀수만 출력
		
//		int num, i;
//		
//		for (i = 1; i <= 10; i += 2) {
//			System.out.print(i + " ");
//		}
		
		// ==============================================================
		
		// 10부터 1까지의 3의 배수의 합
		
		// 1)
//		int num, sum = 0;
//		
//		for (num = 10; num >= 1; num--) {
//			if (num % 3 == 0) {
//			sum += num;
//			}
//		}
//		System.out.println(sum);
		
		// 2)
//		int num, sum = 0;
//		
//		for (num = 10; num >= 1; num--) {
//			if (num % 3 != 0) {
//				continue;
//			}
//			sum += num;
//		}
//		System.out.println(sum);
		
		// 3)
//		int sum = 0;
//		int num = 10;
//		
//		while (num >= 1) {
//			if (num % 3 == 0) {
//			sum += num;
//			}
//			num--;
//		}
//		System.out.println(sum);
		
		// 4)
//		int sum = 0;
//		int num = 10;
//		
//		while (num >= 1) {
//			if (num % 3 != 0) {
//				num--;
//				continue;
//			}
//			sum += num;
//			num--;
//		}
//		System.out.println(sum);
		
		// ==============================================================
		
		// random한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요.
				// random 수 : 5
				// 1 ~ 5까지의 합 : 15
				// 3 <= random <= 10
		// 1)
//		int num, random;		
//		int sum = 0;
//		
//		random = (int)(Math.random() * 8 + 3);
//		
//		for (num = 1; num <= random; num++) {
//			sum += num;
//		}
//		System.out.println(random);
//		System.out.println(sum);
		
		// 2)
		
		// random한 숫자 n을 생성해서 최소값 입력값부터 n까지의 합계를 출력하세요.
		// random 수 : 5
		// 1 ~ 5까지의 합 : 15
		// 16 <= random <= 47
		
//		int sum, num, small, random;
//		sum = 0;
//		
//		random = (int)(Math.random() * 32 + 16);
//		
//		System.out.print("최소값을 입력하세요. : ");
//		small = sc.nextInt();
//		
//		for (num = small; num <= random; num++) {
//			sum += num;
//		}
//		
//		System.out.println(small + "부터 " + random + "까지의 합계 : " + sum);
//		System.out.printf("%d부터 %d까지의 합계 : %d", small, random, sum);
		
		// ==========================================================================================
		
		// 1에서부터 10 사이의 홀수 만을 출력
		// 1 3 5 7 9
		
//		int num;
//		int sum;
//		
//		num = 1;
//		sum = 0;
//		while (num <= 10) {
//			System.out.print(num + " ");
//			num += 2;
//		}

		// ==========================================================================================
		
		// 구구단을 2단부터 9단까지 전부 출력하라.
		
//		int dan, time, res;
//		
//		// res = dan * time 을 여기에 쓸 경우 초기화가 되지 않았기 때문에 연산 불가라고 오류가 남
//		
//		for (dan = 2; dan <= 9; dan++) {
//			for (time = 1; time <= 9; time++) {
//				res = dan * time;
//				System.out.printf("%d * %d = %d\n", dan, time, res);
//			}
//			System.out.println();
//		}
		
		// ==========================================================================================
		
//		int num1, num2, num3;
//		
//		num1 = 10;
//		num2 = 5;
//		
//		num3 = num1 + num2;
		
		// ==========================================================================================
		
		// 사용자에게 문자열을 입력 받아
				// 해당 문자열의 짝수 자리 글자만 출력
				// 문자열 입력 : hello
				// el
		
//		String word;
//		int num;
//		
//		System.out.print("문자열 입력 : ");
//		word = sc.next();
//		
//		for (num = 0; num < word.length(); num++) {
//			if (num % 2 != 0) {
//				System.out.print(word.charAt(num) + " ");
//			}
//		}
		
		// ==========================================================================================
		
		// 사용자에게 문자열을 입력 받아 해당 문자열의 길이를 출력 (이 과정 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 탈출
		
//		String str;
//		int num;
		
//		System.out.print("문자열 입력 : ");
//		str = sc.nextLine(); // 이미 입력된 값을 무한 루프에 넣으니 무한으로 돌아감, 무한 루프 안에서 입력해야 다음에 돌아왔을 때 다시 입력 가능
		
//		while (true) {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//				if (str.equals("exit")) {
//				break;
//				}
//			System.out.println(str.length());
//			if (str.equals("exit")) {
//				break;

//		}
		
//		while (true) {
//
//				if (str.equals("exit")) {
//				break;
//				}
//			System.out.println(str.length());
//		}
		
		// ==========================================================================================
		
		// 1부터 100까지의 총 합계
				// 단, 7의 배수값은 빼고 덧셈 연산
		
//		int num, sum;
//		sum = 0;
//		
//		for (num = 1; num <= 100; num++) {
//			if (num % 7 == 0) {
//				continue;
//			}
//			sum += num;
//		}
//		System.out.println(sum);
//		
//		int num, sum;
//		sum = 0;
//		num = 1;
//		
//		while (num <= 100) {
//			if (num % 7 == 0) {
//				num++;
//				continue;
//			}
//			sum += num;
//			num++;
//		}
//		System.out.println(sum);
	}

}
