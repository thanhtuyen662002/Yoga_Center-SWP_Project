package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createClass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/createClass.css\" />\n");
      out.write("        <title>Create Class</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <form >\n");
      out.write("                    <div class=\"course-link\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"mainController?action=class\">Staff</a></li>\n");
      out.write("                            <li><a href=\"class\">Lớp Học</a></li>\n");
      out.write("                            <li><a href=\"\" id=\"active\">Thêm Lớp Học</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"course-title\" >\n");
      out.write("                    <div class=\"text\">WELCOME STAFF</div>\n");
      out.write("                    <div class=\"insert\"><a class=\"btn-back\" type=\"button\" style=\"margin-left: 0px;border-radius: 5px;border: none\" onclick=\"goBack()\">Back</a></div>                   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"table-name\">\n");
      out.write("                    <h1>THÊM LỚP HỌC</h1>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"insertEvent\" method=\"POST\">\n");
      out.write("                    <div class=\"update-box\">\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Class Name</label>\n");
      out.write("                            <input type=\"text\" name=\"className\" value =\"\"/>\n");
      out.write("                        </div>                       \n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">PT Name</label>\n");
      out.write("                            <select name=\"ptName\">\n");
      out.write("                                <option value=\"\" onchange=\"\"></option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Capacity</label>\n");
      out.write("                            <input type=\"text\" name=\"capacity\" value=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Course Name</label>\n");
      out.write("                            <select name=\"course\">\n");
      out.write("                                <option value=\"\" onchange=\"\"></option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-content-wrapper\">\n");
      out.write("                            <div class=\"update-content\">\n");
      out.write("                                <label for=\"\">Describe</label>\n");
      out.write("                                <textarea id=\"myTextarea\" name=\"description\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label for=\"cate\">Total Session</label>\n");
      out.write("                            <input type=\"text\" name=\"totalSession\" value=\"\" readonly=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-btn\">\n");
      out.write("                        <input type=\"submit\" value=\"Insert\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\"/courseNav/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"/courseNav/jquery.min.js\"></script>\n");
      out.write("            <script src=\"/courseNav/main.js\"></script>\n");
      out.write("            <script src=\"/courseNav/popper.js\"></script>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                        const dayStartInput = document.querySelector('input[name=\"daystart\"]');\n");
      out.write("                        const dayEndInput = document.querySelector('input[name=\"dayend\"]');\n");
      out.write("                        dayStartInput.addEventListener('change', validateDateRange);\n");
      out.write("                        dayEndInput.addEventListener('change', validateDateRange);\n");
      out.write("                        console.log(dayStartInput.value);\n");
      out.write("                        function validateDateRange() {\n");
      out.write("                            const dayStart = new Date(dayStartInput.value);\n");
      out.write("                            const dayEnd = new Date(dayEndInput.value);\n");
      out.write("                            const currentDate = new Date();\n");
      out.write("\n");
      out.write("                            if (dayStart <= currentDate) {\n");
      out.write("                                alert('Giá trị của DayStart phải lớn hơn ngày hiện tại.');\n");
      out.write("                                dayStartInput.value = \"\";\n");
      out.write("                                return;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if (dayEnd <= dayStart) {\n");
      out.write("                                alert('Giá trị của DayEnd phải lớn hơn DayStart.');\n");
      out.write("                                dayEndInput.value = \"\";\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function goBack() {\n");
      out.write("                    window.history.back();\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            <script>\n");
      out.write("                function previewImage(event) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    reader.onload = function () {\n");
      out.write("                        var output = document.getElementById(\"preview\");\n");
      out.write("                        output.src = reader.result;\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    var fileInput = event.target;\n");
      out.write("                    var files = fileInput.files;\n");
      out.write("\n");
      out.write("                    if (files.length > 0) {\n");
      out.write("                        reader.readAsDataURL(files[0]);\n");
      out.write("                    } else {\n");
      out.write("                        // Nếu không có file được chọn, đặt lại ảnh về trạng thái ban đầu\n");
      out.write("                        var output = document.getElementById(\"preview\");\n");
      out.write("                        output.src = \"#\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
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
