package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.InOutListDao;
import com.mini.model.vo.Device;
import com.mini.model.vo.InOutList;
import com.mini.model.vo.Production;

public class InOutListService {
	InOutListDao ioDao = new InOutListDao();	

	public List<InOutList> selectInOutList() {
		Connection conn = JDBCTemplate.getConnection();
		List<InOutList> list = ioDao.selectInOutList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public int registInOut(InOutList iol) {
		Connection conn = JDBCTemplate.getConnection();
		int result = ioDao.registInOut(conn, iol);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
}
