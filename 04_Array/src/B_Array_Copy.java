import java.util.Arrays;

public class B_Array_Copy {
	
	// 배열 복사
	public static void main(String[] args) {
		
//		int[] origin = {1, 2, 3, 4, 5};
//		
//		System.out.println("===원본 배열 출력===");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		
//		System.out.println();
//		
//		// 단순하게 origin을 다시 대입시킨 copy 배열 세팅
//		
//		int[] copy = origin;
//		System.out.println("===복사본 배열 출력===");
//		for (int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
//		
//		System.out.println();
//		
//		copy[2] = 99; // 카피2번 인덱스의 값이 99로 덮어씌워짐
//		
//		System.out.println("---------------복사본 배열 값 변경 후--------------");
//		
//		System.out.println("===원본 배열 출력===");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		
//		System.out.println();
//		
//		System.out.println("===복사본 배열 출력===");
//		for (int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//			
//		}
//		System.out.println();
//		// copy 값만을 수정해도 원본값이 변경됨
//		// origin과 copy가 같은 곳을 참조하고 있기 때문 (즉, 메모리 주소값이 같다)
//		// 얕은 복사 : 주소값을 복사
		
// =================================================================
		
		/* 
		 * 얕은 복사의 문제점을 해결하기 위한 방법 : 깊은 복사
		 * 
		 */
		
		// 1. for문을 활용한 방법
		// 	  새로운 배열을 만들어서 반복문을 통해 원본 배열의 값들을 새로운 배열에 대입하는 방식
		
//		int[] origin = {1, 2, 3, 4, 5};
//		
////		int[] copy = origin;
//		int[] copy = new int[5];
//		for (int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//		copy[2] = 99; // 카피2번 인덱스의 값이 99로 덮어씌워짐
//		// => 원본의 값은 그대로 있고 카피값만 바뀜
//		
//		System.out.println("---------------복사본 배열 값 변경 후--------------");
//		
//		System.out.println("===원본 배열 출력===");
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i] + " ");
//		}
//		
//		System.out.println();
//		
//		System.out.println("===복사본 배열 출력===");
//		for (int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//			
//		}
//		System.out.println();
		
		// 2. 새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
//		int[] origin = {1, 2, 3, 4, 5};
//		int[] copy = new int[10]; // 0~9번 인덱스 모든 값은 0으로 초기화 되어있음
//		// 객체를 새로 생성한 순간 이미 주소값이 달라짐
//		
//		// System.arraycopy(원본배열, 복사 시작할 인덱스값, 복사본배열, 복사본 배열의 복사 시작 인덱스, 복사할 개수)
//		
//		System.arraycopy(origin, 0, copy, 0, 5);
//		for(int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
//		
//		// 메소드 : 남이 만들어준 기능 ex) System.out.println, Scanner, random 등
//		
//		System.out.println();
//		System.out.println(origin.hashCode());
//		System.out.println(copy.hashCode());
//		// 주소값이 다름(깊은 복사)
//		// => 각자 다른 배열을 참조하고 있음
//		// => 즉, 배열 수정 시 서로에게 영향을 주지 않음
		
		//3. Arrays 클래스에서 제공하는 copyOf() 메소드 이용
		
//		int[] origin = {1, 2, 3, 4, 5};
//		
//		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할 길이);
//		int[] copy = Arrays.copyOf(origin, 6);
//		// => 따로 import 안 해도 사용할 수 있도록 만들어놓은 기능도 있음
//		// import java.util.Arrays; => 컨트롤쉬프트오
//		
//		// origin[3] = 65; // => copy가 아예 새로운 배열에 값을 복사했다는 걸 알 수 있다
//		for(int i = 0; i < copy.length; i++) {
//			System.out.print(copy[i] + " ");
//		}
		
		/*
		 * Arrays.copyOf 메소드
		 * => 내가 제시한 길이만큼 복사본 배열 크기 할당
		 * => 단, 내가 제시한 길이가 원본 배열의 크기보다 클 경우 기존의 배열에 있는 값 다 복사, 나머지는 0으로 채움
		 */
		
		// 4. clone() 메소드 활용한 복사
		// 인덱스 지정 불가, 크기 지정 불가
		// 무조건 똑같이 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println(origin);
		System.out.println(copy);
	}
}
