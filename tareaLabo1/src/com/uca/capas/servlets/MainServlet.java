package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
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
		// doGet(request, response);
		
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		
		List<String> passwords = new ArrayList<String>();
		passwords.add("hola");
		passwords.add("mundo");
		passwords.add("uca");
		passwords.add("nCapas");
		passwords.add("quarantine");
		passwords.add("covid");
		
		PrintWriter out = response.getWriter();
		
		if (user.isEmpty() || password.isEmpty()) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Please, complete all fields</h3>");
			out.println("</body>");
			out.println("</html>");
			
		} else {
			
			if (passwords.contains(password)) {
				out.println("<html>");
				out.println("<body>");
				out.println("<h3><font color='green'>CORRECT ACCESS</font></h3>");
				out.println("</body>");
				out.println("</html>");
				
			} else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h3><font color='red'>INCORRECT ACCESS</font></h3>");
				out.println("</body>");
				out.println("</html>");	
			}
		}
	}

}