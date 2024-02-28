package com.kh.chatJay;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		int port = 3000;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("서버 연결 준비 완료...");
			
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			// 클라이언트로부터 메세지를 받는 쓰레드
			// ServerReceive receive = new ServerReceive(socket); 으로 넣고 Thread에서 생성 안 해줘도 됨
			Thread receiveTask = new Thread(new ServerReceive(socket));
			receiveTask.start();
			// 클라이언트로부터 메세지를 보내는 쓰레드
			ServerSend send = new ServerSend(socket);
			Thread sendTask = new Thread(send);
			sendTask.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 생성자에 예외 날 수 있다고 설정해놨기 때문
	}
}
