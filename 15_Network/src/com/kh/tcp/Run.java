package com.kh.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	public static void main(String[] args) {
		/*
		 * # 네트워크 : 여러 대의 컴퓨터들이 연결되어 있는 통신망
		 * //통신망이 구축된 형태 인터넷, 그걸 전송하고 연결하는 방식 네트워크
		 * 			 => 네트워크를 통해서 서로 데이터를 교환하기 위해서
		 *  IP 주소 : 네트워크 상의 각 컴퓨터들을 식별해줄 수 있는 번호(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
		 * // 도메인은 우리가 접근하기 쉽도록 만들어놓은 것, IP가 실제 주소값
		 * 
		 * # 서버와 클라이언트
		 * > 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (클라이언트의 요청에 응답을 해주는 것)
		 * > 클라이언트 : 서버에 요청 하는 컴퓨터 (서비스를 제공 받는 고객)
		 * 
		 * - 서버에 요청하기 위해서는 요청하고자 하는 서버의 IP주소(또는 도메인), 포트 번호를 알아야 함
		 * // 도메인은 별칭 같은 것, 접근하기 쉽게 만들어놓은 형태 -> 도메인 이름에 따라 인기 있는 이름이면 도메인이 비쌈
		 * // 포트 번호는 http는 8080 같은 식으로 정해져있는 것들이 있음, 그걸 제외하고 사용
		 * 
		 * # 현재 구동 중인 서버가 있을 때
		 * 	 클라이언트는 그 서버로 요청을 보낼 수 있고 응답 결과가 돌아옴
		 *   - 요청과 응답에 의해서 웹은 작동함 ("통신한다")
		 *   - 웹에서의 통신 방식 : HTTP 프로토콜 사용
		 *   
		 *   // 스마트폰은 기계, 컴퓨터 웹은 브라우저에서 돌아감 => 장비를 크게 타지 않음
		 *   // 스마트폰은 카메라 같은 것에 접근할 수 있음 / 푸쉬알림은 핸드폰이 가질 수 있던 가장 큰 장점
		 *   // 앱은 접속 시간과 재사용성이 중요한데 알림 없는 웹으로 가면 다시 아무도 찾지 않음
		 *   // 앱은 서버에서 갑자기 알림을 던져줄 수 있음, 웹은 요청 받지 않은 응답을 주지 않음
		 *   // 웹은 요청과 응답이 베이스, 앱은 아님
		 *   
		 *   => 자바만 가지고 서버와 클라이언트 간에 간단한 통신 해보기
		 *   	이때 데이터를 입출력하고자 한다면 서버와 클라이언트 간에 스트림(연결통로)가 필요
		 *   
		 * # 소켓 : 프로세스 간의 통신을 담당하는 것
		 * 	 // 웹도 채팅을 구현해야 함
		 *   // 내가 답장을 보내면 응답할 수 있지만 내가 가만히 있는데 상대 메세지가 뜨려면 새로고침 해야 함
		 *   // 가만히 있는데 뭔가 컴퓨터에 뜨면 서버가 요청했다는 것
		 *   // 메세지 수신 => 강제로 서버에 요청해야 함, 둘 다 서로 양방향이 되어야 함
		 *   // 이때 쓰는 게 소켓
		 *   
		 * # 소켓 프로그래밍 (TCP / UDP)
		 * - TCP 방식 : 데이터 전송 속도가 느림, 데이터가 정확하고 안정적으로 전달이 가능(신뢰성이 요구되는 프로그램)
		 * // 가다가 하나 안 가고 하나만 가면 안 됨
		 * - UDP 방식 : 데이터 전송 속도가 빠름, 신뢰성 없는 데이터 전달에 용이(데이터를 빠른 속도로 전송하고자 할 때)
		 * // 게임(총 쐈는데 하나 사라지면 렉), 스트리밍(중간에 안 나와도 되니까 지금 당장 봐야할 것을 보여줘야 함)
		 * 
		 */

		// InetAddress : 네트워크의 정보(ip주소 관련)를 확인할 수 있는 클래스(객체임)
		// localhost : 지금 요청을 보내는 내 컴퓨터, 상수처럼 그냥 이대로 쓰는 말
		try {
			InetAddress localhost = InetAddress.getLocalHost(); // 내 PC(지역 호스트)에 대한 정보를 반환
			System.out.println(localhost); // 내 PC명 + / + 내 IP주소 (DESKTOP-Q4QNCBE/192.168.30.30)
		
			System.out.println("내 PC명 : " + localhost.getHostName()); // 호스트의 이름을 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress()); // 호스트의 IP주소 반환
	
			System.out.println("===========================================");
			
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // 도메인 명을 통해서 해당 호스트의 정보를 가져올 수 있다.
			System.out.println("구글의 서버명 : " + googleHost.getHostName());
			System.out.println("구글의 IP주소 : " + googleHost.getHostAddress()); // IP주소가 하나만 있지는 않음
			// 와이파이 꺼져있으면 안 됨, 근데 된다고 예상할 수 있는 이유는 host이름을 IP주소로 교환받음
			// 도메인 네임 서버 DNS : 각 컴퓨터에 다 있는 서버, 거기서 IP주소를 교환 받음, 거기에 연결되는 순간 다 등록됨
			// 컴퓨터 하나에 서버 하나? => 서버를 똑같이 동작하게 만듦, 여러 서버 중 하나
			
			System.out.println("===========================================");
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
		
			for (InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소 : " + n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
	}

}
