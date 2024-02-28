import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 두 숫자 입력 받아 그 사이 숫자를 나열하세요.
		// 단 1 미만의 숫자를 입력하면 잘못 됐다고 띄우세요.
		
		// 내 예시
		
//		int num1, num2;
//		
//		System.out.println("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		
//		System.out.println("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//		if (num1 < 1 || num2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		} else {
//		
//			while (num1 >= num2) {
//				System.out.print(num2 + " ");
//				num2++;
//		}
//			while (num1 <= num2) {
//				System.out.println(num1 + " ");
//				num1++;
//			}
//		}
		
		
		
		// 강사님 예시
		int num1, num2, min, max;
		
		System.out.println("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		// num1이 1보다 작다면 다시 입력 받기 반복
		while(num1 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요. : ");
			num1 = sc.nextInt();
		}
		
		System.out.println("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		while(num2 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요. : ");
			num2 = sc.nextInt();
		}
		
		min = (num1 < num2 ? num1 : num2);
		max = (num1 > num2 ? num1 : num2);
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		//=================================================================
		
	}

}
