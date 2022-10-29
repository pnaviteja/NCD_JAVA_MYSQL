

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int first=Integer.parseInt(request.getParameter("first"));
        int second=Integer.parseInt(request.getParameter("second"));
        int third=Integer.parseInt(request.getParameter("third"));
        int fourth=Integer.parseInt(request.getParameter("fourth"));
        int fifth=Integer.parseInt(request.getParameter("fifth"));
        int sixth=Integer.parseInt(request.getParameter("sixth"));
        
        int sum=(first+second+third+fourth+fifth+sixth);
        
        if (sum == -1)
			out.println("<h2>Please answer the questions first.");
		if (sum > 4)
			out.println("The person needs  screening.");
		if (sum < 4)
			out.println("<br>The person is not at risk of NCDs and doesn't need screening.");
        out.print("THE TOTAL SCORE IS = "+sum);
        out.println("<body>");
        out.println("<html>");

        out.println("<button onclick=location.href='Registration.jsp'; align=\"center\" class=\"btn btn-primary\" >Back</button>");
        out.println("</body>");
        out.println("</html>");
    }

	}


