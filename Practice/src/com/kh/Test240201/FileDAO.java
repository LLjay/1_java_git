package com.kh.Test240201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
//		File fd = new File(file);
//		return fd.exists();
		
		File f1 = new File(file); // 객체는 생성 했지만 실제 파일은 없는 상태
		return f1.exists();
	}
	
	public void fileSave(String file, String s) {
//		File fd = new File(file);
//		
//		while (s.equals("ex끝it")) {
//			try {
//				FileOutputStream fin = new FileOutputStream(file, true);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	/*
	 * StringBuilder : 효율적으로 문자열을 처리하기 위한 클래스로 다양한 기능의 메소드 제공
	 * append(), insert(), delete(), replace() ...
	 */
	
	public StringBuilder fileOpen(String file) {
		StringBuilder content = new StringBuilder();
//		String str = ""; // 이렇게 해도 됨
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
//			br.readLine(); // 끝까지 가지고 오면 null을 반환
			
			String value;
			
			while((value = br.readLine()) != null) {
				// String 이용
//				str += (value + "\n");
				
				// StringBuilder 이용
//				content.append(value).append("\n");
				content.append(value);
				content.append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
	
	public void fileEdit(String file, String s) { // edit니까 덮어쓰는 거 아니고 덧붙이는 것, 옵션 바꾸기
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
			br.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
