package org.apache.jsp.views.Admin_005fNhat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/Header_Admin.css\" />\n");
      out.write("    <title>Header</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"wrapper d-flex align-items-stretch h-100\"> \n");
      out.write("      <nav id=\"sidebar\">\n");
      out.write("        <div class=\"custom-menu\">\n");
      out.write("          <button\n");
      out.write("            type=\"button\"\n");
      out.write("            id=\"sidebarCollapse\"\n");
      out.write("            class=\"btn btn-primary\"\n");
      out.write("          ></button>\n");
      out.write("        </div>\n");
      out.write("        <div\n");
      out.write("          class=\"img bg-wrap text-center py-4\"\n");
      out.write("          style=\"background-image: url(images/bg_1.jpg)\"\n");
      out.write("        >\n");
      out.write("          <div class=\"user-logo\">\n");
      out.write("            <div\n");
      out.write("              class=\"img\"\n");
      out.write("              style=\"background-image: url(./../../image/logo-yoga.jpg)\"\n");
      out.write("            ></div>\n");
      out.write("            <h3>YOGA CENTER</h3>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"list-unstyled components mb-5\">\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"#\"\n");
      out.write("              ><span class=\"fa-solid fa-chart-line mr-3\"></span>Dashboard\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"#\"\n");
      out.write("              ><span class=\"fa-solid fa-pen-to-square mr-3\"></span> Edit\n");
      out.write("              Profile</a\n");
      out.write("            >\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"listStaff\"\n");
      out.write("              ><span class=\"fa-solid fa-person fa-xl mr-3\"></span> Staff</a\n");
      out.write("            >\n");
      out.write("          </li>\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"#\"\n");
      out.write("              ><span class=\"fa-solid fa-calendar-days mr-3\"></span> Schedule</a\n");
      out.write("            >\n");
      out.write("          </li>\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"logout\"><span class=\"fa fa-sign-out mr-3\"></span> Đăng Xuất</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!-- Content ở đây -->\n");
      out.write("      <div id=\"content\"></div>\n");
      out.write("    </div>\n");
      out.write("      <script src=\"./../../courseNav/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/jquery.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/main.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/popper.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function () {\n");
      out.write("        $(\"#course\").DataTable();\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
