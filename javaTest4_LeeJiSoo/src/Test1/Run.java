package Test1;

public class Run {
	public static void main(String[] args) {
		int[][] array = {
				{12, 41, 36, 56, 21}, 
				{82, 10, 12, 61, 45}, 
				{14, 16, 18, 78, 65}, 
				{45, 26, 72, 23, 34}};

		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		System.out.printf("합계 : %.2f", sum);
		System.out.printf("평균 : %.2f", sum / (array.length * array[0].length));
	}

}
