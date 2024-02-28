import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 두 개와 연산자를 입력 받고 연산자에 따라 맞는 결과 출력
		// 연산자 입력에 exit 값 들어올 때까지 무한 반복
		// exit 들어오면 프로그램을 종료합니다. 출력 종료
		// 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해주세요." 를 출력
		// 없는 연산자 들어올 시 "없는 연산자입니다. 다시 입력해주세요."
		// 두 경우 모두 처음으로 돌아가 다시 연산자부터 입력하도록 할 것
		
		// 내 예시
//		int num1, num2;
//		char oper;
//		
//		System.out.println("연산자(+, -, *, /, %) : ");
//		oper = sc.next().charAt(0);
//		
//		Switch (oper) { => Switch 대문자로 해서 안 먹음
//			case '+' :
//			case '-' :
//			case '*' : 
//			case '/' :
//			case '%' :
//				break;
//			default : 
//				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//				continue;
//
//			
//		System.out.print("정수1 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("정수2 : ");
//		num2 = sc.nextInt();
		
		
		
		
		
		
		
		// 강사님 예시
//		String str;
//		int num1, num2;
//		while(true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			str = sc.next();
//			if (str.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//				// return; 도 가능 (프로그램 종료이기 때문에)
//			}
//			
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			
//			System.out.println("정수2 : ");
//			num2 = sc.nextInt();
//		
//			switch(str) {
//				case "+" :
//					System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
//					break;
//				case "-" :
//					System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
//					break;
//				case "*" : 
//					System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
//					break;
//				case "/" :
//					if (num2 == 0) {
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//						break; // 왜 break지? => 다시 입력해야 하므로 아예 switch 구문을 빠져나가야 함
//					}
//					System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
//					break;
//				case "%" :
//					System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));
//					break;
//				default :
//					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//				}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 정수 두 개와 연산자를 입력 받고 연산자에 따라 맞는 결과 출력
		// 연산자 입력에 exit 값 들어올 때까지 무한 반복
		// exit 들어오면 프로그램을 종료합니다. 출력 종료
		// 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해주세요." 를 출력
		// 없는 연산자 들어올 시 "없는 연산자입니다. 다시 입력해주세요."
		// 두 경우 모두 처음으로 돌아가 다시 연산자부터 입력하도록 할 것
		
		int num1, num2;
		String oper;
		
		while(true) {
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			oper = sc.next();
			
			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 입력 : ");
			num1 = sc.nextInt();
			
			System.out.print("정수2 입력 : ");
			num2 = sc.nextInt();
			
			switch(oper) {
			case "+" :
				System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
				break;
			case "-" :
				System.out.printf("%d - %d = %d\n", num1, num2, (num1-num2));
				break;
			case "*" :
				System.out.printf("%d * %d = %d\n", num1, num2, (num1*num2));
				break;
			case "/" :
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					break;
				}
				System.out.printf("%d / %d = %d\n", num1, num2, (num1/num2));
				break;
			case "%" :
				System.out.printf("%d %% %d = %d\n", num1, num2, (num1%num2));
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");		
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
