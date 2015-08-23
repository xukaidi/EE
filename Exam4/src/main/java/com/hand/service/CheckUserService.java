package com.hand.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;
import com.hand.jdbc.ConnectionFactory;
import com.hand.util.User;

public class CheckUserService {
	private UserDao userDao = new UserDaoImpl();

	public boolean check(User user, String name) {
		Connection conn = null;

		conn = ConnectionFactory.getInstance().getConnection();
		System.out.println("service连接数据库成功");
		try {
			if (userDao.query(conn, name, user)==true)
			{
			System.out.println("service查询成功");
			return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("checkUser找不到用户");
		return false;
	}

}
