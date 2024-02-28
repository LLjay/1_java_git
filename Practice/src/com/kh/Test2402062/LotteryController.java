package com.kh.Test2402062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public HashSet printLottery() {
		return lottery;
	}
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
		// add 자체 결과가 논리값으로 나온다, 동일 객체면 false
	}

	public boolean deleteObject(Lottery l) {
		boolean isTrue = lottery.remove(l);
		
		if (isTrue == true && win != null) {
			win.remove(l);
		}
			
		return isTrue;
	}
	
	public HashSet winObject() {
		if (lottery.size() < 4) {
			return null;
		}
		ArrayList list = new ArrayList();
		list.addAll(lottery);
		
		while(win.size() != 4) {
			if (list.size() >= 4) {
				int winner = (int)(Math.random() * (list.size()));
				win.add(list.get(winner));
			} else {
				System.out.println("추첨 대상이 부족합니다.");
			}
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		
		return null;
	}
	
	public boolean searchWinner(Lottery l) {
		return true;
	}
}
