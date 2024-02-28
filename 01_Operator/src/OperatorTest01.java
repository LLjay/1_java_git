
public class OperatorTest01 {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
//		System.out.println("num1 / num2 = " + (num1 / num2));
//		
//		System.out.println("num1 / num2 = " + (7.0 / 3.0));
//		
//		System.out.println("num1 / num2 = " + (7.0 / 3));
		//형 변환 때문에 실수로 나옴
//		
//		System.out.println(num1); // 10
//		System.out.println(num2); // 3
//		
//		num1 += num2; // num1 = num1 + num2;
//					  // num1 = 7 + 3
		
		num1 %= num2; // num1 = num1 % num2;
					  // num1 = 7 % 3;
		
		System.out.println(num1); // 1
		System.out.println(num2); // 3
		
		// ++num 전위연산일 경우 먼저 연산 진행 후 코드 실행
		// num++ 후위연산일 경우 먼저 코드 실행 후 연산 진행
		int num3 = 0;
		System.out.println(num3++); // 출력; 끝난 이후 +1
		System.out.println(++num3); // 출력 전 +1 후 출력
		System.out.println(num3--); // 출력; 끝난 이후 -1
		System.out.println(--num3); // 출력 전 -1 후 출력
		
		
		
		
		
		
	}

}
