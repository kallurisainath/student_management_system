package com.sms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dapImplements.Admindao;
import com.sms.pojo.Admin;

/**
 * Servlet implementation class Forgot1passwordservlet
 */
@WebServlet("/Forgot1passwordservlet")
public class Forgot1passwordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Admin a = new Admin();
			a.setPassword(password);
			a.setUsername(username);
			int i = Admindao.updatepassword(username, password);
			if(i > 0) {
				response.sendRedirect("login1.jsp");
			}
			else {
				response.sendRedirect("forgot1password.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
