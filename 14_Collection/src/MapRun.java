import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapRun {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		// 계층구조를 보면
		// List 계열, Set 계열의 클래스들은 Collection 구현한 클래스다.
		// => 객체를 추가하고자 할 때 공통적으로 add 메소드를 사용
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// => 객체를 추가하고자 할 때 put 메소드를 이용(key + value 세트로 담아야 합니다.)
		
		// 1. put(K key, V value) : Map에 키 벨류 세트로 추가 시켜주는 메소드
		
		hm.put("오감자", new Snack("바베큐맛", 1000));
		hm.put("칸초", new Snack("단맛", 500));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("크리스피롤", new Snack("단맛", 300));
		
		System.out.println(hm); // {키=벨류, 키=벨류...}
		// 저장되는 순서 유지 안 됨, value 값이 중복되어도 키 값이 중복되지 않는다면 잘 저장됨
		
		hm.put("오감자", new Snack("매운맛", 700));
		// 동일한 키 값으로 다시 추가하는 경우 value 값이 덮어씌워짐 (중복된 키 값 공존할 수 없음, 키 값이 식별자 역할을 함)
		System.out.println(hm);
		// index가 식별자 역할, 식별자가 같으므로 덮어씌워짐
		
		// 2. get(Object key) : V => 해당 키 값을 가지는 Value 값을 반환 시켜주는 메소드
		Snack s = (Snack)hm.get("오감자");
		// HashMap은 Object를 받아주고 객체가 들어간 순간 Object로 만들어졌을 것이므로 Snack으로 다운캐스팅 해줘야 함
		System.out.println(s);
		
		// 3. size() : 담겨있는 객체들의 객수 반환
		System.out.println(hm.size());
		
		// 4. replace(k key, v value) => 해당 키 값을 찾아서 다시 전달한 Value 값으로 수정 시켜주는 메소드
		hm.replace("칸초", new Snack("초코맛", 600));
		System.out.println(hm);
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 그 벨류 세트를 삭제 시켜주는 메소드
		hm.remove("칸초");
		System.out.println(hm);
		
		// for each => 컬렉션이 아니라서 안 됨
//		for (Object obj : hm) {}
		
		// ArrayList로 변경 가능? 안 됨
		// ArrayList list = new ArrayList(hm);
		// List, ArrayList는 컬렉션에서 온 것들이라 넘기는 게 가능한데 Map은 안 됨
		
		// Iterator 반복자 이용 가능? 안 됨
		// 바로 Iterator를 호출할 수 없음 => Iterator는 List 계열 또는 Set 계열에서만 가능하기 때문
		
		// Map -> Set -> ArrayList/Iterator 등
		// Map -> Set 변경해주는 메소드를 제공한다.
		
		// 1. keySet() 이용하는 방법
		Set keySet = hm.keySet();
		System.out.println(keySet);
		// => key들만 모아서 꺼내준 것 : properties 할 때와 비슷
		
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + " : " + value);
		}
		
		//==================================================
		// 2. entrySet() 이용하는 방법
		
		Set entrySet = hm.entrySet(); // key+value 세트의 집합
		
		Iterator itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next(); // Entry 객체 안에 key, value 값이 다 담겨 있다.
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		
		// Properties : Map 계열의 컬렉션 => key+value 세트로 저장
		
		Properties prop = new Properties();
		
		// Map 계열이기 때문에 put 메소드를 이용해서 key+value 세트로 담는다.
//		prop.put("오감자", new Snack("바베큐맛", 1000));
//		prop.put("칸초", new Snack("단맛", 500));
//		prop.put("새우깡", new Snack("짠맛", 500));
//		prop.put("크리스피롤", new Snack("단맛", 300));
		
		prop.setProperty("list", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서 유지 안 됨, key 값 중복 시 덮어씌움
		System.out.println(prop.get("크리스피롤"));
		
		// Properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력 받아올 때 사용함
		// 즉, Properties에서 제공하는 store(), load() 등의 메소드를 사용하기 위해서 사용
		
		Properties prop2 = new Properties();
		try {
			// store : Properties에 담겨있는 key-value 값들을 파일 형태로 저장할 때 사용하는 메소드
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			// ClassCastException
			// 내부적으로 store 실행 시 properties에 담겨있는 key+value 세트들을 String으로 형 변환해서 출력
		
			// storeToXML : Properties에 담겨있는 key-value 값들을 xml 파일 형태로 저장할 때 사용하는 메소드
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
		
			// load
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
			// loadFromXML : xml 파일로부터 정보를 읽어온다.
			prop2.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop2);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Properties 파일을 사용하는 이유
		 * 프로그램 상에 필요한 기본 환경설정(서버의 ip주소, dbms 경로...) 관련한 구문을 기술할 것이다.
		 * => 모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 수정하기 쉽다
		 * // 코드 상의 정보는 쉽지 않고 문서 상의 정보를 수정하게 할 수 있음
		 * // 배포하고 난 후에 다시 수정하려면 코드를 작성해서 재배포 해야함, 서비스는 중단 되면 안 됨
		 * 
		 * xml -> 프로그래밍 언어들 간에 있어서 호환성이 좋다.
		 */
	}
}
