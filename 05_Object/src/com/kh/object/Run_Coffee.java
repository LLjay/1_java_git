package com.kh.object;

import java.util.Scanner;

public class Run_Coffee {
	
	public static void main(String[] args) {
		
		// 키오스크
		
		Coffee hotAmericano = new Coffee("핫 아메리카노", 3000, 0, 'H');
		Coffee iceAmericano = new Coffee("아이스 아메리카노", 3500, 'I');
		Coffee hotLatte = new Coffee("핫 카페라떼", 3500, 0, 'H');
		Coffee iceLatte = new Coffee("아이스 카페라떼", 4000, 0, 'I');
		Coffee chocoCake = new Coffee("초코 케익", 6000, 0);
		Coffee cheeseCake = new Coffee("치즈 케익", 5800, 0);
		// 객체 생성
		
//		System.out.println(hotAmericano.getPrice() + hotAmericano.getPrice());
//		int total = hotAmericano.getPrice() + hotAmericano.getPrice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 번호를 입력하세요. : ");
		int menuNum = sc.nextInt();
		
		Coffee menu;
		
		switch(menuNum) {
		case 1 : 
			menu = hotAmericano;
			break;
		case 2 :
			menu = iceAmericano;
			break;
		case 3 :
			menu = hotLatte;
			break;
		case 4 :
			menu = iceLatte;
			break;
		case 5 :
			menu = chocoCake;
			break;
		case 6 :
			menu = cheeseCake;
			break;
		}
		
		System.out.println(menu.getCfName());

		System.out.print("수량을 입력하세요. : ");
		int yourCount = sc.nextInt();

		int totalPrice = menu.onePrice(yourCount);
		System.out.println(totalPrice + "원");
		
	}

}
