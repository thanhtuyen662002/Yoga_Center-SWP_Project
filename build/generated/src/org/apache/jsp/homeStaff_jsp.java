package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/updateInsertCourse.css\">\r\n");
      out.write("        <title>Home Staff</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <div class=\"header-nav logo widthLess\" id=\"logo\">\r\n");
      out.write("        <button class=\"header-button\">\r\n");
      out.write("          <div class=\"header-button-li btn1\"></div>\r\n");
      out.write("          <div class=\"header-button-li btn2\"></div>\r\n");
      out.write("          <div class=\"header-button-li btn3\"></div>\r\n");
      out.write("        </button>\r\n");
      out.write("        <h2 class=\"h2\">RO<span>LE</span> STA<span>FF</span></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <nav class=\"nav-content1 widthLess\" id=\"nav\">\r\n");
      out.write("            <ul class=\"nav-content-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-solid fa-book\"></i>\r\n");
      out.write("                    <span><a href=\"mainController?action=courses\">KHÓA HỌC</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-solid fa-newspaper\"></i>\r\n");
      out.write("                    <span><a href=\"mainController?action=news\">TIN TỨC</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav-content-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-solid fa-calendar-days\"></i>\r\n");
      out.write("                    <span><a href=\"mainController?action=listSchedule\">LỊCH DẠY</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-solid fa-people-group\"></i>\r\n");
      out.write("                    <span><a>KHÁCH HÀNG</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-sharp fa-solid fa-tag\"></i>\r\n");
      out.write("                    <span><a href=\"mainController?action=event\">SỰ KIỆN</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <i class=\"fa-solid fa-arrow-right-from-bracket\"></i>\r\n");
      out.write("                    <span><a href=\"logout\">ĐĂNG XUẤT</a></span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div style=\"margin-left: 70rem\"><h1>Hello Staff</h1></div>\r\n");
      out.write("    </body>\r\n");
      out.write("        <script src=\"./js/updateInsert.js\"></script>\r\n");
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
