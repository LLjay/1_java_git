import java.util.Scanner;

public class Casting03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		//다음과 같은 값이 나오도록 코드를 작성하세요.
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 % iNum2);
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println(dNum * iNum2);
		System.out.println(iNum1 + 0.0);
		System.out.println((float)iNum1);
		
		System.out.println(dNum);
		System.out.println((double)iNum1 / (double)iNum2);
		System.out.println((double)iNum1 / iNum2); // 자동 형변환이라 하나만 바꿔도 됨
		// 자동형변환은 서로 다른 자료형이 만났을 때 이루어지는 것
		// 작은 수에서 큰 수로 가는 변환이더라도 자동형변환이 이루어지는 조건이 아니라면 내가 스스로 명시적 형변환 해야함
		
		System.out.println((int)fNum);
		System.out.println((int)(iNum1 / fNum));
		System.out.println(iNum1 / (int)fNum);
		
		System.out.println(iNum1 / fNum);
		System.out.println((double)iNum1 / (double)fNum);
		System.out.println((double)iNum1 / fNum);
		
		System.out.println(ch);
		System.out.println(ch + 0);
		System.out.println((int)ch);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1));
		
		System.out.println((double)iNum1 / (double)fNum);
		System.out.println((double)(iNum1 / fNum));
		System.out.println((double)iNum1 / fNum + 1.0);
		//float형의 자릿값은 3.333333에서 끝난 상태
		// => double 자릿값을 억지로 만들어내려고 하다보니 컴퓨터가 알아서 인식해준 쓰레기값이 밀고 들어옴
		// 컴퓨터는 원래 0과 1밖에 인식하지 못하고 실수형은 억지로 계산하게끔 하는 것
		// 이렇게 컴퓨터가 알아서 넣어주는 값은 근사치로만 존재하고 정확하지 못함
		// 부동소수점? 으로 표현
		// 실수는 계산할 때마다 완벽하게 맞아 떨어지는 값이 나오지 않을 수 있다.
		
	}

}
