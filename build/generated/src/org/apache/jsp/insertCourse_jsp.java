package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/updateInsertCourse.css\" />\r\n");
      out.write("        <title>Insert Course</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\r\n");
      out.write("            <nav id=\"sidebar\">\r\n");
      out.write("                <div class=\"custom-menu\">\r\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"img bg-wrap text-center py-4\" style=\"background-image: url(images/bg_1.jpg);\">\r\n");
      out.write("                    <div class=\"user-logo\">\r\n");
      out.write("                        <div class=\"img\" style=\"background-image: url(/image/logo-yoga.jpg);\"></div>\r\n");
      out.write("                        <h3>YOGA CENTER</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-book mr-3\"></span> KHÓA HỌC</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-gift mr-3\"></span> KHUYẾN MÃI</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-calendar-days mr-3\"></span> LỊCH DẠY</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-newspaper mr-3\"></span> TIN TỨC</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-people-group mr-3\"></span> KHÁCH HÀNG</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-sign-out mr-3\"></span> Đăng Xuất</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"alert alert-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" role=\"alert\">\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Content  -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div class=\"course-link\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"mainController?action=Staff\">Staff</a></li>\r\n");
      out.write("                        <li><a href=\"mainController?action=courses\">Khóa Học</a></li>\r\n");
      out.write("                        <li><a href=\"mainController?action=insertCourse\" id=\"active\">Thêm</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"course-title\" >\r\n");
      out.write("                    <div class=\"text\">WELCOME STAFF</div>\r\n");
      out.write("                    <div class=\"insert\"><a type=\"submit\" name=\"insert\">BACK</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-name\">\r\n");
      out.write("                    <h1>THÊM KHÓA HỌC</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"update-box\">\r\n");
      out.write("                    <div class=\"update-title\">\r\n");
      out.write("                        <label for=\"title\">Name</label>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-cate\">\r\n");
      out.write("                        <label for=\"cate\">Price</label>\r\n");
      out.write("                        <input type=\"number\" name=\"price\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-content-wrapper\">\r\n");
      out.write("                        <div class=\"update-content\">\r\n");
      out.write("                            <label for=\"\">Describe</label>\r\n");
      out.write("                            <textarea id=\"myTextarea\" name=\"description\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-btn\">\r\n");
      out.write("                    <a href=\"mainController?action=insertCourse\">INSERT</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"/courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"/courseNav/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\"/courseNav/main.js\"></script>\r\n");
      out.write("            <script src=\"/courseNav/popper.js\"></script>\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("            <script src=\"/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                CKEDITOR.replace(\"myTextarea\");\r\n");
      out.write("            </script>\r\n");
      out.write("            <script src=\"./course.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<!-- <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./courseUpdateInsert.css\" />\r\n");
      out.write("    <title>Update|Insert Course</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"header-nav logo widthLess\" id=\"logo\">\r\n");
      out.write("      <button class=\"header-button\">\r\n");
      out.write("        <div class=\"header-button-li btn1\"></div>\r\n");
      out.write("        <div class=\"header-button-li btn2\"></div>\r\n");
      out.write("        <div class=\"header-button-li btn3\"></div>\r\n");
      out.write("      </button>\r\n");
      out.write("      <h2 class=\"h2\">RO<span>LE</span> STA<span>FF</span></h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav class=\"nav-content1 widthLess\" id=\"nav\">\r\n");
      out.write("      <ul class=\"nav-content-list\">\r\n");
      out.write("        <li>\r\n");
      out.write("          <i class=\"fa-solid fa-book\"></i>\r\n");
      out.write("          <span>KHÓA HỌC</span>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <i class=\"fa-solid fa-newspaper\"></i>\r\n");
      out.write("          <span>TIN TỨC</span>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"nav-content-list\">\r\n");
      out.write("        <li>\r\n");
      out.write("          <i class=\"fa-solid fa-calendar-days\"></i>\r\n");
      out.write("          <span>LỊCH HỌC</span>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <i class=\"fa-solid fa-people-group\"></i>\r\n");
      out.write("          <span>KHÁCH HÀNG</span>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <i class=\"fa-sharp fa-solid fa-tag\"></i>\r\n");
      out.write("          <span>KHUYẾN MÃI</span>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    Body\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"updateNews\">\r\n");
      out.write("        <h1>Chỉnh Sửa Khóa Học</h1>\r\n");
      out.write("        <div class=\"update-box\">\r\n");
      out.write("          <div class=\"update-title\">\r\n");
      out.write("              <label for=\"title\">Name</label>\r\n");
      out.write("              <input type=\"text\" name=\"title\" />\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"update-cate\">\r\n");
      out.write("              <label for=\"cate\">Price</label>\r\n");
      out.write("              <input type=\"number\" name=\"cate\" />\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"update-image\">\r\n");
      out.write("              <label for=\"img\">Image</label>\r\n");
      out.write("              <input type=\"file\" name=\"img\" />\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"update-content\">\r\n");
      out.write("              <label for=\"\">Describe</label>\r\n");
      out.write("              <textarea id=\"myTextarea\"></textarea>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"update-btn\">\r\n");
      out.write("            <button type=\"submit\" style=\"font-weight: 700\">UPDATE</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      CKEDITOR.replace(\"myTextarea\");\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"../voucher/updateNews.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html> -->");
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
