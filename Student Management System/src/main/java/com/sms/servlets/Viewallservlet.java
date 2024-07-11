package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.dapImplements.Studentdao;
import com.sms.pojo.Student;

/**
 * Servlet implementation class Viewallservlet
 */
@WebServlet("/Viewallservlet")
public class Viewallservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<body style='text-align:center;'><head></head>");

			out.println("<h1>Student management project</h1>");

			HttpSession session = request.getSession();
			String user = (String) session.getAttribute("a");
			user = "ss";
			if (user == null) {
				response.sendRedirect("login1.jsp");
			} else {
				out.println("<h2>welcome " + user + "</h2>");

				/*
				 * to logout the account
				 */
				out.println("<form style='text-align:right;' action='Logoutservlet' method='get'>");
				out.println("<Input type='submit' value='LOGOUT'></form>");

				/*
				 * to search according to id or name or address or email or phone
				 */
				out.println("<form action='Multiservlet' method='get'>");
				out.println("<input type='text' name='stringvalue'>");
				out.println("<input type='submit' value='search'>");

				out.println("</form>");
				/*
				 * to insert new student
				 */
				out.println("<div><h3>Insert new student details</h3>");
				out.println("<form action='Insertstudentservlet' method='post'>");
				out.println("<input type='text' name='fullname' placeholder='fullname'>");
				out.println("<input type='text' name='address' placeholder='address'>");
				out.println("<input type='text' name='email' placeholder='email'>");
				out.println("<input type='text' name='phone' placeholder='phone'>");

				out.println("<input type='submit' value='insert new student'>");
				out.println("</div><br><br>");

				/*
				 * to print list of all students
				 */
				out.println("<div><h3> LIST OF ALL STUDENTS</h3>");
				out.println("<table border='1' width='90%'>");
				out.println("<tr><th>ID</th><th>Fullname</th><th>Address</th><th>Email</th><th>Phone</th></tr>");

//				List list = (List) Studentdao.viewallstudents();

//	for(Student s:list)
				java.util.List<Student> list = Studentdao.viewallstudents();

				for (Student s : list) {
					out.println("<tr><th>" + s.getId() + "</th><th>" + s.getFullname() + "</th><th>" + s.getAddress()
							+ "</th><th>" + s.getEmail() + "</th><th>" + s.getPhone()
							+ "</th><th><a href='Updateservlet1?id=" + s.getId()
							+ "'>edit</a></th><th><a href='Deleteservlet?id=" + s.getId()
							+ "'>Delete </a></th>  </tr>");

				}

				out.println("</table></div><br><br>");
				out.println("</html></body>");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
