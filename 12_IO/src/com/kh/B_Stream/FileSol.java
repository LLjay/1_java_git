package com.kh.B_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSol {
	
	public boolean checkName(String file) {
		File f = new File(file); 
		// 파일 객체를 생성, 이 객체 안에 든 메소드를 이용해 파일을 실제로 생성할 수도 있고
		// 파일 유무 존재 확인, 파일에 써넣기, 파일 형식이 맞는지 확인하는 등의 작업이 가능
		// 객체를 만들어 원하는 메소드를 사용하기 위함
		// f.createNewFile() 을 하지 않았기 때문에 실제 파일은 생성 X 객체만 O
		
		return f.exists(); // 이건 논리값으로 결과가 나오는 메소드, 있으면 true 없으면 false
	}
	
	public void fileSave(String file, String s) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder st = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			st.append(br.readLine());
			st.append("\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
