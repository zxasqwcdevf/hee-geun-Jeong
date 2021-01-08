package net.koreate.test.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.koreate.test.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	SqlSession session;
	
	private String namespace = "net.koreate.mappers.MemberMapper";
	
	public void insertMember(MemberVO member) {
		System.out.println(member);
		//int result = session.insert("net.koreate.mappers.MemberMapper.insertMember",member);
		int result = session.insert(namespace+".insertMember",member);
		System.out.println(result);
		System.out.println("삽입 완료");
	}

	public MemberVO readMember(int num) {
		MemberVO vo = session.selectOne(namespace+".readMember",num);
		System.out.println("dao: " + vo );
		return vo;
	}

	public ArrayList<MemberVO> selectList() {
		List<MemberVO> list
		=session.selectList(namespace+".selectList");
		
		return ((ArrayList<MemberVO>)list);
	};
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
