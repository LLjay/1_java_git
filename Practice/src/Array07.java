import java.util.Scanner;

public class Array07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 "ooo 치킨 배달 가능", 없으면 "ooo 치킨은 없는 메뉴입니다."를 출력하세요.
		// 단, 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요.
		
		
		// 내 예시
//		System.out.print("치킨 이름을 입력하세요. : ");
//		String chicken = sc.next();
//		
//		String[] menu = {"푸라닭", "네네", "굽네", "로스트", "양념", "후라이드"};
//		
//		for (int i = 0; i < menu.length; i++) {
//			if (chicken.equals(menu[i])) {
//				System.out.println(chicken + " 치킨 배달 가능");
//				break;
//			} else {
//				System.out.println(chicken + " 치킨은 없는 메뉴입니다.");
//			} // for문으로 결과 확인을 전부 한 후 있으면 가능 없으면 메뉴 출력 한 번씩만 하면 되는데 for문 안에 결과 출력을 넣었으니 당연히 여러번 출력되지...
//		}
//		
		
		// 강사님 예시
		
//		String[] menu = {"후라이드", "양념", "간장", "반반", "핫후라이드", "슈프림양념"};
//		boolean isTrue = false;
//		
//		System.out.print("치킨 이름을 입력하세요. : ");
//		String pick = sc.next();
//		
//		for (int i = 0; i < menu.length; i++) {
//			if (menu[i].equals(pick)) {
//				isTrue = true;
//				break;
//			}
//		}
//
//		if (isTrue) {
//			System.out.println(pick + " 치킨 배달 가능");
//		} else {
//			System.out.println(pick + "치킨은 없는 메뉴입니다.");
//		}
//		
		
		
		
		
		
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 "ooo 치킨 배달 가능", 없으면 "ooo 치킨은 없는 메뉴입니다."를 출력하세요.
		// 단, 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요.
		
		String[] menu = {"푸라닭", "네네", "굽네", "로스트", "양념", "후라이드"};
		
		System.out.println("치킨 이름을 입력하세요.");
		String chicken = sc.next();
		
		for (int i = 0; i < menu.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
	}
}
