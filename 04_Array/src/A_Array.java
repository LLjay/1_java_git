import java.util.Scanner;
import java.lang.Math;

public class A_Array {
	public static void main(String[] args) { // String[] args => 배열이구나! args라는 이름의 String 객체 배열

		/*
		 * 변수 : 하나의 공간에 하나의 값을 담을 수 있다.
		 * 배열 : 하나의 공간에 여러 개의 값을 담을 수 있는 개념
		 * 		 "같은 자료형의 값"으로만 담을 수 있다.
		 * 		 => 배열의 각 인덱스 자리에 실제 값이 담긴다.(index는 0부터 시작한다.)
		 */
	
		// 배열을 왜 사용할까?
		// 변수만을 사용하게 된다면 -> 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리해야 한다.
		
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 2;
//		int num4 = 3;
//		int num5 = 4;
//		
////		int[] arr1 = new int[5];
//		int[] arr1 = {0, 1, 2, 3, 4};
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		
//		int sum = num1 + num2 + num3 + num4 + num5;
		
		//개수가 많아지면 힘듦
		
		/*
		 * 1. 배열 선언 (여러 개의 값들을 보관할 배열을 만들겠다.)
		 * 		자료형 배열명[];
		 * 		자료형[] 배열명; => 보통 이 방법을 선호
		 */
		
		int[] arr; // => 참조변수 arr만 만들어짐, 공간은 비어있는 상태
		
		/*
		 * 2. 배열 할당 (이 배열에 몇 개의 값들을 보관 할 건지 크기 지정하는 과정, 그 개수만큼의 방이 만들어짐)
		 * 		배열명 = new 자료형[배열의 크기(=길이)];
		 */
		
		arr = new int[5];
		
		// 배열 선언과 동시에 할당(생성과 동시에 크기 지정)
		
		int[] tmp = new int[5];
		
		/*
		 * 3. 값 대입
		 * 		배열명[인덱스] = 값;
		 */

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		for (int i = 0; i < 5; i++) {
			arr[i] = 1;
			// 배열의 장점 : 반복문 활용 가능
			
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i]);
			} // 위에 정해준 arr의 실제값을 arr[i]로 출력
			System.out.println(arr[i]); // 실제 arr이라는 박스에는 "주소값"이라는 게 담겨있음 -> 이상한 문구가 출력됨
			// => [I@2a139a55 [박스, I 자료형, @ 구분, 16진수 값
//		}
		
		// 내 예시
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			arr[i] += arr[i];
//			System.out.print(arr[i] + " ");
//		}
		
		
	}
}
