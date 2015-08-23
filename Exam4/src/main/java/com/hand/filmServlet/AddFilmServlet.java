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

public class AddFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FilmDao filmDao;
	Film f;

	public AddFilmServlet() {
		 super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("addServelt");
		filmDao = new FilmDaoImpl();
		f = new Film();
		System.out.println("add的til"+request.getParameter("fisrt_name").toString());
		try {
			Connection conn;
			conn = ConnectionFactory.getInstance().getConnection();
			
			f.setFirstname(request.getParameter("fisrt_name").toString());
			f.setLastname(request.getParameter("last_name").toString());
			f.setEmail(request.getParameter("email").toString());
			filmDao.save(conn,f);
			System.out.println("添加成功");
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
