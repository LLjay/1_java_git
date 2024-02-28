import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력 됐다면 "1 이상의 숫자를 입력해주세요" 를 출력하세요.
		
//		System.out.println("1 이상의 숫자를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		if (num < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
//		
//		for (int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//		}
//		
		// 강사님 예시
		
//		int num;
//		
//		System.out.println("1 이상의 숫자를 입력하세요. : ");
//		num = sc.nextInt();
//		
//		if (num > 0) {
//			for (int i = 1; i <= num; i++) {
//				
//			}
//		} else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		//=========================================================
		
		// 1 미만의 숫자 => 정상적으로 입력 받을 때까지 하기
		
		// 내 예시
		
//		int num;
//		
//		System.out.println("1 이상의 숫자를 입력하세요. : ");
//		num = sc.nextInt();
//		
//		while (true) {
//			if (num >= 1) {
//				break;
//			} else {
//				System.out.println("1 이상의 숫자를 입력 해주세요. : ");
//				num = sc.nextInt();
//				continue;
//			}
//		}
//		
//		if (num > 0) {
//			for (int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		
		
		
		// 강사님 예시
//		int num;
//		
//		System.out.println("1 이상의 숫자를 입력하세요. : ");
//		num = sc.nextInt();
//		
//		while (num < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//			num = sc.nextInt();
//		}
//		
//		for (int i = 1; i <= num; i++) {
//			System.out.print(i + " ");
//		}

	}

}
