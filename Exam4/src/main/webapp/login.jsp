<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>

<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}
</style>

<script type="text/javascript">
	function check(form) {
		if (document.forms.loginForm.username.value == "") {
			alert("请输入用户名");
			document.forms.loginForm.username.focus();
			return false;
		}

	}
</script>
</head>
<body>
<div class="container" style="background-color:#27CBC7">
    <div class="bgIcon" style="background-image: url(blue.jpg);height:800px;weith:2000px;background-repeat: no-repeat;margin-left:300px">
        <div class="header" style="margin-bottom: 200px;margin-top: 20px">
            <h1>8831 许凯迪</h1>
        </div>
        <div class="content">
		
			<form action="<%=request.getContextPath()%>/LoginServlet03"
				method="post" name="loginForm">
				<%
					if (request.getAttribute("return_uri") != null) {
				%>
				<input type="hidden" name="return_uri"
					value=<%=request.getAttribute("return_uri")%> ""/>
				<%
					}
				%>
	
	
				<table border="1" cellspacing="0" cellpadding="5"
					bordercolor="silver" align="center">
					<tr>
						<td colspan="2" align="left" bgcolor="#E8E8E8">电影租赁管理系统登录</td>
					</tr>
					<tr>
						<td>用户名：</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td colspan="2" align=""><input type="submit"
							name="submit" value="登录" style="align:left"/> 
						</td>
					</tr>
	
	
				</table>
	
			</form>
	     </div>

    </div>
</div>
</body>
</html>