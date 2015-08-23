<%@page import="com.hand.filmServlet.AddFilmServlet"%>
<%@page import="com.hand.jdbc.ConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,com.hand.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/AddFilmServlet" method="post">
	添加电影：
	<br> 电影title：
	<input type="text" name="title">
	<br> 电影discription：
	<input type="text" name="des">
	<br>
	<%
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		PreparedStatement ps = conn
				.prepareCall("SELECT  * FROM language  ");
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
		%>电影laungege：
		<select>
		<script>
		var i = 0;
		document.write("<option name="name" value='"+i+"'/><%=rs.getString(2)%></option>");
		i++;
		</script>
	</select>
	<%
		
		}
	%>
	
	<input type="submit" value="提交" />
	
	</form>
</body>
</html>