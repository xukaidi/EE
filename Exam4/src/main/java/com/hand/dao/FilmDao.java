package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.util.Film;

public interface FilmDao {
	public void save(Connection conn, Film f) throws SQLException;

	public void update(Connection conn, int id, Film f) throws SQLException;

	public void delete(Connection conn, Film f) throws SQLException;

	public ResultSet query(Connection conn, String name,Film f)  throws SQLException;

}
