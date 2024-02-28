package Test15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Test5.Book;

public class BookListTest {
	public static void main(String[] args) {
		BookListTest t = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
				
		t.storeList(list);

	}
	
	public void storeList(List<Book> list) {
		Book[] b = {
			new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1),
			new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1),
			new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1)};
		
		for (int i = 0; i < b.length; i++) {
			list.add(b[i]);
		}
//		System.out.println(list);
		
	}
	
	public void saveFile(List<Book> list) {
		File f = new File("books.dat");
		if (f.exists() != true) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileWriter fw = new FileWriter("books.dat")){
			fw.write(list.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Book> loadFile() {
		try (FileReader fr = new FileReader("books.dat")){
			int value = 0;
			List<Book> list;
			
			if ((value = fr.read()) != -1) {
				list.add(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void printList(List<Book> list) {
		
	}

}
