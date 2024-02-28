/*
 * 클래스를 정의할 때 타입을 정해주지 않고 임의의 값으로 지정한다.
 * 해당 타입은 실제 객체가 생성될 때 정의된다.
 */
public class Box<T> {
	private T[] ob; // 뭘 담을지 => 객체 // 처음에 객체 생성 시 정해준 T 자리 객체로 객체 생성한 것, 그걸 담는 변수
	private int size; // 크기
	
	public Box() {
		super();
	}

//	public Box(T ob, int size) {
//		super();
//		this.ob = ob;
//		this.size = size;
//	}

	public T[] getOb() {
		return ob;
	}

	public void setOb(T[] ob) {
		this.ob = ob;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Box [ob=" + ob + ", size=" + size + "]";
	}
	
	

}
