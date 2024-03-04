package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.ProductionDao;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.Production;

public class ProductionService {
	
	ProductionDao proDao = new ProductionDao();
	
	/**
	 * 전체 공연 정보를 ProductionDao에 요청해 반환하는 메소드
	 * @return
	 */
	public List<Production> selectProductionList() {
		Connection conn = JDBCTemplate.getConnection();
		List<Production> list = proDao.selectProductionList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}

	/**
	 * 특정 키워드를 포함하는 공연 정보를 ProductionDao에 요청해 반환하는 메소드
	 * @param keyword
	 * @return
	 */
	public List<Production> selectProductionByKeyword(String keyword) {
		Connection conn = JDBCTemplate.getConnection();
		List<Production> list = proDao.selectProductionByKeyword(conn, keyword);
		JDBCTemplate.close(conn);
		
		return list;
	}

	public int registProduction(Production pro) {
		Connection conn = JDBCTemplate.getConnection();
		int result = proDao.registProduction(conn, pro);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

}
