package pl.ztus.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Family_Budget_Servlet
 */
@WebServlet("/Servlet")
public class Family_Budget_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Family_Budget_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().print("Gratulacje " + request.getParameter("fname") + " " + request.getParameter("lname"));
		response.getWriter().print("\n" + "Wlasnie dolaczyles do druzyny Javy");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
