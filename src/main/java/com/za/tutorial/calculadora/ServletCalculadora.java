package com.za.tutorial.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletCalculadora extends HttpServlet { //metodo para crear el Servlet
	private static final long serialVersionUID = 1L; //metodo para crear el Servlet
    public ServletCalculadora() { //metodo para crear el Servlet
        super(); //metodo para crear el Servlet
    } //metodo para crear el Servlet

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //metodo para crear el Servlet
		Calculadora calcu = new Calculadora(); //metodo para crear el Servlet
		calcu.setA(Integer.parseInt(request.getParameter("a"))); //metodo para crear el Servlet
		calcu.setB(Integer.parseInt(request.getParameter("b"))); //metodo para crear el Servlet
		calcu.doSomething(); //metodo para crear el Servlet
		request.setAttribute("calcu", calcu); //metodo para crear el Servlet
		getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response); //metodo para crear el Servlet
		
	}
	

}
