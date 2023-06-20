package org.apache.jsp.view_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courseDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/courseDetail.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/course.css\" />\n");
      out.write("    <title>Document</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Header -->\n");
      out.write("    ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("       \n");
      out.write("      <div class=\"priceDetail\">\n");
      out.write("          \n");
      out.write("        <div class=\"price-title\">\n");
      out.write("          <ul>\n");
      out.write("              <li><a href=\"../view.customer/courses.jsp\">Khóa Học</a></li>\n");
      out.write("              <li><a href=\"../view.customer/courseDetail.jsp\">Chi Tiết</a></li>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("          <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.courseName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"price-detail-main\">\n");
      out.write("          <div class=\"price-detail-main-left\">\n");
      out.write("            <div class=\"price-detail-img\">\n");
      out.write("                <img src=\"data:image;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.courseData}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"price-detail-content\">\n");
      out.write("              <h1>Nội dung của gói</h1>\n");
      out.write("              <ul>\n");
      out.write("                <li>\n");
      out.write("                  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"price-detail-rating\">\n");
      out.write("              <h1>Đánh Giá Khóa Học</h1>\n");
      out.write("              <div class=\"rating-box\">\n");
      out.write("                <h3 id=\"notice\">Viết bình luận thành công!!!</h3>\n");
      out.write("                <h2>Viết Bình Luận ...<i class=\"fa-solid fa-pen fa-sm\"></i></h2>\n");
      out.write("                <form action=\"\">\n");
      out.write("                  <input\n");
      out.write("                    id=\"inputContent\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Mời bạn bình luận và đánh giá khóa học\"\n");
      out.write("                    required\n");
      out.write("                  />\n");
      out.write("                  <button id=\"mess\">Gửi</button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"rating-box-question\">\n");
      out.write("                <div class=\"question-card\">\n");
      out.write("                  <div class=\"question-title\">\n");
      out.write("                    <div class=\"nameUser\">Phú</div>\n");
      out.write("                    <div class=\"timeQuestion\">2016-06-16 14:25:59</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"question-content\">Khóa học này ok</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"question-card\">\n");
      out.write("                  <div class=\"question-title\">\n");
      out.write("                    <div class=\"nameUser\">Phú</div>\n");
      out.write("                    <div class=\"timeQuestion\">2016-06-16 14:25:59</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"question-content\">Khóa học này ok</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"question-card\">\n");
      out.write("                  <div class=\"question-title\">\n");
      out.write("                    <div class=\"nameUser\">Phú</div>\n");
      out.write("                    <div class=\"timeQuestion\">2016-06-16 14:25:59</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"question-content\">Khóa học này ok</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"question-card\">\n");
      out.write("                  <div class=\"question-title\">\n");
      out.write("                    <div class=\"nameUser\">Phú</div>\n");
      out.write("                    <div class=\"timeQuestion\">2016-06-16 14:25:59</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"question-content\">\n");
      out.write("                    Khóa học này oksssssssssssssssssssssssssssssssssss\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <div class=\"price-detail-right\">\n");
      out.write("            <div class=\"aa\">\n");
      out.write("              <div class=\"price-detail-box\">\n");
      out.write("                <div class=\"price-detail-head\">\n");
      out.write("                  <h2>GIÁ KHÓA HỌC</h2>\n");
      out.write("                  <h1>");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"price-detail-bottom\">\n");
      out.write("                  <ul>\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"price-detail-right-text\">\n");
      out.write("                        Thời gian tập luyện:\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"price-detail-right-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.numberOfMonths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" THÁNG</div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"price-detail-right-text\">Chi phí / tháng</div>\n");
      out.write("                      <div class=\"price-detail-right-price\">");
      if (_jspx_meth_fmt_formatNumber_1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"price-detail-right-text\">Chí phí / ngày</div>\n");
      out.write("                      <div class=\"price-detail-right-price\">");
      if (_jspx_meth_fmt_formatNumber_2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>- Giá gói chưa áp dụng ưu đãi</li>\n");
      out.write("                    <li>- Được sử dụng toàn bộ dịch vụ trung tâm</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"signupCourse\">ĐĂNG KÝ NGAY</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("      </div>\n");
      out.write("                    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"../js/courseDetail.js\"></script>\n");
      out.write("    ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </body>\n");
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
    _jspx_th_c_import_0.setUrl("customer_header.jsp");
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

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setCurrencyCode("VND");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.numberOfMonths * c.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent(null);
    _jspx_th_fmt_formatNumber_1.setType("currency");
    _jspx_th_fmt_formatNumber_1.setCurrencyCode("VND");
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent(null);
    _jspx_th_fmt_formatNumber_2.setType("currency");
    _jspx_th_fmt_formatNumber_2.setCurrencyCode("VND");
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.price/30}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("customer_footer.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }
}
