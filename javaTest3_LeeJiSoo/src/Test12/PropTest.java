package Test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {
	
	public static void main(String[] args) {
		
		 Properties prop = new Properties();
			
	        /* prop에 키와 값(key,value)를 저장한다.*/
	        prop.setProperty("1", "apple,1200,3");
	        prop.setProperty("2", "banana,2500,2");
	        prop.setProperty("3", "grape,4500,5");
	        prop.setProperty("4", "orange,800,10");
	        prop.setProperty("5", "melon,5000,2");
//	        System.out.println(prop);
//
//	        Enumeration enumeration = prop.propertyNames(); // key만 모아서 가져오고 싶으면 propertyNames()
//	        while (enumeration.hasMoreElements()) { // 아직 남은 게 있는지 확인
//	            String element = (String) enumeration.nextElement(); // key를 하나씩 뽑는다.
//	            System.out.println(element + "=" + prop.getProperty(element)); // prop.getProperty -> value 가져오고 있다.
//	        }
	        
	        fileSave(prop);
	        
	        fileOpen(prop);
	}
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "Properties Example");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			// data.xml 파일에서 데이터를 읽어온다
			p.loadFromXML(new FileInputStream("data.xml"));
			
			Enumeration enumeration = p.propertyNames();
			Fruit[] fruitArr = new Fruit[p.size()];
			
			// String name, int price, int quantity
			for (Fruit f : fruitArr) {
				String key = (String) enumeration.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				System.out.println(key + " = " + f.toString());
			}
			
//			
//			while (enumeration.hasMoreElements()) { // 아직 남은 게 있는지 확인
//	            String element = (String) enumeration.nextElement(); // key를 하나씩 뽑는다.
//	            System.out.println(element + "=" + p.getProperty(element)); // prop.getProperty -> value 가져오고 있다.
//	        }
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
