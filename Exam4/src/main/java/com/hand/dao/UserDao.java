package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.util.User;

public interface UserDao {


	public boolean query(Connection conn, String name,User user)  throws SQLException;

}
