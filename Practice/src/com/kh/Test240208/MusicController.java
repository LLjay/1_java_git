package com.kh.Test240208;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
	List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		if (!list.contains(music)) {
			list.add(music);
			return 1;
		} else {
			return 0;
		}
	}
	
	public int addAtZero(Music music) {
		if (!list.contains(music)) {
			list.add(0, music);
			return 1;
		} else {
			return 0;
		}
	}

	public List printAll() {
		return this.list;
	}
	
	public Music searchMusic(String title) {
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getTitle();
			if (str.equals(title)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getTitle();
			if (str.equals(title)) {
				Music m = list.get(i);
				System.out.println(m);
				list.remove(i);
				return m;
			} 
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getTitle();
			if (str.equals(title)) {
				Music m = list.get(i);
				list.set(i, music);
				return m;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		AscTitle ac = new AscTitle();
		list.sort(ac);
		return 0;
	}
	
	public int descSinger() {
		return 0;
	}
}
