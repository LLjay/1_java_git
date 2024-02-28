package com.kh.threadtest;

public class Task2 extends Thread { // 20 미만 짝수 출력
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1) {
					System.out.print(i + " ");
				}
				Thread.sleep(100);
			}
				 // 밀리초, 1000이 1초, 100이 0.1초
				// => 0.1초간 잠을 잔다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
