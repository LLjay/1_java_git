package com.kh.Test240213;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
	
	// 파일에 내용 작성하기, 파일로부터 내용 가져오기
	// 파일에 객체 정보 저장하기(직렬화), 파일로부터 객체 정보 가져오기(역직렬화) // 객체 캐스팅 하라는 것?
		File fLct = new File("D:\\Test0");
		File f = new File("D:\\Test0\\Test.txt");
		
		fLct.mkdir();
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fTest = new File("hello.txt");
		try {
			fTest.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(fTest.exists());
		System.out.println(fTest.isFile());
		
		System.out.println("파일명 : " + fTest.getName());
		System.out.println("절대경로 : " + fTest.getAbsolutePath());
		System.out.println("파일용량 : " + fTest.length());
		System.out.println("상위폴더 : " + fTest.getParent());
		
		fileSave();
		fileRead();

		
	}
	
	public static void fileSave() {
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter("Test.txt");
			
//			while(true) {
//				System.out.print("입력 : ");
//				String str = sc.nextLine();
//				
//				fw.write(str);
//				
//				System.out.println();
//				
//				if (str.equals("끝")) {
//					return;
//				}
//			}
//			for (int i = 0; i < 5; i++) {
				System.out.print("입력 : ");
				String str = sc.nextLine();
				
				fw.write(str);
				
				Human h = new Human("전은지", 30);
				
				fw.write(h);
				
				System.out.println();
				
//				if (str.equals("끝")) {
//					return;
//				}
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void fileRead() {
		
		
		try (FileReader fr = new FileReader("Test.txt")){
			System.out.print(fr.read()); // 유니코드 형태로 변환되어 오기 때문에 다시 역직렬화 해줘야 함
			System.out.print((char)fr.read()); // 역직렬화
			// fr.read()는 한 글자씩만 읽어들이기 때문에 전체를 다 읽기 위해서는 반복문을 돌려야 함
			// 파일이 null일 경우 결과값이 -1로 나옴
			
			int value = 0; // fr.read()는 값이 유니코드 숫자 형태로 도착하기 때문에 받아줄 자료형도 정수형이어야 함
			while((value = fr.read()) != -1) { // 그냥 fr.read()로 조건 돌리면 그 값을 출력할 수 없이 사라짐, 받아줄 변수 필요
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
