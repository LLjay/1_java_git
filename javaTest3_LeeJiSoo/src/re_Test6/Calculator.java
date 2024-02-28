package re_Test6;

public class Calculator {
	public double getSum(int data) throws InvalidException {
		if (!(data >=2 && data <= 5)) {
			throw new InvalidException("오류 발생");
		}
		
		double sum = 0;
		
		for (int i = 0; i < data; i++) {
			sum += i;
		}
		return sum;
	}

}
