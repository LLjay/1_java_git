package Test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("2부터 5까지의 수 중 하나를 입력하세요. : ");
		int data = sc.nextInt();
		sc.nextLine();
		
		Calculator cal = new Calculator();
		try {
			System.out.println("결과값 : " + cal.getSum(data));
		} catch (InvalidException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
//		System.out.println(cal.getSum(data));
//		Exception을 상속 받은 클래스는 Exception을 발생시킬 수 있다.
		
	}

}
