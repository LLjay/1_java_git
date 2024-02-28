import java.util.Scanner;

public class Test240118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 실수 num1과 num2를 사용자로부터 입력 받아 +  % / 3가지의 결과를 출력해라.
		
		double num1, num2;
		
//		System.out.print("첫 번째 실수를 입력하세요. : ");
//		num1 = sc.nextDouble();
//		
//		System.out.print("두 번째 실수를 입력하세요. : ");
//		num2 = sc.nextDouble();
//		
//		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
//		System.out.printf("%.2f %% %.2f = %.2f\n", num1, num2, (num1 % num2));
//		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
		
		
//======================================================================
		// 정수형 변수 num3을 사용자로부터 입력 받아 100보다 작으면 100 이하
		// 100보다 크고 200보다 작으면 200 이하
		// 200보다 크고 300보다 작으면 300 이하를 출력하고
		// 그것도 아니면 300초과를 출력해라
		
//		System.out.print("정수를 입력하세요. : ");
//		int num3 = sc.nextInt();
//		
//		if (num3 <= 100) {
//			System.out.println("100 이하입니다.");
//		} else if(num3 <= 200) {
//			System.out.println("100 초과 200 이하입니다.");
//		} else if(num3 <= 300) {
//			System.out.println("200 초과 300 이하입니다.");
//		} else {
//			System.out.println("300 초과입니다.");
//		}
		
		
		
		
		
//======================================================================		
		// 수학, 영어, 국어 성적을 입력 받아 평균이 60 이상이면 합격입니다.
		// 60보다 작으면 불합격입니다. 출력
		
//		int math, eng, korean, evar;
//		
//		System.out.print("수학 성적을 입력하세요. : ");
//		math = sc.nextInt();
//		
//		System.out.print("영어 성적을 입력하세요. : ");
//		eng = sc.nextInt();
//		
//		System.out.print("국어 성적을 입력하세요. : ");
//		korean = sc.nextInt();
//		
//		evar = (math + eng + korean) / 3;
//		// 세 개 합이 180보다 크다고 해도 평균은 60 이상일 것이므로 괜찮은 조건
//		if (evar >= 60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
//		int math, eng, korean, evar;
//		System.out.print("수학 영어 국어 성적을 입력하세요. : ");
//		math = sc.nextInt();
//		eng = sc.nextInt();
//		korean = sc.nextInt();
		// 정수라 띄어쓰기 포함 안 되고 들어감
		
		
		
		
//======================================================================		
		// 국어 성적을 입력 받아 50점 이하는 f학점 50점 초과 60점 이하는 d학점
		// 60점 초과 70점 이하는 c학점
		// 70점 초과 80점 이하는 b학점
		// 80점 초과는 a학점 출력하는 프로그램을 작성해라
		
//		System.out.print("국어 성적을 입력하세요. : ");
//		int korean = sc.nextInt();
//		
//		if (korean <= 50) {
//			System.out.println("F학점입니다.");
//		} else if (korean <= 60) {
//			System.out.println("D학점입니다.");
//		} else if (korean <= 70) {
//			System.out.println("C학점입니다.");
//		} else if (korean <= 80) {
//			System.out.println("B학점입니다.");
//		} else {
//			System.out.println("A학점입니다.");
//		}
		
		
		
//======================================================================
		// 크기가 9인 1차원 배열 arr1을 작성하고 구구단 2단을 각 인덱스에 대입 출력해라
		// ex) arr1[0] = "2 * 1 = 2";
		
//		int[] arr1 = new int[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = (2 * (i+1));
//			System.out.println("arr1[" + i + "] = " + "2 * " + (i + 1) + " = " + arr1[i]);
//		}
		
//		int times;
//		
//		for (times = 1; times <= 9; times++) {
//			System.out.println("2 * " + times + " = " + 2 * times);
//		}
		
		// 강사님 예시
		
//		String[] arr1 = new String[9];
//		for (int i = 0; i < arr1.length; i++) { // 0 1 2 3 4 5 6 7 8
//			int su = i + 1;
////			arr1[i] = "2 * " + (i + 1) + " = " + (2 *)//문자열이라 괄호 없으면 01 11 식으로 출력
//			arr1[i] = "2 * " + su + " = " + (2 * su);
//		}
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}


//======================================================================
		// 크기가 9인 1차원 배열 arr2을 작성하고 구구단 3단을 각 인덱스에 대입 출력해라
		// ex) arr1[0] = "3 * 1 = 3";
		
//		int[] arr2 = new int[9];
//		
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = (3 * (i+1));
//			System.out.println("arr2[" + i + "] = " + "3 * " + (i + 1) + " = " + arr2[i]);
//		}
//		
//======================================================================
		// 크기가 [8][9]인 2차원 배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입 출력해라
		// ex) arr1[0][0] = "2 * 1 = 2";
		
		// 내 예시
//		int[][] arr3 = new int[8][9];
//		
//		for (int i = 0; i < arr3.length; i++) {
//			for (int j = 0; j < arr3[i].length; j++) {
//				arr3[i][j] = (i+2) * (j+1);
//				System.out.printf("arr3[%d][%d] = %d * %d = %d\n", i, j, (i+2), (j+1), (i+2)*(j+1));
//			}
//			System.out.println();
//		}
//		
		
		// 강사님 예시
		
		String[][] arr3 = new String[8][9];
		
		for (int j = 0; j < arr3. length; j++) { // 0 1 2 3 4 5 6 7
			for (int i = 0; i < arr3[j].length; i++) { // 0 1 2 3 4 5 6 7 8
				int dan = j + 2;
				int su = i + 1;
				arr3[j][i] = dan + " * " + su + " = " + (dan * su);
			}
		}
		
		for (int i = 0; i < arr3.length; i++) { // 0 1 2 3 4 5 6 7 8
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		
		// 구구단의 한 단을 배열에 저장하는 반복문
//		for (int i = 0; i < arr3.length; i++) { // 0 1 2 3 4 5 6 7 8
//			for (int j = 0; j < arr3[i].length; j++) {
//				System.out.println(arr3[i][j]);
//			}
//		}
		
		
		
	}
}
