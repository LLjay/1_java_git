package com.kh.Test240207;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
//		Set keySet = map.keySet();
//		Iterator it = keySet.iterator();
//		
//		while(it.hasNext()) {
//			if (it.next().equals(id)) {
//				return false;
//			}
//		}
//		map.put(id, m);
//		return true;
		
		// 내 예시
//		if (map.containsKey(id)) {
//			return false;
//		} else {
//			map.put(id, m);
//			return true;
//		}
		
		
		
		// 강사님 예시
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		return false;
		
//		if (map.get(id) == null)
	}
	
	public String logIn(String id, String password) {
//		// 내 예시
//		if (map.containsKey(id)) {
//			if (password.equals(map.get(id).getPassword())) {
//				return map.get(id).getName();
//			}
//		} else {
//			return null;
//		}
//		return null;
		
		// 강사님 예시
		Member m = map.get(id);
		// 제네릭 안써주면 Member m = (Member)map.get(id); 로 다운캐스팅
		if (m != null) {
			if (m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 내 예시
		//		if (map.containsKey(id)) {
//			if (oldPw.equals(map.get(id).getPassword())) {
//				map.replace(id, new Member(newPw, map.get(id).getName()));
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return false; // contain으로 확인하고 replace 해도 됨
		
		
		// 강사님 예시
		Member m = map.get(id);
		if (m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String password, String newName) {
		if (map.containsKey(id)) {
			if (password.equals(map.get(id).getPassword())) {
//				map.replace(id, new Member(map.get(id).getPassword(), newName));
				map.get(id).setName(newName);
			}
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap result = new TreeMap(new Comparator<String>);
		
		// 정렬 가능한 기준을 안 넣어줌
		// 하지만 정렬 될 것 => String은 compare를 구현하고 있음, 기본이 오름차순
		
		for(String id : map.keySet()) { // 제네릭 없는 경우 Object
			// [sdf, wer, lkj] => 여기서 꺼냄
			Member m = map.get(id);
			if (m.getName().equals(name)) {
				result.put(id, m.getName());
			}
		}
		return result;
	}

}
