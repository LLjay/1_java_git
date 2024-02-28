package com.kh.Test2402072;

import java.util.ArrayList;
import java.util.HashMap;

// Controller : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할
public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	// HashMap 사용한 이유 : key는 중복되면 안 되지만 value는 중복이 가능해야 하기 때문에(수량)
	
	public void print() {
		System.out.println(hMap);
	}
	
	public boolean addNewKind(Farm f, int amount) {
//		if (!hMap.containsKey(f)) {
//			hMap.put(f, amount);
//			return true;
//		}
//		return false;
		
		// 강사님 예시
		if (hMap.containsKey(f)) {
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}
	}
	
	public boolean removeKind(Farm f) {
//		if (hMap.containsKey(f)) {
//			hMap.remove(f);
//			return true;
//		}
//		return false;
		
		// 강사님 예시
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		return this.hMap;
	}
	
	public boolean buyFarm(Farm f) {
//		if (hMap.containsKey(f) && hMap.get(f) > 0) {
//			list.add(f);
//			hMap.replace(f, hMap.get(f) - 1);
//			return true;
//		}
//		return false;
		
		// 강사님 예시
		Integer amount = hMap.get(f);
		if (amount != null && amount > 0) { // hMap.containsKey(f)나 amount != null 이나 같은 말이군
			list.add(f);
			hMap.replace(f, amount - 1); // amount--; 로 해도 된다?
			return true;
		} else {
			return false;
		}
		// 이상하게 List로 가져오는 것들은 다시 안 넣어주는데 Set이나 Map은 다시 넣어줌
	}
	
	public boolean removeFarm(Farm f) {
//		for (int i = 0; i < list.size(); i++) {
//			if (f.equals(list.get(i))) {
//				list.remove(i);
//				hMap.replace(f, hMap.get(f) + 1);
//				return true;
//			}
//		}
//		return false;
		
		// 강사님 예시
		if (list.contains(f)) {
			list.remove(f);
			Integer amount = hMap.get(f);
//			amount++; // 해도 됨
			hMap.replace(f, amount + 1);
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return this.list;
	}

}
