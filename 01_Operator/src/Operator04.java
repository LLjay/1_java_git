import java.util.Scanner;

public class Operator04 {
	
	/*
	 * 비교연산자, 관계연산자 (이항 연산자)
	 * 두 값을 비교하는 연산자
	 * 
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)를 반환한다.
	 * 즉, 비교연산의 결과는 논리값이다.
	 * 
	 * 대소비교연산자 : < > <= >=
	 * 동등비교연산자 : == !=
	 * 
	 * 원시타입의 일반 변수 => 동등 비교를 == !=로 진행하면 된다.
	 * 
	 * String(문자열)은 단순하게 ==로 동등 비교할 수 없다.
	 * 이유는 참조변수(객체를 담는 변수)이기 때문에.
	 * => 참조변수는 객체의 주소를 저장함, 주소 안의 데이터가 같아도
	 * 	  주소명이 다르면 동등하다고 나올 수 없음
	 * 
	 * 	String 비교할 때
	 *  문자열.equals(문자열);
	 *  = 메서드의 일종
	 * 
	 */
	
	public static void main(String[] args) { 
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); // F
		System.out.println("a <= b : " + (a <= b)); // T
		
		boolean result = (a > b);
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		System.out.println((a * 2) > (b / 5));
		
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 == 1));
		System.out.println("a가 홀수인가 : " + (a % 2 != 0));
		System.out.println("a가 홀수인가 : " + !(a % 2 == 0));
		
		// 두 수를 입력 받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		
		// 첫 번째 정수 : ()
		// 두 번째 정수 : ()
		// 첫 번째가 두 번째보다 큽니다 : (true/false)
		// 첫 번째 정수는 짝수입니다 : (true/false)
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 정수를 입력하세요. : ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		// 뒤에 오는 게 문자열(next, nextLine)이 아니라면 nextLine으로 날려주지 않아도 되지만
//		// 습관적으로 써줄 것
//		
//		System.out.print("두 번째 정수를 입력하세요. : ");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		
////		System.out.println("첫 번째가 두 번째보다 큽니다 : " + (num1 > num2));
////		System.out.println("첫 번째 정수는 짝수입니다 : " + (num1 % 2 == 0));
//		
//		System.out.println("첫 번째가 두 번째보다 큽니다 : " + (num2 < num1));
//		System.out.println("첫 번째 정수는 짝수입니다 : " + !(num1 % 2 != 0));

		// 특이케이스 (문자와 숫자 간의 대소 비교 가능)
//		System.out.println('A' + 0);
		System.out.println('A' > 60);
		System.out.println('A' > 70);
		System.out.println('Z' + 0);
		// 'A' ~ 'Z' 는 65~90까지의 숫자로 연달아 나열되어 있다.
		
		String str1 = new String("a");
		String str2 = new String("a");
		
		System.out.println(str1 == str2);
		System.out.println(str1 + " " + str2);
		
		// 객체(String)를 비교할 때는 객체를 이용해서 비교해야 함
		System.out.println(str1.equals(str2));
		System.out.println("as".equals("as"));
		
	}

}
