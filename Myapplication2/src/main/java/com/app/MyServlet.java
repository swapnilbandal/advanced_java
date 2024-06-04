package com.app;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns= {"/ser1"},initParams= {@WebInitParam(name="ROI",value="6.2")})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
	private String uname,pwd;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In init() of httpServlet");
		super.init(config);
	}
	
	

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init() method");
		config =getServletConfig();
		uname=config.getInitParameter("user");
		pwd = config.getInitParameter("password");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("username"+uname+"<br>password: "+pwd+"ROI: "+config.getInitParameter("ROI"));
		Enumeration<String> e= config.getInitParameterNames();
		while(e.hasMoreElements()) {
			String str=e.nextElement();
			pw.write("<br>"+str+config.getInitParameter(str));
		}
		pw.close();
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
