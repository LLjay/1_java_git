package com.mini.service;

import java.sql.Connection;
import java.util.List;

import com.mini.common.JDBCTemplate;
import com.mini.model.dao.MemberDao;
import com.mini.model.vo.Member;

public class MemberService {
	
	public Member logIn(String id, String password) {
		Connection conn = JDBCTemplate.getConnection();
		Member m = new MemberDao().logIn(conn, id, password);
		JDBCTemplate.close(conn);
		
		return m;
	}
	
	public List<Member> selectMemberByName(String userName) {
		Connection conn = JDBCTemplate.getConnection();
		List<Member> list = new MemberDao().selectMemberByName(conn, userName);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public int insertMember(Member mem) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().signUp(conn, mem);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
}
