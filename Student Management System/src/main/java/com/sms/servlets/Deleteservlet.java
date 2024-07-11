package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dapImplements.Studentdao;

/**
 * Servlet implementation class Deleteservlet
 */
@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Deleteservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			// 1.get the beans from the jsp pages
			int id = Integer.parseInt(request.getParameter("id"));
			String password = request.getParameter("password");

			// 2.set these beans using setter methods of bean clas Admin

			// 3.call the business method/login from dao class Admindao
			int result = Studentdao.deletestudent(id);
			// 4.result decides the next page

			if (result > 0) {
				response.sendRedirect("Viewallservlet");
			} else {
				response.sendRedirect("Viewallservlet");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
