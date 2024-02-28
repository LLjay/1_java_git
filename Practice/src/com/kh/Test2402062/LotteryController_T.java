package com.kh.Test2402062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController_T {
	
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public HashSet printLottery() {
		return lottery;
	}
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean isTrue = lottery.remove(l);
		
		if (isTrue && win != null) { // 내가 코드 짰으니까 win이 null일 수는 없는데 외부의 영향 안 받을 수 있게 검사해주면 좋음
			win.remove(l);
		}
			
		return isTrue;
	}
	
	public HashSet<Lottery> winObject() {
		if (lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		
		while(win.size() < 4) {
			int rand = (int)(Math.random()*list.size());
			win.add(list.get(rand));
		}
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> sortedWinSet = new TreeSet<>(new SortedLottery());
		// => sortedLottery를 기준으로 삼게 됨
		sortedWinSet.addAll(win); // => 이걸 HashSet으로 하면 정렬할 수 없기 때문에 오류가 남
		
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}