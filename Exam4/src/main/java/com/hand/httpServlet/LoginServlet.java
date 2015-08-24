package com.hand.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("===serviece====");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		doPost(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		doPost(req, resp);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("=====doPost");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter pr = resp.getWriter();

		if (username.equals("kaidi") && password.equals("yingying")) {

			// 请求转发
			String forward = "/02/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			// 请求重定向

			// resp.sendRedirect(req.getContextPath()+"/02/success.jsp");

		} else {
			// 请求转发,不能转发给其他应用
			// String forward="/02/error.jsp";
			// RequestDispatcher rd=req.getRequestDispatcher(forward);
			// rd.forward(req, resp);

			resp.sendRedirect("http://www.baidu.com");
		}
	}

}
