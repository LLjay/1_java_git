package Collection_List_Comparator;

import java.util.Comparator;
//Comparator 인터페이스
//정렬 기준을 만들어줌 + compare 추상 메소드를 가지는 인터페이스
//compare()
//> 비교 대상 2개를 비교
//>> 오름차순 : 전자가 크면 양수, 후자가 크면 음수, 둘이 같다면 0을 반환
//>> 내림차순 : 전자가 크면 음수, 후자가 크면 양수, 둘이 같다면 0을 반환
public class Decending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); >>> 내림차순
		return o1 > o2 ? 1 : (o1 == o2 ? 0 : -1);
	} 

}
