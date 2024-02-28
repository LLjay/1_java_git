package com.kh.chatJay;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend implements Runnable {
	
	private Socket socket;
	
	public ServerSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); // true니까 자동으로 공간을 비우므로 스트림으로 넘어감
				Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				String message = sc.nextLine();
				writer.println();
//				writer.flush();// 이걸 해야 입력한 내용이 스트림을 통해 넘어감
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
