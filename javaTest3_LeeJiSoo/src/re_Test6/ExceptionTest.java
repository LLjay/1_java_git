package re_Test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		Calculator cal = new Calculator();

		try {
			cal.getSum(num);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
	}

}
