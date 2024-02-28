package com.kh.Interface01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 다형성을 활용하여 Animal 타입의 배열을 만들어보자
		Animal[] animals = new Animal[5];
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println("추가할 동물을 선택해주세요.");
			System.out.println("1. 강아지 2. 고양이 : ");
			animals[i] = sc.nextInt() == 1 ? new Dog() : new Cat(); 
		}
//			int num = sc.nextInt();
//			
//			switch(num) {
//			case 1 : 
//				animals[i] = new Dog();
//				break;
//			case 2 : 
//				animals[i] = new Cat();
//				break;
//			}
			
			for (int i = 0; i < animals.length; i++) {
				if (animals[i] instanceof Baby) {
					System.out.println("잠들어 있습니다."); // 체크 용도로 사용하는 인터페이스, 여기에 이 인터페이스를 사용하고 있느냐는 확인 용도
				} else {
					animals[i].makeSound();
				}
			}
			
			
	}
}
