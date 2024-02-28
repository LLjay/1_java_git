package Test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int price, quantity;
		
		System.out.print("상품명 입력 : ");
		name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
		
		System.out.print("수량 입력 : ");
		quantity = sc.nextInt();
		sc.nextLine();
		
		Product pro = new Product(name, price, quantity);
		
		System.out.println(pro.information());
		System.out.println("총 구매 가격 : " + (pro.getPrice() * pro.getQuantity()));
		// 총 구매 가격은 따로 써줌
		
	}

}
