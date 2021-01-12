package net.koreate.test_java.dao;

import java.util.ArrayList;
import java.util.List;

import net.koreate.test_java.vo.MemberVO;

public interface MemberDAO {
	
	public void insertMember(MemberVO memberVO);
	
	public MemberVO readMember(String id);
	
	public MemberVO readMemberWithPass(String userid, String userpw);
	
	public List<MemberVO> getMemberList();

}
