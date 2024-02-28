package com.kh.Test240205;

public class Run {
	public static void main(String[] args) {
		Human[] aGroup = new Human[5];
		
		aGroup[0] = new Human("전은지", 29);
		aGroup[1] = new Human("윤현지", 27);
		aGroup[2] = new Human("서지안", 27);
		aGroup[3] = new Human("이해솔", 30);
		aGroup[4] = new Human("김은선", 32);
		// 한 명을 더 추가하고 싶다면 배열을 새로 만들어야 함
		
		Human[] tmp = new Human[6];
		for (int i = 0; i < aGroup.length; i++) {
			tmp[i] = aGroup[i];
		}
		
		tmp[5] = new Human("송은지", 34);
		
		aGroup = tmp;
		
		for(Human h : aGroup) {
			System.out.println(h);
		}
		
		// 중간에 있는 2번째 인덱스값 삭제
		aGroup[2] = null;
		
		for(int i = 2; i < 5; i++) {
			aGroup[i] = aGroup[i + 1];
		}
		aGroup[5] = null;
		
		
	}
}
