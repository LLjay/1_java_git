package com.mini.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.mini.model.vo.Member;

public class MemberDao {
	
	/**
	 * 입력한 아이디와 비밀번호에 해당하는 데이터 한 가지 조회

	 * @param id
	 * @param password
	 * @return
	 */

	public Member logIn(String id, String password) {
	
		String sql = "SELECT * FROM TB_MEMBER"
				+ " WHERE USER_ID = '" + id + "'"
				+ " AND USER_PWD = '" + password + "'";

		return this.selectMember(sql);
	}
	
	public int insertMember(Member mem) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_MEMBER VALUES (SEQ_MEMNO.NEXTVAL, ?, ?, ?, DEFAULT, DEFAULT, DEFAULT)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getUserId());
			pstmt.setString(2, mem.getUserPwd());
			pstmt.setString(3, mem.getUserName());
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			return result;
		} finally {
		}
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		return result;
	}
	
	public Member searchMember(String userName) {
		String sql = "SELECT * FROM TB_MEMBER"
				+ " WHERE USER_NAME = '" + userName + "'";

		return this.selectMember(sql);

	}

	public Member selectMember(String sql) {
		
		Member mem = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				mem = new Member();
				mem.setUserNo(rset.getInt("user_no"));
				mem.setUserId(rset.getString("user_id"));
				mem.setUserPwd(rset.getString("user_pwd"));
				mem.setUserName(rset.getString("user_name"));
				mem.setUserGrade(rset.getString("user_grade"));
				mem.setUserPoint(rset.getInt("user_point"));
				mem.setEnrollDate(rset.getDate("enroll_date"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return mem;
	}
}
