package com.kh.Test2402062;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {
		int num = o1.getName().compareTo(o2.getName()); // => 음수 0 양수로 결과값
		
		if (num == 0) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		// => 정렬 기준, sort 안에 이 기준을 넣어주면 됨
		/*
		 * 0보다 작은 값 : o1이 o2보다 작을 때
		 * 0 : 같을 때
		 * 0보다 큰 값(양수) : o1이 o2보다 클 때
		 * => 내림차순이면 o2이 o1보다 작을 때라고 하면 됨
		 */
		// return 안에 넣으면 정렬됨
		return 0;
	}// 굳이 이렇게 안 해도 되긴 함
	
//	public int compare(Object o1, Object o2) { // comparator 상속받아야 함 => 정렬하고 싶을 때 기준을 정해주는 것
//		return 0;
//	}

}
