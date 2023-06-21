package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staff_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/staffDropdown.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav id=\"sidebar\">\r\n");
      out.write("                <div class=\"custom-menu\">\r\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"img bg-wrap text-center py-4\" style=\"background-image: url(./image/bg_1.jpg);\">\r\n");
      out.write("                    <div class=\"user-logo\">\r\n");
      out.write("                        <div class=\"img\" style=\"background-image: url(./image/logo-yoga.jpg);\"></div>\r\n");
      out.write("                        <h3>YOGA CENTER</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("                    <li onmouseover=\"showDropdown('courses')\" onmouseout=\"hideDropdown('courses')\">\r\n");
      out.write("                        <a href=\"mainController?action=courses\"><span class=\"fa-solid fa-book mr-3\"></span> KHÓA HỌC</a>\r\n");
      out.write("                        <ul id=\"courses\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"insertCourse.jsp\">Thêm khóa học</a></li>\r\n");
      out.write("                            <li><a href=\"getDelete\">Khóa học đã xóa</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li onmouseover=\"showDropdown('event')\" onmouseout=\"hideDropdown('event')\">\r\n");
      out.write("                        <a href=\"mainController?action=event\"><span class=\"fa fa-gift mr-3\"></span> KHUYẾN MÃI</a>\r\n");
      out.write("                        <ul id=\"event\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"insertEvent\">Thêm khuyến mãi</a></li>\r\n");
      out.write("                            <li><a href=\"pendingevent\">Khuyến mãi đã xóa</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"mainController?action=listSchedule\"><span class=\"fa-solid fa-calendar-days mr-3\"></span> LỊCH DẠY</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li onmouseover=\"showDropdown('news')\" onmouseout=\"hideDropdown('news')\">\r\n");
      out.write("                        <a href=\"mainController?action=news\"><span class=\"fa-solid fa-newspaper mr-3\"></span> TIN TỨC</a>\r\n");
      out.write("                        <ul id=\"news\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"#\">Thêm tin tức</a></li>\r\n");
      out.write("                            <li><a href=\"pendingnews\">Tin tức đã xóa</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"mainController?action=\"><span class=\"fa-solid fa-people-group mr-3\"></span> KHÁCH HÀNG</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"logout\"><span class=\"fa fa-sign-out mr-3\"></span> Đăng Xuất</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"../js/staffDropdown.js\"></script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
