package com.light.TestLight;

import java.util.ArrayList;

public class LightController {
	
	Member mem = null;
	ArrayList<LightDevice> lList = new ArrayList<>();
	static int count = 0;
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public ArrayList<LightDevice> lightList() {
		return this.lList;
	}

	public LightDevice registConvention (String product, String manufacture, int power, float weight, int totalQty) {
		lList.add(new Convention(product, manufacture, power, weight, totalQty));
		return lList.get((lList.size()-1));
	}
	
	public LightDevice registSpot (String product, String manufacture, int power, float weight, int totalQty, String powerSource, int xlr, int chNum, int goboNum) {
		lList.add(new Spot(product, manufacture, power, weight, totalQty, powerSource, xlr, chNum, goboNum));
		return lList.get((lList.size()-1)); 
	}
	
	public LightDevice registWash (String product, String manufacture, int power, float weight, int totalQty, String powerSource, int xlr, int chNum, boolean flower) {
		lList.add(new Wash(product, manufacture, power, weight, totalQty, powerSource, xlr, chNum, flower));
		return lList.get((lList.size()-1)); 
	}
	
	public ArrayList<LightDevice> searchLight (String product) {
		
		ArrayList<LightDevice> aList = new ArrayList<>();
		
		for (int i = 0; i < lList.size(); i++) {
			lList.get(i).getProduct().contains(product);
			aList.add(lList.get(i));
		}
		
		return aList;
	}
	
	public void changeTotalQty(LightDevice list, int editNum) {
		
		int i;
		
		for (i = 0; i < lList.size(); i++) {
			if (lList.get(i).equals(list)) {
				break;
			}
		}
		
		lList.get(i).setTotalQty(editNum);
	}

	public void deleteDevice(LightDevice list, int lNum) {
		
		int i;
		
		for (i = 0; i < lList.size(); i++) {
			if (lList.get(i).equals(list)) {
				break;
			}
		}
		
		lList.remove(i);
	}

}
