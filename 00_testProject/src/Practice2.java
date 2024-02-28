import java.util.Scanner;


public class Practice2 {

	/*
	 * 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요. : ");
		int num1 = input.nextInt();
		input.nextLine();
		
		System.out.print("두 번째 정수를 입력하세요. : ");
		int num2 = input.nextInt();
		input.nextLine();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		//괄호를 치지 않으면 앞의 문자열이 더 커서 문자열을 따라가기 때문에 나열됨
		
		int num3 = num1 + num2;
		
		System.out.printf("더하기 결과 : %d", num3);
		System.out.printf("더하기 결과 : %d", (num1 + num2));
		
	}
}
