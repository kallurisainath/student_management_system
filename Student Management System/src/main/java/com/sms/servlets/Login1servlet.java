package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.dapImplements.Admindao;

/**
 * Servlet implementation class Login1servlet
 */
@WebServlet("/Login1servlet")
public class Login1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		try {
			//creating response object
			//PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			
			HttpSession session = request.getSession();
			session.setAttribute("a", username);
//			int result = 1;
			int result = Admindao.loginadmin(username, password);
			if(result > 0) {
				response.sendRedirect("Viewallservlet");
			} else {
				response.sendRedirect("Viewallservlet");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
