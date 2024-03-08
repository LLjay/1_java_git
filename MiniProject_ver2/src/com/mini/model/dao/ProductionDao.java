package com.mini.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.vo.Production;

public class ProductionDao {
	
	/**
	 * 전체 공연 정보를 모두 조회해 List에 담아 반환하는 메소드
	 * @param conn
	 * @return
	 */
	public List<Production> selectProductionList(Connection conn) {
		List<Production> list = new ArrayList<>();
		Production pro = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TB_PRODUCTION";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				pro = this.setFieldProduction(pro, rset);
				list.add(pro);
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
	 * 특정 키워드를 포함하는 공연 정보를 조회해 List에 담아 반환하는 메소드
	 * @param conn
	 * @param keyword
	 * @return
	 */
	public List<Production> selectProductionByKeyword(Connection conn, String keyword) {
		List<Production> list = new ArrayList<>();
		Production pro = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TB_PRODUCTION WHERE PRO_TITLE LIKE '%" + keyword + "%'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				pro = this.setFieldProduction(pro, rset);
				list.add(pro);
			}
		} catch (SQLException e) {

		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}
	
	public int registProduction(Connection conn, Production pro) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_PRODUCTION "
				+ "VALUES(SEQ_PRONO.NEXTVAL, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pro.getCategory());
			pstmt.setString(2, pro.getTitle());
			pstmt.setString(3, pro.getTheatre());
			pstmt.setDate(4, pro.getOpening());
			pstmt.setDate(5, pro.getClosing());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public Production searchProduction(String proTitle) {
		Production pro = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TB_PRODUCTION "
				+ "WHERE PRO_TITLE = '" + proTitle + "'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				pro = new Production();
				pro.setProNo(rset.getInt("pro_no"));
				pro.setCategory(rset.getString("pro_category"));
				pro.setTitle(rset.getString("pro_title"));
				pro.setTheatre(rset.getString("pro_theatre"));
				pro.setOpening(rset.getDate("pro_opening"));
				pro.setClosing(rset.getDate("pro_closing"));
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
		
		return pro;
	}
	
	public Production setFieldProduction(Production pro, ResultSet rset) {
		
		try {
			pro = new Production();
			pro.setProNo(rset.getInt("pro_no"));
			pro.setCategory(rset.getString("pro_category"));
			pro.setTitle(rset.getString("pro_title"));
			pro.setTheatre(rset.getString("pro_theatre"));
			pro.setOpening(rset.getDate("pro_opening"));
			pro.setClosing(rset.getDate("pro_closing"));
		} catch (SQLException e) {

		}
		
		return pro;
	}


}
