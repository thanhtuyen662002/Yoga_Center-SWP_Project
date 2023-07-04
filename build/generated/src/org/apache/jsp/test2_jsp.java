package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Trang JSP</title>\r\n");
      out.write("    <script>\r\n");
      out.write("        function init() {\r\n");
      out.write("            // Lấy danh sách các thẻ li\r\n");
      out.write("            var listItem = document.querySelectorAll(\"li\");\r\n");
      out.write("\r\n");
      out.write("            // Lặp qua từng thẻ li để gắn sự kiện click\r\n");
      out.write("            listItem.forEach(function(li) {\r\n");
      out.write("                li.addEventListener(\"click\", function() {\r\n");
      out.write("                    // Loại bỏ class active từ tất cả các thẻ li\r\n");
      out.write("                    listItem.forEach(function(item) {\r\n");
      out.write("                        item.classList.remove(\"active\");\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    // Thêm class active cho thẻ li được chọn\r\n");
      out.write("                    this.classList.add(\"active\");\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Gọi hàm init sau khi web đã xử lý xong thông tin từ servlet\r\n");
      out.write("        window.addEventListener(\"load\", init);\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .active {\r\n");
      out.write("            background-color: yellow;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>Item 1</li>\r\n");
      out.write("        <li>Item 2</li>\r\n");
      out.write("        <li>Item 3</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</body>\r\n");
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
