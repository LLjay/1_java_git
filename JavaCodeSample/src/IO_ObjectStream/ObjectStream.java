package IO_ObjectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream / ObjectInputStream
//		> 객체 단위로 출력 가능하도록 도와주는 보조스트림
//		> ObjectWriter, ObjectReader는 없음
// 		> FileOutputStream, FileInputStream과 연결해 1바이트 단위로 출력
// 		> 따라서 객체의 형태를 1바이트로 바꿀 수 있도록 직렬화 선언 필요

public class ObjectStream {
	
	public void objectSave() {
		Phone phone1 = new Phone("아이폰1", 1000000);
		Phone phone2 = new Phone("아이폰2", 2000000);
		Phone phone3 = new Phone("아이폰3", 3000000);
		
//		try { -> 이 상태를 try-with-resource 구문으로 변환
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectStream.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// try-with-resource : 자원을 자동으로 반납해주는 구문
		// try() 괄호 안에 들어간 스트림을 try-catch 구문이 끝나면 자동으로 닫아줌
		ObjectOutputStream oos = null;
		try {
			// FileOutputStream으로 기반스트림을 생성하고, 그걸 보조스트림인 ObjectOutputStream으로 감싸줌
			oos = new ObjectOutputStream(new FileOutputStream("ObjectStream.txt"));
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);
			// writeObject는 매개변수 형이 Object obj
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void objectRead() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("ObjectStream.txt"));
			// true 사용이 안 되나?
			
			Phone ph = null;
			Object obj = null;
			
			while((obj = ois.readObject()) != null) {
				if (obj instanceof Phone) {
					ph = (Phone)obj;
					System.out.println(ph.getName() + " " + ph.getPrice());
				}
			}
			
//			while (true) {
//				System.out.println(ph);
//			} // ObjectInputStream은 객체를 읽어들일 때마다 새로운 객체를 생성한다.
			// 읽을 때 따로따로 담을 수 있도록 해야 예외가 발생하지 않는다?
//		
		} catch (EOFException e){
			return; // 더이상 읽어들일 데이터가 없을 때의 예외처리 구문 => while 무한반복해 예외처리로 종료
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
