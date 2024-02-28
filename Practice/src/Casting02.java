import java.util.Scanner;

public class Casting02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요.
		
		/*
		 * ex)
		 * 국어 : 90.0
		 * 수학 : 90.0
		 * 영어 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		
		double korean, math, eng;
		int totalScore, score;
		
		System.out.print("국어 점수를 입력하세요. : ");
		korean = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요. : ");
		eng = sc.nextDouble();
		
		totalScore = (int)(korean + math + eng);
		score = (int)(totalScore / 3);
				
		System.out.println("총점은 " + totalScore + "점, 평균은 " + score + "점 입니다.");
		System.out.printf("총점은 %d점, 평균은 %d점 입니다.", totalScore, score);
		
	}
}
