package com.light.TestIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByte {
	
	// xxxOutputStream => xxx 매체로 출력하겠다
	// xxxInputStream => xxx 매체로부터 입력받겠다
	// 바이트스트림 : 1바이트 단위로 전송하는 통로
	// 기반스트림 : 외부 매체와 직접적으로 연결하는 통로
	
	public void fileSave() {
		try {
			FileOutputStream fOut = new FileOutputStream("test_fileByte.txt");
			
			fOut.write(120);
			fOut.write('a');
			fOut.write('이');
			
			byte[] arr = {100, 101, 101, 102, 103, 104};
			
			fOut.write(arr, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	

}
