package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user_email = request.getParameter("user_email");
		String user_passWord = request.getParameter("user_password");
		PrintWriter out = response.getWriter();
		if (user_email == "" || user_passWord == "") {

			out.println("<h1>Please enter all fields</h1>");
		}

		else {
			if (user_email.equals("vishalchhadekar95@gmail.com") && user_passWord.equals("Lucifer@Lux")) {
				out.println("<h1>Welcome back, to our application</h1>");
//				out.println("<h1><a href="LogoutServlet">Log Out</a></h1>");
				out.print("<h1><a href='LogoutServlet'>Log Out</a></h1>"); 
				
			} else {
				out.println("<h1>You are not existing user, Please Sign up first OR check your credentials.</h1>");
			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
