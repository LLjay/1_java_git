package Test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		Calculator cal = new Calculator();
		
		try {
			System.out.println("결과값 : " + cal.getSum(num));
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}

}
