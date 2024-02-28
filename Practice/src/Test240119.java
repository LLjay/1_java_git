import java.util.Scanner;

public class Test240119 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수형 변수 age를 입력 받아 7세 이하면 어린이, 19세 이하면 청소년, 20세 이상이면 성인을 출력하세요.
		
//		System.out.print("나이를 입력하세요. : ");
//		int age = sc.nextInt();
//		
//		if (age <= 7) {
//			System.out.println("어린이입니다.");
//		} else if (age <= 19) {
//			System.out.println("청소년입니다.");
//		} else {
//			System.out.println("성인입니다.");
//		}
		
		
		// 정수 num1과 num2를 입력 받아 두 수 사이에 있는 3의 배수의 모든 합을 구하세요.
//		int num1, num2, min, max, sum = 0;
//		System.out.print("정수 두 개 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		min = num1 < num2 ? num1 : num2;
//		max = num1 > num2 ? num1 : num2;
//		
//		for (int i = min; i <= max; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
// ==============================================================================================
		
		// 정수 num1과 num2를 입력 받아 두 수 사이에 있는 모든 홀수의 합과 짝수의 합을 각각 구하세요.
		
		// 내 예시
//		System.out.print("첫 번째 정수를 입력하세요. : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수를 입력하세요. : ");
//		int num2 = sc.nextInt();
//		
//		int even = 0;
//		int odd = 0;
//		if (num1 > num2) {
//			for (int i = num2; i <= num1; i++) {
//				if (i % 2 == 0) {
//					even += i;
//				} else {
//					odd += i;
//				}
//			}
//		} else {
//			for (int i = num1; i <= num2; i++) {
//				if (i % 2 == 0) {
//					even += i;
//				} else {
//					odd += i;
//				}
//			}
//		}
//		
//		System.out.println("짝수 합 : " + even);
//		System.out.println("홀수 합 : " + odd);

		// 내 예시
		
//		System.out.print("첫 번째 정수를 입력하세요. : ");
////		int num1 = sc.nextInt();
////		
////		System.out.print("두 번째 정수를 입력하세요. : ");
////		int num2 = sc.nextInt();
////		
////		int even = 0;
////		int odd = 0;
//		
//		min = 
		
		
		
		
		
		// 강사님 예시
//		int num1, num2, sum1 = 0, sum2 = 0;
//		System.out.print("정수 두 개 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		for (int i = (num1 < num2 ? num1 : num2); i <= (num1 > num2 ? num1 : num2); i++) {
//			if (i % 2 == 1) {
//				sum1 += i;
//			} else {
//				sum2 += i;
//			}
//		}
//		System.out.println("홀수의 총합 : " + sum1);
//		System.out.println("짝수의 총합 : " + sum2);
		
// ====================================================================
				
		// 첫째줄에 데이터의 개수 n개를 입력 받고
		// 사용자로부터 n개의 정수를 입력 받아 입력 받은 반대로 출력하세요.
		// ex) 정수 입력 : 5
		// 숫자 입력 : 1 7 5 9 4
		// 반대로 출력 : 4 9 5 7 1

		// 내 예시
//		System.out.print("데이터의 개수를 입력하세요. : ");
//		int n = sc.nextInt();
//		
//		int[] num = new int[n];
//		
//		System.out.println("개수만큼의 정수를 입력하세요. : ");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
//		
//		for (int i = num.length; i > 0; i--) {
//			System.out.print(num[(i-1)] + " ");
//		}
		
		
		
		// 강사님 예시
//		System.out.print("데이터의 개수를 입력하세요. : ");
//		int n = sc.nextInt();
//		
//		int[] num = new int[n];
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(i + "번째 정수를 입력하세요. : ");
//			num[i] = sc.nextInt();
//		}
//		
//		for (int i = (num.length - 1); i >= 0; i--) {
//			System.out.print(num[(i)] + " ");
//		}
//		
		

// ====================================================================		
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		
		// 내 예시
//		System.out.print("행의 크기 : ");
//		int size1 = sc.nextInt();
//		int[] arr = new int[size1];
//		int i;
//		
//		for (i = 0; i < size1; i++) {
//			System.out.print(i + "행의 열의 크기 : ");
//			arr[i] = sc.nextInt();
//		}
//		
//		char[][] alph = new char[size1][arr[i]]; // i=5인 상태이므로 내가 입력한 값들과 범위가 전혀 달라 오류가 남
//		
//		for (int j = 0; j < alph.length; j++) {
//			for (int k = 0; k < alph[j].length; k++) {
//				if (j == 0 && k == 0) {
//					alph[j][k] = 'a';
//				} else if (j != 0 && k == 0) {
//					alph[j][k] = (char)(alph[j-1][alph[j].length - 1] + 1);
//				} else {
//					alph[j][k] = (char)(alph[j][k-1] + 1);
//				}
//			}
//		}
//		
//		for (int j = 0; j < alph.length; j++) {
//			for (int k = 0; k < alph[j].length; k++) {
//				System.out.print(alph[j][k] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		// 강사님 예시
//		int row, col;
//		System.out.print("행의 크기 : ");
//		row = sc.nextInt();
//		
//		char[][] arr = new char[row][];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "행의 열 크기 : ");
//			col = sc.nextInt();
//			
//			arr[i] = new char[col];
//		}
//		
//		char ch = 'a';
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = ch++;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		sc.close(); // 명시적으로 표기해주자. 괄호 끝나면 끝나긴 함
	}
}
