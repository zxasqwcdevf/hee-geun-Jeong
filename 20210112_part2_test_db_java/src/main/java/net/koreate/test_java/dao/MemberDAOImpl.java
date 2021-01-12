package net.koreate.test_java.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.koreate.test_java.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession session;
	
	String namespace ="net.koreate.mappers.MemberMapper";

	@Override
	public void insertMember(MemberVO memberVO) {
		session.insert(namespace+".insertMember",memberVO);
	}

	@Override
	public MemberVO readMember(String id) {
		return session.selectOne(namespace+".readMember",id);
	}

	@Override
	public MemberVO readMemberWithPass(String userid, String userpw) {
		Map<String,String> paramMap = new HashMap<>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return session.selectOne(namespace+".readWithPass",paramMap);
	}

	@Override
	public List<MemberVO> getMemberList() {
		return session.selectList(namespace+".memberList");
	}

}
