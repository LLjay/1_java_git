import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = input.next();
		
		System.out.println("password : ");
		int password = input.nextInt();
		String i = input.nextLine();
		// nextInt에 입력한 값은 그대로 어딘가의 공간(input)에 남아있음
		// 뒤에 nextLine만 입력해주면 내가 출력한다는 말이 없기 때문에
		// 출력이 되지 않아 눈에 보이지는 않지만
		// 공백 이후의 값은 그대로 nextLine의 공간 안으로 들어감
		
		System.out.println("하고 싶은 말");
		String say = input.nextLine();
		
		System.out.println(id);
		System.out.println(password);
		System.out.println(say);
		
		System.out.println(i);
		
		input.close();
		
		//변수의 재사용성
		System.out.println(10 + 10 + 10); //10은 모두 다른 값
		
		int num = 10;
		System.out.println(num + num + num); //num은 모두 같은 값 -> 값을 재사용 한다.
	}

}
