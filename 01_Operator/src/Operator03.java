
public class Operator03 {

	/*
	 * 산술연산자 (이항 연산자 == 두 개의 값을 가지고 연산한다)
	 * + - * / %
	 * 
	 * * / % > + - (우선순위)
	 * 
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합되어 있는 형태
	 * 연산처리 속도가 빨라지므로 사용하는 것을 권장
	 * 
	 * += -= /+ *= %=
	 * 
	 * a = a + 3; => a += 3;
	 * a = a - 3; => a -= 3;
	 * a = a * 3; => a *= 3;
	 * a = a / 3; => a /= 3;
	 * a = a % 3; => a %= 3;
	 * 
	 * ex) int score;
	 * 	   score += 100;
	 */
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
//		int c = (++a) + b; // a=6, b=10, c=16
//		int d = c / a; // c=16, a=6, d=2
//		int e = c % a; // c=16, a=6, e=4
//		int f = e++; // e=4 (e-> 5)
//		int g = (--b) + (d--); // b=9, d=2, g=11 (d->1)
//		int h = 2;
//		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
//				// a=6(a->7), b=9, c=15, f=5, g=11(g->10), d=1, e=6, h=2
//				// 6 + 9 / (15 / 5) * (11 -1) % (6 + 2)
				// 12
		// f=4 -> e++를 실행하기 전 출력값이므로 f는 4이고 e가 5가 됨
		
		int c = (++a) + b; // a=6, b=10, c=16
		int d = c / a; // a=6, b=10, c=16, d=2
		int e = c % a; // a=6, b=10, c=16, d=2, e=4
		int f = e++; // a=6, b=10, c=16, d=2, e=4 (e-> 5), f=4
		int g = (--b) + (d--); // a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
		int h = 2; //a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
				// a=6(a->7), b=9, c=15, f=5, g=11(g->10), d=1, e=6, h=2
				// 6 + 9 / (15 / 5) * (11 -1) % (6 + 2)
				// 12
		
		// 변수 안에는 값이 할당되고 덮어씌워지고 수정됨, 누적
		
		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b); // 0.2
//		System.out.println(a % b); // 딱 떨어지기 때문에 5가 그대로 나옴
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
		
	}
}
