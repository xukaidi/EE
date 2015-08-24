<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示film</title>

</head>
<body>


	<%
	for(int i=0;i<1010;i++){
		%>电影的id为：<% out.println(request.getAttribute("id"+i));
		
		
		%>电影的title为：<%out.println(request.getAttribute("title"+i));
		%>电影的description为：<%out.println(request.getAttribute("description"+i));
		%>电影的language为：<%out.println(request.getAttribute("languageid"+i));
		%>
		
		<br><a href="<%=request.getContextPath()%>/DelFilmServlet?id=<%=request.getAttribute("id"+i)%>" value="<%=i%>">删除记录</a>
		<a href="<%=request.getContextPath()%>/01/editFilm.jsp?id=<%=request.getAttribute("id"+i)%> ">编辑记录</a>
		
	<% 
	
	}
	
		
%>
	



</body>
</html>