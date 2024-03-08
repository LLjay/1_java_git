package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.DeviceDao;
import com.mini.model.vo.Device;

public class DeviceService {
	
	public List<Device> selectDeviceList() {
		Connection conn = JDBCTemplate.getConnection();
		List<Device> list = new DeviceDao().selectDeviceList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public List<Device> selectDeviceByName(String dvName) {
		Connection conn = JDBCTemplate.getConnection();
		List<Device> list = new DeviceDao().selectDeviceByName(conn, dvName);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public int deleteDevice(Device d) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new DeviceDao().deleteDevice(conn, d);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

}
