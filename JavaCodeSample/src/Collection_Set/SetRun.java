package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(new Member("전은지", 30, "solti"));
		hs.add(new Member("윤현지", 27, "쥐"));
		hs.add(new Member("서지안", 27, "밍"));
		hs.add(new Member("전은지", 30, "solti"));
		
		System.out.println(hs);
		// => 전은지는 하나만 프린트 됨
		
		// HashSet에 담긴 모든 객체에 순차적으로 접근
		// 1. for each문 사용
		
		for (Object o : hs) {
			System.out.println(o);
		}
		
		// 2. ArrayList에 담아 접근
		// 2-1) ArrayList 생성 후 addAll 메소드 사용
		
		ArrayList list1 = new ArrayList();
		list1.addAll(hs);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// 2-2) ArrayList와 함께 생성하며 대입
		ArrayList list2 = new ArrayList(hs);
		
		for (Object o : list2) {
			System.out.println(o);
		}
		
		// 3. Iterator 반복자 이용해 순차적으로 접근
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		} // 왜 제네릭 하면 오류나지?
	}

}
