package Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		System.out.println(str == "exit");
		
//		exa[] pArr = new exa[3];
//		
//		pArr[0] = new exa("전은지");
//		pArr[1] = new exa("이지수");
//		pArr[2] = new exa("이해솔");
//		
//		for(int i = 0; i <= pArr.length; i++) {
//			System.out.println(pArr[i].getName());
//		}
//		
//		ArrayList<Fruit> list = new ArrayList<Fruit>();
//		list.add(new Fruit("사과", "빨강"));
//		list.add(new Fruit("메론", "초록"));
//		list.add(new Fruit("포도", "보라"));
//
//		for (int i = 0; i < list.size(); i++) {
//		    System.out.println(list.get(i));
		
//		new Save().fileSave("save.txt");
		
//		try {
//			System.out.println(InetAddress.getLocalHost().getHostAddress());
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
		
//		new Save().output();
		
		int port = 900;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			Socket client = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
