import java.util.Scanner;

public class Mexample {
	
	public static void main(String[] args) {
		
		//	예제풀이
//		int a = 10;
//		int b = 29;
//		
//		int c = a++; // a=10(11), b=29, c=10
//		int d = c-- + --b; // a=11, b=28, c=10(9), d=38
//		int e = ++b - d * a--; // a=11(10), b=29, c=9, d=38, e=-389
//		
//		int f = (a-- - e) * (++c - d--) + b--; // a=10(9), b=29(28), c=10, d=38(37), e=-389
//				// (10 - -389) * (10 - 38) + 29 = -11143
//		
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
//		System.out.println("c : " + c);
//		System.out.println("d : " + d);
//		System.out.println("e : " + e);
//		System.out.println("f : " + f);
//		----------------------------------------------------------------------
		// 괄호 여부에 따른 오류 (없음)	
//		int num = 10;
//		
//		boolean result1 = num < 5 && ++num > 0; // FT
//		System.out.println(result1);
//		----------------------------------------------------------------------
		//	문자를 숫자로 표현
//		char gul = 44544;
//		System.out.println(gul);
//		----------------------------------------------------------------------
		//	자동 형변환 예시 (int, float)
//		int num1 = 10;
//		float num2 = 2.0f;
//		int num3 = num1 + (int)num2;
//		
//		System.out.println(num1 + num2); // 12.0
//		System.out.println((int)(num1 + num2)); // 12
//		System.out.println(num3); // 12
//		-------------------------------------------------------------------
		// 정수 두 개와 연산자를 입력 받아 연산 결과를 출력하시오. (삼항연산자-다른 답) 
		// String 변수는 데이터의 주소가 할당되기 때문에 비교 연산 하면 서로 다른 데이터라고 출력됨
		// 변수이름.equals(변수이름) 으로 비교해야 함
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("첫 번째 정수 : ");
//		int num1 = input.nextInt();
//		input.nextLine();
//		
//		System.out.print("두 번째 정수 : ");
//		int num2 = input.nextInt();
//		input.nextLine();
//		
//		System.out.println("연산자 입력 (+ 또는 -) : ");
//		char in = input.next().charAt(0);
//		// String 변수의 비교 연산은 따로 명령어가 있어 비교 연산자로는 비교가 불가능함
//		boolean plus = (in == '+') || (in == '-');
//		int num3 = (in == '+') ? (num1 + num2) : (num1 - num2);
//		
//		System.out.println(plus ? num3 : "잘못 입력했습니다.");
//		-------------------------------------------------------------------
		//	switch문 예제풀이
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("사계절을 입력하세요. : ");
//		String four = sc.nextLine();
//		
//		switch(four) {
//		case "봄" : 
//			System.out.println("봄입니다.");
//			break;
//		case "여름" : 
//			System.out.println("여름입니다.");
//			break;
//		case "가을" :
//			System.out.println("가을입니다.");
//			break;
//		default :
//			System.out.println("겨울입니다.");
//		}
		
//		-------------------------------------------------------------------
		// 나머지 연산과 곱하기/나누기 연산의 순서 (왼->오)
//		int num1 = 10 % 3 * 8;
//		System.out.println(num1);
//		-------------------------------------------------------------------
//		
//		int num;
//		
//		String result =  ? "양수" : ;
//		
//		--------------------------------------------------------------------
		//	ch1 ch2 ch3은 char 형태 그대로인 상태로 이지수 붙여서 출력하기	
//		
//		char ch1 = '이';
//		char ch2 = '지';
//		char ch3 = '수';
//		
//		System.out.println("문자 자료형");
//		System.out.printf("%c%c%c\n", ch1, ch2, ch3);
//		
//		System.out.print(ch1);
//		System.out.print(ch2);
//		System.out.println(ch3);
//		-----------------------------------------------------------------------
		
//		String str1, str2;
//		str1 = "A";
//		str2 = "A";
//		
//		System.out.println(str1.equals(str2));
//		-----------------------------------------------------------------------
//		// 예제
//		int num1, num2;
//		num1 = 3729;
//		num2 = 52;
//		System.out.println(num1 / num2 + "개 필요");
//		-----------------------------------------------------------------------
		// 예제
		// 사용자에게 두 개의 정수값을 입력 받으세요.
		// + 또는 -를 입력 받아 그에 맞는 연산 결과를 출력해주세요.
		// 단, + 또는 - 이외에 다른 문자를 입력했을 경우 "잘못 입력했습니다" 출력
		// 첫 번째 정수 : 
		// 두 번째 정수 :
		// 연산자 입력 (+ 또는 -)
		// 결과 : xxx / 잘못 입력했습니다.
//		
//		Scanner scan = new Scanner(System.in);
//		String num3;
//		
//		System.out.print("첫 번째 정수를 입력하세요. : ");
//		int num1 = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("두 번째 정수를 입력하세요. : ");
//		int num2 = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("연산자 입력 (+, -, *, /) : ");
//		char operator = scan.next().charAt(0);
//		
//		 
//		switch(operator) {
//		case '+' :
//			num3 = num1 + num2 + "";
//			break;
//		case '-' : 
//			num3 = num1 - num2 + "";
//			break;
//		case '*' :
//			num3 = num1 * num2 + "";
//			break;
//		case '/' :
//			num3 = num1 / num2 + "";
//			break;
//		default :
//			num3 = "잘못 입력된 값입니다.";
//			
//		// System.out.println(num3); => 이 자리에 있으면 break 때문에 빠져나왔기 때문에 출력 실행이 안 됨
//		// 중괄호 바깥에서 출력해줘야 break에 걸리지 않고 실행
//		}
//		System.out.println(num3);
		// 숫자 입력에서 틀리면 틀렸다고 바로 출력하는 방법?
		
//		//		-----------------------------------------------------------------------
		//	질문	
//		후위 연산을 사용해야 하는 예시가 뭐가 있지?
//		부정 연산 사용 예시 (문 열고 닫기 해보기)
//		왜 괄호를 다 벗어나면 결과 출력이 안 되지? (if문)
// 		형 변환은 원시타입에서 원시타입만 가능하고 객체는 불가능한가?
//		숫자를 표기할 때 은/는을 구별해서 출력하는 방법
//		
//		-----------------------------------------------------------------------
		// .charAt(0)
		
//		char ch = "안녕하세요".charAt(0);
//		System.out.println(ch);
//		// sc.next().charAt(0) 에서 sc.next() 와 .charAt(0)은 독립적인 기능
		
//		-----------------------------------------------------------------------		
		
		
	}

}
