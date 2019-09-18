package kr.co.itcen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public JoinServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST 방식의 문자열 엔코딩
		request.setCharacterEncoding("UTF-8");
		
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		String birth_year =request.getParameter("birth-year");
		String gender =request.getParameter("gender");
		String[] hobbies=request.getParameterValues("hobby");
		String selfInfo =request.getParameter("self-intro");
		
		response.setContentType("text/html; charset=utf-8");
		System.out.println(email+":"+password+":"+birth_year+":"+gender);
		
		for(String hobby:hobbies) {
			System.out.println(hobby);
		}
		System.out.println(selfInfo);
		//응답 문자열 엔코딩

		response.getWriter().println("ok!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
