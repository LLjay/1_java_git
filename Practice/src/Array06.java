import java.util.Scanner;

public class Array06 {
	public static void main(String[] args) {
		
		// 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
		// 다시 정수를 받도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		
		// 내 예시
//		int num;
//		
//		while(true) {
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//			if (num % 2 == 0 || num < 3) {
//				System.out.println("다시 입력하세요.");
//			} else {
//				break;
//			}
//		}
//		
//		int[] iArr = new int[(num + num - 1)];
//		int minus = -1;
//		
//		for (int i = 0; i < iArr.length; i++) {
//			if (i < num) {
//				iArr[i] = i + 1;
//				System.out.print(iArr[i] + " ");
//			} else {
//				iArr[i] = i + minus;
//				System.out.print(iArr[i] + " ");
//				minus -= 2;
//			}
//		}

		// 문제를 잘못 이해했어...
		
		
		
		// 강사님 예시
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		while(num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요. : ");
			System.out.println("정수 : ");
			num = sc.nextInt();
		}
		int[] arr = new int[num];
		int mid = num / 2;
		int count = 0;
		
//		arr[0] = 1;
//		for (int i = 1; i <= mid; i++) {
//			arr[i] = arr[i - 1] + 1;
//		}
//		for (int i = mid + 1; i < arr.length; i++) {
//			arr[i] = arr[i - 1] - 1;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		for (int i = 0; i < arr.length; i++) {
			if (i <= mid) {
				arr[i] = ++count;
			} else {
				arr[i] = --count;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
