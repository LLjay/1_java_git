import java.util.Scanner;

public class ControllAndLoop01 {
	
	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력 받고 문자열의 검색될 문자를 입력 받아 해당 문자가 몇 개 있는지 개수를 출력하세요.
		 * 그리고 다시 하시겠습니까? : 표시해준 뒤 y를 입력하면
		 * 다시 반복하고 다른 문자를 입력하면 종료
		 */
		
		// 내 예시
//		Scanner sc = new Scanner(System.in);
//		
//		String word;
//		char serc;
//		int sum = 0; // sum 여기서 초기화보다는 가독성 좋게
//		
//		while(true) {
//			System.out.print("문자열 : ");
//			word = sc.next();
//			
//			System.out.print("문자 : ");
//			serc = sc.next().charAt(0);
//			
//			char[] cArr = new char[word.length()];
//			
//			// sum 여기서 초기화하면 보기 쉬움
//			// sum = 0;
//			for (int i = 0; i < cArr.length; i++) {
//				cArr[i] = word.charAt(i);
//				if (cArr[i] == serc) {
//					sum++;
//				}
//			}
//			
//			System.out.println(word + " 안에 포함된 " + serc + "의 개수 : " + sum);
//			
//			System.out.print("다시 하시겠습니까? (y/n) : ");
//			char again = sc.next().charAt(0);
//			
//			if (again == 'y') {
//				continue;
//			} else {
//				break;
//			}
//		}
		
		
		// 강사님 예시
		Scanner sc = new Scanner(System.in);
		
		String word;
		char serc, again;
		int sum; // sum 여기서 초기화보다는 가독성 좋게
		
		do {
			System.out.print("문자열 : ");
			word = sc.nextLine();
			
			System.out.print("문자 : ");
			serc = sc.next().charAt(0);
			
			// sum 여기서 초기화하면 보기 쉬움
			sum = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == serc) {
					sum++;
				}
			}
			
			System.out.println(word + " 안에 포함된 " + serc + "의 개수 : " + sum);
			
			System.out.print("다시 하시겠습니까? (y/n) : ");
			again = sc.next().charAt(0);

		} while (again == 'y');
		
		System.out.println("종료합니다.");
	}

}
