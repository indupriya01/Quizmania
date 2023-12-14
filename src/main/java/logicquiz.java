

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logicquiz
 */
public class logicquiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logicquiz() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int cnt=0;
		String c="",a="",p="";
		c=request.getParameter("first");
		a=request.getParameter("second");
		p=request.getParameter("third");
		if(c.equals("th"))
		{
			//out.println("your first answer is correct : <br/>");
			cnt++;
			
		}
		else
		{
			
		}
		
		if(a.equals("fou1"))
		{
			
			cnt++;
			
		}
		else
		{
			
		}
		if(p.equals("se2"))
		{
			
			cnt++;
			
		}
		else
		{
			
		}
		 RequestDispatcher rd = request.getRequestDispatcher("maths.html");
	     out.println("<h1>You have scored"+cnt+"points.</h1>");
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
