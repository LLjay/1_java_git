import java.util.Scanner;

	public class Controll02 {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 합격인지 불합격인지 나타내는 프로그램을 작성하세요.
		// 합격 조건 : 세 과목 점수가 각각 40점 이상 그리고 평균이 60점 이상일 경우
		// 
		
		/*
		 * ex)
		 * 국어 : 90.0
		 * 수학 : 90.0
		 * 영어 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		
		int totalScore, korean, math, eng;
		double score;
		
		System.out.print("국어 점수를 입력하세요. : ");
		korean = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		
		totalScore = korean + math + eng;
		score = totalScore / 3;
		
		//내 예시
//		if (korean >= 40 && (math >= 40 && eng >= 40)) {
//			if (score >= 60) {
//				System.out.println("국어점수 : " + korean);
//				System.out.println("수학점수 : " + math);
//				System.out.println("영어점수 : " + eng);
//				System.out.println("합계 : " + totalScore);
//				System.out.println("평균 : " + score);
//				System.out.println("축하합니다. 합격입니다!");
//			} else {
//				System.out.println("불합격입니다.");
//			}
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
		//강사님 예시
		if (korean >= 40 && math >= 40 && eng >= 40 && score >= 60) {
				System.out.println("국어점수 : " + korean);
				System.out.println("수학점수 : " + math);
				System.out.println("영어점수 : " + eng);
				System.out.println("합계 : " + totalScore);
				System.out.println("평균 : " + score);
				System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}