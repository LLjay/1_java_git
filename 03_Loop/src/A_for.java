import java.util.Scanner;
import java.lang.Math;

public class A_for {
		
		/*
		 * <반복문>
		 * 프로그램 흐름을 제어하는 제어문 중 하나
		 * 어떤 실행코드를 반복적으로 수행 시켜준다.
		 * 
		 * 크게 두 종류로 나뉨 ( for문 / while문 (do-while문)
		 * 
		 * #for문
		 * 
		 * for(초기식; 조건식; 증감식) {		// 반복 횟수를 지정하기 위해 제시하는 것들
		 * 		반복적으로 실행 시키고자 하는 구문
		 * }
		 * 
		 * - 초기식 : 반복문이 수행될 때 "처음에 단 한 번만 실행하는 구문"
		 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
		 * 			-> 초기식은 탈출 조건을 만들어줘야 함 (아니면 계속 돌기 때문에)
		 * 
		 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
		 * 			조건식이 true일 경우 해당 구문을 실행
		 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
		 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 정함)
		 * 
		 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
		 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자를 사용함)
		 * 
		 * #for문을 만나는 순간
		 * 초기식 -> 조건식 검사 -> true일 경우 실행구문 실행 -> 증감식
		 * 		-> 조건식 검사 -> true일 경우 실행구문 실행 -> 증감식
		 * ------------------------해당 내용 반복------------------------
		 * 		   조건식 검사 -> false일 경우 실행구문 실행X==> 반복문 빠져나옴
		 * 
		 *  tip. 알아둘 점
		 *    for문 안에 초기식, 조건식, 증감식
		 * 
		 * 

		 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// "안녕하세요"를 5번 출력하세요.
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		// -> 수가 40개 60개 80개로 늘어나면 구분도 작성도 힘들어짐
		
//		for (int i = 0; i < 5; i++) { // i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복 수행
//			System.out.println("안녕하세요"); // 증감을 앞에서 하든 뒤에서 하든 다 똑같은 결과
//		} 
//		
//		for (int i = 11; i < 16; i++) { // i값이 11에서부터 16까지 매번 1씩 증가하는 동안 반복수행
//			
//			
//		for (int i = 1; i < 9; i+=2) { // i값이 1에서부터 8까지 매번 2씩 증가하는 동안 반복수행)
////			 -> 총 횟수가 바뀜
		
		// 1 ~ 5까지 순차적으로 출력하세요 (1 2 3 4 5)
		
//		for (int i = 1; i < 6; i++) { // 1 2 3 4 5
//			System.out.print(i + " ");
//		}
////		for ( ; ; )
////			System.out.println(); // 무한반복
//		
//		// 5~1까지 순차적으로 출력
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i + "");
		
		// 정수 n을 입력 받아 1부터 n까지 일씩 증가 시키면서 출력해라.
		// 정수 입력 : 3
		// 1 2 3

//		System.out.println("정수 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		for (i = 1; i <= n; i++) {
//			System.out.print(i + "");
//		}
		//======================================================
		
		// 1부터 10 사이의 홀수만 출력
		// 1 3 5 7 9
		
		// 내 예시
//		int res;
//		for (res = 1; res < 10; res += 2) {
//			System.out.println(res);
			
		// 강사님 예시
		
//		for (int i = 1; i < 11; i++) {
//			if (i % 2 == 1) {
//				System.out.print(i + " ");
//			}
//		}

		// 1에서부터 10까지 총 합계를 구해라
		// 방법 1. 1+2+3+4+...+10; => 수가 늘어나면 힘들어짐
		
		// 방법 2.
		/* 
		 * int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 10;
		 * => 1 + 2
		 * => (1 + 2) + 3
		 * => ((1 + 2) + 3) + 4
		 * ...
		 * 
		 * 규칙을 찾자! sum 변수에 누적해서 합산하는 것이 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가한다.
		 */
		 
//		int sum = 0;
//		
//		for (int i = 1; i < 11; i++) { // 1 2 3 4 5 6 7 8 9 10
//			sum += i;
//			// 0 + 1 = 1 을 sum에 넣어라.
//			// (0 + 1) + 2 = 3 을 sum에 넣어라.
//			// ((0 + 1) + 2) + 3 = 6 을 sum에 넣어라.
//		}
//		System.out.println("1부터 10까지의 모든 수의 합 : " + sum);
		
