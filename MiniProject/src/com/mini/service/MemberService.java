package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.MemberDao;
import com.mini.model.vo.Member;

public class MemberService {
	MemberDao memDao = new MemberDao();
	
	public Member logIn(String id, String password) {
		Connection conn = JDBCTemplate.getConnection();
		Member m = memDao.logIn(conn, id, password);
		JDBCTemplate.close(conn);
		
		return m;
	}
	
	public List<Member> selectMemberByName(String userName) {
		Connection conn = JDBCTemplate.getConnection();
		List<Member> list = memDao.selectMemberByName(conn, userName);
		JDBCTemplate.close(conn);
		
		return list;
		
	}
}
