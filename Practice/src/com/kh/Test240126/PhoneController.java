package com.kh.Test240126;

public class PhoneController {
	
	private String[] result;
	
	public PhoneController() {
		result = new String[2];
	}
	
	public String[] method() {
		int count = 0;
		Phone[] pho = {
			new GalaxyNote9(), 
			new V40() };
		
		for (int i = 0; i < pho.length; i++) {
			if (pho[i] instanceof GalaxyNote9) {
				result[count++] = ((GalaxyNote9)pho[i]).printInformation();
			} else if (pho[i] instanceof V40) {
				result[count++] = ((V40)pho[i]).printInformation();
			} // 갤럭시랑 브이로 해줘도 됨, 이게 더 맞음
		}
		
		String[] arr = new String[2];
		for (count = 0; count < arr.length; count++) {
			arr[count] = result[count];
		}
		
		return arr;
		
		// 강사님 예시
//		Phone[] phones = new Phone[2];
//		
//		phones[0] = new GalaxyNote9();
//		phones[1] = new V40();
//		
//		result = new String[phones.length];
//		
//		for (int i = 0; i < phones.length; i++) {
//			result[i] = ((SmartPhone)phones[i]).printInformation();
//		}
//		return result;
	}
	

}
