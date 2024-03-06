package com.mini.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			prop.store(new FileOutputStream("resources/driver.properties"), "mini properties");
			prop.storeToXML(new FileOutputStream("resources/query.xml"), "mini properties");
			// 뒤의 자리는 String comment
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
