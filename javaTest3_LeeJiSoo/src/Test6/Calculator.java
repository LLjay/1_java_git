package Test6;

public class Calculator {
	
//	public double getSum(int data) {
//		
//		double sum = 0;
//	
//		try {
//			if (data >= 2 && data <= 5) {
//				for (int i = 1; i <= data; i++) {
//					sum += i;
//				}
//			} 
//		} catch (InvalidException message) {
//			return;
//		}
//		return sum;
//	}
	
	public double getSum(int data) throws InvalidException {
		
		if (data < 2 || data > 5) {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		double sum = 0;
		
		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		return sum;
	}

}
