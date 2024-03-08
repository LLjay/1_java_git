package com.mini.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.vo.Device;
import com.mini.model.vo.InOutList;
import com.mini.model.vo.Production;

public class InOutListDao {

	public List<InOutList> selectInOutList(Connection conn) {
		List<InOutList> list = new ArrayList<>();
		InOutList io = null;
		Production pro = null;
		Device dv = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT PRO_TITLE, DV_NAME, OUT_QTY, IN_QTY, OUT_DATE, IN_DATE, MEMO"
				+ " FROM VW_INOUTLIST";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				pro = new Production();
				dv = new Device();
				io = new InOutList();
				
				pro.setTitle(rset.getString("pro_title"));
				dv.setDvName(rset.getString("dv_name"));
				io.setOutQty(rset.getInt("out_qty"));
				io.setInQty(rset.getInt("in_qty"));
				io.setOutDate(rset.getDate("out_date"));
				io.setInDate(rset.getDate("in_date"));
				io.setMemo(rset.getString("memo"));
				
				io.setPro(pro);
				io.setDevice(dv);
				
				list.add(io);
			}
		} catch (SQLException e) {

		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}
	
	public int registInOut(Connection conn, InOutList iol) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_INOUTLIST VALUES(SEQ_INOUTNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, iol.getPro().getProNo());
			pstmt.setInt(2, iol.getDevice().getDvNo());
			pstmt.setInt(3, iol.getOutQty());
			pstmt.setInt(4, iol.getInQty());
			pstmt.setDate(5, iol.getOutDate());
			pstmt.setDate(6, iol.getInDate());
			pstmt.setString(7, iol.getMemo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
