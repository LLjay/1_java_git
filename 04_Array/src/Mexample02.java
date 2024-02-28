import java.util.Scanner;

public class Mexample02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 임의의 숫자 하나(1~5)를 생성하고 이를 맞히는 프로그램 작성
		// 몇 번만에 맞혔는지 출력하세요.
		// ex) 
		// 컴퓨터가 생각하는 수는 : 4(사용자 입력)
		// 컴퓨터가 생각하는 수는 : 2(사용자 입력)
		// 정답입니다. 2번 만에 맞히셨습니다.
		
//		int random = (int)(Math.random() * 5 + 1);
//		int sum = 0;
//		int num;
//		
//		do {
//		System.out.print("컴퓨터가 생각하는 수는 : ");
//		num = sc.nextInt();
//		sum++;
//		} while (num != random);
//		
//		System.out.println("정답입니다. " + sum + "번만에 맞히셨습니다.");
		
		// 와~~

//=======================================================================================
		// 로또 추첨 번호를 예상하는 프로그램 작성
		// 임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호를 구합니다.
		// 중복된 숫자는 있으면 안 된다.
		
//		int[] num = new int[6];
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random() * 45 + 1);
//			for (int j = 0; j < i; j++) {
//				if (num[i] == num[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//=======================================================================================
		// 사용자에게 입력 받은 양의 정수만큼 배열의 크기를 할당하고
				// 1부터 입력 받은 값까지 배열에 초기화 한 후 출력하세요.
		
//		int num;
//		
//		System.out.print("양의 정수를 입력하세요. : ");
//		num = sc.nextInt();	
//		
//		while(num < 1) {
//			System.out.print("양의 정수가 아닙니다. 다시 입력하세요. : ");
//			num = sc.nextInt();	
//		}
//		
//		int[] iArr = new int[num];
//		
//		for (int i = 0; i < iArr.length; i++) {
//			iArr[i] = i + 1;
//			System.out.print(iArr[i] + " ");
//		}
		

//=======================================================================================
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
//		System.out.print("문자열을 입력하세요. : ");
//		String word = sc.next();
//		
//		int i;
//		int sum = 0;
//		
//		char[] cArr = new char[word.length()];
//		
//		for(i = 0; i < cArr.length; i++) { 
//			cArr[i] = word.charAt(i);
//		}// cArr.length = 5, i는 5보다 작아야해, cArr[i]는 4까지밖에 없는데 i가 한번더 증가해서 5에서 끝났으니 if문 cArr[i]에 5만 대입돼서 값이 초과해 없다고 뜨는 것
//		
//		System.out.println("문자를 검색하세요. : ");
//		char search = sc.next().charAt(0);
//		
//		if (search == cArr[i]) {
//			sum++;
//			System.out.print(i + " ");
//		}
//		System.out.println(search + "의 개수 : " + sum);
		
		
		
		
		
		
		
		
//		System.out.print("문자열을 입력하세요. : ");
//		String word = sc.next();
//		
//		int i;
//		int sum = 0;
//		
//		char[] cArr = new char[word.length()];
//		
//		for(i = 0; i < cArr.length; i++) { 
//			cArr[i] = word.charAt(i);
//		}
//		
//		System.out.println("문자를 검색하세요. : ");
//		char search = sc.next().charAt(0);
//		
//		System.out.print("인덱스 번호 : ");
//		
//		for (i = 0; i < cArr.length; i++) { 
//			if (search == cArr[i]) {
//				sum++;
//				System.out.print(i + " ");
//			}
//		}
//		
//		System.out.println("\n" + search + "의 개수 : " + sum);

//=======================================================================================
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0~6까지의 숫자를 입력 받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
		 * 0~6사이의 숫자를 입력하세요를 출력하고 다시 입력을 받습니다.
		 */
		
//		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
//		
//		System.out.print("0~6까지의 숫자를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		while (num > 6 || num < 0) {
//			System.out.println("올바른 숫자가 아닙니다. 다시 입력하세요. : ");
//			num = sc.nextInt();
//		}
//		
//		System.out.println(week[num] + "요일입니다.");
		
//=======================================================================================
		
		// 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
		// 다시 정수를 받도록 하세요.
		
//		System.out.print("3 이상인 홀수의 자연수를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		while (num % 2 != 1 || num < 3) {
//			System.out.print("다시 입력하세요. : ");
//			num = sc.nextInt();
//		}
//		
//		int[] iArr = new int[num];
//		int i;
//		
//		for (i = 0; i < iArr.length; i++) {
//			if (i <= num / 2) {
//				iArr[i] = i + 1;
//			} else {
//				iArr[i] = iArr[i - 1] - 1;
//			}
//			System.out.print(iArr[i] + " ");
//		}

//=======================================================================================
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 "ooo 치킨 배달 가능", 없으면 "ooo 치킨은 없는 메뉴입니다."를 출력하세요.
		// 단, 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요.
		
//		String[] menu = {"푸라닭", "네네", "굽네", "자담", "치킨매니아"};
//		
//		System.out.print("치킨을 검색하세요. : ");
//		String chicken = sc.next();
//		boolean isTrue;
//		
//		for (int i = 0; i < menu.length; i++) {
//			if (chicken.equals(menu[i])) {
//				isTrue = true;
//				break;
//			} else {
//				isTrue = false;
//			}
//		}
//		
//		if (isTrue == true) {
//			System.out.print(chicken + " 치킨 배달 가능");
//		} else {
//			System.out.println(chicken + " 치킨은 없는 메뉴입니다.");
//		}
		

		
//	String[] menu = {"푸라닭", "네네", "굽네", "자담", "치킨매니아"};
//		
//		System.out.print("치킨을 검색하세요. : ");
//		String chicken = sc.next();
//		int num = 1;
//		
//		for (int i = 0; i < menu.length; i++) {
//			if (chicken.equals(menu[i])) {
//				num = 0;
//				break;
//			} 
//		}
//		
//		if (num == 0) {
//			System.out.print(chicken + " 치킨 배달 가능");
//		} else {
//			System.out.println(chicken + " 치킨은 없는 메뉴입니다.");
//		}
		

		
//=======================================================================================
		// 크기가 [8][9]인 2차원 배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입 출력해라
		// ex) arr1[0][0] = "2 * 1 = 2";
		
		String[][] arr3 = new String[8][9];
		
		int i, j, dan, time;
		
		for (i = 0; i < arr3.length; i++) {
			for (j = 0; j < arr3[i].length; j++) {
				dan = i + 2;
				time = j + 1;
				arr3[i][j] = dan + " * " + time + " = " + dan*time;
			}
		}
		
		for (i = 0; i < arr3.length; i++) {
			for (j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
			System.out.println();
		}
		
		
		
		//=======================================================================================
		
	}

}
