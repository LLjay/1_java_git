package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.MemRollDao;
import com.mini.model.vo.Member;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.Production;

public class MemRollService {
	
	/**
	 * 전체 공연 정보를 ProductionDao에 요청해 반환하는 메소드
	 * @return
	 */
	public List<MemberRoll> selectMemRollList() {
		Connection conn = JDBCTemplate.getConnection();
		List<MemberRoll> list = new MemRollDao().selectMemRollList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	
	public int registMemRoll(MemberRoll mr) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemRollDao().registMemRoll(conn, mr);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

	public List<MemberRoll> selectMyMemRollList(Member user) {
		Connection conn = JDBCTemplate.getConnection();
		List<MemberRoll> list = new MemRollDao().selectMyMemRollList(conn, user);
		JDBCTemplate.close(conn);
		
		return list;
		
	}
}
