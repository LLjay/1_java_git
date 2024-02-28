package Example;

import java.util.StringTokenizer;

public class Test2 {
	public static void main(String[] args) {
		
//		String str = "1.22,4.12,5.93,8.71,9.34";
//		
//		double[] data = new double[5];
//		double sum = 0;
//		
//		String[] st = str.split(",");
//		
//		for (String srr : st) {
//			sum += Double.parseDouble(srr);
//		}
//		
//		System.out.printf("합계 : %.3f\n", sum);
//		System.out.printf("평균 : %.3f", sum / st.length);
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		StringTokenizer stk = new StringTokenizer(str, ",");
		double sum = 0;
		
		int count = stk.countTokens();

//		for (int i = 0; stk.hasMoreTokens(); i++) {
//			sum += Double.parseDouble(stk.nextToken());
//		}
		
		for (int i = 0; i < count; i++) {
			sum += Double.parseDouble(stk.nextToken());
		}
		
		System.out.printf("합계 : %.3f\n", sum);
		System.out.printf("평균 : %.3f", sum / count);
		
	}

}
