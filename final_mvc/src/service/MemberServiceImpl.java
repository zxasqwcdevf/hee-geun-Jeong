package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Override
	public void memberJoin(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("id"));
		String gender = request.getParameter("gender");
		MemberVO vo = new MemberVO(id,pass,name,age,gender);
		System.out.println(vo);
	}

	@Override
	public boolean memberLogin(HttpServletRequest request, HttpServletResponse response) {
		return false;
	}

	@Override
	public void memberUpdate(HttpServletRequest request, HttpServletResponse response) {
		
	}

	@Override
	public void withdraw(HttpServletRequest request, HttpServletResponse response) {
		
	}

	@Override
	public void logOut(HttpServletRequest request, HttpServletResponse response) {
		
	}
	

}
