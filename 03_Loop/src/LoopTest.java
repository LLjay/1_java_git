import java.util.Scanner;

public class LoopTest {
	public static void main(String[] args) {
		
//		System.out.println("반복문 시작 전");
		// for (초기식; 조건식; 증감식)
//		
//		
//		for (int i=0; i < 5; i++) { // 초기식에 사용하는 변수는 for문 괄호 안에서만 사용 가능
//			System.out.println("반복문 실행 : " + i);
//		}
//		
//		System.out.println("반복문 종료");
//		
//		int i = 0; // for문에서 초기식
//		while(i < 10) {
//			System.out.println(i);
//		} // -> 무한반복
//		while(i < 10) { // -> for문에서 조건식
//			System.out.println("반복문 실행 : " + i); // for문에서 실행문
//			i++; // for문에서 증감식
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String menu;
		
		while(num != 7) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.println("메뉴 번호를 입력하세요. : ");
			
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("입력 메뉴입니다.");
			} else if (num == 2) {
				System.out.println("수정 메뉴입니다.");
			} else if (num == 3) {
				System.out.println("조회 메뉴입니다.");
			} else if (num == 4) {
				System.out.println("삭제 메뉴입니다.");
			} else if (num == 7) {
				System.out.println("프로그램이 종료됩니다.");
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		do {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.println("메뉴 번호를 입력하세요. : ");
			
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("입력 메뉴입니다.");
			} else if (num == 2) {
				System.out.println("수정 메뉴입니다.");
			} else if (num == 3) {
				System.out.println("조회 메뉴입니다.");
			} else if (num == 4) {
				System.out.println("삭제 메뉴입니다.");
			} else if (num == 7) {
				System.out.println("프로그램이 종료됩니다.");
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		} while(num != 7);
		// -> 원래는 while이 먼저 들어가있으나 do가 차지 했으므로
		// 	  while 조건을 검사하고 곧바로 위로 올라감
		// -> while 뒤에 세미콜론을 반드시 찍어줘야 함
	}

}
