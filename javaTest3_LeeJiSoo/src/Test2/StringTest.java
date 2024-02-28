package Test2;

public class StringTest {

	public static void main(String[] args) {
		
		// 스트링 값을 직접 세서 배열 길이를 지정해주지 않고 알아서 세주는 로직?
//		
//		String str = "1.22,4.12,5.93,8.71,9.34";
//		
//		double[] data = new double[5];
//		double sum = 0;
//		
//		String[] arr = new String[str.split(",").length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = str.split(",")[i];
//		}
//		
//		Double[] d = {
//				new Double(arr[0]),
//				new Double(arr[1]),
//				new Double(arr[2]),
//				new Double(arr[3]),
//				new Double(arr[4])
//		};
//		
//		for (int i = 0; i < data.length; i++) {
//			data[i] = d[i].doubleValue();
//		}
//	
//		for (int i = 0; i < data.length; i++) {
//			sum += data[i];
//		}
//		
//		double evarage = sum / data.length;
//		
//		System.out.printf("합계 : %.3f\n", sum);
//		System.out.printf("평균 : %.3f\n", evarage);
		
		
		// split으로 하면 안 되는 것들이 있다?
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		double[] data = new double[5];
		double sum = 0;
		
		String[] st;
		st = str.split(",");
		
		int index = 0;
		for (String s : st) {
			data[index] = Double.parseDouble(str);
			sum += data[index++];
		}
		// 실무에서는 고정된 데이터라는 게 없기 때문에 인덱스 값을 따로 주는 게 훨씬 낫다?
		
		System.out.printf("합계 : %3f\n", sum);
		System.out.printf("평균 : %3f\n", sum / index);
		
		// for~each / parse / split 공부
		
		
		
//		for (int i = 0; i < str.split(",").length; i++) {
//			d[i] = new Double(arr[i]);
//		}
//		for (int i = 0; i < str.split(",").length; i++) {
//		Double d[i] = new Double(str.split(",")[i]);
//	}
		
		
		// 구분자 기준 문자열 분리, 스트링 래퍼 클래스로 숫자로 변환
	}

}
