package com.za.tutorial.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletController extends HttpServlet { //metodo para crear el Servlet
	private static final long serialVersionUID = 1L; //metodo para crear el Servlet
    public ServletController() { //metodo para crear el Servlet
        super(); //metodo para crear el Servlet
    } //metodo para crear el Servlet

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //metodo para crear el Servlet
		PersonBeanModel person = new PersonBeanModel(); //metodo para crear el Servlet
		person.setName(request.getParameter("name")); //metodo para crear el Servlet
		person.setMail(request.getParameter("mail")); //metodo para crear el Servlet
		person.doSomething(); //metodo para crear el Servlet
		request.setAttribute("person", person); //metodo para crear el Servlet
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response); //metodo para crear el Servlet
	} //metodo para crear el Servlet

}
