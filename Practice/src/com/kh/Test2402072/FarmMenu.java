package com.kh.Test2402072;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// View : 사용자에게 보여지는 시각적인 요소
public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		while(true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.adminMenu();
				break;
			case 2 : 
				this.customerMenu();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}

	public void adminMenu() {
		while(true) {
			System.out.println("***** 직원 메뉴 *****");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.addNewKind();
				break;
			case 2 : 
				this.removeKind();
				break;
			case 3 : 
				this.changeAmount();
				break;
			case 4 : 
				this.printFarm();
				break;
			case 9 : 
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			
			System.out.println("***** 고객 메뉴 *****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				this.buyFarm();
				break;
			case 2 : 
				this.removeFarm();
				break;
			case 3 : 
				this.printBuyFarm();
				break;
			case 9 : 
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
		
	}
	
	public void addNewKind() {
//		int num;
		int num = 0;
		
//		while(true) {
//			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
//			num = sc.nextInt();
//			sc.nextLine();
//			
//			if (num > 0 && num < 4) {
//				break;
//			}
//			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//		}
		
		// 강사님 예시
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("추가할 농산물 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("추가할 농산물 수량 : ");
			int count = sc.nextInt();
			sc.nextLine();
			
			Farm f = null;
			
			switch(num) {
			case 1 :
				f = new Fruit("과일", name);
				break;
			case 2 : 
				f = new Vegetable("채소", name);
				break;
			case 3 :
				f = new Nut("견과", name);
				break;
			}
			
			if (fc.addNewKind(f, count)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
		
//		System.out.print("추가할 농산물 이름 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("추가할 농산물 수량 : ");
//		int count = sc.nextInt();
//		sc.nextLine();
//		
//		Farm f = null;
//		
//		switch(num) {
//		case 1 :
//			f = new Fruit("과일", name);
//			break;
//		case 2 : 
//			f = new Vegetable("채소", name);
//			break;
//		case 3 :
//			f = new Nut("견과", name);
//			break;
//		}
//		
//		if (fc.addNewKind(f, count)) {
//			System.out.println("새 농산물이 추가되었습니다.");
//		} else {
//			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//		}

		
	}
	
	public void removeKind() {
		int num;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num > 0 && num < 4) {
				break;
			}
			
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		System.out.print("삭제할 농산물 이름 : ");
		String name = sc.nextLine();
		
		Farm f = null;
		
		switch(num) {
		case 1 :
			f = new Fruit("과일", name);
			break;
		case 2 : 
			f = new Vegetable("채소", name);
			break;
		case 3 :
			f = new Nut("견과", name);
			break;
		}
		
		if (fc.removeKind(f)) {
			System.out.println("농산물이 삭제되었습니다.");
		} else {
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void changeAmount() {
		int num;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num > 0 && num < 4) {
				break;
			}
			
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		System.out.print("수정할 농산물 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("수정할 농산물 수량 : ");
		int amount = sc.nextInt();
		
		Farm f = null;
		
		switch(num) {
		case 1 :
			f = new Fruit("과일", name);
			break;
		case 2 : 
			f = new Vegetable("채소", name);
			break;
		case 3 :
			f = new Nut("견과", name);
			break;
		}
		
		if (fc.changeAmount(f, amount)) {
			System.out.println("농산물 수량이 수정되었습니다.");
		} else {
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void printFarm() {
		Set<Farm> keySet = fc.printFarm().keySet();
//
//		for (Farm f : keySet) {
//			System.out.println(f.getKind() + ": " + f + "(" + fc.printFarm().get(f) + "개)");
//		} // f가 왜 종류는 안 나오고 이름만 나오는지 이해도 못했는데 쓰면 어케...
		
		for (Farm f : keySet) {
			System.out.println(f.toString() + "(" + fc.printFarm().get(f) + "개)");
		}
		// 강사님 예시
//		HashMap<Farm, Integer> farmList = fc.printFarm();
//		for (Farm f : farmList.keySet()) {
//			
//			if (f instanceof Fruit) {
//				Fruit tmp = (Fruit)f;
//				System.out.printf("%s: %s(%d개)\n", tmp.getKind(), tmp.getName(), farmList.get(f));
//			} else if (f instanceof Vegetable) {
//				Vegetable tmp = (Vegetable)f;
//				System.out.printf("%s: %s(%d개)\n", tmp.getKind(), tmp.getName(), farmList.get(f));
//			} else if (f instanceof Nut) {
//				Nut tmp = (Nut)f;
//				System.out.printf("%s: %s(%d개)\n", tmp.getKind(), tmp.getName(), farmList.get(f));
//			}
//
//		}
		
	}
	
	public void buyFarm() {
		int num;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num > 0 && num < 4) {
				break;
			}
			
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		System.out.print("구매할 농산물 이름 : ");
		String name = sc.nextLine();
		
		Farm f = null;
		
		switch(num) {
		case 1 :
			f = new Fruit("과일", name);
			break;
		case 2 : 
			f = new Vegetable("채소", name);
			break;
		case 3 :
			f = new Nut("견과", name);
			break;
		}
		
		if (fc.buyFarm(f)) {
			System.out.println("구매에 성공하였습니다.");
		} else {
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
		}
	}
	
	public void removeFarm() {
		int num;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if (num > 0 && num < 4) {
				break;
			}
			
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		System.out.print("구매 취소할 농산물 이름 : ");
		String name = sc.nextLine();
		
		Farm f = null;
		
		switch(num) {
		case 1 :
			f = new Fruit("과일", name);
			break;
		case 2 : 
			f = new Vegetable("채소", name);
			break;
		case 3 :
			f = new Nut("견과", name);
			break;
		}
		
		if (fc.removeFarm(f)) {
			System.out.println("구매 취소에 성공하였습니다.");
		} else {
			System.out.println("구매 목록이 존재하지 않습니다. 다시 입력해주세요.");
		}
		
	}
	
	public void printBuyFarm() {
//		Iterator it = fc.printBuyFarm().iterator();
//		
//		while(it.hasNext()) {
//			Farm f = (Farm)it.next();
//			System.out.println(f.getKind() + ": " + f);
//		}
		
		// 강사님 예시
		ArrayList<Farm> list = fc.printBuyFarm(); // 어차피 list가 ArrayList니까
		Iterator<Farm> it = list.iterator();
		while(it.hasNext()) {
			Farm f = it.next();
			if (f instanceof Fruit) {
				Fruit tmp = (Fruit)f;
				System.out.printf("%s: %s\n", tmp.getKind(), tmp.getName());
			} else if (f instanceof Vegetable) {
				Vegetable tmp = (Vegetable)f;
				System.out.printf("%s: %s\n", tmp.getKind(), tmp.getName());
			} else if (f instanceof Nut) {
				Nut tmp = (Nut)f;
				System.out.printf("%s: %s\n", tmp.getKind(), tmp.getName());
			}
		}
		
	}
	
	public void Test() {
		Set<Farm> keySet = fc.printFarm().keySet();
//		for(int i = 0; i < keySet.size(); i++) {
//			System.out.println();
//		}
		for (Farm f : keySet) {
			System.out.println(f.getKind() + ": " + f + "(" + fc.printFarm().get(f) + "개)");
		}
	}
}
