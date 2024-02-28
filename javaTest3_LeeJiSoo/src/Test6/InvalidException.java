package Test6;

public class InvalidException extends Exception {
	// 예외 처리 할 때 Exception 상속 처리를 꼭 해줘야 함
	// 예측 가능한 예외를 처리하는 게 Exception
	
	public InvalidException(String message) {
		super(message);
	}
	// 부모 생성자에 메세지를 넘겨줘라 : 어디에서 몇 번이 오류인지 넘겨주는 게 메세지
	// 상속 받은 사람의 상속 받은 생성자에서 Exception 클래스에 메세지를 넘겨줄 것
}
