
public class Run {

	public static void main(String[] args) {
		// 객체를 생성하는 시점에 어떤 타입을 사용할지
		// 타입 인자를 전달해준다.
//		Box aBox = new Box("사과", 0); // 이렇게 생성하는 게 아니라
//		Box<String> aBox = new Box<>("사과", 0);
		
//		Box<Integer> aBox = new Box(5, 0);
//		aBox.setOb(15);
		
		Box<Integer> aBox = new Box<>();
		
		Integer[] arr = new Integer[10];
		aBox.setOb(arr);
		
		aBox.getOb()[0] = 10;
		
//		ArrayList<String> arr = new ArrayList(); // 형태로도 만들 수 있음
//		arr1.set(0, 1); => 이 정도로 사용하는 영역을 더 많이 씀
		
		
		
	}
}
