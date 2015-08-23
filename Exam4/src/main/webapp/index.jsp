<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">
<script src="jquery-2.1.1.min.js"></script>
<script src="bootstrap.min.js"></script>
</head>
<body>




	<div class="head"
		style="background-color: #00FF33; width: 1500px; height: 60px; margin: 0 auto">
		<div class="">
			<div class=" " style="float: left; margin-left: 50px">
				<a class="" style="color: red"><h1>8831 许凯迪</h1> </a>
			</div>
		</div>
		<div class="admin" style="float: right; margin-right: 400px">
			<h1><%=request.getParameter("username")%></h1>
		</div>
	</div>
	<div class="container">
		<div class="left">
			<div class="ul">
				<ul>
					<li><a href="index.jsp"><h3>Customer管理</h3> </a>
					</li>
					<li><a href="FilmIndex.jsp">
							<h3>Film管理</h3> </a>
					</li>
				</ul>
			</div>
		</div>
		<div class="right">
			<div>
				<h1>客户管理</h1>
			</div>
			<div style="float: left">
				<h4>客户列表</h4>
			</div>
			<div>
				<input type="button" class="btn" value="新建"
					onclick="window.location='<%=request.getContextPath()%>/01/addCustomer.jsp'">
			</div>
			<div class="form">
				<table border="1" spacing="2">

					<tr>
						<td>操作</td>
						<td></td>
						<td>first_name</td>
						<td>last_name</td>
						<td>email</td>
						<td>customer_id</td>
						<td>last_update</td>

					</tr>



					<%!public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String USER = "root";
	public static final String PASS = "111111";
	public static final String URL = "jdbc:mysql://localhost:3306/sakila";
	public static final int PAGESIZE = 20;
	int pageCount;
	int curPage = 1;%>
					<%
						String user = null;
						String pass = null;
						try {
							Class.forName(DRIVER);
							Connection con = DriverManager.getConnection(URL, USER, PASS);
							String sql = "SELECT first_name,last_name,email,customer_id,last_update FROM customer";
							PreparedStatement stat = con
									.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY,
											ResultSet.CONCUR_READ_ONLY);
							ResultSet rs = stat.executeQuery();
							rs.last();
							int size = rs.getRow();
							pageCount = (size % PAGESIZE == 0) ? (size / PAGESIZE) : (size
									/ PAGESIZE + 1);
							String tmp = request.getParameter("curPage");
							if (tmp == null) {
								tmp = "1";
							}
							curPage = Integer.parseInt(tmp);
							if (curPage >= pageCount)
								curPage = pageCount;
							boolean flag = rs.absolute((curPage - 1) * PAGESIZE + 1);
							out.println(curPage);
							int count = 0;

							do {
								if (count >= PAGESIZE)
									break;
								String first_name = rs.getString(1);
								String last_name = rs.getString(2);
								String email = rs.getString(3);
								int customer_id = rs.getInt(4);
								String last_update = rs.getString(5);

								count++;
					%>
					<tr>
						<td>
							<button type="button" class="btn btn-default" data-toggle="modal"
								data-target=".myModal2"><a>编辑</a></button>
							<div class="modal fade myModal2" tabindex="-1" role="dialog"
								aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
									 <div class="modal-header">
										进入编辑
            						    </div>
										<div class="modal-body">
											<form action="<%=request.getContextPath()%>/EdiFilmServlet?eid=<%=customer_id%>" method="post">
												<div class="form-group">
													 <input type="hidden" name="eid" value="<%=customer_id %>">
													<label for="recipient-name" class="control-label">First Name*</label>
													<input class="form-control" type="text" id="recipient-name" name="firstname">
													<label for="recipient-name" class="control-label">Last Name*</label>
													<input class="form-control" type="text" id="recipient-name" name="lastname">
													<label for="recipient-name" class="control-label">Email</label>
													<input class="form-control" type="text" id="recipient-name" name="email">
													<label for="recipient-name" class="control-label">提交</label>
													<input class="form-control" type="submit" value="提交">
												</div>
											</form>
										</div>
									</div>
								</div>
							</div></td>
						<td><a
							href="<%=request.getContextPath()%>/DelFilmServlet?id=<%=customer_id%>"
							value="<%=customer_id%>">删除</a></td>
						<td><%=first_name%></td>
						<td><%=last_name%></td>
						<td><%=email%></td>
						<td><%=customer_id%></td>
						<td><%=last_update%></td>

					</tr>
					<%
						} while (rs.next());
							con.close();
						} catch (Exception e) {

						}
					%>
				</table>
				<div style="text-align: center">
					<a href="index.jsp?curPage=1">首页</a> <a
						href="index.jsp?curPage=<%=curPage - 1%>">上一页</a> <a
						href="index.jsp?curPage=<%=curPage + 1%>">下一页</a> <a
						href="index.jsp?curPage=<%=pageCount%>">尾页</a> 第<%=curPage%>页
				</div>

			</div>
		</div>
	</div>



	<script>
		$("#exam").on("show.bs.modal", function(event) {
			var button = $(event.relatedTarget);
			var recipient = button.data("whatever");
			var modal = $(this);
			modal.find(".modal-title").text("new message" + recipient);
			modal.find(".modal-body input").val(recipient);
		})
	</script>



</body>
</html>