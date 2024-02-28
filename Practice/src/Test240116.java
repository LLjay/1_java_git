import java.util.Scanner;
import java.lang.Math;

public class Test240116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수형 변수 num1, num2를 사용자로부터 입력 받아
		// + - * / % 의 결과값을 각각 출력하세요.
		
//		int num1, num2;
//		
//		System.out.print("첫 번째 정수를 입력하세요. : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수를 입력하세요. : ");
//		num2 = sc.nextInt();
//		
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
//		System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
//		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));
		// 이런 정도의 난이도는 구글링 해도 나옴
		
//===============================================================================================
	
		// 가위바위보를 진행합니다. user1의 가위, 바위, 보 정보와
		// user2의 가위, 바위, 보 정보를 받아 누가 이겼는지를 출력하세요.
		// 가위바위보 정보는 숫자로 입력 받습니다(가위 = 1, 바위 = 2, 보 = 3)
		
		
		// 내 예시
//		int user1, user2;
//		
//		System.out.println("user 1, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user1 = sc.nextInt();
//		
//		System.out.println("user 2, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user2 = sc.nextInt();
//		
//		if (user1 > user2) {
//			if (user1 == 3 && user2 == 1) {
//				System.out.println("user2가 이겼습니다.");
//			} else {
//				System.out.println("user1이 이겼습니다.");
//			}
//		}
//		
//		if (user1 < user2) {
//			if (user1 == 1 && user2 == 3) {
//				System.out.println("user1이 이겼습니다.");
//			} else { 
//				System.out.println("user2가 이겼습니다.");
//			}
//		}
//		
//		if (user1 == user2) {
//			System.out.println("user1과 user2는 무승부입니다.");
//		}
		
		
		// 강사님 예시
//		int user1, user2;
//		
//		System.out.println("user 1, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user1 = sc.nextInt();
//		
//		System.out.println("user 2, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user2 = sc.nextInt();
//		
//		if (user1 == user2) {
//			System.out.println("무승부입니다.");
//		} else if ((user1 == 1 && user2 == 3) || (user1 == 2 && user2 == 1) || (user1 == 3 && user2 == 2)) {
//			System.out.println("user1이 승리하였습니다.");
//		} else {
//			System.out.println("user2가 승리하였습니다.");
//		}
//		
		
		// 또다른 예시
		int user1, user2;
		
		System.out.println("user 1, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
		user1 = sc.nextInt();
		
		while (user1 > 3 || user1 < 1) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("user 1, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
			user1 = sc.nextInt();
			if (user1 <= 3 || user1 >= 1) {
				break;
			} else { 
				continue;
			}
		}

		// 입력을 받자마자 안 된다고 말해주는 게 가장 좋음
		
		System.out.println("user 2, 가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
		user2 = sc.nextInt();
		
		if (user1 == user2) {
			System.out.println("무승부입니다.");
		} else if ((user1 == 1 && user2 == 3) || (user1 == 2 && user2 == 1) || (user1 == 3 && user2 == 2)) {
			System.out.println("user1이 승리하였습니다.");
		} else {
			System.out.println("user2가 승리하였습니다.");
		}
		
		
		
		// 15 ~ 111까지의 수를 순서대로 출력하세요.
		
//		int num;
//		
//		for (num = 15; num <= 111; num++) {
//			System.out.print(num + " ");
//		}
//		
		
		// 숫자를 입력 받아 * 2인 숫자를 출력하세요.
		// 유저가 숫자 0을 입력할 때까지 반복하세요.
		
		// 내 예시
//		int num;
//		
//		while(true) {
//			System.out.print("숫자를 입력하세요. : ");
//			num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//			System.out.println(num + " * 2 = " + (num * 2));
//		}
		
		// 강사님 예시
		
//		int num;
//		
//		do {
//			System.out.print("숫자를 입력하세요. : ");
//			num = sc.nextInt();
//			System.out.println(num + " * 2 = " + (num * 2));
//		} while (num != 0);
		
		
		
		// user 3의 가위바위보 정보를 입력 받고
		// 컴퓨터의 랜덤한 가위바위보 정보를 생성해
		// 누가 이겼는지를 출력하세요.
		// 가위바위보 정보는 숫자로 입력 받습니다.(가위 = 1, 바위 = 2, 보 = 3)
		// 해당 행위를 user3이 5를 입력 받을 때까지 반복하세요.
		
		
//		int random, user3;
//		
//		System.out.println("가위 바위 보 중 하나를 입력하세요.(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user3 = sc.nextInt();
//		
//		random = (int)(Math.random() * 3 + 1);
//		
//		if (user3 == random) {
//			System.out.println("무승부입니다.");
//		} else if ((user3 == 1 && random == 3) || (user3 == 2 && random == 1) || (user3 == 3 && random == 2)) {
//			System.out.println("user3이 이겼습니다.");
//		} else {
//			System.out.println("컴퓨터가 이겼습니다.");
//		} 
		
	}

}
