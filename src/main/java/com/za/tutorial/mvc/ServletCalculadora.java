package com.za.tutorial.mvc;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletCalculadora() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculadora calcu = new Calculadora();
		calcu.setA(Integer.parseInt(request.getParameter("a")));
		calcu.setB(Integer.parseInt(request.getParameter("b")));
		calcu.doSomething();
		request.setAttribute("person", calcu);
		getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
		
	}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
