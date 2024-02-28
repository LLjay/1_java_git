package Test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("수량 : ");
		int qty = sc.nextInt();
		
		Product pd = new Product(name, price, qty);
		
		System.out.println(pd.information());
		System.out.println("총 구매 가격 : " + pd.getPrice()*pd.getQuantity() + "원");
	}

}
