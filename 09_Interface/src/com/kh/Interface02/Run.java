package com.kh.Interface02;

public class Run {
	/*
	 * #인터페이스
	 * - 추상 메소드 + 상수 필드로만 이루어진 클래스
	 * - 추상 메소드로 이루어져 있기 때문에 객체를 직접 생성할 수 없다.
	 * - 참조변수로 사용은 가능하다.
	 * 
	 * #추상 메소드
	 * - 미완성된 메소드로 몸통부({} 중괄호 블럭)가 구현되어 있지 않은 메소드
	 * - 무조건 오버라이딩 후 호출이 가능하다.
	 */
	
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(3);
		shapes[1] = new Rectangle(2, 5);
		/*
		 * 배열 또는 컬렉션에서 사용
		 * 처음부터 끝까지 무조건 모두 탐색
		 * 해당 배열에 인덱스 값이 하나씩 왼쪽에 있는 값에 대입되어 반복문 진행
		 */
		
//		for (int i = 0; i < shapes.length; i++) {
		for (Shape shape : shapes) {
			System.out.println("도형의 넓이 : " + shape.calculateArea());
		} // 얕은 복사
		
		for (int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i];
			System.out.println("도형의 넓이 : " + shape.calculateArea());
		}
	}

}
