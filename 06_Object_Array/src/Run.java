
public class Run {

	public static void main(String[] args) {

		/*
		 * 객체 배열
		 * - 객체를 저장하는 배열로 일반적인 배열과 다르게
		 * 배열의 각 요소가 참조변수로 이루어져 있다. -> 사용을 위해서는 각 요소마다 객체 생성이 필요하다.
		 * 
		 * [표현법]
		 * 클래스명[] 배열명 = new 클래스명[크기]; -> 크기가 n개인 참조변수 배열 생성
		 * 배열명[index]= new 클래스명(); -> 각 인덱스 객체 생성
		 */

			Human[] humanArr = new Human[3]; // -> [ㅇ,ㅇ,ㅇ]
			humanArr[0] = new Human("최지원", 21, 'i');
			humanArr[1] = new Human("이지수", 27, 'j');
			humanArr[2] = new Human("전은지", 30, 'k');
			
			for (int i = 0; i < humanArr.length; i++) {
				humanArr[i].print(); // 배열 안에 참조변수가 생겼는데 null로 초기화 되었기 때문에
			}
		
			Human[] humanArr2 = {new Human("최지원", 21, 'i'),
					new Human("이지수", 27, 'j'),
					new Human("전은지", 30, 'k')};
			}
		
		
	}

}
