import java.util.Scanner;
import java.lang.Math;

public class Test240117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 정수형 변수 num1과 num2를 입력 받아 큰 값에서 작은 값을 뺀 결과를 출력하세요.
		
		// 내 예시
//		int num1, num2;
//		
//		System.out.print("첫 번째 정수 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수 : ");
//		num2 = sc.nextInt();
//		
//		if (num1 > num2) {
//			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
//		} else {
//			System.out.printf("%d - %d = %d\n", num2, num1, (num2 - num1));
//		}
		
		// 강사님 예시
		// 와 똑같다~~
		
// ================================================================================================
		
		// 85에서 10까지 수를 1씩 줄여가며 모든 사이에 숫자를 출력하세요.
		
		// 내 예시
//		for (int i = 85; i >= 10; i--) {
//			System.out.print(i + " ");
//		}
		// 와 똑같다~~
		
// ================================================================================================		
		// 임의의 숫자 하나(1~5)를 생성하고 이를 맞히는 프로그램 작성
		// 몇 번만에 맞혔는지 출력하세요.
		// ex) 
		// 컴퓨터가 생각하는 수는 : 4(사용자 입력)
		// 컴퓨터가 생각하는 수는 : 2(사용자 입력)
		// 정답입니다. 2번 만에 맞히셨습니다.
		
		// 내 예시
//		int num, random;
//		int i = 0;
//		
//		random = (int)(Math.random() * 5 + 1);
//		
//		while(true) {
//			i++;
//			
//			System.out.print("컴퓨터가 생각하는 수는 : ");
//			num = sc.nextInt();
//			
//			if (num == random) {
//				System.out.println("정답입니다. " + i + "번만에 맞히셨습니다.");
//				break;
//			} else {
//				continue;
//			}
//		}
		
		// 강사님 예시
		
//		int target = (int)(Math.random() * 5 + 1); // 1~5 사이의 난수 발생
//		int num, count = 0; // 몇 번 질문 했는지를 저장하는 변수
//		
//		do {
//			System.out.println("컴퓨터가 생각하는 수는 : ");
//			num = sc.nextInt(); // 사용자 입력값 받기
//			
//			count++; // 질문 횟수 1 증가
//		} while(target != num); // 사용자가 입력한 값과 컴퓨터가 만들어낸 난수가 다르면 계속 반복
//		
//		System.out.printf("정답입니다. %d번만에 맞히셨습니다.", count);

			// while, for문은 조건을 만족하지 않으면 빠져나간다.
		
// ================================================================================================
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 대입하고 그 값을 출력하세요.
		
		// 내 예시
//		int num = 1;
//		int[] arr = new int[10];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = num;
//			System.out.println(i + "번째 : " + num);
//			num++;
//		}
		
		// 강사님 예시
//		int[] arr = new int[10]; // 배열 생성
//		// 필요한 값 : 1 ~ 10
//		// 배열 index : 0(+1) ~ 9(+1)
//		
//		// 대입을 위한 반복
//		for (int i = 0; i < arr.length; i++) { // i => 0~9
//			arr[i] = i + 1;
//		}
//		// 출력을 위한 반복
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
// ================================================================================================
		// 로또 추첨 번호를 예상하는 프로그램 작성
		// 임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호를 구합니다.
		// 중복된 숫자는 있으면 안 된다.

		// 내 예시
//		
//		int[] chum = new int[6];
//		
//		while(true)
//			for (int i = 0; i < chum.length; i++) {
//				chum[i] = (int)(Math.random() * 45 + 1);
//				if (chum[i] == chum[(i-1)]) {
//					break;
//				}
//			if (i == chum.length) {
//				break;
//			}
//			
//		}
		
		// 강사님 예시
//		int[] arr = new int[6];
//		
//		for (int i = 0; i < arr.length; i++) { // 0~5
//			arr[i] = (int)(Math.random() * 45 + 1); // 1~45 사이의 랜덤값을 배열에 저장
//		
//			// 중복검사
//			if (i > 0) {
//				for(int j = 0; j < i; j++) { // 배열을 전부 한 바퀴 확인
//					if (arr[i] == arr [j]) {
//						i--; // 중복이 존재하므로 i값을 1 줄여서 다시 arr[i]의 값을 넣어준다.
//						break;
//					}	
//				}
//			}
//		}
//		
//		System.out.printf("%d %d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
//		
		
		
		// 기본 구문은 먼저 만들어놓고 예외 추가는 나중에 하나씩 하는 것
		
		int[] iArr = new int[6];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 45 + 1); // 랜덤값을 대입해야 비교할 수 있음
			
			if (i > 0) { //
				for (int j = 0; j < i; j++) {
					if (iArr[i] == iArr[j]) {
						i--;
						break;
					}
				}			
			}
		}
	}
}
