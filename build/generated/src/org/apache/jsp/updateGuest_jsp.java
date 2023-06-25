package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateGuest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/updateGuest.css\" />\n");
      out.write("        <title>Update News</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div class=\"course-link\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Staff</a></li>\n");
      out.write("                        <li><a href=\"\">Khóa Học</a></li>\n");
      out.write("                        <li><a href=\"\" id=\"active\">Chỉnh Sửa</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"course-title\" >\n");
      out.write("                    <div class=\"text\">WELCOME STAFF</div>\n");
      out.write("                    <div class=\"insert\"><a type=\"submit\" name=\"guest\">BACK</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"table-name\">\n");
      out.write("                    <h1>CHỈNH SỬA THÔNG TIN KHÓA HỌC ĐĂNG KÝ</h1>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"updatenews\" method=\"Post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"update-box\">\n");
      out.write("                        <div class=\"update-title\">\n");
      out.write("                            <label for=\"title\">Title</label>\n");
      out.write("                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list_guest.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"title\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-select\">\n");
      out.write("                            <label>Title</label>\n");
      out.write("                            <select name=\"categoryID\">\n");
      out.write("                                <option value=\"\" selected>Chọn Loại Tin Tức</option>\n");
      out.write("                                <option value=\"1\">Blog</option>\n");
      out.write("                                <option value=\"2\">Product</option>\n");
      out.write("                                <option value=\"3\">Other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"update-cate\">\n");
      out.write("                            <label>Image</label>\n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"fileInput\" onchange=\"previewImage(event)\" accept=\"image/*\" />\n");
      out.write("                            <div class=\"file-img\">\n");
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                <!--<img id=\"preview\" src=\"#\" alt=\"Preview\" />-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"update-content-wrapper\">\n");
      out.write("                            <div class=\"update-content\">\n");
      out.write("                                <label for=\"\">Content</label>\n");
      out.write("                                <textarea id=\"myTextarea\" name=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list_guest.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"newsID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list_guest.newsID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-btn\">\n");
      out.write("                        <!--<a href=\"#\">UPDATE</a>-->\n");
      out.write("                        <!--<input class=\"btn btn-danger btn-lg\" type=\"submit\" name=\"action\" value=\"UPDATE\" />--> \n");
      out.write("                        <button type=\"submit\">Update</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.STAFF}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
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
