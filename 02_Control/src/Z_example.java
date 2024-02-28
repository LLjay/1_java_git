import java.util.Scanner;

public class Z_example {
	public static void main(String[] args) {
	
		//질문	
		
//		후위 연산을 사용해야 하는 예시가 뭐가 있지?
//		부정 연산 사용 예시 (문 열고 닫기 해보기)
//		왜 괄호를 다 벗어나면 결과 출력이 안 되지? (if문)
// 		형 변환은 원시타입에서 원시타입만 가능하고 객체는 불가능한가?
//		숫자를 표기할 때 은/는을 구별해서 출력하는 방법
		//실행하라 라는 명령어를 가진 코드 없나...
//		==============================================================
		
//		if (num > 0) {
//			System.out.println("양수이다.");
//		} else if (num < 0) {
//				System.out.println("음수이다.");
//			} else {
//				System.out.println("0이다.");
//			}
//		===============================================================
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("양수를 입력하세요. : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if ((num >= 0) && (num <= 10)) {
//			System.out.println(num + "은 0에서 10 사이의 수입니다.");
//		} else if ((num >= 11) && (num <= 20)) {
//				System.out.println(num + "은 11에서 20 사이의 수입니다.");
//		} else if ((num >= 21) && (num <= 30)) {
//			System.out.println(num + "은 21에서 30 사이의 수입니다.");
//		} else {
//			System.out.println(num + "은 30을 초과하는 수입니다.");
//		}
//		================================================================
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		String res1;
//		
//		System.out.println("정수(양수) 입력 : ");
//		num = sc.nextInt();
//		sc.nextLine();
//
//		if (num % 2 == 0) {
//			res1 = "짝수";
//		} else if (!(num % 2 == 0)) {
//			res1 = "홀수";
//		} else {
//			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
//		}
//		
//		System.out.println(res1 + "다.");
//		-> 에러 뜨는 이유 : else로 넘어간 경우 res1의 값이 설정되지 않으므로
//		-> return을 붙이면 res1의 값을 설정해주지 않아도 메소드가 종료되므로 에러 X
//		
//		================================================================
		
		
//		boolean doorOpen;
//		
//		doorOpen = !doorOpen;
		
//		================================================================
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, num3;
//		char ch;
//		
//		System.out.print("첫 번째 양수를 입력하세요.");
//		num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("두 번째 양수를 입력하세요.");
//		num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("연산자(+, -, *, /, %)를 입력하세요.");
//		ch = sc.next().charAt(0);
//		
//		if (num1 > 0 && num2 > 0) {
//				switch(ch) {
//				case '+' :
//					num3 = num1 + num2;
//					break;
//				case '-' :
//					num3 = num1 - num2;
//					break;
//				case '*' :
//					num3 = num1 * num2;
//					break;
//				case '/' :
//					num3 = num1 / num2;
//					break;
//				default :
//					num3 = 0;
//					System.out.println("잘못된 형식입니다.");
//				}
//				System.out.println("연산 결과는 " + num3 + "입니다.");
//		} else {
//			System.out.println("잘못된 형식입니다.");
//		}
//		System.out.println("연산 결과는 " + num3 + "입니다.");
		
		// 여기서 num3에서 오류가 뜨는 이유는 if문에서 num3가 정의되지 않을 수도 있기 때문
		
		// System.out.println("연산 결과는 " + num3 + "입니다.");
		
		// 모든 것은 중괄호 기준
		// 지역 변수 = 중괄호 영역 안에서만 사용할 수 있는 변수
		// 자바는 전역 변수(모든 곳에서 사용할 수 있는 변수)가 없음
		// -> 모든 게 클래스의 영역 안에 포함되어 있기 때문에
		// 서울의 구로구 구로동에 있는 물건은 신도림동에서 쓸 수 없음
		// 가비지 컬렉터 : 메모리를 계속 청소해줌
		// -> 함수가 끝나는 순간(괄호가 끝나는 순간) 메모리를 없애버림
		// -> 괄호를 벗어나는 순간 없는 데이터가 됨
		// 더 좁은 영역으로 들어갈 수는 있어도 바깥으로 나갈 수는 없음
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("좋아하는 숫자를 입력하세요. : ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("이름을 입력하세요.");
//		String name = sc.next();
//		sc.nextLine();
//		
//		System.out.printf("제 이름은 %s입니다. 제가 좋아하는 숫자는 %d입니다.", name, num1);
		
//		char ch1, ch2;
//		ch1 = sc.next().charAt(0);
//		ch2 = sc.next().charAt(0);
//		
//		
//		
//		System.out.println(Character.toString(ch2) + Character.toString(ch1));
//		System.out.printf("%c, %c", ch2, ch1);
//		
//		// char에서 String으로 자동형변환은 안 되지만 객체이므로 클래스 문법을 이용해서 따로 char 출력 가능
		
		
		
		
		
		
		
		
		
		
		
		String str1 = "안녕하세요.";
		String str2 = "안녕하세요.";

		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2););
		
		
	}

}
