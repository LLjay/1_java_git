package com.kh.Test2402072;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	
	public void print() {
		System.out.println(hMap);
	}
	
	public boolean addNewKind(Farm f, int amount) {
		if (!hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}
	
	public boolean removeKind(Farm f) {
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		if (hMap.containsKey(f) && hMap.get(f) > 0) {
			list.add(f);
			hMap.replace(f, hMap.get(f) - 1);
			return true;
		}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		for (int i = 0; i < list.size(); i++) {
			if (f.equals(list.get(i))) {
				list.remove(i);
				hMap.replace(f, hMap.get(f) + 1);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}

}
