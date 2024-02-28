
public class Z_memo {
	
	// 연산 말고 쓰는 * 는 전부 라는 뜻
	// import java.util.*; => util 안의 모든 것을 가져오라는 뜻
	// 보통 쓰진 않음, 그 안에 안 쓰는 게 반복적으로 겹칠 수도 있기 때문에 쓸 것만 골라오기
	
	// ==================================================================
	
//	//	int age;
//	String type = " ";
//	
//	System.out.println("나이(정수만) : ");
//	age = sc.nextInt();
//	sc.nextLine();
//	
//	
//	if (age <= 13) {
//		type = "어린이";
//	} else if ((age > 13) && (age <=19)) {
//		type = "청소년";
////	} else {
////		type = "성인";
//	} else if (age > 19) {
//	 	 type = "성인";
//	 //이렇게 써도 되긴 하지만 연산이 한 번 더 들어가게 되므로 그냥 else가 낫다	
//	}
//	
//	System.out.println(age + "세는 " + type + "에 속합니다.");
//	
	/*
	 * 우리 생각에는 모든 수가 포함되어 있는 상황이지만
	 * 컴퓨터 입장에서는 모든 경우의 수가 아닐 수 있음
	 * 따라서 else를 이용해 나머지라고 표기를 해 모든 경우의 수를 포함 시키거나
	 * else if를 사용 시 세 조건이 모두 안 맞아 값이 출력되지 않는 경우를 생각해서
	 * 수를 초기화 시켜줘야 컴퓨터가 연산 가능
	 */
	// ==================================================================
	
	/*
	 * 반복문 : 제어문
	 * for문만 초기식이 존재
	 * 숫자가 올라가거나 내려가면 전부 다 증감식 (곱하기도 증감식)
	 * 반복문이니까 몇 번 실행할 것이냐를 정해줌, 그게 초기식 조건식 증감식
	 * 초기식 : 변수 하나를 초기화 시켜주는 식
	 * 반복문을 무한반복하지 않아야 하기 때문에 범위를 설정해주어야 함
	 * -> 시작 부분을 설정해주는 것이 초기식
	 * -> for문의 괄호 안의 값들은 바깥으로 나갈 수 없기 때문에 안에서 초기식을 정해주어야 함
	 * 조건식 : 탈출 조건
	 * -> 조건식이 참이면 실행문을 반복
	 * -> 조건식이 거짓이면 진행 끝내고 탈출
	 * 증감식
	 * -> 증감식이 있어야 숫자가 변하면서 탈출할 수 있음
	 * 초기화 -> 조건식 확인 -> 참이면 실행 -> 증감식 수행 -> 조건식 확인 -> 참이면 실행 ... -> 거짓이면 탈출
	 * 초기식은 생략해도 상관 없음
	 * ex)
	 * 
	 * int i = 10;
	 * for (i = 0; i < 5; i++) {
	 * System.out.println("반복문 실행 : " + i);
	 * }
	 * 초기화 안 하고 바깥에서 만들어도 상관은 없음
	 * for문은 길이가 제한된 조건에서 많이 사용
	 * (범위가 제한된) (어디부터 어디까지)
	 * 
	 * while
	 * -> 무언가 특별한 조건을 만족할 때까지 계속 반복해라 (ex) 클릭하는 경우)
	 * 
	 * while문 진입을 하려면 무조건 조건을 비교해야 함 -> 사용하는 변수가 초기화 되어 있어야 함
	 * -> 딱 한 번만 조건 필요없이 무조건 진입하게 해주는 게 do-while문
	 * 
	 * 반복문 안에 반복문은 반드시 중첩될 수 있음
	 * 제어문끼리도 반드시 중첩 가능
	 * 
	 * 
	 * 
	 * IOT
	 * 
	 * 포인터가 뭘까
	 * 
	 * 
	 */
	String str1 = "0";

	String str2 = "0";


	
	

}