package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/register.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/css/bootstrap.min.css\" integrity=\"sha512-8qV1Bc/gqjKX4e6V9sJmGtBd4g1eJ6fj8v4mmlY5f8/zBBZSv8BCNB4JHfzrS7J9S9hVQZ+Pz+vp1l1z+LB8vA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <title>Sign Up</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("            <div class=\"signin\">\r\n");
      out.write("            <span class=\"boderLine\">\r\n");
      out.write("                <form action=\"mainController\" method=\"POST\">\r\n");
      out.write("                    <h2>Sign Up</h2>\r\n");
      out.write("                    <div class=\"input\">\r\n");
      out.write("                        <span>Họ và Tên</span>\r\n");
      out.write("                        <div class=\"input-right\">\r\n");
      out.write("                            <input type=\"text\" name=\"name\" required=\"required\" placeholder=\"6 - 30 ký tự\">\r\n");
      out.write("                            <i></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input male\">\r\n");
      out.write("                        <span>Giới tính</span>\r\n");
      out.write("                        <div class=\"input1-right\">\r\n");
      out.write("                            <span><input type=\"radio\" name=\"gender\" value=\"Male\">Male</span>\r\n");
      out.write("                            <span><input type=\"radio\" name=\"gender\" value=\"Female\">Female</span>\r\n");
      out.write("                            <span><input type=\"radio\" name=\"gender\" value=\"Other\">Other</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input\">\r\n");
      out.write("                        <span>Số điện thoại</span>\r\n");
      out.write("                        <div class=\"input-right\">\r\n");
      out.write("                            <input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.PHONE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" placeholder=\"10 chữ số\">\r\n");
      out.write("                            <i id=\"error-tooltip\" style=\"display:none;\" class=\"fa-solid fa-circle-exclamation text-danger\" data-bs-custom-class=\"error-tooltip\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ERROR}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></i><br> \r\n");
      out.write("                            <i></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input\">\r\n");
      out.write("                        <span>Mật khẩu</span>\r\n");
      out.write("                        <div class=\"input-right\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" required=\"required\" placeholder=\"6 - 20 ký tự\">\r\n");
      out.write("                            <i></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input\">\r\n");
      out.write("                        <span for=\"password-confirm\">Xác nhận mật khẩu</span>\r\n");
      out.write("                        <div class=\"input-right\">\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Nhập lại mật khẩu\" name=\"password-confirm\" required>\r\n");
      out.write("                            <i></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input\">\r\n");
      out.write("                        <span>Địa chỉ</span>\r\n");
      out.write("                        <div class=\"input-right\">\r\n");
      out.write("                            <input type=\"text\" name=\"address\" required=\"required\" placeholder=\"20 - 70 ký tự\">\r\n");
      out.write("                            <i></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"home.jsp\"><input type=\"button\" value=\"HUỶ\" id=\"link-button\"></a>\r\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"SignUp\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/js/bootstrap.bundle.min.js\" integrity=\"sha512-YsKfWz2CmJgUZ5fF7T3Xs/7E6dQp2Kx8OJ+eKZoT6uI2z+Qs4z5wMSTgC7WY/1B6RJ9E5WkYy2Z8K6e2Ll8vQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
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
    _jspx_th_c_redirect_0.setUrl("");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
