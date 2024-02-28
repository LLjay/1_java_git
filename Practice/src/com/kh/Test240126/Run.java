package com.kh.Test240126;

public class Run {

	public static void main(String[] args) {

		PhoneController pc = new PhoneController();
		
		String[] print = pc.method();
		
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
		
	}

}
