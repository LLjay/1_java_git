package com.kh.test240124;

import java.util.Scanner;

public class PointMenu {
//	
	// 내 예시
//	Scanner sc;
//	CircleController cc = new CircleController();
//	RectangleController rc = new RectangleController();
//	
//	public PointMenu(Scanner sc, CircleController cc, RectangleController rc) {
//		sc = new Scanner(System.in);
//		cc = new CircleController();
//		rc = new RectangleController();
//	}
//	
//	public void mainMenu() {
//		
//		boolean tobeContinued = true;
//		
//		while(tobeContinued) {
//			System.out.println("=====메인 메뉴=====");
//			System.out.println("1. 원");
//			System.out.println("2. 사각형");
//			System.out.println("9. 끝내기");
//			System.out.print("메뉴 번호 : ");
//			
//			int num = sc.nextInt();
//			sc.nextLine();
//			
//			switch(num) {
//			case 1 : 
//				cc.circleMenu();
//				break;
//			case 2 : 
//				rectangleMenu();
//				break;
//			case 9 :
//				System.out.println("종료합니다.");
//				tobeContinued = false;
//			default :
//				System.out.println("다시 입력하세요.");
//				break;
//			}
//		}
//	}
//	
//	public void circleMenu() {
//		System.out.println("=====원 메뉴=====");
//		System.out.println("1. 원 둘레");
//		System.out.println("2. 원 넓이");
//		System.out.println("9. 메인으로");
//		System.out.print("메뉴 번호 : ");
//		
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		switch(num) {
//		case 1 : 
//			CcalcCircum();
//			break;
//		case 2 : 
//			calcCircleArea();
//			break;
//		case 9 :
//			break;
//		default :
//			System.out.println("잘못 입력했습니다.");
//			break;
//		}
//	}
//	
//	public void calcCircum()
	
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("=====메인 메뉴=====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
	//		sc.nextLine();
			
			switch(menuNum) {
			case 1 : 
				circleMenu();
				break;
			case 2 : 
				rectangleMenu();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void circleMenu() {
		
		while(true) {
			System.out.println("=====원 메뉴=====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : 
				calcCircum();
				break;
			case 2 : 
				calcCircleArea();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return; // 이 함수가 끝나는 거니까 전체가 끝나는거 아니고 이 메소드만 종료
				// 메인 메뉴 메소드 호출해서 간다? => 아직 메인 메뉴 스위치 문 안임
				// break; 사용하면 switch문을 탈출해서 다시 원 메뉴로 돌아감
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
	}
	
	
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void rectangleMenu() {
		
		while(true) {
			System.out.println("=====사각형 메뉴=====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : 
				calcPerimeter();
				break;
			case 2 : 
				calcRectArea();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return; // 이 함수가 끝나는 거니까 전체가 끝나는거 아니고 이 메소드만 종료
				// 메인 메뉴 메소드 호출해서 간다? => 아직 메인 메뉴 스위치 문 안임
				// break; 사용하면 switch문을 탈출해서 다시 원 메뉴로 돌아감
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
	}
	
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("너비 : ");
		int width = sc.nextInt();
		
		System.out.println("길이 : ");
		int height = sc.nextInt();
		sc.nextLine();
		
		System.out.println(rc.calcPerimeter(x, y, width, height));
	}
	
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("너비 : ");
		int width = sc.nextInt();
		
		System.out.println("길이 : ");
		int height = sc.nextInt();
		sc.nextLine();
		
		System.out.println(rc.calcArea(x, y, width, height));
	}
}
