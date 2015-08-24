package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.hand.jdbc.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

public static final int PAGESIZE = 20;
	int pageCount;
	int curPage = 1;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<link href=\"bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"index.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"head navbar-header col-lg-1\"\r\n");
      out.write("\t\tstyle=\"width: 1500px; height: 60px; margin: 0 auto\">\r\n");
      out.write("\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<div class=\" \" style=\"float: left; margin-left: 50px\">\r\n");
      out.write("\t\t\t\t<a class=\"\" style=\"color: red\"><h1>8831 许凯迪</h1> </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"admin navbar-right \">\r\n");
      out.write("\t\t\t<h1 style=\"color: darkgreen\">");
      out.print(request.getParameter("username"));
      out.write("</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t<div class=\"ul\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills nav-stacked \">\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\" role=\"presentation\" class=\"active\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"index.jsp\"><h3>Customer管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\" role=\"presentation\" class=\"\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Film管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>客户管理</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"float: left\">\r\n");
      out.write("\t\t\t\t<h4>客户列表</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"btn btn-success \"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 200px\" value=\"新建\"\r\n");
      out.write("\t\t\t\t\tonclick=\"window.location='");
      out.print(request.getContextPath());
      out.write("/01/addCustomer.jsp'\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\" border=\"0\" spacing=\"2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td>first_name</td>\r\n");
      out.write("\t\t\t\t\t\t<td>last_name</td>\r\n");
      out.write("\t\t\t\t\t\t<td>email</td>\r\n");
      out.write("\t\t\t\t\t\t<td>customer_id</td>\r\n");
      out.write("\t\t\t\t\t\t<td>last_update</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						try {
							Connection con = ConnectionFactory.getInstance()
									.getConnection();
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
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-target=\".myModal2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a>编辑</a>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal fade myModal2\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">进入编辑</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/EdiFilmServlet?eid=");
      out.print(customer_id);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"eid\" value=\"");
      out.print(customer_id);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"recipient-name\" class=\"control-label\">First\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tName*</label> <input class=\"form-control\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"recipient-name\" name=\"firstname\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"recipient-name\" class=\"control-label\">Last\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tName*</label> <input class=\"form-control\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"recipient-name\" name=\"lastname\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor=\"recipient-name\" class=\"control-label\">Email</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" type=\"text\" id=\"recipient-name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"email\"> <label for=\"recipient-name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"control-label\">提交</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" type=\"submit\" value=\"提交\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/DelFilmServlet?id=");
      out.print(customer_id);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(customer_id);
      out.write("\">删除</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(first_name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(last_name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(email);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(customer_id);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(last_update);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						} while (rs.next());
							con.close();
						} catch (Exception e) {

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div style=\"text-align: center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group \" style=\"float: right\" id=\"btn-g\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-success\" href=\"index.jsp?curPage=1\">首页</a>\r\n");
      out.write("\t\t\t\t\t\t <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\" href=\"index.jsp?curPage=");
      out.print(curPage - 1);
      out.write("\">上一页</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-success\"\thref=\"index.jsp?curPage=");
      out.print(curPage + 1);
      out.write("\">下一页</a> \r\n");
      out.write("\t\t\t\t\t\t\t<a\tclass=\"btn btn-success\" href=\"index.jsp?curPage=");
      out.print(pageCount);
      out.write("\">尾页</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\"#exam\").on(\"show.bs.modal\", function(event) {\r\n");
      out.write("\t\t\tvar button = $(event.relatedTarget);\r\n");
      out.write("\t\t\tvar recipient = button.data(\"whatever\");\r\n");
      out.write("\t\t\tvar modal = $(this);\r\n");
      out.write("\t\t\tmodal.find(\".modal-title\").text(\"new message\" + recipient);\r\n");
      out.write("\t\t\tmodal.find(\".modal-body input\").val(recipient);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
