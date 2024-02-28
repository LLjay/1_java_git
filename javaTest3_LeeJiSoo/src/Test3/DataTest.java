package Test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {

	public static void main(String[] args) {

		Date birth = new Date(1987-1900, 5-1, 27);
		Date present = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
//		int age = present.getYear() - birth.getYear();
//		
//		System.out.println("생일 : " + sdf1.format(birth));
//		System.out.println("현재 : " + sdf2.format(present));
//		System.out.println("나이 : " + age + " 세");
		
		String birthFormat = sdf1.format(birth);
		String presentsFormat = sdf2.format(present);
		
		System.out.println("생일 : " + birthFormat);
		System.out.println("현재 : " + presentsFormat);
		System.out.println("나이 : " + (present.getYear() - birth.getYear()) + " 세");

		// 만 나이일 경우 조건 걸어서 월을 비교해서 하면 됨
		
	
	}

}
