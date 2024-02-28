package com.jay.exampleNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientJay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		int port = 2000;
		String serverID = "192.168.30.30";
		
		try {
			socket = new Socket(serverID, port); // 이 서버 IP의 2000번 포트에 요청을 보내는 구문, 연결 실패 시 null 값 담김
			
			if (socket != null) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.print(": ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage); // 왜 print()로 하면 안 되지??
					pw.flush();
					
					String getMessage = br.readLine();
					System.out.println(getMessage);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
