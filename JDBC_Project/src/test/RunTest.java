package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunTest {
	/*
	 * JDBC를 사용하기 위해서는 자바 프로젝트에 jdbc 드라이버를 추가해야 함
	 * 
	 * #JDBC용 객체
	 * - Connection : DB의 연결 정보를 담고 있는 객체
	 * - [Prepared]Statement : 연결된 DB에 sql문을 전달해서 실행하고 결과를 받아내는 객체
	 * - ResultSet : SELECT문 실행 후 조회된 결과물들을 담는 객체
	 * 
	 * #JDBC 과정(순서 중요함)
	 * 1) JDBC Driver 등록 : 해당 DBMS(오라클)가 제공하는 클래스 등록
	 * 2) Connection 생성 : 연결하고자 하는 db 정보를 입력해서 해당 db와 연결할 수 있는 객체 생성
	 * 3) Statement 생성 : Connection 객체를 이용해서 생성(sql문 실행 및 결과를 받는 객체)
	 * 4) sql문 전달, 실행 : Statement 객체를 이용해서 sql문 실행
	 * 5) 결과 받기 > (6-1) SELECT문 실행 => ResultSet 객체(조회된 결과를 담아줌)
	 * 		 		(6-2) DML문(INSERT, UPDATE, DELETE)문 실행 => int
	 * // DML은 조회가 아니라 데이터를 바꾸는 것이라 바뀐 행의 개수를 반환해줌
	 * 
	 * 6-1) ResultSet 객체에 담겨 있는 데이터들을 하나씩 추출해서 차근차근 옮겨닮기[+ArrayList에 담기]
	 * // 결과가 얼마나 나올지 모르므로
	 * 6-2) 트랜잭션 처리 (성공했다면 commit, 실패했다면 rollback 실행)
	 * 
	 * 7) 다 사용한 JDBC용 객체를 반드시 자원 반납(close) => 생성된 역순으로 하기
	 * 
	 */
	
	public static void main(String[] args) {
		/*
		// 1. 각자의 PC(localhost)에 JDBC 계정 연결 후 test 테이블에 insert 해보자
		// insert => 처리된 행 수(int) => 트랜잭션 처리 해야 함
		
		// 0) 필요한 변수 세팅
		int result = 0; // 결과(처리된 행 수)를 받아줄 변수
		Connection conn = null; // DB의 연결 정보를 보관할 객체
		Statement stmt = null; // sql문을 전달해서 실행 후 결과를 받는 객체 // sql로 해야 함
		// 오류 나는 상태에서 add module 뜨면 추가해줘야 함
		
		// 실행할 sql문(완전한 상태로 만들어두기)(맨 뒤에 세미콜론이 없어야 함)
//		String sql = "INSERT INTO TEST VALUES(1, '김개똥', SYSDATE)";
		// 세미콜론 주의, 디벨로퍼니까 ; 붙이는 거고 여긴 쿼리 하나만 날릴 거니까 괜찮음

		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		
		String sql = "INSERT INTO TEST VALUES(" + num + ", '" + name + "', SYSDATE)";
		// 쿼리문 작성 시 변수 넣을 때 쿼리에서의 문자열은 ''로 인식하므로 여기서도 빠지면 안 됨
		
		try {
			// 1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ojdbc6.jar 파일 추가 확인 | 오타 확인 => 에러 발생
			System.out.println("등록성공");
			// Class 자체 안에 압축파일 형태로 Library가 있음
			// 그걸 가져와서 여기에 import 해주는 역할
			// 프로젝트에 add 해준 jar 파일
			// oracle.jdbc.driver 패키지 안에 있는 OracleDriver를 가져와서 쓰겠다
			
			// 2) Connection 생성 (url, 계정명, 비밀번호)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			// 접속하려면 어디로 가야할지, 계정, 비밀번호 필요 => 넣어줄 것 // IP주소 써줘야 함 // 데이터베이스의 포트 // SID(계속 백그라운드에서 돌고 있는 것), 계정명, 비밀번호
			// xe가 죽을 때가 있음 -> 살리는 방법 검색...
			// network connection 관련해 실패 뜨면 연결이 잘못된 것이므로 주소나 계정 정보 맞는지 오타 났는지 확인
			
			// 3) Statement 생성
			stmt = conn.createStatement();
			
			// 4, 5) sql문 전달하면서 실행 후 결과 받기 (처리된 행 수)
			result = stmt.executeUpdate(sql); // 원래는 sql 자리에 명령문 들어가면 됨
			// 내가 실행할 sql문이 DML(Insert, Update, Delete)문일 때 stmt.executeUpdate(SQL문)
			// 내가 실행할 sql문이 SELECT문 -> stmt.executeQuery(SELECT문) : ResultSet
			
			if (result > 0) { // 요청 SQL문 성공 // 성공한 행 결과가 담겼을 것이므로
				conn.commit();
			} else { // 요청 SQL문 실패 // 기존에 담아놓은 0 값에서 바뀌지 않았을 것이므로
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 7) 다 쓴 JDBC용 객체 자원 반납 (생성과 역순)
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // 순서 지켜서 하기
		}
		
		if (result > 0) { // 요청 SQL문 성공
			System.out.println("데이터 삽입 성공");
		} else { // 요청 SQL문 실패
			System.out.println("데이터 삽입 실패");
		} // 데이터베이스에 데이터를 왔다갔다 하는 시간이 필요해서 데이터 삽입 성공 구문이 뜨기까지 잠깐 텀이 생김
	*/
		
		// 2. 내 PC DB상의 JDBC 계정의 TEST 테이블의 모든 데이터 조회하기
		// SELECT문 => 결과 ResultSet(조회된 데이터가 담겨있음) => ResultSet으로부터 데이터 추출
		
		// 0) 필요한 변수 세팅
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		// 실행할 SQL문 작성
		String sql = "SELECT * FROM TEST";
		try {
			// 1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ojdbc6.jar 파일 추가 확인 | 오타 확인 => 에러 발생
			System.out.println("등록성공");
			
			// 2) Connection 생성 (url, 계정명, 비밀번호)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			// 3) Statement 생성
			stmt = conn.createStatement();
			
			// 4, 5) SQL문 전달, 실행 후 결과 받기 (ResultSet)
			rset = stmt.executeQuery(sql);
			
			// rset.next() => rset의 다음 행이 들어있는지 없는지 확인 후 결과 반환 + 한 행을 내려줌
				// 맨 처음에 가리키고 있는 행이 컬럼이라고 생각하면 편함, next() 쓰면 1행으로 넘어갈 것 => 있으면 true 반환
				// Tokenizer와 비슷한 방식
			
			while(rset.next()) {
				// 현재 참조하는 rset으로부터 어떤 컬럼에 해당하는 값을 어떤 타입으로 추출할 것인지 제시해줘야 함
				// DB의 컬럼명 제시(대소문자 구분하지 않음) // 컬럼명이니까
				int tno = rset.getInt("TNO"); // 어떤 컬럼값을 가져오고 싶은지 쓰면 됨
				String tname = rset.getString("TNAME"); // 자료형을 뭘로 받아줄건지
				Date tdate = rset.getDate("TDATE");
				// Date sql 이어야 함
				// rset.next() //를 또 해야함, false가 반환될 때까지 => while돌리기
				System.out.println(tno + ", " + tname + ", " + tdate);
			}
			
			// SELECT문은 조회니까 트랜잭션 해줄 게 없음, 7번 생략
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close(); // SELECT는 ResultSet도 닫아줘야 함
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
