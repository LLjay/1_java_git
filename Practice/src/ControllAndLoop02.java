import java.util.Scanner;

public class ControllAndLoop02 {
	public static void main(String[] args) {
		
		// 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요.
		// 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
		// 사용자에게는 직접 가위바위보를 받으세요.
		// 사용자가 exit를 입력하기 전까지 가위바위보를 계속 진행하고 exit가 들어가면 반복을 멈추고
		// 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String user, rspUser, rspCom = " ";
		int com, total;
		int win = 0;
		int lose = 0;
		int same = 0;
		
		System.out.print("당신의 이름을 입력해주세요. : ");
		user = sc.next();
		
		while(true) { 
			System.out.print("가위바위보 : ");
			rspUser = sc.next();
			
			if (rspUser.equals("exit")) {
				break;
			}
			
			com = (int)(Math.random() * 3 + 1);
			
//			if (com == 1) {
//				rspCom.equals("가위");
//			} else if (com == 2) {
//				rspCom.equals("바위");
//			} else if (com == 3) {
//				rspCom.equals("보");
//			}
			
			if (com == 1) {
				rspCom = "가위";
			} else if (com == 2) {
				rspCom = "바위";
			} else if (com == 3) {
				rspCom = "보";
			}
			
			// rspCom.equals("가위")는 논리연산자 == 와 같은 기능, 결과값이 논리값이므로 비교 불가
			// 가위라는 문자열을 대입하려면 대입연산자를 사용해야 함
			
			if (rspUser.equals(rspCom)) {
				same++;
				System.out.println("컴퓨터 : " + rspCom);
				System.out.println(user + " : " + rspUser);
				System.out.println("비겼습니다.");
			} else if ((rspUser.equals("가위") && rspCom.equals("보")) ||
						(rspUser.equals("보") && rspCom.equals("바위")) ||
						(rspUser.equals("바위") && rspCom.equals("가위"))) {
				win++;
				System.out.println("컴퓨터 : " + rspCom);
				System.out.println(user + " : " + rspUser);
				System.out.println("이겼습니다!");
			} else {
				lose++;
				System.out.println("컴퓨터 : " + rspCom);
				System.out.println(user + " : " + rspUser);
				System.out.println("졌습니다ㅠㅠ");
			}
			System.out.println();
//			
//			if (rspUser.equals("exit")) {
//				break;
			// => 입력을 받은 후에 해야하므로 순서가 위로 올라가야 함
			}

				
		
		total = win + same + lose;
		System.out.printf("%d전 %d승 %d무 %d패", total, win, same, lose);
		
		
		
		
		
		
		// 강사님 예시
		
//		Scanner sc = new Scanner(System.in);
//		String name, userChoice, comChoice;
//		String[] arr = {"가위", "바위", "보"};
//		
//		System.out.print("당신의 이름을 입력해주세요. : ");
//		name = sc.next();
//		
//		System.out.print("가위바위보 : ");
//		userChoice = sc.next();
//		if (userChoice.equals("exit")) {
//			System.out.println();
//			break;
//		}
//		
//		if(!(userChoice.equals("가위") || (userChoice.equals("바위") || userChoice.equals("보")))) {
//			System.out.println("잘못 입력하셨습니다.");
//			continue;
//		}
//		comChoice = arr[(int)(Math.random() * 3) + 1]; // 컴퓨터의 선택 받기
//		
//		if (userChoice.equals(comChoice)) {
//			System.out.println("비겼습니다.");
//		} else if (userChoise.equals("가위") && comChoice.equals("보")) ||
//		} else {
//		}
		

	}

}
