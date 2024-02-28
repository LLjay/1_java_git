import java.util.Scanner;
public class Casting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		// ex)
		// 문자 : A
		// Unicode : 65
		
		System.out.print("문자 하나를 입력하세요. : ");
		char un = sc.next().charAt(0);
		
		System.out.println(un + " Unicode : " + (int)un);
		System.out.println(un + " Unicode : " + (un + 0));
	}


}
