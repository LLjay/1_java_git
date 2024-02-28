import java.util.Scanner;

public class Controll04 {

	public static void main(String[] args) {

		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 단, 관리자는 회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 비회원은 게시글 조회만 가능합니다.
		 * 
		 * ex)
		 * 권한을 확인하고자 하는 회원 등급 : (관리자)
		 * 회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String rank;

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		rank = sc.next();
		sc.nextLine();
		
//		if (rank.equals("관리자")) {
//			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (rank.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (rank.equals("비회원")) {
//			System.out.println("게시글 조회");
	//  } else {
//			System.out.println("권한이 올바르지 않습니다.")
//		}
		
		String str = "";
		
//		switch (rank) {
//		case "관리자" :
//			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//			break;
//		case "회원" : 
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//			break;
//		case "비회원" :
//			System.out.println("게시글 조회");
//		} // 왜 빠져나와서 출력만 안 하면 안에서는 디폴트 없고 스트링 값 없어도 안 된다고 안 뜨지?
		
		switch (rank) {
		case "관리자" :
			str += "회원관리, 게시글 관리";
		case "회원" : 
			str += ((str.equals("") ? "" : ", ") + "게시글 작성, 댓글 작성");
		case "비회원" :
			str += ((str.equals("") ? "" : ", ") + "게시글 조회");
			break;
		default :
			System.out.println("권한이 올바르지 않습니다.");
		}
		System.out.println(str);
		
//		switch (rank) {
//		case "관리자" :
//			str += "회원관리, 게시글 관리";
//		case "회원" : 
//			str += "게시글 작성, 댓글 작성";
//		case "비회원" :
//			str += "게시글 조회";
//			break;
//		default :
//			System.out.println("권한이 올바르지 않습니다.");
//		}
//		System.out.println(str);
		
		
		
		
		
		
		
	}

}
