

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DriverManage = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","indupriya@2001");
		PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?)");
		ps.setString(1, fname);
		ps.setString(2, email);
		ps.setString(3,Password);
		int i=ps.executeUpdate();
		if(i>0)
		{
			out.print("You are succesfully registered");
			RequestDispatcher rd=request.getRequestDispatcher("homepage.html");
			rd.include(request,response);
		}
	}
	catch(Exception e)
	{
	  	
	}
	out.close();
	}
}
