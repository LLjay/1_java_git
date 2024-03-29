package Test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListTest {
	/*
	 * ArrayList는 java에서 제공하는 동적 배열
	 * 배열과 유사하게 요소들을 순서대로 저장하여 인덱스를 통해 접근해 사용할 수 있다.
	 * 또한 제네릭을 통해서 해당 리스트에 저장하는 타입을 지정할 수 있다.
	 */
	public static void main(String[] args) {
		
		// ArrayList => 배열처럼 사용하는 거구나 -> 제네릭 사용 가능하구나
		// 
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for (int i = 0; i < 10; i++) {
//			list.add((int)(Math.random() * 100 + 1));
//		}
//		
//		display();
//		list.sort(list, Comparator.reverseOrder());
		
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();	
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(random.nextInt(100) + 1));
		}

		System.out.println("정렬 전 : ");
		display(list);
		System.out.println();
		Collections.sort(list, new Decending());
		
		System.out.print("정렬 후 : ");
		display(list);
		
	}
	
	public static void display(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
