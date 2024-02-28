
public class A_Method {

//	public static void main(String[] args) {
//		System.out.println("프로그램의 시작");
//		hiEveryone(12); // 12를 전달하며 hiEveryone 호출 // 함수를 호출했다 => 함수를 실행했다. 12 = 인자
//		hiEveryone(13); // 13을 전달하며 hiEveryone 호출
//		System.out.println("프로그램의 끝");
//	}
//	
//	public static void hiEveryone(int age) { // 매개 변수라고 함 => 인자가 어떤 값으로 오느냐에 따라 그때마다 달라지는 변수, 빈 공간 => 메소드를 사용하기 위해, 인자를 넘겨받기 위해 사용하는 변수
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//	}
	
//	public static void main(String[] args) {
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5); // 12를 전달하며 hiEveryone 호출 // 함수를 호출했다 => 함수를 실행했다. 12 = 인자
//		hiEveryone(13, myHeight); // 13을 전달하며 hiEveryone 호출
//		byEveryone();
//	}
//	
//	public static void hiEveryone(int age, double height) { // 매개변수가 둘, 인자도 두 개 넘어옴
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("제 키는 " + height + "cm 입니다.");
//	}
//	
//	public static void byEveryone() { 
//		System.out.println("다음에 뵙겠습니다.");
//	}
	
	public static void main(String[] args) {
		int result;
		result = adder(4, 5); // adder가 반환하는 값을 result에 저장
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5)); // square(3.5) 라는 함수가 3.5라는 값을 가지고 메소드에 들어가 num 값에 3.5가 대입된 것
	}
	
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult; // addResult의 값을 반환
	} // return : 값의 반환을 명령
	
	public static double square(double num) {
		return num * num; // num * num의 결과를 반환
	}

}
