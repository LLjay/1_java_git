import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		// 내 예시
		int i;
		char ch1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String word = sc.next();
		sc.nextLine();
		
		char[] cArr = new char[word.length()];
		
		System.out.println("문자 : ");
		ch1 = sc.next().charAt(0);
		
		int sum = 0;
		
		System.out.println("에 존재하는 인덱스 : ");
		
		for (i = 0; i < word.length(); i++) {
			cArr[i] = word.charAt(i);
			if (ch1 == cArr[i]) {
				sum++;
				System.out.println(i + " ");
			}
		}
		System.out.println("개수 : " + sum);
		
		
		
		
		
		
		// 강사님 예시
//		Scanner sc = new Scanner(System.in);
//		// 1. 문자열을 입력 받아
//		String str = sc.next();
//		int count = 0;
//		
//		// 2. 배열을 만들어서 문자열 -> 문자로 바꿔서 배열에 넣는다.
//		char[] chArr = new char[str.length()];
//		
//		// 3. 문자열 -> 문자로 바꿔서 배열에 넣는다.
//		for (int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//		}
//		
//		// 4. 문자 하나 입력 받기
//		char target = sc.next().charAt(0);
//		
//		// 5. 검색할 문자가 문자열에 몇 개 들어가 있는지
//		//    개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		
//		System.out.print(str + "에 존재하는 위치(인덱스) : ");
//		
//		for (int i = 0; i < chArr.length(); i++) {
//			if (target == chArr[i]) {
//				count++;
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("\n" + target + "개수 : " + count);
//		
	}

}
