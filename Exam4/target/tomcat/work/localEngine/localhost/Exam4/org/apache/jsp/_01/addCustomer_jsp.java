package org.apache.jsp._01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>增加客户</title>\r\n");
      out.write("<link href=\"../bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"index.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"../jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"../bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"index.jsp\"><h3>Donbord</h3>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>应用设置</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>管理设置</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>数据配置</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>主数据管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>客户订单管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\"><a href=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>发货单管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>创建Customer</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"conten-text\">\r\n");
      out.write("\t\t\t\t<form method=\"post\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/AddFilmServlet\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left\">\r\n");
      out.write("\t\t\t\t\t\t<h4>基本信息</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 200px; height: 100px; margin: 0px auto; text-align: center\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">First Name*</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"fisrt_name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">Last Name*</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"last_name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">Email</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"email\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">Address*</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"address\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" style=\"margin-left: 600px\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-success\">取消</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
