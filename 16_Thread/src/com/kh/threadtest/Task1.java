package com.kh.threadtest;

public class Task1 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
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


