import java.util.Arrays;
import java.util.Scanner;

public class Mexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 1. 사용자에게 문자열 한 개 입력 받기
//		
//		Scanner sc = new Scanner(System.in);
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
////		for (int i = 0; i < word.length(); i++) {
////			word.charAt(i);
////		}
//		
//		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		
//		for (int i = 0; i < word.length(); i++) {
//			if (word.equals(" ")) {
//				continue;
//			}
//			System.out.println(i + "번 : " + word.charAt(i));
//		}
//		
//		
//		
//		
		
		
// ============================================================================

//		// 1. 크기가 10인 정수형 배열 생성 후
//		
//		int[] iArr = new int[10];
//		
//		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
//		//	  매번 1 ~ 100 사이의 랜덤값
//		
//		int i; // 인덱스의 값
//		
//		for (i = 0; i < iArr.length; i++) {
//			iArr[i] = (int)(Math.random() * 100 + 1);
//		}
//		
//		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값을 전부 출력
//		// arr[x] : xx
//		
//		for (i = 0; i < iArr.length; i++) { // 이 사이에 iArr[i]의 정의가 다시 들어가지 않아도 되는 이유는
//			//iArr의 초기식이 for문 바깥에 있고 iArr[i]의 값이 직전에 정해졌기 때문에
//			System.out.println("arr[" + i + "] : " + iArr[i]);
//		}
		
		
		
		
		
// ============================================================================
		
		// 1. 사용자에게 배열의 길이를 입력 받은 후
		// 	  해당 크기의 문자열 배열을 생성
		
//		int leng;
//		
//		System.out.print("배열의 길이 입력 : ");
//		leng = sc.nextInt();
//		
//		String[] iArr = new String[leng];
//		
//		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력 받아 그 값을 매 인덱스 자리에 대입(0~마지막 인덱스)
//		
//		String fruit;
//		int i; // 인덱스 값
//		
//		for (i = 0; i < iArr.length; i++) {
//			System.out.print("과일명을 입력하세요. : ");
//			iArr[i] = sc.next();
//		}
//		
//		// 3. 반복문을 이용해서 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		
//		for (i = 0; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
		
		
		
		
// ============================================================================
		
		// 사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨닮기
		
		
		
		
		
		
		
		
		
//		
//		
//		String word;
//		
//		System.out.print("문자열을 입력하세요. : ");
//		word = sc.next();
//		
//		char[] cArr = new char[word.length()];
//		// String은 문자열이니까 길이가 값에서 정해지지만 배열은 길이가 배열의 크기에서 정해지니까 String에서 length 쓰려면 괄호가 들어가지
//		
//		for (int i = 0; i < cArr.length; i++) {
//			cArr[i] = word.charAt(i);
//			System.out.println(i + "번째 : " + cArr[i]);
//		}
		
		
				
		// 1. 사용자에게 문자열 한 개 입력 받기
		
		// 2. char 배열 생성해두기 (배열의 길이 == 문자열의 길이)
		
		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열에 각 인덱스에 대입
		
		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
		
		
		
		
		
// ============================================================================
//		
//		int leng;
//		
//		System.out.println("배열의 길이 입력하세요. : ");
//		leng = sc.nextInt();
		
		
		
		// 1. 사용자에게 배열의 길이를 입력 받은 후 해당 크기 만큼의 정수 배열 생성
		
		// 2. 반복문 활용해서 0 ~ 마지막 인덱스까지 매번 1 ~ 100 사이의 랜덤값 발생 시켜 대입
		
		// 3. 반복문을 활용해서 배열에 담긴 모든 값을 출력함과 동시에
//		//	  짝수인 값들의 총 합을 구해라
		
		// 4. 위에서 구한 짝수값의 총합을 출력
		
		
		
		
		
		
		
// ===================================================================
		
//		// 1. for 문을 활용한 복사
//	 	//  새로운 배열을 만들어서 반복문을 통해 원본 배열의 값들을 새로운 배열에 대입하는 방식
//		
//		int[] origin = {1, 2, 3, 4, 5};
//		
//		int[] copy = new int[5];
//		
//		for (int i = 0; i < origin.length; i++) {
////			origin[i] = copy[i]; // 오리진의 값을 카피에 넣는 게 아니라 카피값을 오리진에 넣는 거니까 죄다 초기화값인 0만 나오게 됨
//			copy[i] = origin[i];
//			System.out.print(copy[i] + " ");
//		}
		
		// 2. 새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
//		
//		int[] origin = {1, 2, 3, 4, 5};
//		int[] copy = new int[5];
//		
//		System.arraycopy(origin, 1, copy, 3, 2);
//		for (int i = 0; i < origin.length; i++) {
//			System.out.println(copy[i]);
//		}
		
		//3. Arrays 클래스에서 제공하는 copyOf() 메소드 이용
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		
		copy = Arrays.copyOf(origin, 4);
		for (int i = 0; i < origin.length; i++) {
			System.out.println(copy[i]);
	}
	
	
	

}
