package com.kh.api01;

public class Example {

	public static void main(String[] args) {
		String str1 = "Wind Blow";
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		String str2 = str1.concat(" and comes up");
		System.out.println(str2);
		
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(5, 9));
		
		System.out.println(str1.replace('w', 'r'));
		
		String light = " Sola Spot Pro CMY    ";
		System.out.println(light.trim());
		
		char[] arr = str1.toCharArray();
		for (char a : arr) {
			System.out.println(a);
		}
		System.out.println(String.valueOf(arr));
		
		str1.replaceAll(str1, light);
		
	}

}
