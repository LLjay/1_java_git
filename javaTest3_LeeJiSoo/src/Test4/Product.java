package Test4;

public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	public Product() {
		super();
	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String information() {
//		int totalPrice = getPrice() * getQuantity();
//		// this 꼭 명시적으로 써줄 것
//		// 총 구매 가격은 원래 Product에 포함되어 있지 않은 항목이므로 기능을 분리해줄 것
//		return "상품명 : " + this.getName() + "\n가격 : " + this.getPrice() + " 원\n수량 : "
//				+ this.getQuantity() + " 개\n총 구매 가격 : " + this.totalPrice + " 원";
	
		return "상품명 : " + this.getName() + "\n가격 : " + this.getPrice() + " 원\n수량 : "
				+ this.getQuantity() + " 개";
	
	}
	
	
	
}
