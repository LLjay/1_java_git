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
import com.mini.model.vo.Convention;
import com.mini.model.vo.Device;
import com.mini.model.vo.Line;
import com.mini.model.vo.MovingLight;

public class DeviceDao {
	
	public List<Device> selectDeviceList(Connection conn) {
		List<Device> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql1 = "SELECT * FROM TB_DEVICE WHERE DV_CATEGORY = 'MovingLight'";
		String sql2 = "SELECT * FROM TB_DEVICE WHERE DV_CATEGORY = 'Convention'";
		String sql3 = "SELECT * FROM TB_DEVICE WHERE DV_CATEGORY = 'Line'";
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql1);
			list.addAll(this.addListMovingLight(rset));
			
			rset = stmt.executeQuery(sql2);
			list.addAll(this.addListConvention(rset));
			
			rset = stmt.executeQuery(sql3);
			list.addAll(this.addListLine(rset));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return list;
	}
	
	public List<Device> selectDeviceByName(Connection conn, String dvName) {
		List<Device> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TB_DEVICE WHERE DV_CATEGORY = ? AND DV_NAME LIKE '%' || ? || '%'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "MovingLight");
			pstmt.setString(2, dvName);
			
			rset = pstmt.executeQuery();
			
			list.addAll(addListMovingLight(rset));
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Convention");
			pstmt.setString(2, dvName);
			
			rset = pstmt.executeQuery();
			
			list.addAll(addListConvention(rset));
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Line");
			pstmt.setString(2, dvName);
			
			rset = pstmt.executeQuery();
			
			list.addAll(addListLine(rset));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}
	
	public List<Device> addListMovingLight(ResultSet rset) {
		List<Device> list = new ArrayList<>();
		try {
			while(rset.next()) {
				Device d = new MovingLight();
				if (d instanceof MovingLight) {
					d = new MovingLight();
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					((MovingLight) d).setManufacture(rset.getString("dv_manufacture"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					((MovingLight) d).setPower(rset.getInt("dv_power"));
					((MovingLight) d).setWeight(rset.getDouble("dv_weight"));
					((MovingLight) d).setLamp(rset.getString("dv_lamp"));
					
					list.add(d);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Device> addListConvention(ResultSet rset) {
		List<Device> list = new ArrayList<>();
		try {
			while(rset.next()) {
				Device d = new Convention();
				if (d instanceof Convention) {
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					((Convention) d).setManufacture(rset.getString("dv_manufacture"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					((Convention) d).setPower(rset.getInt("dv_power"));
					((Convention) d).setWeight(rset.getDouble("dv_weight"));
					
					list.add(d);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Device> addListLine(ResultSet rset) {
		List<Device> list = new ArrayList<>();
		try {
			while(rset.next()) {
				Device d = new Line();
				if (d instanceof Line) {
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					
					list.add(d);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int deleteDevice(Connection conn, Device d) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM TB_DEVICE WHERE DV_NAME = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getDvName());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Device> searchDevice(String dvName) {
		String sql1 = "SELECT * FROM TB_DEVICE "
				+ "WHERE DV_CATEGORY = 'MovingLight' "
				+ "AND DV_NAME LIKE '%" + dvName + "%'";
		String sql2 = "SELECT * FROM TB_DEVICE "
				+ "WHERE DV_CATEGORY = 'Convention'"
				+ "AND DV_NAME LIKE '%" + dvName + "%'";
		String sql3 = "SELECT * FROM TB_DEVICE "
				+ "WHERE DV_CATEGORY = 'Line'"
				+ "AND DV_NAME LIKE '%" + dvName + "%'";
		
		return this.selectDevice(sql1, sql2, sql3);
	}

	public List<Device> selectDevice(String sql1, String sql2, String sql3) {
		List<Device> list = new ArrayList<Device>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql1);
			
			while(rset.next()) {
				Device d = new MovingLight();
				
				if (d instanceof MovingLight) {
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					((MovingLight) d).setManufacture(rset.getString("dv_manufacture"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					((MovingLight) d).setPower(rset.getInt("dv_power"));
					((MovingLight) d).setWeight(rset.getDouble("dv_weight"));
					((MovingLight) d).setLamp(rset.getString("dv_lamp"));
					
					list.add(d);
				}
			}
			
			rset = stmt.executeQuery(sql2);
			
			while(rset.next()) {
				Device d = new Convention();
				if (d instanceof Convention) {
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					((Convention) d).setManufacture(rset.getString("dv_manufacture"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					((Convention) d).setPower(rset.getInt("dv_power"));
					((Convention) d).setWeight(rset.getDouble("dv_weight"));
					
					list.add(d);
				}
			}
			
			rset = stmt.executeQuery(sql3);
			
			while(rset.next()) {
				Device d = new Line();
				if (d instanceof Line) {
					d.setDvNo(rset.getInt("dv_no"));
					d.setCategory(rset.getString("dv_category"));
					d.setDvName(rset.getString("dv_name"));
					d.setTotalQty(rset.getInt("dv_totalqty"));
					
					list.add(d);
				}
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
		
		return list;
	}

	public int registMovingLight(Device d) {
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_DEVICE VALUES(SEQ_DVNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			pstmt = conn.prepareStatement(sql);
			
			if (d instanceof MovingLight) {
				pstmt.setString(1, d.getCategory());
				pstmt.setString(2, d.getDvName());
				pstmt.setString(3, ((MovingLight)d).getManufacture());
				pstmt.setInt(4, d.getTotalQty());
				pstmt.setInt(5, ((MovingLight)d).getPower());
				pstmt.setDouble(6, ((MovingLight)d).getWeight());
				pstmt.setString(7, ((MovingLight)d).getLamp());
			}
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
		
		return result;
	}

	public int registConvention(Device d) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_DEVICE (DV_NO, DV_CATEGORY, DV_NAME, DV_MANUFACTURE, DV_TOTALQTY, DV_POWER, DV_WEIGHT) "
				+ "VALUES(SEQ_DVNO.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			pstmt = conn.prepareStatement(sql);
			
			if (d instanceof Convention) {
				pstmt.setString(1, d.getCategory());
				pstmt.setString(2, d.getDvName());
				pstmt.setString(3, ((Convention)d).getManufacture());
				pstmt.setInt(4, d.getTotalQty());
				pstmt.setInt(5, ((Convention)d).getPower());
				pstmt.setDouble(6, ((Convention)d).getWeight());
			}
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
		
		return result;
	}
	
	public int registLine(Device d) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TB_DEVICE (DV_NO, DV_CATEGORY, DV_NAME, DV_TOTALQTY) "
				+ "VALUES(SEQ_DVNO.NEXTVAL, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LTPROJECT", "LTPROJECT");
			pstmt = conn.prepareStatement(sql);
			
			if (d instanceof Line) {
				pstmt.setString(1, d.getCategory());
				pstmt.setString(2, d.getDvName());
				pstmt.setInt(3, d.getTotalQty());
			}
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
		
		return result;
	}
	
	
	
}
