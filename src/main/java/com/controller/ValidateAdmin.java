package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Admins;
import com.model.AdminsDao;

/**
 * Servlet implementation class ValidateAdmin
 */
public class ValidateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        response.setContentType("text/html");

	        String username = request.getParameter("uname");
	        String password = request.getParameter("pass");
	        
	        Admins ad = new Admins(); // Creating object
	        ad.setUsername(username);
	        ad.setPassword(password);
			
	        boolean status = AdminsDao.doValidate(ad);
	            if(status)
		    {
	                //Logged in  as admin do something (pending)
	                HttpSession session = request.getSession();
	                session.setAttribute("username", ad.getUsername());
	                response.sendRedirect("AdminPanel.jsp");
		    }
		    else
		    {
		    	String msg2 = "Invalid Username or Password";
		    	response.sendRedirect("AdminLogin.jsp?msg2="+msg2);
		    }
	        
	}

}
