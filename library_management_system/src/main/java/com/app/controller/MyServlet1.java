package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.DAO.AdminDAO;
import com.app.DAO.StudentDAO;
import com.app.model.Admin;
import com.app.model.Student;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/serv2")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
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
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String designation = request.getParameter("designation");
		String phoneNo=request.getParameter("phoneNo");
		String password=request.getParameter("password");
		Admin a=new Admin();
		a.setName(name);
		a.setEmail(email);
		a.setPhoneNo(phoneNo);
		a.setDesignation(designation);
		a.setPassword(password);
		System.out.println(name);
		System.out.println(email);
		System.out.println(designation);
		System.out.println(phoneNo);
		System.out.println(password);
		
			int status = 0;
			try {
				status = AdminDAO.save(a);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(status==1) {
				pw.write("Registration Successful!");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			else {
				pw.write("Registration Failed");
				request.getRequestDispatcher("studRegister.html").include(request, response);
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
