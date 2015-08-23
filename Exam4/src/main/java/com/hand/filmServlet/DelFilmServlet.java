package com.hand.filmServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.FilmDao;
import com.hand.dao.FilmDaoImpl;
import com.hand.jdbc.ConnectionFactory;
import com.hand.util.Film;


public class DelFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	FilmDao filmDao;
    Film f;
    public DelFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;

		conn = ConnectionFactory.getInstance().getConnection();
		
		System.out.println("service连接数据库成功");
		 filmDao=new FilmDaoImpl();
		  f=new Film();
		//f.setFilmId(request.getAttribute("fid"));
		  request.getParameter("id");
		  System.out.println("immmmid"+request.getParameter("id").toString());
		  f.setCoustomerId(Integer.parseInt(request.getParameter("id").toString()));
		 try {
			filmDao.delete(conn,f);
			System.out.println("删除成功");
			RequestDispatcher rd;
			rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

}
