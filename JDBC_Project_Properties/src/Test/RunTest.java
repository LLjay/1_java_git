package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RunTest {
	public static void main(String[] args) {
		// Properties
		
		/*
		 * Properties 특징 - Map 계열 컬렉션 (key value 세트로 담음) - key, value 모두
		 * setProperty(key, value) / 담을 때 사용
		 * getProperty(key) : value / 가져올 때
		 * 
		 * - 주로 외부 파일(.properties / .xml)을 사용해서 입출력 할 때 사용
		 */
		
		// 파일로 출력하는 것
		
//		Properties prop = new Properties();
////		
//		prop.setProperty("C", "INSERT"); // 데이터 저장
//		prop.setProperty("R", "SELECT"); // 데이터 읽기
//		prop.setProperty("U", "UPDATE"); // 데이터 수정
//		prop.setProperty("D", "DELETE"); // 데이터 삭제
//		
//		try {
////			prop.store(new FileOutputStream("resources/driver.properties"), "properties test");
//			prop.storeToXML(new FileOutputStream("resources/query.xml"), "properties test");
//		} catch (FileNotFoundException e) {// query 부분에 진짜 쿼리를 집어넣을 것
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		// 만약 상대경로를 지정할 경우 이 프로젝트의 폴더 기준 경로가 지정
		// 지금은 resources라는 폴더 안에 driver.properties라는 파일을 생성해준 것
		
		// 파일로부터 읽어오기
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println(prop.getProperty("U")); // 키로 가져오겠다는 뜻
		// 키 밸류 값으로 키를 통해 밸류를 가져올 수 있음
		
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
