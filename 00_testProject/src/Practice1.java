import java.util.Scanner;

public class Practice1 {
	
	/*
	 * 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	 * 
	 * 문자열.charAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
	 * -> char gender = sc.next().charAt(0); 에서는 내가 입력한 글자의 첫 글자.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. : ");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요. (남/여) ");
		//String gender = sc.next();
		char gender = sc.next().charAt(0);
		
		System.out.print("나이를 입력하세요.(ex) 25) : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요. (ex) 170) : ");
		//int height = sc.nextInt();
		float height = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("키 " + height + "cm인 " + age + "살" + gender + "자"+ name + "님 반갑습니다 ^^");
		System.out.printf("키 %.2fcm인 %d살 %c자 %s님 반갑습니다 ^^", height, age, gender, name);
		//%f = 뒤의 소수점 자리를 첫 번째 자리까지만 나타내라는 뜻
		
	}

}
