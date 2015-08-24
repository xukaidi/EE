package com.hand.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
	public  static final ConnectionFactory factory=new ConnectionFactory();
	
	private  Connection  conn;

	static {

		Properties pro = new Properties();
		try {
			// 读取，加载文件
			InputStream in = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("db.properties");
			pro.load(in);

		} catch (Exception e) {
			System.out.println("===配置文件读取错误===");
		}
		
		driver=pro.getProperty("driver");
		dburl=pro.getProperty("dburl");
		user=pro.getProperty("user");
		password=pro.getProperty("password");
	}
	
	private ConnectionFactory(){
		
	}
	
	public  static ConnectionFactory getInstance() {
		return factory;
	}
	

	public Connection getConnection(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(dburl,user,password);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
		
		
	}
	
}
