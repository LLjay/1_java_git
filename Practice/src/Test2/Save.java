package Test2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {
	
	public void fileSave(String fileName) {
		File f = new File(fileName);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Food a = new Food("사과", 20);
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
			os.writeObject(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void output() {
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
