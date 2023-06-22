package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dto.CoursesDTO;
import java.util.List;
import model.dao.EventDAO;

public final class updateEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/updatevoucher.css\" />\r\n");
      out.write("        <title>UpdateEvent</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Content  -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div class=\"course-link\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"mainController?action=event\">Staff</a></li>\r\n");
      out.write("                        <li><a href=\"event\">Khuyến Mãi</a></li>\r\n");
      out.write("                        <li><a href=\"\" id=\"active\">Chỉnh Sửa Khuyến Mãi</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"course-title\" >\r\n");
      out.write("                    <div class=\"text\">WELCOME STAFF</div>\r\n");
      out.write("                    <div class=\"insert\"><a type=\"submit\" name=\"insert\" href=\"mainController?action=event\">BACK</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-name\">\r\n");
      out.write("                    <h1>CHỈNH SỬA KHUYẾN MÃI</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                ");
 EventDAO dao = new EventDAO(); 
      out.write("\r\n");
      out.write("                ");
 List<CoursesDTO> courses = dao.getCourseName(); 
      out.write("\r\n");
      out.write("                <form action=\"updateEvent\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    <div class=\"update-box\">\r\n");
      out.write("                        <div class=\"update-title\">\r\n");
      out.write("                            <label for=\"title\">Event Name</label>\r\n");
      out.write("                            <input type=\"text\" name=\"EventName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.eventName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"update-cate\">\r\n");
      out.write("                            <label for=\"cate\">Discount</label>\r\n");
      out.write("                            <input type=\"text\" name=\"Discount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"update-course\">\r\n");
      out.write("                            <label for=\"cate\">Course Name</label>\r\n");
      out.write("                            <select name=\"Course\">\r\n");
      out.write("                                ");
 for (CoursesDTO course : courses) {
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print( course.getCourseID());
      out.write('"');
      out.write('>');
      out.print( course.getCourseName());
      out.write("</option>\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"update-cate\">\r\n");
      out.write("                            <label for=\"cate\">Day Start</label>\r\n");
      out.write("                            <input type=\"date\" name=\"daystart\" id=\"day-start\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.daystart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"update-cate\">\r\n");
      out.write("                            <label for=\"cate\">Day End</label>\r\n");
      out.write("                            <input type=\"date\" name=\"dayend\" id=\"day-end\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.dayend}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"update-img\">\r\n");
      out.write("                            <label for=\"cate\">Image</label>\r\n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"fileInput\" onchange=\"previewImage(event)\" accept=\"image/*\" />\r\n");
      out.write("                            <div class=\"file-img\">\r\n");
      out.write("                                <img id=\"preview\" src=\"data:image;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.data}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Preview\"/>\r\n");
      out.write("                                <input type=\"text\" hidden=\"\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.eventID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"table-btn\">\r\n");
      out.write("                        <button type=\"submit\">UPDATE</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("                <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("                <script>\r\n");
      out.write("                                const dayStartInput = document.querySelector('input[name=\"day-start\"]');\r\n");
      out.write("                                const dayEndInput = document.querySelector('input[name=\"day-end\"]');\r\n");
      out.write("                                dayStartInput.addEventListener('change', validateDateRange);\r\n");
      out.write("                                dayEndInput.addEventListener('change', validateDateRange);\r\n");
      out.write("                                console.log(dayStartInput.value);\r\n");
      out.write("                                function validateDateRange() {\r\n");
      out.write("                                    const dayStart = new Date(dayStartInput.value);\r\n");
      out.write("                                    const dayEnd = new Date(dayEndInput.value);\r\n");
      out.write("                                    const currentDate = new Date();\r\n");
      out.write("\r\n");
      out.write("                                    if (dayStart <= currentDate) {\r\n");
      out.write("                                        alert('Giá trị của DayStart phải lớn hơn ngày hiện tại.');\r\n");
      out.write("                                        dayStartInput.value = \"\";\r\n");
      out.write("                                        return;\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                    if (dayEnd <= dayStart) {\r\n");
      out.write("                                        alert('Giá trị của DayEnd phải lớn hơn DayStart.');\r\n");
      out.write("                                        dayEndInput.value = \"\";\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                </script>\r\n");
      out.write("                <script>\r\n");
      out.write("                    function previewImage(event) {\r\n");
      out.write("                        var reader = new FileReader();\r\n");
      out.write("                        reader.onload = function () {\r\n");
      out.write("                            var output = document.getElementById(\"preview\");\r\n");
      out.write("                            output.src = reader.result;\r\n");
      out.write("                        };\r\n");
      out.write("\r\n");
      out.write("                        var fileInput = event.target;\r\n");
      out.write("                        var files = fileInput.files;\r\n");
      out.write("\r\n");
      out.write("                        if (files.length > 0) {\r\n");
      out.write("                            reader.readAsDataURL(files[0]);\r\n");
      out.write("                        } else {\r\n");
      out.write("                            var output = document.getElementById(\"preview\");\r\n");
      out.write("                            output.src = \"#\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
