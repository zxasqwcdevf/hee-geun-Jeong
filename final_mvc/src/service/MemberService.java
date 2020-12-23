package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemberService {
	
	void memberJoin(HttpServletRequest request, HttpServletResponse response); 
		//로그인 처리
	//@return true 로그인 성공
	//@return false 로그인 실패
	boolean memberLogin(HttpServletRequest request, HttpServletResponse response);
	
	//회원정보 수정
	void memberUpdate(HttpServletRequest request, HttpServletResponse response);
	//탈퇴처리
	void withdraw(HttpServletRequest request, HttpServletResponse response);
	
	//로그아웃 처리
	void logOut(HttpServletRequest request, HttpServletResponse response);
}
