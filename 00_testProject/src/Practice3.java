import java.util.Scanner;

public class Practice3 {
	
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	 * 공식) 면적 : 가로 * 세로
	 * 		둘레 : (가로 + 세로) * 2
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float garo, sero;
		//width, height
		//사용할 변수를 먼저 선언 해주는 게 가독성이 좋기 때문에 앞에 써줌
		
		System.out.print("가로 : ");
		garo = scan.nextFloat();
		scan.nextLine();
		
		System.out.print("세로 : ");
		sero = scan.nextFloat();
		scan.nextLine();
		
		System.out.printf("면적 : %.2f\n", (garo * sero));
		System.out.printf("둘레 : %.2f", ((garo + sero) * 2));
	}
}
