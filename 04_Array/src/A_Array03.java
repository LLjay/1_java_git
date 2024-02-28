import java.util.Scanner;
import java.lang.Math; 

public class A_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 크기가 10인 정수형 배열 생성 후
//		int[] arr = new int[10];
		
		
		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		//	  매번 1 ~ 100 사이의 랜덤값
		
		 // 내 예시
	
		// int num = (int)(Math.random() * 100 + 1); => 여기다 쓰면 이미 정해진 값을 계속 대입하는 것만 반복
		
//		for (int i = 0; i < 10; i++) {
//			int num = (int)(Math.random() * 100 + 1);
//			arr[i] = num;
//		}
//		
//		// 강사님 예시
////		for (int i = 0; i < arr.length; i++) {
////			arr[i] = (int)(Math.random() * 100 + 1);
////		}
//		
//		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값을 전부 출력
//		// arr[x] : xx
//		
		// 내 예시
//		for (int i = 0; i < 10; i++) {
//			int num = (int)(Math.random() * 100 + 1);
//			System.out.println("arr[" + i + "] = " + num);
//		}
		
		// 강사님 예시
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "] = " + arr[i]);
//		}
		
		// 1. 사용자에게 배열의 길이를 입력 받은 후
		// 	  해당 크기의 문자열 배열을 생성
		
		// 내 예시
//		Scanner sc = new Scanner(System.in);
////		
////		System.out.println("길이를 입력 : ");
////		int leng = sc.nextInt();
////		
////		String[] fruit = new fruit[leng];
//		
//		// 강사님 예시
//		
//		int size;
//		
//		System.out.println("배열의 길이 : ");
//		size = sc.nextInt();
//		sc.nextLine();
//		
//		String[] strArr = new String[size];
//		
//		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력 받아 그 값을 매 인덱스 자리에 대입(0~마지막 인덱스)
//		
//		for (int i = 0; i < size; i++) { // size 대신 strArr.length로 해도 됨
//			System.out.println("좋아하는 과일을 입력하세요 : ");
//			strArr[i] = sc.next();
//		}
//		
//		// 3. 반복문을 이용해서 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		// 사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨닮기
		
		// 1. 사용자에게 문자열 한 개 입력 받기
		
//		System.out.println("문자열 입력");
//		String word = sc.next();
//		sc.nextLine();
//		
//		// 2. char 배열 생성해두기 (배열의 길이 == 문자열의 길이)
//		
//		char[] cArr = new char[word.length()];
//		
//		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열에 각 인덱스에 대입
//		
//		for (int i = 0; i < word.length(); i++) {
//			word.charAt(i);
//		}
//		
//		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		
////		for (int i = 0; i < word.length(); i++) {
////			System.out.println(i + "번 : " + word.charAt(i));
////		}
		
		
		
		
//		// -
//		
//		// 1. 사용자에게 문자열 한 개 입력 받기
//		
//		System.out.println("문자열 입력");
//		String word = sc.nextLine();
//		
//		// 2. char 배열 생성해두기 (배열의 길이 == 문자열의 길이)
//		
//		char[] cArr = new char[word.length()];
//		
//		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열에 각 인덱스에 대입
//		
//		// 내 예시
////		for (int i = 0; i < word.length(); i++) {
////			word.charAt(i);
////		}
//		
//		// 강사님 예시
//		for (int i = 0; i < cArr.length; i++) {
//			cArr[i] = word.charAt(i);
//		}
//		
//		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		
//		for (int i = 0; i < cArr.length; i++) {
//			System.out.println(cArr[i]);
//		}
		
		
		//=====================================================================
		
		// 1. 사용자에게 배열의 길이를 입력 받은 후 해당 크기 만큼의 정수 배열 생성
		
//		System.out.println("배열의 길이 : "); 
//		
//		int leng = sc.nextInt();
//		int[] iArr = new int[leng];
//		
//		// 2. 반복문 활용해서 0 ~ 마지막 인덱스까지 매번 1 ~ 100 사이의 랜덤값 발생 시켜 대입
//		
//		for (int i = 0; i < iArr.length; i++) {
//			int random = (int)(Math.random() * 100 + 1);
//			iArr[i] = random;
//		}
//		
//		// 3. 반복문을 활용해서 배열에 담긴 모든 값을 출력함과 동시에
//		//	  짝수인 값들의 총 합을 구해라
//		
//		for (int i = 0; i < iArr.length; i++) {
//			int random = (int)(Math.random() * 100 + 1);
//			iArr[i] = random;
//			System.out.println(i + "번 : " + iArr[i]);
//			if (iArr[i] % 2 == 0) {
//				iArr[i] += iArr[i];
//			}
//		}
		
//		System.out.println(iArr[i]);
		
		// 4. 위에서 구한 짝수값의 총합을 출력
		
		
		// 강사님 예시
		int size;
		int sum = 0;
		System.out.println("정수 배열의 길이 : ");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("짝수의 총 합 : " + sum);
	}

}
