import java.util.Scanner;
// 1. Scanner를 사용하기 위해서 외부로부터 가져온다.

public class inputTest {
	/*
	 * 키보드로 값을 입력하는 방법
	 * Scanner를 사용한다.
	 * (java.util.Scanner 클래스를 이용하는 것이다.)
	 * Scanner 클래스 내부의 메소드를 호출하여 입력 받는 것
	 * (자바 폴더 안에 유틸 폴더 안에 기본으로 탑재되어 있는 스캐너 클래스를 이용)
	 * 
	 * [사용법]
	 * Scanner 이름 = new Scanner(System.in);
	 * ex) Scanner sc = new Scanner(System.in);
	 * 
	 * sc.next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
	 * sc.nextLine() : \n(개행문자)를 포함하는 한 라인을 읽고 '/n'을 버린 나머지만 가져옴
	 * -> 문자열을 가져오기 위한 명령어
	 * 
	 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong()
	 * sc.nextFloat(), sc.nextDouble()
	 * 위처럼 정수나 실수를 입력 받는 코드를 작성했을 때 \n 토큰이 함께 들어오기 때문에
	 * sc.nextLine()을 통해서 비워주는 코드를 작성해야 한다.
	 * 
	 * sc.next().charAt(0);
	 * 
	 * close() : 더이상 Scanner를 사용하지 않겠다.
	 * hasNext() : 현재 Scanner 공간에 사용자로부터 입력 받은 값이 남아있는지 확인
	 * 			   없으면 다른 값이 들어올 때까지 무작정 기다립니다.
	 * 			   기다렸다가 true 리턴
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 2. Scanner 클래스의 객체를 생성
		Scanner sc = new Scanner(System.in);
		//System.in은 입력 받은 값을 바이트 단위로 받아들이겠다 라는 뜻.
		//출력 시에는 System.out 이라는 구문을 사용했다.
		
		/*
		 * (스캐너 이름은 input이라고도 씀)
		 * 여기서 마음대로 할 수 있는 부분은 변수 이름
		 * 코드 기준 코드가 들어오면 입력, 나가면 출력
		 */
		/*
		System.out.print("아무거나 입력하세요 : "); //입력할 때까지 코드가 진행되지 않고 기다림
		String str = sc.next();
		System.out.println(str);
		/*
		sc.next();
		System.out.print("끝");
		
		System.out.print("아무거나 입력하세요 : ");
		String st1 = sc.next();
		String st2 = sc.next();
		String st3 = sc.next();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		*/
		/*
		System.out.print("한 줄 입력 받기 : ");
		String st1 = sc.nextLine();
		System.out.println(st1);
		
		sc.close();
		*/
//		
//		System.out.println("이름을 입력하세요");
//		String name = sc.next();
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		System.out.println(name);
//		System.out.println(age);
//		
//		

		
//		System.out.println("이름을 입력하세요");
//		String name = sc.next();
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		sc.nextLine(); //위에서 사용한 nextInt() 때문에 함께 들어온 /n을 비워주는 것
//		
//		System.out.print("주소를 입력하세요 : ");
//		String add = sc.nextLine();
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(add);
		// nextInt는 숫자만 들어가서 엔터를 치면 그 다음 add 값에 \n만 들어감
		// -> nextInt 사이에 nextLine을 하나 더 넣어줘야 함
		// -> nextLine이 그 뒤의 것까지 한 줄로 가져오겠다고 설정해줌
		
		
		//변수이름.close();
		
		// 1. Import
		// 2. 스캐너 객체 생성
		Scanner input = new Scanner(System.in);
		String name, address;
		int age;
		
		System.out.println("==============================");
		System.out.print("이름을 입력해주세요 : ");
		name = input.nextLine();
		System.out.println("나이를 입력하세요 : ");
		age = input.nextInt();
		input.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		address = input.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("==============================");
		
	}
}
