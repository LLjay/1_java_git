package com.kh.tcp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer { // UDP는 서버가 받기만 함
	public static void main(String[] args) {
		
		int port = 4000;
		try (DatagramSocket dsoc = new DatagramSocket(port)){ // 스트림이 받는 애 하나밖에 없어서 여기 넣어도 안 복잡함
			// 서버가 4000포트를 결합하여 요청 받을 준비를 한다.
//			DatagramSocket dsoc = new DatagramSocket();
			
			// 전송 받은 데이터를 지정할 바이트 배열 선언
			byte[] date = new byte[60000];
			
			// 패킷 통신 <--> 소켓 통신 (패킷은 막 던지는 통신)
			
			// 클라이언트로부터 받을 packet 객체 생성
			DatagramPacket dp = new DatagramPacket(date, date.length);
			System.out.println("데이터 받을 준비 완료");
			
			while(true) {
				// 패킷으로 데이터가 계속 들어오면 패킷에서 데이터를 꺼내줄 것
				// 데이터 전송된 것 받아주기
				dsoc.receive(dp);
				// 데이터 확인해보기
				System.out.println("클라이언트 IP : " + dp.getAddress());
				String message = new String(dp.getData(), "UTF-8"); 
				System.out.println("클라이언트가 보낸 내용 : " + message);
				
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
