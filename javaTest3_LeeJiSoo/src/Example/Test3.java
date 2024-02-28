package Example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
	
	public static void main(String[] args) {
		Date birth = new Date(1987-1900, 5-1, 27);
		Date presents = new Date();
		
		SimpleDateFormat b = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat p = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		int age = presents.getYear() - birth.getYear();
		
		System.out.println(b.format(birth));
		System.out.println(p.format(presents));
		System.out.println(age);
	}

}
