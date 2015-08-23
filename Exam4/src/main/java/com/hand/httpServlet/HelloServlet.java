package com.hand.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet{
	
	
	
	public void init() throws ServletException {
		System.out.println("====init=====");
		//super.init();
	}

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("====init=====");
		super.init(config);
	}

	

	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("====service=====");
		System.out.println(req.getContextPath());
		PrintWriter or=resp.getWriter();
		or.println("hello world");
	}

	
	public void destroy() {
		System.out.println("====destroy=====");
		super.destroy();
	}

	
	
}
