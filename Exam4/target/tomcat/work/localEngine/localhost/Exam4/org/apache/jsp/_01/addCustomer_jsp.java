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
      out.write("<link href=\"bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"index.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"head\" style=\"background-color: #00FF33;width: 1500px;height: 60px;margin: 0 auto\">\r\n");
      out.write("    <div class=\"\">\r\n");
      out.write("        <div class=\" \" style=\"float: left;margin-left: 50px\">\r\n");
      out.write("            <a class=\"\" style=\"color: red\"><h1>8831 许凯迪</h1></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"admin\" style=\"float: right;margin-right: 400px\" >\r\n");
      out.write("       <h1>");
      out.print(request.getParameter("username") );
      out.write("</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"left\"  >\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.jsp\"><h3>Donbord</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>应用设置</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>管理设置</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>数据配置</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>主数据管理</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>客户订单管理</h3></a></li>\r\n");
      out.write("                <li><a href=\"FilmIndex.jsp\"> <h3>发货单管理</h3></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("        <div ><h1>创建Customer</h1></div>\r\n");
      out.write("        <div class=\"conten-text\">\r\n");
      out.write("            <form method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/AddFilmServlet\" >\r\n");
      out.write("                <div style=\"float: left\"><h4>基本信息</h4></div>\r\n");
      out.write("                <div style=\"width: 200px;height: 100px;margin: 0px auto;text-align: center\"> </div>\r\n");
      out.write("               First Name* <input type=\"text\" name=\"fisrt_name\"><br><br>\r\n");
      out.write("               Last Name*  <input type=\"text\" name=\"last_name\"><br><br>\r\n");
      out.write("               Email       <input type=\"text\" name=\"email\"><br><br>\r\n");
      out.write("               Address* &nbsp;<input type=\"text\" name=\"address\"><br><br>\r\n");
      out.write("                <input type=\"submit\" value=\"提交\" style=\"margin-left: 100px\" >\r\n");
      out.write("                <input type=\"reset\" value=\"取消\" >\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
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
