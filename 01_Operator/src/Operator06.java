import java.util.Scanner;

public class Operator06 {
	
	/*
	 * 삼항연산자 (항목 3개를 가지고 연산해주는 연산자)
	 * 
	 * [표현법]
	 * 조건식 ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오도록 해야한다.
	 * 주로 비교, 논리연산자를 통해 작성한다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 입력 받은 정수값이 양수인지 아닌지 판별 후 출력한다.
		System.out.print("정수값 입력 : ");
		int num = input.nextInt();
//
//		String result = (num > 0) ? "양수" : "음수";
//		System.out.println(result + "입니다.");
		
//		String result;
//		if (num > 0) {
//			result = "양수";
//		} else {
//			result = "음수";
//		}
		
//		
//		System.out.println((num > 0) ? "양수" : "음수");
//		System.out.println(num + "은 " + (num > 0 ? "양수이다." : "음수이다.5"));
//		
		// 정수 하나를 입력받아 짝수인지 홀수인지 판별 후 출력
		// 정수값 입력 : 5
		// 5는 홀수이다.
//		
//		System.out.print("정수값 입력 : ");
//		int num0 = input.nextInt();
//		input.nextLine();
//		//System.out.println(num0 + "은 " + (num0 % 2 == 0 ? "짝수이다." : "홀수이다."));
//		
//		String res = (num0 % 2 == 0) ? "짝수이다." : "홀수이다.";
//		// 은는을 수에 맞게 변환해줄 수 없나?
//		System.out.println(num0 + "은 " + res);
		
//		=> 맞는 값을 String res = "짝수이다." 처럼 남기고 나머진 다 지움
//		   실제로 컴파일러가 필요 없는 코드는 걷어내고 필요한 것만 변환함
//		
		// 사용자에게 두 개의 정수값을 입력 받으세요.
		// + 또는 -를 입력 받아 그에 맞는 연산 결과를 출력해주세요.
		// 단, + 또는 - 이외에 다른 문자를 입력했을 경우 "잘못 입력했습니다" 출력
		// 첫 번째 정수 : 
		// 두 번째 정수 :
		// 연산자 입력 (+ 또는 -)
		// 결과 : xxx / 잘못 입력했습니다.
		
//		System.out.print("첫 번째 정수 : ");
//		int num1 = input.nextInt();
//		input.nextLine();
//		
//		System.out.print("두 번째 정수 : ");
//		int num2 = input.nextInt();
//		input.nextLine();
//		
//		System.out.println("연산자 입력 : ");
//		String in = input.nextLine();
//		boolean plus = (in == "+") || (in == "-");
//		
//		
//		int num3 = (in == "+") ? (num1 + num2) : (num1 - num2);
//		
//		System.out.println(plus ? num3 : "잘못 입력했습니다.");
	
		int num1, num2;
		char op;
		String result;
		
		System.out.print("첫 번째 정수 : ");
		num1 = input.nextInt();
		input.nextLine();
		
		System.out.print("두 번째 정수 : ");
		num2 = input.nextInt();
		input.nextLine();
		
		System.out.println("연산자 입력(+ 또는 - 또는 /) : ");
		op = input.next().charAt(0);
		
		//삼항연산자
//		result = (op == '+' ? (num1 + num2) : (op == '-' ? (num1 - num2) : "잘못 입력했습니다.")) + " ";
//		result = (op == '+' ? (num1 + num2) : (op == '-' ? (num1 - num2) : (op == '/' ? (num1 / num2) : "잘못 입력했습니다."))) + " ";
//		
		//조건문(if)
//		if (op == '+') {
//			result = num1 + num2 + " ";
//		} else if (op == '-') {
//			result = num1 - num2 + " ";
//		} else {
//			result = "잘못 입력했습니다.";
//		}
//		
		//조건문(switch)(op char이므로 문자라 들어갈 수 있는 조건)
//		switch(op) {
//		case '+' : // + 입력하는 경우 +부터 실행하므로 세 구문 다 출력
//			System.out.println("+로 들어왔습니다.");
//		case '-' :
//			System.out.println("-로 들어왔습니다.");
//		default : 
//			System.out.println("잘못 들어왔습니다.");
//		}
		
//		switch(op) {
//		case '+' : 
//			System.out.println("+로 들어왔습니다.");
//			break; // 조건에 맞아 진입한 부분부터 쭉 실행하지만 break가 있으면 그 구간에서 빠져나옴
//		case '-' :
//			System.out.println("-로 들어왔습니다.");
//			break;
//		default : 
//			System.out.println("잘못 들어왔습니다.");
//			break;
//		}
		
		switch(op) {
		case '+' : 
			result = num1 + num2 + " ";
			break; 
		case '-' :
			result = num1 - num2 + " ";
			break;
		default : 
			result = "잘못 입력했습니다.";

		}

		
		System.out.println("결과 : " + result);
	}

}
