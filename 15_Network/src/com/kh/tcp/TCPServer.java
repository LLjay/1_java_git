package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * # TCP(Transmission Control Protocol)
 * - 서버, 클라이언트 간에 1:1 소켓 통신
 * - 데이터를 교환 하기에 앞서 서버, 클라이언트 연결이 되어야 한다.(서버가 먼저 실행 되어 클라이언트에 요청을 기다려야 함)
 * - 신뢰성 있는 데이터 전달 가능
 * 
 * #Socket
 * - 프로세스 간의 통신을 담당
 * - Input / OutputStream을 가지고 있다. (이 스트림을 통해서 입출력이 이루어진다.)
 * // => 1바이트만 사용 가능, 따라서 보조스트림을 이용해 2바이트로 변경할 것
 * 
 * #ServerSocket
 * - 포트와 연결(Bind) 되어 외부와 연결 요청을 기다린다. -> 요청이 들어오면 수락해준다.
 * 	 수락 -> 통신할 수 있는 socket이 생성
 */

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) 포트 번호 지정(서버 측에서 몇 번 포트로 통로를 열겠냐라는 의미)
		int port = 3000;
		
		ServerSocket server;
		try {
			// 2) ServerSocket 객체 생성 시 포트 결합(Bind)
			server = new ServerSocket(port);
			
			// 3) 클라이언트로부터 접속 요청이 올 때까지 대기
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
			// 4) 연결 요청이 오면 => 요청 수락 후 클라이언트와 통신할 수 있는 서버 측 소켓 객체 생성
			Socket socket = server.accept(); // 요청이 오면 소켓을 반환?
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함");
			
			// => 방화벽에서 액세스 허용 요청, 허용 취소하면 그 안으로 들어가서 변경해줘야 함
			
			// 5) 클라이언트와 입출력 기반 스트림 생성(바이트스트림 밖에 안 됨 -> 1바이트라)
			// 6) 보조 스트림을 통한 성능 개선
			
			// 입력용 스트림 (클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이기 위한 입력용 스트림)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 인풋 열었으니 아웃풋도 따로 열어줘야 함
			
			// 출력용 스트림 (클라이언트에게 값을 한 줄 단위로 출력할 수 있는 출력용 스트림
//			pw = new PrintWriter(socket.getOutputStream());
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			// PrintWriter : 데이터 출력 시 print(), println() 메소드를 가지고 있는 보조 스트림
			// => System.out과 비슷
			
			while(true) {
				// 7) 스트림을 통해서 읽고 쓰기
				String message = br.readLine(); // bufferedReader가 이런 메소드를 사용할 수 있으니까 이거 쓰는 거고 다른 메소드 쓰고 싶으면 그거 써도 됨
				System.out.println("클라이언트로부터 전달 받은 메세지 : " + message);
				
				// 반대로 클라이언트에게 데이터 전달(출력)
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 출력
				// 잠깐 담은 걸 클라이언트한테 강제로 밀어넣어야 함
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드
			}
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
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
