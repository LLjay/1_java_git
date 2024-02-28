package Test2;

import java.util.StringTokenizer;

public class Run {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34"; 
		
		// StringTokenizer
//		StringTokenizer sk = new StringTokenizer(str, ",");
//		
//		double sum = 0;
//		int count = 0;
//		while(sk.hasMoreTokens()) {
//			sum += Double.parseDouble(sk.nextToken());
//			count++;
//		}
//		
//		System.out.printf("합계 : %.3f\n", sum);
//		System.out.printf("평균 : %.3f", sum / count);

		
		// split()
		String[] sp = str.split(",");
		
		double sum = 0;
		int count = 0;
		
		for (String s : sp) {
			sum += Double.parseDouble(s);
			count++;
		}
		System.out.printf("합계 : %.3f\n", sum);
		System.out.printf("평균 : %.3f", sum / count);
	}

}
