package com.mini.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mini.common.JDBCTemplate;
import com.mini.model.vo.Member;

public class MemberDao {
	
	Properties prop = new Properties();
	
	// 멤버다오를 만들 때마다 이 메소드가 실행 되도록 생성자를 만들어준 것
	public MemberDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 전달 받은 아이디와 비밀번호에 해당하는 데이터 한 가지 조회해 Member 반환

	 * @param id
	 * @param password
	 * @return
	 */
	public Member logIn(Connection conn, String id, String password) {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Member> list = new ArrayList<>();
		
		String sql = prop.getProperty("logIn");

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rset = pstmt.executeQuery();
			
			list.addAll(this.addListMember(m, rset));
			
		} catch (SQLException e) {
			
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list.get(0);
	}
	
	/**
	 * 이름명 키워드로 검색해 해당하는 회원을 List에 담아 반환하는 메소드
	 * @param conn
	 * @param userName
	 * @return
	 */
	public List<Member> selectMemberByName(Connection conn, String userName) {
		List<Member> list = new ArrayList<>();
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectMemberByName");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			
			rset = pstmt.executeQuery();
			
			list.addAll(this.addListMember(m, rset));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	public int signUp(Connection conn, Member mem) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("signUp");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getUserId());
			pstmt.setString(2, mem.getUserPwd());
			pstmt.setString(3, mem.getUserName());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * ResultSet으로 받은 정보들을 Member 객체에 담는 메소드
	 * @param m
	 * @param rset
	 * @return
	 */
	public List<Member> addListMember(Member m, ResultSet rset) {
		List<Member> list = new ArrayList<>();
		
		try {
			while(rset.next()) {
			m = new Member();
			m.setUserNo(rset.getInt("user_no"));
			m.setUserId(rset.getString("user_id"));
			m.setUserPwd(rset.getString("user_pwd"));
			m.setUserName(rset.getString("user_name"));
			m.setUserGrade(rset.getString("user_grade"));
			m.setUserPoint(rset.getInt("user_point"));
			m.setEnrollDate(rset.getDate("enroll_date"));
			
			list.add(m);
			}
		} catch (SQLException e) {

		}
		return list;
	}
	
	/**
	 * 전달 받은 정보를 데이터베이스에 등록
	 * @param mem
	 * @return
	 */
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
	
	/**
	 * 전달 받은 멤버명에 해당하는 데이터 한 가지 조회해 Member 반환
	 * @param userName
	 * @return
	 */
	public Member searchMember(String userName) {
		String sql = "SELECT * FROM TB_MEMBER"
				+ " WHERE USER_NAME = '" + userName + "'";

		return this.selectMember(sql);

	}

	/**
	 * 사용하고자 하는 sql문을 전달 받아 데이터 한 가지를 조회해 Member형으로 반환
	 * @param sql
	 * @return
	 */
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
