<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加客户</title>
<link href="bootstrap.min.css" rel="stylesheet">
    <link href="index.css" rel="stylesheet">
</head>
<body>
<div class="head" style="background-color: #00FF33;width: 1500px;height: 60px;margin: 0 auto">
    <div class="">
        <div class=" " style="float: left;margin-left: 50px">
            <a class="" style="color: red"><h1>8831 许凯迪</h1></a>
        </div>
    </div>
    <div class="admin" style="float: right;margin-right: 400px" >
       <h1><%=request.getParameter("username") %></h1>
    </div>
</div>
<div class="container">
    <div class="left"  >
        <div>
            <ul>
                <li><a href="index.jsp"><h3>Donbord</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>应用设置</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>管理设置</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>数据配置</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>主数据管理</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>客户订单管理</h3></a></li>
                <li><a href="FilmIndex.jsp"> <h3>发货单管理</h3></a></li>
            </ul>
        </div>
    </div>
    <div class="right">
        <div ><h1>创建Customer</h1></div>
        <div class="conten-text">
            <form method="post" action="<%=request.getContextPath()%>/AddFilmServlet" >
                <div style="float: left"><h4>基本信息</h4></div>
                <div style="width: 200px;height: 100px;margin: 0px auto;text-align: center"> </div>
               First Name* <input type="text" name="fisrt_name"><br><br>
               Last Name*  <input type="text" name="last_name"><br><br>
               Email       <input type="text" name="email"><br><br>
               Address* &nbsp;<input type="text" name="address"><br><br>
                <input type="submit" value="提交" style="margin-left: 100px" >
                <input type="reset" value="取消" >
            </form>
        </div>

    </div>
</div>

	
</body>
</html>