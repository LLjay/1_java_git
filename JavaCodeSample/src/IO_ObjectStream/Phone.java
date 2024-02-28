package IO_ObjectStream;

import java.io.Serializable;

public class Phone implements Serializable{
	// Serializable 인터페이스를 가져와 컴퓨터에게 이 클래스는 직렬화를 허용할 것이라고 체크하게 해줌
	// => 인터페이스가 체킹 용도로 쓰인 경우
	
	private String name;
	private int price;
	
	public Phone() {
		super();
	}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
