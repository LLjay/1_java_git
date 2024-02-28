package com.kh.B_Stream;

public class Run {
	/*
	 * 프로그램 상의 데이터를 외부 매체로 출력 한다거나 외부매체로부터 입력을 받아오려고 한다.
	 * 이 때 반드시 외부 매체와 연결되는 통로를 만들어줘야 한다. -> 스트림
	 * 
	 * #스트림(통로)의 특징
	 * - 단방향 : 입력이면 입력 / 출력이면 출력만 가능
	 * 			=> 입력과 출력을 동시에 하고자 한다면 => 입력용 스트림/출력용 스트림 따로 열어야 함
	 * - 선입선출(FIFO) : 통로가 파이프 같은 개념이기 때문에 먼저 보낸 값이 먼저 나온다.
	 * - 시간지연(delay)이 발생할 수 있다.
	 * 
	 * #스트림의 구분
	 * > 통로의 사이즈 (1byte / 2byte)
	 * 	- 바이트스트림 : 1byte만 왔다갔다 할 수 있는 통로 => 입력(InputStream), 출력(OutputStream)
	 * 	- 문자스트림 : 2byte가 왔다갔다 할 수 있을 정도의 통로 => 입력(Reader), 출력(Writer)
	 * 
	 * > 외부 매체와 직접 연결 유무에 따라
	 * 	- 기반스트림 : 외부 매체와 직접적으로 연결 되는 통로(필수)
	 * 	- 보조스트림 : 기반스트림을 보조하는 통로(속도를 빠르게 하는 등 유용한 기능을 제공하기 위한 보조 역할)
	 * 				=> 단독 사용 불가, 반드시 기반스트림과 함께 사용할 수 있음
	 * 
	 */

	public static void main(String[] args) {

//		new FileByte().fileSave();
//		new FileByte().fileRead();
//		new FileChar().fileSave();
//		new ServeStream().fileSave();
//		new ServeStream().fileRead();
//		new ServeStream().objectSave();
		new ServeStream().objectRead();

	}

}
