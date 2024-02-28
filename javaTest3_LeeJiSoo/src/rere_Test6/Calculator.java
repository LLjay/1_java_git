package rere_Test6;

public class Calculator {
	
	public int getSum(int num) throws InvalidException {
		if (num < 1 || num > 11) {
			throw new InvalidException("유효하지 않은 범위입니다.");
		}
	
		int sum =  0;
		for (int i = 0; i < num; i++) {
			sum += num;
		}
		
		return sum;
		
	}
}
