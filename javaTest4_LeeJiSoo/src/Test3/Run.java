package Test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Date birth = new Date(1987 - 1900, 5 - 1, 27);
		Date presents = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 dd일");
		
		int age = presents.getYear() - birth.getYear();
		
		System.out.println("생일 : " + sdf1.format(birth));
		System.out.println("현재 : " + sdf2.format(presents));
		System.out.println("나이 : " + age + " 세");
	}

}
