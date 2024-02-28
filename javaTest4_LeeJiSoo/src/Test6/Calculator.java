package Test6;

public class Calculator {

	public double getSum (int data) throws InvalidException {
		int sum = 0;
//		if (data >= 2 && data <= 5) {
//			for (int i = 1; i <= data; i++) {
//				sum += i;
//			}
//		} else {
//			throw new InvalidException("입력 값에 오류가 있습니다.");
//		}
		
		if(data < 2 || data > 5) {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		
		return sum;
	}
}
