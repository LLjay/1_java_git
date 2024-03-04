package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.InOutListDao;
import com.mini.model.vo.InOutList;

public class InOutListService {
	InOutListDao ioDao = new InOutListDao();	

	public List<InOutList> selectInOutList() {
		Connection conn = JDBCTemplate.getConnection();
		List<InOutList> list = ioDao.selectInOutList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
}