		// =======================================================
		
		// 정수 n을 입력 받아 1부터 n까지 1씩 증가하며 모든 수를 더해서 출력해라.
		// 정수 입력 : 10
		// 1부터 10까지의 합 : 55
		
//		int n, num, sum;
//		
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		sum = 0;
//		
//		for (num = 1; num <= n; num++) {
//			// sum을 여기서 초기화 해주면 바깥에 sum 값이 없기 때문에 결과에 오류
//			sum += num;
//		}
//		System.out.println("1부터 " + n + "까지의 합 : " + sum);

		/* 
		 * java.lang.Math => 클래스에서 제공하는 random 메소드 호출해서 매번 다른 랜덤값을 얻어낼 수 있다.
		 *  => Math 안에 random 메소드가 있는 것
		 *  
		 * Math.random() 호출 시 ==> 0.0 ~ 0.99999999 사이의 랜덤값을 반환
		 *  						(0.0 <=    < 1.0)
		 * -> double이 기본값
		 * int random = Math.random(); // double형이라서 안 됨
		 * 
		 * int random = Math.random() * 10; // 10도 int라 곱하면 double 나오기 때문에 안 됨
		 *				(0.0 <=    < 10.0); => 0.0 ~ 9.99999999
		 *
		 * int random = Math.random() * 10 + 1;
		 * 				(1.0 <=    < 11.0); => 1.0 ~ 10.99999999
		 * 
		 * int random = (int)(Math.random() * 10 + 1);
		 * 				(1 ~ 10)
		 * -> 랜덤에 어디까지 구하고 싶은지(10) 적고 시작값(1) 적으면 정수로 변환
		 */
		
//		System.out.println(Math.random());
		
		// random한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요.
		// random 수 : 5
		// 1 ~ 5까지의 합 : 15
		// 1 <= random <= 10
		
//		int n= (int)(Math.random() * 10 + 1);
//		
//		int sum = 0;
//		int num;
//		
//		for (num = 1; num <= n; num++) {
//			sum += num;
//		}
//		System.out.println("random 수 : " + n);
//		System.out.println("1 ~ " + n + "까지의 합 : " + sum);
		// ================================================================
		// random(5~50)한 숫자 n을 생성해서 1부터 n까지의 숫자 중 짝수만 출력해라
		// random 수 : 10
		// 2 4 6 8 
		
//		int n = (int)(Math.random() * 46 + 5); // 왜 46이지?
//		int sum = 0;
//		int num;
//		
//		for (num = 1; num <= n; num++) {
//			if (num % 2 == 0) {
//			System.out.print(num + " ");
//			}
//		}
		
		// ==========================================================
		
		/*
		 * 각 인덱스별 문자를 뽑아서 출력
		 * 인덱스 = 컴퓨터가 문자 순서를 세는 법 (0, 1, 2, 3, ...)
		 * 
		 * H => str.charAt(0) 출력
		 * e => str.charAt(1) 출력
		 * l => str.charAt(2) 출력
		 * l => str.charAt(3) 출력
		 * o => str.charAt(4) 출력
		 * 
		 * 0번 인덱스에서부터 4번 인덱스(마지막 인덱스)까지 매번 1씩 증가하면서 반복 수행
		 * 
		 * 문자열.length() : 문자열의 길이를 구할 수 있다. (공백 포함)
		 * ex) HelloWorld -> 길이 10 / Hello World -> 길이 11
		 */
//		String str;
//		System.out.print("문자 입력하세요 : ");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
//		
//		System.out.println(str.length());
		
