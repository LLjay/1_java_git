package Test5;

public class BookArrayTest {

	public static void main(String[] args) {

//		Book[] bArray = new Book[3];
//		bArray = {"자바의 정석", "남궁성", 30000, "도우출판", 0.1},
		
		Book[] bArray = {
			new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1),
			new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1),
			new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1)};

//		for (int i = 0; i < bArray.length; i++) {
//			System.out.println(bArray[i].toString());
//			System.out.println(bArray[i].discount());
//		}
		
		for (int i = 0; i < bArray.length; i++) {
			Book b = bArray[i];
			System.out.printf("%s, %s, %s, %d원, %d%% 할인", 
					b.getTitle(), b.getAuthor(), b.getPublisher(), 
					b.getPrice(), (int)(b.getDiscountRate()*100));
			System.out.println("할인된 가격 : " + (b.getPrice() - (int)(b.getPrice() * b.getDiscountRate())));
		}

		// 당연히 똑같이 하면 좋지만 어느 정도 내가 유들리 있게 만들면 됨, 결과만 똑같으면 됨
		

	}
}
