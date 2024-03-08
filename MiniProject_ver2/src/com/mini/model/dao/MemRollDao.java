package com.mini.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.vo.Member;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.Production;

public class MemRollDao {
	
	/**
	 * 전체 공연 정보를 모두 조회해 List에 담아 반환하는 메소드
	 * @param conn
	 * @return
	 */
	public List<MemberRoll> selectMemRollList(Connection conn) {
		List<MemberRoll> list = new ArrayList<>();
		MemberRoll mr = null;
		Production pro = null;
		Member mem = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT PRO_CATEGORY, PRO_TITLE, PRO_THEATRE,"
				+ "PRO_OPENING, PRO_CLOSING, USER_NAME, ROLL_NAME "
				+ "FROM VW_MEMROLL";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				pro = new Production();
				mem = new Member();
				mr = new MemberRoll();
				pro.setCategory(rset.getString("pro_category"));
				pro.setTitle(rset.getString("pro_title"));
				pro.setTheatre(rset.getString("pro_theatre"));
				pro.setOpening(rset.getDate("pro_opening"));
				pro.setClosing(rset.getDate("pro_closing"));
				mem.setUserName(rset.getString("user_name"));
				mr.setRoll(rset.getString("roll_name"));
				mr.setPro(pro);
				mr.setMem(mem);
				
				list.add(mr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return list;
	}

	/**
	 * 공연별 회원 역할을 데이터베이스에 등록하는 메소드
	 * @param conn
	 * @param mr
	 * @return
	 */
	public int registMemRoll(Connection conn, MemberRoll mr) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_MEMROLL VALUES (SEQ_MEMNO.NEXTVAL, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mr.getMem().getUserNo());
			pstmt.setInt(2, mr.getPro().getProNo());
			pstmt.setString(3, mr.getRoll());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {

		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public List<MemberRoll> selectMyMemRollList(Connection conn, Member user) {
		List<MemberRoll> list = new ArrayList<>();
		Production pro = null;
		Member mem = null;
		MemberRoll mr = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT PRO_CATEGORY, PRO_TITLE, PRO_THEATRE, PRO_OPENING, PRO_CLOSING, USER_NAME, ROLL_NAME "
				+ "FROM VW_MEMROLL "
				+ "WHERE USER_NAME = ?";
//				+ "TB_MEMROLL "
//				+ "JOIN TB_PRODUCTION USING (PRO_NO) "
//				+ "JOIN TB_MEMBER ON (USER_NO = MEMBER_NO) "
//				+ "WHERE USER_NAME = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				pro = new Production();
				mem = new Member();
				mr = new MemberRoll();
				pro.setCategory(rset.getString("pro_category"));
				pro.setTitle(rset.getString("pro_title"));
				pro.setTheatre(rset.getString("pro_theatre"));
				pro.setOpening(rset.getDate("pro_opening"));
				pro.setClosing(rset.getDate("pro_closing"));
				mem.setUserName(rset.getString("user_name"));
				mr.setRoll(rset.getString("roll_name"));
				mr.setPro(pro);
				mr.setMem(mem);
				
				list.add(mr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}
}
