import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println(7);
		System.out.println(3.15);
		System.out.println("3+5=" +8);
		System.out.println(3.15 + "는 실수입니다.");
		System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
		System.out.println(3 + 5);
		
		char car = '가';
		boolean b1;
		b1 = true;

		System.out.println("저는\b지금");
		System.out.println("저는\t지금");
		System.out.println("저는\\지금");
		System.out.println("저는\'지금\'");
		System.out.println("저는\n지금\n");
		
		String name = "이지수";
		int age = 27;
		
		System.out.printf("제 이름은 %s 이고 나이는 %d살 입니다.", name, age);
		System.out.println();
		
		
		Scanner input = new Scanner(System.in);
		
		int bang = 3;
		System.out.println(bang);
		
		String id = input.next();
		System.out.print(id);
		
		input.close();
		
		char a = 'a';
	      System.out.println((char)(a + 1));
	      //a는 자동 형변환이 된 상태 (char가 int보다 작으니까)
	      //98이라는 결과를 char로 바꾸라고 시도
	      
	      double pi = 3.1415;
	      int wholeNumber = (int)pi;
	      System.out.println(wholeNumber);
	      
	      long num1 = 30000000007L;
	      int num2 = (int)num1;
	    		  System.out.println(num2);
	      
	    		  short num3 = 1;
	    	      short num4 = 2;
	    	      short num5 = (short)(num3 + num4);
	    	      System.out.println(num5);
	    	      
	    	    char ch1 = '이';
	    		char ch2 = '지';
	    		char ch3 = '수';
	    			
	    		System.out.println("문자 자료형");
	    		System.out.println(ch1 + ch2 + ch3);
	    		System.out.println(ch1);
	    		System.out.println(ch2);
	    		System.out.println(ch3);
		
		
		
	}
}