import java.util.Scanner;

public class A_if02 { // A_if02 이름을 가진 클래스
	public static void main(String[] args) { // main 메소드 영역
		Scanner sc = new Scanner(System.in);
		
		/*
		   나이를 입력 받아
		   13세 이하 : 어린이
		 * 13세 초과 19세 이하 : 청소년
		 * 19세 초과 : 성인
		 * xx세는 xxx에 속합니다.
		 */
		
//		int age;
//		String type = " ";
//		
//		System.out.println("나이(정수만) : ");
//		age = sc.nextInt();
//		sc.nextLine();
//		
		//if만 사용하는 경우
		
//		if (age <= 13) {
//			type = "어린이";
//		}
//		if ((age > 13) && (age <= 19)) {
//			type = "청소년";
//		}
//		if (age > 19) {
//			type = "성인";
//		}
//		System.out.println(age + "세는 " + type + "에 속합니다.");
//		--------------------------------------------------------------
		
		// if else if 사용하는 경우
		
//		if (age <= 13) {
//			type = "어린이";
//		} else if ((age > 13) && (age <=19)) {
//			type = "청소년";
//		} else {
//			type = "성인";
//		} else if (age > 19) {
//		 	 type = "성인";
//		 //이렇게 써도 되긴 하지만 연산이 한 번 더 들어가게 되므로 그냥 else가 낫다	
//		}
//		
//		System.out.println(age + "세는 " + type + "에 속합니다.");
		
		//-------------------------------------------------------------
		// 의미가 연결되는 경우는 조건문 따로따로 말고 전부 이어주는 게 좋음
//		if (age <= 13) {
//			type = "어린이";
//		} else if (age <=19) {     // 이미 13까지가 걸러졌으므로 19까지만 적어도 상관없음
//			type = "청소년";
//		} else {
//			type = "성인";
//		} else if (age > 19) {
//		 	 type = "성인";
		
		// =============================================================
		
		// 성별을 (m/f)(대소문자 상관 없음)로 입력 받아 남학생인지 여학생인지
		// 출력하는 프로그램을 작성하세요.
		// 성별(m/f) : 
		// 여학생입니다 / 남학생입니다 / 잘못 입력하셨습니다
		
//		System.out.println("성별(m/f)");
//		char gender = sc.next().charAt(0);
//		sc.nextLine();
//		
//		if (gender == 'f' || 'F') {          // 왼쪽은 참거짓이 되지만 오른쪽은 그냥 문자 하나임!
//			System.out.println("여학생입니다.");
//		} else if (gender == 'm' || 'M') {
//			System.out.println("남학생입니다.");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//		if (gender == 'f' || gender == 'F') {
//			System.out.println("여학생입니다.");
//		} else if (gender == 'm' || gender == 'M') {
//			System.out.println("남학생입니다.");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//		String result;
//		String name = "이지수";
//		
//		if (gender == 'f' || gender == 'F') {
//			result = "여학생";
//		} else if (gender == 'm' || gender == 'M') {
//			result = "남학생";
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//			return; // 해당 메소드 자체를 빠져나가는 구문
//		}
//		
//		System.out.println(name + "님은 " + result + "입니다.");
//		// return을 발견했기 때문에 else를 진행하고 메인 메소드를 빠져나가
//		// 마지막 출력문은 실행하지 않음
//		============================================================
		
		// 정수(양수)를 입력 받아
		// 짝수인지 홀수인지 출력하는 프로그램 작성
		// 정수(양수) 입력 : ()
		// 짝수다 / 홀수다 / 양수가 아닙니다. 잘못 입력하셨습니다.
		
		int num;
		String res1;
		
		System.out.print("정수(양수) 입력 : ");
		num = sc.nextInt();
		sc.nextLine();

		// 내 예시
//		if (num % 2 == 0 && num > 0) { // num은 2로 나눈 나머지가 0이다 / num은 0보다 크다
//			res1 = "짝수";
//		} else if (num % 2 == 1 && num > 0) {
//			res1 = "홀수";
//		} else {
//			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
//			return;
//		}
//		
//		System.out.println(res1 + "다.");
		
		// 강사님 예시
		if (num > 0) { // 양수일 경우
			if (num % 2 == 0) { // 양수이면서 짝수일 경우
				System.out.println("짝수다.");
			} else { // 양수이면서 홀수일 경우
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
		}
		// 경우의 수가 많아질 때 초기에 걸러내지 않으면
		// 깔고 가야하는 전제를 계속 추가해야 됨 => 가독성이 떨어짐
		
		
		
		
		

	}

}
