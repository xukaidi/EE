<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<link href="bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">
<script src="jquery-2.1.1.min.js"></script>
<script src="bootstrap.min.js"></script>



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
    <div class="bgIcon" style="background-image: url(blue.jpg);height:800px;weith:1000px;background-repeat: no-repeat;margin-left:300px">
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
	
	
				<table class="table table-bordered table-condensed" border="0" 
					 align="center" style="width:500px;margin:0px auto">
					<tr>
						<td >电影租赁管理系统登录</td>
						<td>
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
						<td ><button type="submit"
							name="submit" class="btn btn-success" style="align:left"/> 登录
							</button>
						</td>
						<td>
					</tr>
	
	
				</table>
	
			</form>
	     </div>

    </div>
</div>
</body>
</html>