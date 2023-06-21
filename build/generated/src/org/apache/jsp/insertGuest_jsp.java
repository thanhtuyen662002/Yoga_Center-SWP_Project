package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertGuest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/insertGuest.css\" />\n");
      out.write("        <title>Insert Course</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String ErrorMessage = (String) request.getAttribute("ErrorMessage"); 
      out.write("\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!--<div class=\"alert alert-danger\" role=\"alert\" style=\"text-align: center\">-->\n");
      out.write("                <div style=\"text-align: center; color: red; font-size: 2rem;\">\n");
      out.write("                    ");
 if (ErrorMessage != null) {
      out.write("\n");
      out.write("                    <p>");
      out.print( ErrorMessage);
      out.write("</p>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"course-link\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"mainController?action=Staff\">Staff</a></li>\n");
      out.write("                        <li><a href=\"mainController?action=guest\">Khách hàng</a></li>\n");
      out.write("                        <li><a href=\"#\" id=\"active\">Thêm</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"course-title\" >\n");
      out.write("                    <div class=\"text\">WELCOME STAFF</div>\n");
      out.write("                    <div class=\"insert\"><a type=\"submit\" name=\"insert\" href=\"guest\">BACK</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"table-name\">\n");
      out.write("                    <h1>TẠO TÀI KHOẢN</h1>\n");
      out.write("                </div>\n");
      out.write("                <form enctype=\"multipart/form-data\" action=\"insertGuest\" method=\"POST\">\n");
      out.write("                    <div class=\"update-box\">\n");
      out.write("                        <div class=\"update-title\">\n");
      out.write("                            <label for=\"title\">Full Name</label>\n");
      out.write("                            <input type=\"text\" name=\"fullName\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Phone Number</label>\n");
      out.write("                            <input type=\"number\" name=\"phone\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Password</label>\n");
      out.write("                            <input type=\"text\" name=\"password\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Address</label>\n");
      out.write("                            <input type=\"text\" name=\"address\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Gender</label>\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"Male\" checked> Male\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"Female\"> Female\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"Other\"> Other\n");
      out.write("                            </label>\n");
      out.write("                        </div>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-button\">\n");
      out.write("                        <button type=\"submit\">INSERT</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"./courseNav/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"./courseNav/jquery.min.js\"></script>\n");
      out.write("            <script src=\"./courseNav/main.js\"></script>\n");
      out.write("            <script src=\"./courseNav/popper.js\"></script>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"./ckeditor/ckeditor.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                CKEDITOR.replace(\"myTextarea\");\n");
      out.write("            </script>\n");
      out.write("            <script src=\"./js/course.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("staff_header.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
