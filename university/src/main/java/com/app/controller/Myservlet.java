package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.DAO.StudentDAO;
import com.app.model.Student;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/serv1")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
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
		
		String prn=request.getParameter("prn");
		Student s=new Student();
		s.setPrn(prn);
		
		
		try {
			ResultSet rs = null;
			try {
				rs = StudentDAO.result(s);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (rs.next()) {
			pw.write("<table style='border:2px'>");
			pw.write("<thead>");
			
			pw.write("<tr>");
			pw.write("<th>Name:</th>");
			pw.write("<td>" + rs.getString(3) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>PRN:	</th>");
			pw.write("<td>" + rs.getInt(2) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Subject 1</th>");
			pw.write("<td>" + rs.getInt(4) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Subject 2</th>");
			pw.write("<td>" + rs.getInt(5) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Subject 3</th>");
			pw.write("<td>" + rs.getInt(6) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Total</th>");
			pw.write("<td>" + rs.getInt(7) + "</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Percentage</th>");
			pw.write("<td>" + rs.getInt(8) + "% 	</td>");
			pw.write("</tr>");
			
			pw.write("<tr>");
			pw.write("<th>Result</th>");
			pw.write("<td>" + rs.getString(9) + "</td>");
			pw.write("</tr>");
			pw.write("</thead>");
				pw.write("</table>");
			}
			else {
				pw.write("No Student Found of given PRN");
			}
			

		} catch (SQLException e) {
		    e.printStackTrace(); // Handle the exception appropriately
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
