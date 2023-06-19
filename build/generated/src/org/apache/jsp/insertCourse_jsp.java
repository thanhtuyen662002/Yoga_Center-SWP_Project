package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../css/insertCourse.css\" />\r\n");
      out.write("        <title>Insert Course</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 String ErrorMessage = (String) request.getAttribute("ErrorMessage"); 
      out.write("\r\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     \r\n");
      out.write("            <!-- Page Content  -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                \r\n");
      out.write("                <!--<div class=\"alert alert-danger\" role=\"alert\" style=\"text-align: center\">-->\r\n");
      out.write("                <div style=\"text-align: center; color: red; font-size: 2rem;\">\r\n");
      out.write("                    ");
 if( ErrorMessage != null) { 
      out.write("\r\n");
      out.write("                    <p>");
      out.print( ErrorMessage );
      out.write("</p>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
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
      out.write("                    <div class=\"insert\"><a type=\"submit\" name=\"insert\" href=\"courseStaff.jsp\">BACK</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-name\">\r\n");
      out.write("                    <h1>THÊM KHÓA HỌC</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form enctype=\"multipart/form-data\" action=\"insertCourse\" method=\"POST\">\r\n");
      out.write("                <div class=\"update-box\">\r\n");
      out.write("                    <div class=\"update-title\">\r\n");
      out.write("                        <label for=\"title\">Name</label>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-cate\">\r\n");
      out.write("                        <label for=\"cate\">Price</label>\r\n");
      out.write("                        <input type=\"number\" name=\"price\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-cate\">\r\n");
      out.write("                        <label for=\"cate\">Number of months</label>\r\n");
      out.write("                        <input type=\"number\" name=\"numberOfMonths\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-img\">\r\n");
      out.write("                        <label for=\"cate\">Image</label>\r\n");
      out.write("                        <input type=\"file\" name=\"image\" id=\"fileInput\" onchange=\"previewImage(event)\" accept=\"image/*\" />\r\n");
      out.write("                        <div class=\"file-img\">\r\n");
      out.write("                            <img id=\"preview\" src=\"#\" alt=\"Preview\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"update-content-wrapper\">\r\n");
      out.write("                        <div class=\"update-content\">\r\n");
      out.write("                            <label for=\"\">Describe</label>\r\n");
      out.write("                            <textarea id=\"myTextarea\" name=\"description\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-button\">\r\n");
      out.write("                    <button type=\"submit\">INSERT</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("            <script>\r\n");
      out.write("                function previewImage(event) {\r\n");
      out.write("                    var reader = new FileReader();\r\n");
      out.write("                    reader.onload = function () {\r\n");
      out.write("                        var output = document.getElementById(\"preview\");\r\n");
      out.write("                        output.src = reader.result;\r\n");
      out.write("                    };\r\n");
      out.write("\r\n");
      out.write("                    var fileInput = event.target;\r\n");
      out.write("                    var files = fileInput.files;\r\n");
      out.write("\r\n");
      out.write("                    if (files.length > 0) {\r\n");
      out.write("                        reader.readAsDataURL(files[0]);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        // Nếu không có file được chọn, đặt lại ảnh về trạng thái ban đầu\r\n");
      out.write("                        var output = document.getElementById(\"preview\");\r\n");
      out.write("                        output.src = \"#\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("            <script src=\"./courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"./courseNav/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\"./courseNav/main.js\"></script>\r\n");
      out.write("            <script src=\"./courseNav/popper.js\"></script>\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("            <script src=\"./ckeditor/ckeditor.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                CKEDITOR.replace(\"myTextarea\");\r\n");
      out.write("            </script>\r\n");
      out.write("            <script src=\"./js/course.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
