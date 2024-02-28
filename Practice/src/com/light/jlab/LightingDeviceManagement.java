package com.light.jlab;

import java.util.Scanner;

public class LightingDeviceManagement {

	Scanner sc;
	LightingDevice[] lightingArr;
	
	public LightingDeviceManagement () {
		this.sc = new Scanner(System.in);
		lightingArr = new LightingDevice[100];
	}
	
	public void managementProgram() {
		
		boolean tobeContinued = true;
		
		while(tobeContinued) {
			System.out.println("=====조명기 반입반출 관리 프로그램=====");
			System.out.println("1. 조명기 등록");
			System.out.println("2. 조명기 수량 관리");
			System.out.println("3. 조명기 검색");
			System.out.println("8. 총수량 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 : 
				lightingRegist();
				break;
			case 2 : 
				lightingEAChange();
				break;
			case 3 : 
				lightingSearch();
				break;
			case 8 : 
				lightingTotal();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				tobeContinued = false;
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	
	public void lightingRegist() {
		
		String lightName, manufacture, purpose;
		int totalEA;
		
		System.out.print("장비명 : ");
		lightName = sc.nextLine();
		
		System.out.print("제조사 : ");
		manufacture = sc.nextLine();
		
		System.out.print("종류(spot, wash, beam etc.) : ");
		purpose = sc.nextLine();
		
		System.out.print("수량 : ");
		totalEA = sc.nextInt();
		sc.nextLine();
		
		int i = 0;
		while(lightingArr[i] != null) { // 0번째는 처음부터 null 값이니까 아예 while문에 들어가질 않는데
			if(lightingArr[++i] == null) { // 1번째부터는 while문에 들어간 후 증감 조건이 없었어서 null값인 인덱스값에 도달하질 못함
				break;
			}
		}
		
		lightingArr[i] = new LightingDevice(lightName, manufacture, purpose, totalEA);
		System.out.println("등록 완료 : " + lightingArr[i].toString());

	}
	
	public void lightingEAChange() {
		
		String lightingName;
		System.out.print("수량 수정할 장비명 입력 :");
		lightingName = sc.nextLine();
		
		for (int i = 0; lightingArr[i] != null; i++) { // lightingArr[i] == null 까지가 아님. 여태까지의 for문은 i의 최종값을 포함하지 않았는데(<, >) 이건 포함임
			if (lightingArr[i].getLightName().equals(lightingName)) {
				System.out.print("수량 입력 : ");
				int num = sc.nextInt();
				
				lightingArr[i].setTotalEA(num);
				
				System.out.println("수정 완료 : " + lightingArr[i].toString());
				break;
			}
		}
		System.out.println("입력한 이름과 맞는 장비가 없습니다.");
	}
	
	public void lightingSearch() {
		
		System.out.print("장비명 입력 : ");
		String lightingName = sc.nextLine();
	
		// for문으로 했을 때
//		for (int i = 0; lightingArr[i] != null; i++) {
//			if (lightingName.equals(lightingArr[i].getLightName())) {
//				System.out.println(lightingArr[i].toString());
//				break;
//			}
//		}
//		System.out.println("없는 장비명입니다.");
		
		// while문으로 했을 때
		int i = 0;
		while(lightingArr[i] != null) {
			if (lightingName.equals(lightingArr[i].getLightName())) {
				System.out.println(lightingArr[i].toString());
				break;
			}
			i++;
		}
		
		System.out.println("없는 장비명입니다.");
	}

	public void lightingTotal() {
		for (int i = 0; lightingArr[i] != null; i++) {
			System.out.println(lightingArr[i].toString());
		}
	}
}
