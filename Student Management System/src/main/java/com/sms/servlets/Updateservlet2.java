package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dapImplements.Studentdao;
import com.sms.pojo.Student;

/**
 * Servlet implementation class Updateservlet2
 */
@WebServlet("/Updateservlet2")
public class Updateservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateservlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			//1.get the beans from the jsp pages
			int id=Integer.parseInt(request.getParameter("id"));
			String fullname=request.getParameter("fullname");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			
			//2.set these beans using setter methods of bean clas Student
			Student s=new Student();
			s.setId(id);
			s.setFullname(fullname);
			s.setAddress(address);
			s.setEmail(email);
			s.setPhone(phone);
			
			//3.call the business method/logic from dao class Studentdao
		int result=	Studentdao.updatestudent(s);
		//4.result decides the next page
		
		if(result >0)
		{
			response.sendRedirect("Viewallservlet");
		}
		else
		{
			response.sendRedirect("Viewallservlet");	
		}
		}
		catch(Exception ex)
		{
		ex.printStackTrace();
		}
		
	}

}
