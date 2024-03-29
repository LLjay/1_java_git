package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket = null;
		
		// 요청하고자 하는 서버 IP : 192.168.30.30 (내 컴퓨터)
		// 포트 번호 : 3000 (서버에 포트 3000을 열어줬으니까)
		
		int port = 3000;
		
		String serverIP = "192.168.30.30";
		// 1) 서버에 연결 요청 보내는 구문(요청하고자 하는 서버의 IP주소와 지정된 포트 번호를 제시하면 된다.)
		try {
			socket = new Socket(serverIP, port);
			// 만약 통신이 실패했다면 null 값이 socket 객체에 담긴다.
			
			if (socket != null) { // 서버와 잘 연결된 경우
				System.out.println("서버와 연결 성공!");
				
				// 2) 서버와 입출력 기반 스트림 생성
				// 3) 보조스트림 활용해서 성능 개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					// 4) 스트림을 통해서 읽고 쓰기
					System.out.print("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버로부터 전달 받은 메세지 : " + message);
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		sc.close();
	}

}
