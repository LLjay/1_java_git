import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0~6까지의 숫자를 입력 받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
		 * 0~6사이의 숫자를 입력하세요를 출력하고 다시 입력을 받습니다.
		 */
		
		// 내 예시
		
//		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
//		// 보통은 0 하면 일요일임
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("0~6 사이 숫자를 입력하세요. : ");
//			int indx = sc.nextInt();
//			
//			if (indx >= 0 && indx <= 6) {
//				System.out.println(day[indx] + "요일입니다.");
//				break;
//			} else {
//				System.out.println("0~6사이의 숫자를 입력하세요 : ");
//			}
//		}
		
		
		// 강사님 예시
//		Scanner sc = new Scanner(System.in);
//		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
//		
//		do {
//			System.out.print("0~6 사이 숫자를 입력하세요. : ");
//			int indx = sc.nextInt();
//		} while (indx < 0 || indx > 6);
//		
//		
//		while (int indx < 0 || indx > 6);
//			System.out.print("0~6 사이 숫자를 입력하세요. : ");
//			int indx = sc.nextInt();
//		}	
//		System.out.println(day[indx] + "요일");
		
		
		
		
		
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0~6까지의 숫자를 입력 받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
		 * 0~6사이의 숫자를 입력하세요를 출력하고 다시 입력을 받습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("0~6까지의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		while (num < 0 || num > 6) {
			System.out.println("0~6까지의 숫자를 입력하세요. : ");
			num = sc.nextInt();
		}
		System.out.println(day[num] + "요일입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
