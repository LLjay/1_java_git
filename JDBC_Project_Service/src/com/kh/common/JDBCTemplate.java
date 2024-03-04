package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 공통 템플릿(매번 반복적으로 작성될 코드를 메소드로 정의)
public class JDBCTemplate {
	// 모든 메소드를 static 메소드로 생성
		// 원래 객체를 만드는 건 하나의 데이터를 만드는 것
		// 근데 얘는 자주 사용하는 메소드를 모아두기 위한 것
		// 따라서 static으로 사용
	// 싱글톤 패턴 : 메모리 영역에 단 한 번만 올려두고 매번 재사용 하는 개념
	
	// 1. Connection 객체 생성(DB접속) 후 해당 Connection 객체 반환
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 2. Commit 처리해주는 메소드 (Connection 객체 전달 받아서)
	public static void commit(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) { // .isClosed()가 true면 Connection 객체가 닫혀있음, 즉 반납되어 있는 것
				conn.commit(); // 따라서 열려있는 상태를 확인해야 함
			} // 따라서 rollback도 같은 설정이어야 함
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 3. Rollback 처리해주는 메소드 (Connection 객체 전달 받아서)
	public static void rollback(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) { 
				conn.rollback(); 
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} // 이걸 원래 commit과 rollback을 했던 자리에 넣어주는 것
	}
	
		// 원래는 반납도 무조건 열려 있을 때만 가능하고, 어디서 닫을 때 오류가 나는지도 확인해야 함
	// JDBC용 객체들을 전달 받아서 반납 처리해주는 메소드
	// 4. Statement 관련 객체를 전달 받아서 반납 시켜주는 메소드
		// prepare은 statement 상속
	public static void close(Statement stmt) { // 오버로딩
		try {
			if (stmt != null && !stmt.isClosed()) { 
				stmt.close(); 
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	// 5. Statement 관련 객체를 전달 받아서 반납 시켜주는 메소드
			// prepare은 statement 상속
	public static void close(Connection conn) { // 오버로딩
		try {
			if (conn != null && !conn.isClosed()) { 
				conn.close(); 
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
		
	// 5. Statement 관련 객체를 전달 받아서 반납 시켜주는 메소드
				// prepare은 statement 상속
	public static void close(ResultSet rset) { // 오버로딩
		try {
			if (rset != null && !rset.isClosed()) { 
				rset.close(); 
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
