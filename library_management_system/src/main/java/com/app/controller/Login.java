package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.DAO.AdminDAO;
import com.app.DAO.StudentDAO;
import com.app.model.Admin;
import com.app.model.Student;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		
		Student s= new Student();
		s.setEmail(email);
		s.setPassword(pass);
		
		Admin a=new Admin();
		a.setEmail(email);
		a.setPassword(pass);
		boolean status=false;
		boolean status1=false;
		try {
			
			status=StudentDAO.validateStud(s);
			status1=AdminDAO.validateAdmin(a);
			System.out.println("User is Student: "+status);
			System.out.println("User is Admin: "+status1);
			
			
			if(status1==true) {
				pw.write("Welcome "+a.getEmail());
				response.sendRedirect("adminHome.jsp");
				request.getRequestDispatcher("adminHome.jsp").include(request, response);
			}
			else if(status==true) {
				pw.write("Welcome "+s.getEmail());
				//HttpSession session = request.getSession();
				response.sendRedirect("studHome.jsp");
				//request.getRequestDispatcher("studHome.jsp").include(request, response);
				
			}
			
			else {
				pw.write("Login Failed");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			
			
		}catch(Exception e1) {
			System.out.println("Not Found!");
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
