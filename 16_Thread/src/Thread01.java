
public class Thread01 {
	
	/*
	 * 쓰레드 : 프로그램 내에서 실행의 흐름을 가지고 있는 최소 단위
	 * 			main 메소드 실행 시 메인쓰레드가 실행되는 것이다.
	 */
	
	public static void main(String[] args) {
		Runnable task = new MyRunable(); // 실행 정보를 가진 것, 쓰레드는 아직 여러 개가 아님
		
		Thread t1 = new Thread(task);
		Task t2 = new Task();
		t1.start();
		t2.start();
		
		System.out.println("End : " + Thread.currentThread().getName());
		// 어느 쪽이 더 빨리 끝날지 알 수 없어서 결과를 보장할 수 없음
		// CPU의 우선순위가 서로 다르기 때문에 결과도 다르게 나옴
	}

}
