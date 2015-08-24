package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tomcat.jni.Local;
import org.omg.CORBA.DATA_CONVERSION;

import com.hand.util.Film;

public class FilmDaoImpl implements FilmDao {

	public void save(Connection conn, Film f) throws SQLException {
		System.out.println("执行add");
		PreparedStatement ps = conn
				.prepareCall("INSERT INTO customer(first_name,last_name,email,address_id,store_id,create_date)VALUES(?,?,?,?,?,?)");
		ps.setString(1, f.getFirstname());
		ps.setString(2, f.getLastname());
		ps.setString(3, f.getEmail());
		ps.setInt(4,6);
		ps.setInt(5,1);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String str = sdf.format(date);
		ps.setString(6, str);
		ps.execute();

	}
	
	public void update(Connection conn, int id, Film f) throws SQLException {
		PreparedStatement ps = conn
				.prepareCall("UPDATE  customer SET first_name=?,last_name=?, email=? WHERE customer_id=? ");
	
		ps.setString(1, f.getFirstname());
		ps.setString(2, f.getLastname());
		ps.setString(3, f.getEmail());
		ps.setInt(4,id);
		ps.execute();
		System.out.println("结束");
	}

	public void delete(Connection conn ,Film f) throws SQLException {
		
		PreparedStatement preparedStatement;
		String sql = "delete from payment where customer_id=?";
			preparedStatement = conn.prepareCall(sql);
			preparedStatement.setInt(1, f.getCoustomerId());
			preparedStatement.execute();
			sql = "delete from rental where customer_id=?";
			preparedStatement = conn.prepareCall(sql);
			preparedStatement.setInt(1, f.getCoustomerId());
		
			preparedStatement.execute();
			
			sql = "delete from customer where customer_id=?";
			preparedStatement = conn.prepareCall(sql);
			preparedStatement.setInt(1, f.getCoustomerId());
		
			preparedStatement.execute();
		
		System.out.println("impDao删除成功");

	}

	public ResultSet query(Connection conn, String name,Film f) throws SQLException {
		PreparedStatement ps = conn
				.prepareCall("SELECT  * FROM film ");
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("dao层film查询成功");
		}
		
		return rs;
	}






}
