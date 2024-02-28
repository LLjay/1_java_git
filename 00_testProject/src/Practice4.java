import java.util.Scanner;

public class Practice4 {
	
	/*
	 * 영어 문자열 값을 키보드로 입력 받아 문자에서 앞으로부터 3개를 출력하세요.
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char first, second, third;
		
		System.out.print("문자열을 입력하세요 : ");
//		first = input.next().charAt(0);
//		second = input.next().charAt(1);
//		third = input.next().charAt(2);
		//.next()는 입력을 받는 명령어이므로 입력을 3번 받아야 함
		// 따라서 한 번 받은 입력어를 우선 저장한 후 그 입력어에서 문자를 따옴
//		
//		System.out.println("첫 번째 문자 : " + first);
//		System.out.println("두 번째 문자 : " + second);
//		System.out.println("세 번째 문자 : " + third);
		
		String str = input.next();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		System.out.printf("첫 번째 문자 : %c\n", str.charAt(0));
		System.out.printf("두 번째 문자 : %s\n", str.charAt(1));
		System.out.printf("세 번째 문자 : %c\n", str.charAt(2));
		System.out.printf("네 번째 문자 : %c\n", str.charAt(3));
		System.out.printf("다섯 번째 문자 : %c\n", str.charAt(4));
		
	}

}
