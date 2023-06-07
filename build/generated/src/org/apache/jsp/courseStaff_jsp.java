package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courseStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/courseStaff.css\" />\r\n");
      out.write("    <title>Course</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"wrapper d-flex align-items-stretch\">\r\n");
      out.write("\t\t\t<nav id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"custom-menu\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\r\n");
      out.write("\t        </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t  \t\t<div class=\"img bg-wrap text-center py-4\" style=\"background-image: url(images/bg_1.jpg);\">\r\n");
      out.write("\t  \t\t\t<div class=\"user-logo\">\r\n");
      out.write("\t  \t\t\t\t<div class=\"img\" style=\"background-image: url(/image/logo-yoga.jpg);\"></div>\r\n");
      out.write("\t  \t\t\t\t<h3>YOGA CENTER</h3>\r\n");
      out.write("\t  \t\t\t</div>\r\n");
      out.write("\t  \t\t</div>\r\n");
      out.write("        <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("          <li class=\"active\">\r\n");
      out.write("            <a href=\"#\"><span class=\"fa-solid fa-book mr-3\"></span> KHÓA HỌC</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"fa fa-gift mr-3\"></span> KHUYẾN MÃI</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"fa-solid fa-calendar-days mr-3\"></span> LỊCH DẠY</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"fa-solid fa-newspaper mr-3\"></span> TIN TỨC</a>\r\n");
      out.write("          </li> \r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"fa-solid fa-people-group mr-3\"></span> KHÁCH HÀNG</a>\r\n");
      out.write("          </li> \r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\"><span class=\"fa fa-sign-out mr-3\"></span> Đăng Xuất</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    \t</nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content  -->\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <div class=\"course-link\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"\">Staff</a></li>\r\n");
      out.write("            <li><a href=\"\" id=\"active\">Khóa Học</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"course-title\" >\r\n");
      out.write("        <div class=\"text\">WELCOME STAFF</div>\r\n");
      out.write("       <div class=\"insert\"><a type=\"submit\" name=\"insert\">Insert</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"table-name\">\r\n");
      out.write("          <h1>BẢNG DỮ LIỆU KHÓA HỌC</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table id=\"course\" class=\"display\" style=\"width:100%\">\r\n");
      out.write("          <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>Course ID</th>\r\n");
      out.write("                  <th>Name</th>\r\n");
      out.write("                  <th>Description</th>\r\n");
      out.write("                  <th>Price</th>\r\n");
      out.write("                  <th>Status</th>\r\n");
      out.write("                  <th>Action</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <td>Jena Gaines</td>\r\n");
      out.write("                  <td>Office Manager</td>\r\n");
      out.write("                  <td>London</td>\r\n");
      out.write("                  <td>30</td>\r\n");
      out.write("                  <td>$90,560</td>\r\n");
      out.write("                  <td id=\"tool\">\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa-solid fa-eye \"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa-solid fa-pen\"></i></a>\r\n");
      out.write("                    <a href=\"#\"> <i class=\"fa-sharp fa-solid fa-trash\"></i></a>\r\n");
      out.write("                  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \r\n");
      out.write("          </tbody>\r\n");
      out.write("          <tfoot>\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>Course ID</th>\r\n");
      out.write("                  <th>Name</th>\r\n");
      out.write("                  <th>Description</th>\r\n");
      out.write("                  <th>Price</th>\r\n");
      out.write("                  <th>Status</th>\r\n");
      out.write("                  <th>Action</th>\r\n");
      out.write("\r\n");
      out.write("              </tr>\r\n");
      out.write("          </tfoot>\r\n");
      out.write("      </table>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <script src=\"/courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("      <script src=\"/courseNav/jquery.min.js\"></script>\r\n");
      out.write("      <script src=\"/courseNav/main.js\"></script>\r\n");
      out.write("      <script src=\"/courseNav/popper.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("       $(document).ready(function () {\r\n");
      out.write("    $('#course').DataTable();\r\n");
      out.write("});\r\n");
      out.write("    </script>\r\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("          <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
