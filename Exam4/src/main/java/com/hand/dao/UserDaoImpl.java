package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.util.User;

public class UserDaoImpl implements UserDao {


	

	public boolean query(Connection conn, String name,User user) throws SQLException {
		try {
			//String sql=""
			System.out.println("dao name"+name);
			PreparedStatement ps = conn.prepareStatement("SELECT first_name FROM customer  WHERE first_name=?");
			ps.setString(1,name);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("存在该用户");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("不存在该用户查询结束");
		return false;
	}



}
