<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功界面</title>

<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}

#message {
	text-align: center;
}
</style>
</head>
<body>
	<div id="message">
		登陆成功： <br>
		<%
			String flag = "";
			Object obj = session.getAttribute("flag");
			if (obj.equals("login_success")) {
		%>
		用户保存成功
		<%
			} else {
				out.print("用户没保存");
			}
		%>
		 你提交的信息为：<br> 用户名：<%=session.getAttribute("username")%>
		密码：<%=request.getParameter("password")%>
		<a href="<%=request.getContextPath() %>/03/login.jsp">返回登录界面</a>
	</div>


</body>
</html>