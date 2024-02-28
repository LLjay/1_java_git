import java.util.Scanner;

public class Controll03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 아이디와 비밀번호를 입력 받아 지정해둔 아이디와 비밀번호와 비교해서
		// 로그인 성공 시 로그인 성공
		// 아이디가 틀렸을 시 "아이디가 틀렸습니다"
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다" 를 출력하세요.
		
		String id = "myId";
		String pwd = "myPassword12";
		
		String inputId, inputPwd;
		
		System.out.print("아이디 : ");
		inputId = sc.next();
		sc.nextLine();
		
		System.out.print("비밀번호 : ");
		inputPwd = sc.next();
		
		// 내 예시
//		if (inputId.equals(id) && inputPwd.equals(pwd)) {
//			System.out.println("로그인 성공");
//		} else if (input.equals(id) && !(inputPwd.equals(pwd))) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		} else if (!(input.equals(id)) && inputPwd.equals(pwd)) {
//			System.out.println("아이디가 틀렸습니다.");
//		} else {
//		}
		// -> && 논리연산자가 비교할 항 두 개의 값이 논리값이 아니므로 비교 불가능
		
		
		if(id.equals(inputId)) {
			if(pwd.equals(inputPwd)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}
