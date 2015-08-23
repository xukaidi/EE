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


public class EdiFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	FilmDao filmDao;
    Film f;
    public EdiFilmServlet() {
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
		 try {
			 System.out.println("进入编辑");
			 System.out.println("编辑的id"+request.getParameter("eid"));
			 int id=Integer.parseInt(request.getParameter("eid").toString());
			 f.setCoustomerId(id);
			 f.setFirstname(request.getParameter("firstname"));
			 System.out.println("NADA"+request.getParameter("firstname"));
			 f.setLastname(request.getParameter("lastname"));
			 f.setEmail(request.getParameter("email"));
			 System.out.println("editserv+email="+request.getParameter("email"));
			 //f.setDescription(request.getParameter("des"));
			filmDao.update(conn, id, f);
			System.out.println("编辑成功");
			RequestDispatcher rd;
			rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

}
