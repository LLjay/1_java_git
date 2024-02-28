import java.util.Scanner;

public class Controll01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "ㅇㅇ 메뉴입니다."를,
		//종료 번호를 누르면 "프로그램이 종료됩니다." 를 출력하세요.
		
		/*
		 * ex)
		 * 
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 메뉴번호를 입력하세요. : 4
		 * 삭제 메뉴입니다.
		 */
		
//		int num;
//		String menu;
//		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.println("메뉴 번호를 입력하세요. : ");
//		num = sc.nextInt();
		
//		if (num == 1) {
//			System.out.println("입력 메뉴입니다.");
//		} else if (num == 2) {
//			System.out.println("수정 메뉴입니다.");
//		} else if (num == 3) {
//			System.out.println("조회 메뉴입니다.");
//		} else if (num == 4) {
//			System.out.println("삭제 메뉴입니다.");
//		} else if (num == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		} else {
//			System.out.println("잘못 입력하였습니다.");
//		}
//		
//		switch (num) {
//		case 1 :
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2 :
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3 :
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4 :
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 7 :
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		default : 
//			System.out.println("잘못 입력하였습니다.");
//		}
		
		
		
		
		int num;
		String menu = " ";
		
		System.out.print("메뉴 번호를 입력하세요. : ");
		num = sc.nextInt();
		
		if (num == 1) {
			menu = "입력";
		} else if (num == 2) {
			menu = "수정";
		} else if (num == 3) {
			menu = "조회";
		} else if (num == 4) {
			menu = "삭제";
		} else if (num == 7) {
			menu = "종료";
					System.out.println("프로그램이 종료됩니다.");
		}
		if (menu != "종료") {
		System.out.println(menu + " 메뉴입니다.");
		}
		
		// String menu;
//		-> String이 초기화 되지 않은 상태로 else도 없기 때문에 실행이 되지 않았음
		
//		if (num == 1) {
//			menu = "입력";
//		} else if (num == 2) {
//			menu = "수정";
//		} else if (num == 3) {
//			menu = "조회";
//		} else if (num == 4) {
//			menu = "삭제";
//		} else if (num == 7) {
//			menu = "종료";
//					System.out.println("프로그램이 종료됩니다.");
//		}
		
//		if (menu != "종료") {
//		System.out.println(menu + " 메뉴입니다.");
//		}
	}

}
