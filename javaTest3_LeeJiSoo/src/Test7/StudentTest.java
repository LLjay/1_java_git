package Test7;

public class StudentTest {

	public static void main(String[] args) {

//		Student[] students = {
//				new Student("홍길순", 25, 171, 81, 201401, "영어영문학"),
//				new Student("한사랑", 23, 183, 72, 201402, "건축학"),
//				new Student("임꺽정", 26, 175, 65, 201403, "체육학")
//		};
		Human[] arr = new Human[3];
		arr[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		arr[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		arr[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].toString());
//		}
		
		for (Human h : arr) {
			System.out.println(h.toString());
		}
		// 동적 바인딩 => 오버라이딩은 동적 바인딩이 적용
		// 실행 시 찾아가서 확인해줌 오버라이딩 되어 있으면 그걸로 찾아가서 실행해줌
		
	}

}
