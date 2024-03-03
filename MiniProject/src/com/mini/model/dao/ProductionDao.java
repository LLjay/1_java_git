package com.mini.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mini.model.vo.Member;
import com.mini.model.vo.Production;

public class ProductionDao {
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
}
