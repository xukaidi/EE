package com.hand.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.hand.util.User;


public class LoginServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet03() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CheckUserService cus=new CheckUserService();
		User user=new User();
		String username=request.getParameter("username");
		String returnUri=request.getParameter("return_uri");
		
		System.out.println("用户名=="+username);
		System.out.println("return_uri==："+returnUri);
		RequestDispatcher rd=null;
		if(username==null){
			request.setAttribute("msg", "用户为空");
			rd=request.getRequestDispatcher("/login.jsp");
			
		}
		else{
			if(cus.check(user, username)==true){
				request.getSession().setAttribute("flag", "login_success");
				request.getSession().setAttribute("username", username);
				System.out.println("session+"+username);
				System.out.println("登录结果"+cus.check(user, username));
				System.out.println("用户登录成功");
				if(returnUri!=null){
					rd=request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				}else {
					rd=request.getRequestDispatcher("/index.jsp");
					rd.forward(request, response);
				}
			}else{
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户或者密码错误");
				rd=request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			}
			
		}
	}

}
