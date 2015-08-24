package com.hand.filmServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.FilmDao;
import com.hand.dao.FilmDaoImpl;
import com.hand.jdbc.ConnectionFactory;


public class ShowFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   FilmDao flimDao=new FilmDaoImpl();
   ResultSet rs;
   Connection conn;
   
    public ShowFilmServlet() {
       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			conn=ConnectionFactory.getInstance().getConnection();
			PreparedStatement ps = conn
					.prepareCall("SELECT film_id,title,description,language.name FROM film,language where film.language_id=language.language_id ");
			
			ResultSet rs=ps.executeQuery();
			
					int i=0;
					while(rs.next()){
					request.setAttribute("id"+i, rs.getInt(1));
					request.setAttribute("title"+i, rs.getString(2));
					request.setAttribute("description"+i, rs.getString(3));
					request.setAttribute("languageid"+i, rs.getString(4));
					i++;
				}
			
			
			RequestDispatcher rd;
			rd=request.getRequestDispatcher("01/showFilm.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
