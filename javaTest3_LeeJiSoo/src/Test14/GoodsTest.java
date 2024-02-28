package Test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {
	public static void main(String[] args) {
		
		Goods g;
		String name;
		int price, quantity;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("상품명 : ");
			name = br.readLine();
			
			System.out.print("가격 : ");
			price = Integer.parseInt(br.readLine());
			
			System.out.print("수량 : ");
			quantity = Integer.parseInt(br.readLine());
			// Integer i1 = new Integer(br.readLine()); 
			// price = i1; => 은 오류 났음 java.lang.NumberFormatException
			
			g = new Goods(name, price, quantity);
			
			int totalPrice = g.getPrice() * g.getQuantity();
			
			System.out.println(g.toString());
			System.out.println("총 구매 가격 : " + totalPrice + " 원");
			// 왜 다 이 안에서 해결하라고 하지? 왜 범위에 없다고 뜨지?
		} catch (IOException e) {
			e.printStackTrace();
		}


		
		
	}

}
