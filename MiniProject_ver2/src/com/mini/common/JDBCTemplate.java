package com.mini.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	/**
	 * Connection 객체를 JDBC Driver에 연결해 반환
	 * @return
	 */
	public static Connection getConnection() {
		
		Connection conn = null;
		Properties prop = new Properties();
		
//		prop.load(new FileInputStream("resources/driver.properties")); 어차피 try catch 하라고 뜨므로 그냥 넣어주기
		
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
			// prop의 메소드를 사용하기 위해 resources 경로에서 driver.properties 파일에서 읽어들이겠다는 뜻
			
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

	/**
	 * Connection 객체가 닫혀있지 않을 때 commit 해주는 메소드
	 * @param conn
	 */
	public static void commit(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Connection 객체가 닫혀있지 않을 때 rollback 해주는 메소드
	 * @param conn
	 */
	public static void rollback(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Statement 객체가 닫혀있지 않을 때 닫아주는 메소드
	 * @param stmt
	 */
	public static void close(Statement stmt) {
		try {
			if (stmt != null && !stmt.isClosed())
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Connection 객체가 닫혀있지 않을 때 닫아주는 메소드
	 * @param conn
	 */
	public static void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ResultSet 객체가 닫혀있지 않을 때 닫아주는 메소드
	 * @param rset
	 */
	public static void close(ResultSet rset) {
		try {
			if (rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
