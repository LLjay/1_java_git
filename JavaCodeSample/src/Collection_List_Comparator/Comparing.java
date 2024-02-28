package Collection_List_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Comparing {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// List 클래스에 Integer 제네릭을 갖는 참조변수 list 생성
		// 자식 객체인 ArrayList로 똑같이 Integer 제네릭 선언
		
		Random random = new Random();
		// Math 클래스를 사용하지 않는 Random 클래스의 random 참조변수 생성
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(random.nextInt(100) + 1));
		} // 10개의 랜덤한 수를 골라내기 위해 Random 클래스의 random 메소드로
		// 1~100 범위까지의 수 중 하나를 반환, 반환값을 int형으로 캐스팅
		// 랜덤하게 나온 수를 list에 추가, 10번 반복
		// => list에 10개의 랜덤한 수가 쌓였을 것
		
		System.out.println("정렬 전 : ");
		display(list);
		
		System.out.println();
		Collections.sort(list, new Decending());
		// Collections 클래스를 이용해 sort 메소드로 정렬
		// => Collections.sort(list) 만 하면 기본적으로 오름차순 정렬
		// Comparator 인터페이스를 구현한 객체 Decending을 기준으로 넣고 정렬
		
		System.out.println("정렬 후 : ");
		display(list);
		
		
	}
	
	public static void display(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
	} // Integer 제네릭을 갖는 List 클래스 형으로 참조 가능한 객체를 인자로 받아
	  // for문으로 list 안의 데이터를 하나씩 꺼내놓는 메소드

}