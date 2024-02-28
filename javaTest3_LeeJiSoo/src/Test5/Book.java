package Test5;

public class Book {
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	@Override
	public String toString() {
		return this.title + ", " + this.author + ", " + this.publisher + ", " + this.price + "원, " + (int)(this.discountRate * 100) + "% 할인";
	}
	
	public String discount() {
		int discount = (int)(this.price - (this.price * this.discountRate));
		return "할인된 가격 : " + discount + "원";
	}
	
	
	
	
	
	
}
