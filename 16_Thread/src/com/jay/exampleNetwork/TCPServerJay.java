package com.jay.exampleNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerJay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader brd = null;
		PrintWriter pwt = null;
		ServerSocket serverSocket;
		
		int port = 2000;
		
		try {
			serverSocket = new ServerSocket(port); // 포트와 서버소켓 바인드 + 요청 대기
			System.out.println("클라이언트의 요청 대기 중...");
			
			while(true) {
				Socket socket = serverSocket.accept(); // 클라이언트 요청 수락, 보내온 소켓 정보 받아서 반환
				System.out.println(socket.getInetAddress().getHostAddress() + "의 연결 요청 수락");
			}
			brd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pwt = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String getMessage = brd.readLine();
				System.out.println(" " + getMessage);
				
				System.out.print(": ");
				String sendMessage = sc.nextLine();
				pwt.println(sendMessage);
				pwt.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			pwt.close();
			try {
				brd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
