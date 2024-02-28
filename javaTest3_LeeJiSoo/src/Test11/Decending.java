package Test11;

import java.util.Comparator;
//public class Decending implements Comparator {
public class Decending implements Comparator<Integer> {
	// 제네릭은 접근 제한, 기존에 받아줄 수 있던 매개변수가 Object더라도 오버라이딩 했기 때문에 제네릭 접근 제한에 따라 제한해주는 것
//	@Override
//	public int compare(Object o1, Object o2) {
//		return 0;
//	}
//	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1);
	}
	

}
