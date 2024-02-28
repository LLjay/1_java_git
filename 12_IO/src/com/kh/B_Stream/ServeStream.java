package com.kh.B_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServeStream {
	/*
	 * 보조스트림 : 기반스트림만으로는 부족했던 성능을 보다 향상 시켜주는 스트림
	 * 			  기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상
	 * 		>> 외부 매체와 직접적으로 연결되는 스트림이 아님(단독 사용 불가 -> 반드시 기반스트림과 함께 사용)
	 */
	
	// 프로그램 -> 파일(출력)
	public void fileSave() {
		// FileWriter : 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 기반스트림
		// BufferedWriter : 속도 향상에 도움을 주는 보조스트림
		

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// 1. 기반스트림 먼저 생성
//			FileWriter fw = new FileWriter("c_buffer.txt");
//			
//			// 2. 보조스트림 생성 시 기반스트림 객체를 전달하면서 생성
//			BufferedWriter bw = new BufferedWriter(fw);
			
//			BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			// 객체 생성을 하기 위한 변수 fw였고 한 번 쓰고 말 것이기 때문에 보조스트림 안에 넣어줘도 무관
		
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine(); // 새로운 메소드 사용 가능
			bw.write("끝"); // write 자체도 성능적으로 좀 더 빠르게 사용 가능
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력 받을 수 있는 객체
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			br은 객체이고 객체 안에 아무것도 없다를 표현할 때 null이라고 하기 때문에 null이 나오는 것
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	// 프로그램 -> 파일 출력
	public void objectSave() {
		
		// 출력할 데이터 (Produce 객체)
		Produce phone1 = new Produce("아이폰1", 1000000);
		Produce phone2 = new Produce("아이폰2", 2000000);
		Produce phone3 = new Produce("아이폰3", 3000000);
		
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter는 없음)
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_produce.txt"))){
		
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // object스트림은 보조스트림
	}

	
	public void objectRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_produce.txt"))){
			
			while(true) {
			System.out.println(ois.readObject());
			}

		} catch (EOFException e) { // 더이상 데이터가 없는데 읽으려고 하니까 발생하는 에러 캐치
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}




