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
 * Servlet implementation class Register1servlet
 */
@WebServlet("/Register1servlet")
public class Register1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Admin a = new Admin();
		a.setUsername(username);
		a.setPassword(password);
		int i = Admindao.registeradmin(a);
		if(i > 0) {
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("register1.jsp");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
