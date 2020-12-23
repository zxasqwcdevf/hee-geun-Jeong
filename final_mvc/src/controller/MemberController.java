package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("*.mc")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService ms = new MemberServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("M C 요청");
		request.setCharacterEncoding("utf-8");
		String requestUri = request.getRequestURI();
		System.out.println("전체 경로 : " + requestUri);
		String contextPath = request.getContextPath();
		System.out.println("프로젝트 경로 : " + contextPath);
		String command = requestUri.substring(contextPath.length()+1);
		System.out.println("요청 경로"+command);
		
		
		String view ="";
		
		if(command.equals("join.mc")) {
			view ="/member/join.jsp";
			
		}
		
		if(command.equals("joinSubmit.mc")) {
			System.out.println("회원가입 요청");
			ms.memberJoin(request,response);
		}
		if(command.equals("login.mc")) {
			view ="/member/login.jsp";
			
		}
		if(command.equals("info.mc")) {
			view ="/member/info.jsp";
			
		}
		if(command.equals("update.mc")) {
			view ="/member/update.jsp";
			
		}
		if(command.equals("withdraw.mc")) {
			view ="/member/withdraw.jsp";
			
		}
		if(view != null && !view.equals("")) {
			request.getRequestDispatcher(view)
			.forward(request,response);
			
				
		}else {
			response.sendRedirect(contextPath+"*.mc");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
