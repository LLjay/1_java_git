package com.kh.tcp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient { // TCP는 무조건 받아줘야 다음이 동작하는데 UDP는 받건 말건 일단 막 보냄, 받다가 못 받을 수도 있음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보낼 메세지 입력 : ");
		String msg = sc.nextLine();
		
		String serverIP = "192.168.30.30";
		InetAddress inet;
		int port = 4000;
		
		
		try (DatagramSocket dsoc = new DatagramSocket()){
			inet = InetAddress.getByName("192.168.30.11");
			
			// 전송하기 위한 UDP 소켓 만들어주기
//			DatagramSocket dsoc = new DatagramSocket();
		
			// 전송할 데이터 생성
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
			dsoc.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
