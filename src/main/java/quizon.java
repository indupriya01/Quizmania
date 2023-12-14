

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class quizon
 */
public class quizon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quizon() {
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
		int score=0;
		String c="",a="",p="";
		c=request.getParameter("first");
		a=request.getParameter("second");
		p=request.getParameter("third");
		if(c.equals("th"))
		{
			//out.println("your first answer is correct : <br/>");
			score++;
			
		}
		else
		{
			
		}
		
		if(a.equals("se1"))
		{
			
			score++;
			
		}
		else
		{
			
		}
		if(p.equals("se2"))
		{
			
			score++;
			
		}
		else
		{
			
		}
		 request.setAttribute("score", score);
	     request.getRequestDispatcher("maths.html").forward(request, response);
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
