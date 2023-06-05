package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voucher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/voucher.css\">\r\n");
      out.write("        <title>Voucher</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"nav-background\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"nav\">\r\n");
      out.write("                    <div class=\"nav-logo\">\r\n");
      out.write("                        <a href=\"home.jsp\">YO<span>GA</span> </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"checkbox\" id=\"toggler\">\r\n");
      out.write("                    <label for=\"toggler\"><i class=\"fas fa-bars fa-2xl\"></i></label>\r\n");
      out.write("                    <div class=\"nav-menu\">\r\n");
      out.write("                        <ul class=\"nav-menu-list\">\r\n");
      out.write("                            <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"mainController?action=club\">CLB</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                     <a class=\"nav-menu-link\" href=\"mainController?action=courses\">KHÓA HỌC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"mainController?action=schedule\">LỊCH HỌC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"mainController?action=voucher\">KHUYẾN MÃI</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"mainController?action=news\">TIN TỨC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <button class=\"btn_contact\">ĐĂNG NHẬP</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"voucher\">\r\n");
      out.write("            <div> <H1>CẬP NHẬT KHUYẾN MÃI TẠI ĐÂY</H1></div>\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>EventID</th>\r\n");
      out.write("                        <th>Event Name</th>\r\n");
      out.write("                        <th>CourseID</th>\r\n");
      out.write("                        <th>Discount </th>\r\n");
      out.write("                        <th>DayStart</th>\r\n");
      out.write("                        <th>Update</th>\r\n");
      out.write("                        <th>Delete</th>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"./js/voucher.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>Cell 1</td>\r\n");
          out.write("                            <td>Cell 2</td>\r\n");
          out.write("                            <td>Cell 3</td>\r\n");
          out.write("                            <td>Cell 4</td>\r\n");
          out.write("                            <td>Cell 5</td>\r\n");
          out.write("                            <td><button type=\"submit\" name=\"update\" class=\"btn-update\">Update</button></td>\r\n");
          out.write("                            <td><button type=\"submit\" name=\"delete\" class=\"btn-delete\">Delete</button></td>\r\n");
          out.write("\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