		// 자료형은 .기능() 형태가 없는데 객체는 있음
		// 변수.next(); 변수.next().charAt(); 변수.equals();
		
		//=============================================================
		
		// 사용자에게 문자열을 입력 받아 
		// 해당 문자열의 짝수 자리 글자만 출력
		// 문자열을 입력 : hello
		// el
		
		// 내 예시
//		System.out.print("문자를 입력하세요. : ");
//		String word = sc.next();
//		int num;
//		
//		for (num = 0; num <= word.length(); num++) {
//			if (num % 2 == 0) {
//				System.out.print(word.length()););
//				System.out.print();
//			}
//		}
		
		// 강사님 예시
		
//		String str;
//		
//		System.out.print("문자열 입력 : ");
//		str = sc.next();
		
		// 각 인덱스별 문자를 뽑아서 출력
		
		// apple 길이 : 5
		// 01234
		
		// 마지막 인덱스는 항상 (문자열 길이 - 1)
		// 추출하고자 하는 인덱스 값이 0 ~ (문자열 길이 -1)까지 매번 1씩 증가
		
//		for (int i = 0; i < str.length(); i++) // i <= (str.length() - 1);
//			if (i % 2 != 0) { // 출력하고자 하는 것은 짝수 자리 글자(다만 짝수 자리 글자의 인덱스는 모두 홀수이다.) 
//			System.out.println(str.charAt(i));
//			}
		
		
//===================================================================
		
//		System.out.println("문자열 입력 : ");
//		String word = sc.next(); 
//		// word는 이미 여기서 키보드를 통해 입력 받은 값으로 초기화 되었음
//		int num;
//		
//		for (num = 0; num < word.length(); num++) {
//			if (num % 2 == 0) { // word에 값이 들어 있으므로 어떤 기능을 써도 무방
//				System.out.println(word.charAt(num));
//			}
//		}
		
		//===================================================================
		
		// 구구단 2단을 출력해보자
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * 
		 * 2는 똑같이 반복, 1부터 9까지
		 */
	
//		System.out.println("2 * ");
		
//		int num, dan, res;
//		
//		for (num = 1; num <= 9; num++) {
//			System.out.println("2 * " + num + " = " + (2*num));
//		}
		
		// 사용자로부터 단을 입력 받아
		// 사용자가 입력한 단을 출력하기
		// 단 수(2~9)를 입력 : 2 
		
		// 내 예시
//		int dan, num;
//		
//		System.out.print("단 수(2~9) 입력 : ");
//		dan = sc.nextInt();
//		
//		for (num = 1; num < 10; num++) {
//			System.out.println(dan + " * " + num + " = " + dan*num);
//		}
		
		// 강사님 예시
		
//		int dan;
//		
//		System.out.println("단 수(2~9)를 입력 : ");
//		dan = sc.nextInt();
//		
//		if (dan >= 2 && dan <= 9) {
//			for (int num = 1; num <= 9; num++)
//				System.out.printf("%d * %d = %d\n", dan, num, (dan*num));
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
		
		// ===================================================================
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// 내 예시
//		int i, j, num1, num2;
//		
//		num = sc.nextInt();
//		
//		for (i = 1; i <= num1; i++) {
//			for (j = 1; j <= num2; j++)
//		}
		
		// 강사님 예시
		
		for (int i = 0; i < 3; i++) {
			//1 -> 시작 하자마자 한 번 개행
			for (int j = 1; j < 6; j++) {
				//2 -> 숫자 늘어나면서 계속 개행
				System.out.print(j + " ");
				//3 -> 숫자 늘어나면서 계속 개행
			}
			//4 -> 한 번 출력한 후에 개행
		}
		
// ==============================================================
		
		// 구구단을 2~9단 모두 출력해라.
		
		int dan, time;
		
		for (dan = 2; dan <=9; dan++) {
			for (time = 1; time <=9; time++) {
				System.out.printf("%d * %d = %d\n", dan, time, (dan*time));
			}
			System.out.println();
		}


		

	}

}
