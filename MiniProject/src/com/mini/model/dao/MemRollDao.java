package com.mini.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mini.model.vo.MemberRoll;

public class MemRollDao {

	public int registMemRoll(MemberRoll mr) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_MEMROLL VALUES (SEQ_MEMNO.NEXTVAL, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mr.getMem().getUserNo());
			pstmt.setInt(2, mr.getPro().getProNo());
			pstmt.setString(3, mr.getRoll());
			
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
}
