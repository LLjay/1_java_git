import java.util.Scanner;

public class Loop03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 9를 초과하는 숫자가 들어오면 9 이하의 숫자만 입력해주세요를 출력하세요.
		
		
		// 내 예시
//		int dan, time, num;
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//	
//		while (num > 9) {
//			System.out.println("9 이하의 숫자만 입력해주세요.");
//			sc.nextInt();
//		}
//		
////		for (int i = dan; i <= 9; i++) {
////			System.out.println("===== " + dan + "단 =====");
////		} // 실질적으로 플러스 되는 건 i 이고 dan은 초기화 때만 들어갔으므로 안됨
//		
//		for (dan = num; dan <= 9; dan++) {
//			System.out.println("===== " + dan + "단 =====");
//			for (time = 1; time <= 9; time++) {
//				System.out.printf("%d * %d = %d\n", dan, time, dan * time);
//			}
//			System.out.println();
//		}
		
		
		
		
		// 강사님 예시
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		// 잘못된 값이 입력 되었을 때 반복해서 다시 입력
		while(dan > 9 || dan < 1) {
			System.out.print("1 이상 9 이하의 숫자만 입력해주세요. : ");
			dan = sc.nextInt();
		}
		
		for (int i = dan; i <= 9; i++) {
			System.out.println("=======" + i + "=======");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		
	}

}
