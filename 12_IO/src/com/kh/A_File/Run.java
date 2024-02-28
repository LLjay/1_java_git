package com.kh.A_File;

import java.io.File;
import java.io.IOException;

public class Run {
	
	/*
	 * 간단하게 파일(File)을 만들어보자.
	 * java.io.File 클래스로.
	 */
	public static void main(String[] args) {
		
		// 1. 경로 지정을 딱히 하지 않고 파일을 생성
		//
		File f1 = new File("test.text"); // 파일 객체를 하나 만든 상태(실제 파일 X)
		// 파일 객체가 메모리에 생긴 것
		// 원래 파일 지정은 \인데 이스케이프 시퀀스에서 \t로 먹으므로 \\로 지정해줘야 함
		// 컴퓨터에 G드라이브 없으므로 지정된 경로 찾을 수 없다고 나옴
//		try {
//			f1.createNewFile(); // 메소드까지 실행을 해야만 파일이 만들어진다.
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // 
//		// 실제 파일을 만들어주는 메소드
		
		// 2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정 // 이 경로가 있다면 파일 생성해줌
		File f2 = new File("D:\\test.text");
		
		try {
			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException
			
//			File f3 = new File("D:\\tmp\\test.txt"); // 지정된 경로를 찾을 수 없기 때문에 
//			f3.createNewFile();
			
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir(); // 폴더가 만들어지게 하는 메소드
			
			File f3 = new File("D:\\tmp\\test.txt"); // 지정된 경로를 찾을 수 없기 때문에 
			f3.createNewFile();
			
			System.out.println(f1.exists()); // 파일의 존재 유무 확인
			System.out.println(new File("ttt.txt").exists()); // 실제로 만들어진 게 아니고 프로그램에 객체로 둥둥 떠있는 상태기 때문에 false
			
			System.out.println(f1.isFile()); // 파일인지 확인하는 메소드
			System.out.println(tmpFolder.isFile()); // 파일인지 아닌지 물어보는 것, 이건 폴드
			
			// -----------------------------------------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		System.out.println("프로그램을 종료합니다.");
		
	}
			

}
