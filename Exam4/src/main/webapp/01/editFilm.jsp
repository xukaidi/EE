<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/EdiFilmServlet" method="post">
	编辑电影的ID：<%=request.getParameter("id") %>
	<% request.getSession().setAttribute("eid",request.getParameter("id")); %>
	<br> 电影title：
	<input type="text" name="title">
	<br> 电影discription：
	<input type="text" name="des">
	<br>
	电影languageID <input type="text" name="lid">
	<br>
	<input type="submit" value="提交" />
	</form>
</body>
</html>