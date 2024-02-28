import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	/*
	 * #컬렉션
	 * 자료구조 개념이 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
	 * 
	 * - 자료구조 : 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와주는 개념
	 * - 프레임워크 : 이미 만들어져 있는 틀(뼈대)
	 * 
	 * # 배열의 단점과 컬렉션의 장점
	 * > 배열의 단점
	 * 		1. 배열은 크기를 지정해야 한다. 한 번 크기를 지정하면 변경할 수 없다.
	 * 		   새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 값을 전부 복사하는 코드를 작성해야 한다.
	 * 		2. 배열 중간 위치에 값을 추가하거나 삭제하는 경우 값을 매번 땡겨주는 복잡한 코드를 직접 작성해야 한다.
	 * 		3. 한 공간에 한 타입의 데이터들만 저장이 가능하다.
	 * 
	 * > 컬렉션의 장점
	 * 		1. 크기를 지정해줄 필요가 없다. 만일 지정했다고 해도 더 많은 데이터들이 들어오면 알아서 사이즈를 늘려줘 크기 제약이 없다.
	 * 		2. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요가 없다.
	 * 		   단지 메소드 호출 만으로도 알아서 내부적으로 진행이 된다.
	 * 		3. 한 공간에 여러 타입의 데이터들을 저장할 수 있다. (단, 객체만 가능) // 이걸 받아주는 게 Object 클래스
	 * 		   한 타입만 담도록 제한할 수도 있음(제네릭 사용 가능)
	 * 
	 *  #방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용한다.
	 *   방대한 데이터들을 보관, 추가, 삭제 등등 이런 과정들이 빈번할 경우 컬렉션을 많이 사용한다.
	 * // 나라 정보나 수도 같은 것들은 웬만해서 변하지 않음, 이런 건 오히려 배열이 나음
	 * // 대부분은 움직이는 정보들임
	 */
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(3); // 크기 지정할 수도 있고 안 해도 괜찮다.
		
		// List? 인터페이스를 구현한 구현체, Array를 사용해 List를 사용할 수 있다
		
		System.out.println(list); // 비어있는 상태
		
		// E --> Element : 리스트에 담긴 데이터(요소)
		
		// 1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가 시켜주는 메소드
		list.add(new Music("HIT", "세븐틴"));
		list.add(new Music("Sorry Not Sorry", "ITZY"));
		list.add(new Music("Super Power", "신화"));
		list.add("끝");
		System.out.println(list); // list의 특징 : 순서 유지하면서 담김(0번 인덱스부터 차곡차곡)
		
		// 지정된 크기보다 더 많이 넣어도 오류가 발생하지 않는다. => 장점1 : 크기 제약이 없다.
		// 다양한 타입의 데이터를 담을 수 있음 => 장점 3 : 여러 타입 보관 가능

		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가 시켜주는 메소드
		list.add(1, new Music("Vermillion", "알칼로이드"));
		
		// 중간 위치에 데이터 추가 시 복잡한 알고리즘 직접 구현 안 함 => 장점2
		System.out.println(list);
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제 시켜주는 메소드
		list.remove(1);
		System.out.println(list);
		
		// 4. set(int index, E e) : 해당 인덱스 위치에 데이터를 새로 전달된 e로 수정 시켜주는 메소드
		list.set(0, new Music("Psyche's Butterfly", "Eden"));
		System.out.println(list);
		
		// 5. size() : 리스트의 사이즈 반환 시켜주는 메소드(즉, 몇 개의 데이터가 담겨 있는지)
		System.out.println("리스트의 사이즈 : " + list.size());

		// 6. get(int index) : 해당 인덱스 위치의 객체를 반환 시켜주는 메소드
		// arr[0] 이랑 같은 말
		Music m = (Music)list.get(0); // get 들어가보면 제네릭 E, 큰 알파벳 모르는거면 보통 object로 생각해도 됨
		// => list.get(0) 자체를 다운캐스팅 한 것, list를 다운캐스팅 한 것이 아님
		
		String s = (String)list.get(3);

		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)(list.get(1))).getTitle());
		
		// 7. subList(int index1, int index2) : List => 추출해서 새로운 List로 변환
		List sub = list.subList(0, 2); // 0부터 2 인덱스 전까지
		// List는 인터페이스, 그 인터페이스에 메소드가 있음
		System.out.println(sub);
		
		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가 시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		// 9. isEmpty() : boolean => 컬렉션이 비어 있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		// 10. clear() : 전부 비워주는 메소드
//		list.clear();
		System.out.println(list);
//		System.out.println(list.clear()); // 반환형 void
		
		System.out.println("===================================");
		
		// 반복문을 이용해서 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================================");

		// for each문 (향상된 for문)
		for (Object e : list) {
			System.out.println(e);
		}
	}

}
