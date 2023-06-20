package org.apache.jsp.view_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/clb.css\">\r\n");
      out.write("        <title>Câu lạc bộ</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!-- Banner -->\r\n");
      out.write("        <div class=\"banner\">\r\n");
      out.write("            <div class=\"banner-bg\"> <img src=\"../image/bannerClb.jpg\" alt=\"\"></div>\r\n");
      out.write("            <div class=\"banger-bg-color\"></div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"title-bg\">CÂU LẠC BỘ</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <div class=\"clb\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"clb-title\">TẬP LUYỆN Ở CÂU LẠC BỘ GẦN BẠN</div>\r\n");
      out.write("                <br class=\"clb-detail\">Hệ thống phòng tập của YOGA có mặt khắp các quận TPHCM.</br>Lựa chọn phòng tập gần\r\n");
      out.write("                bạn nhất để có thể tập luyện dễ dàng và tiết kiệm thời gian\r\n");
      out.write("            </div>\r\n");
      out.write("            <select class=\"form-select\" id = \"district-select\" aria-label=\"Default select example\">\r\n");
      out.write("                <option value=\"\" selected>Chọn quận gần bạn</option>\r\n");
      out.write("                <option value=\"Quận 1\">Quận 1</option>\r\n");
      out.write("                <option value=\"Quận 2\">Quận 2</option>\r\n");
      out.write("                <option value=\"Quận 3\">Quận 3</option>\r\n");
      out.write("                <option value=\"Quận 4\">Quận 4</option>\r\n");
      out.write("                <option value=\"Quận 5\">Quận 5</option>\r\n");
      out.write("                <option value=\"Quận 6\">Quận 6</option>\r\n");
      out.write("                <option value=\"Quận 7\">Quận 7</option>\r\n");
      out.write("                <option value=\"Quận 8\">Quận 8</option>\r\n");
      out.write("                <option value=\"Quận 9\">Quận 9</option>\r\n");
      out.write("                <option value=\"Quận 10\">Quận 10</option>\r\n");
      out.write("                <option value=\"Quận 11\">Quận 11</option>\r\n");
      out.write("                <option value=\"Quận 12\">Quận 12</option>\r\n");
      out.write("                <option value=\"Quận Gò Vấp\">Quận Gò Vấp</option>\r\n");
      out.write("                <option value=\"Quận Bình Thạnh\">Quận Bình Thạnh</option>\r\n");
      out.write("                <option value=\"Quận Phú Nhuận\">Quận Phú Nhuận</option>\r\n");
      out.write("                <option value=\"Quận Tân Phú\">Quận Tấn Phú</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Form control -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-content\" id=\"clb-container\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"listPage\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- FOOTER -->\r\n");
      out.write("        ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            document.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("                // Lấy các phần tử cần tương tác\r\n");
      out.write("                var selectElement = document.getElementById('district-select');\r\n");
      out.write("                var clbContainer = document.getElementById('clb-container');\r\n");
      out.write("                var clbCards = clbContainer.getElementsByClassName('clb-card');\r\n");
      out.write("\r\n");
      out.write("                // Xử lý sự kiện khi người dùng thay đổi giá trị trong dropdown\r\n");
      out.write("                selectElement.addEventListener('change', function () {\r\n");
      out.write("                    var selectedValue = selectElement.value;\r\n");
      out.write("                    var regex = new RegExp(\"\\\\b\" + selectedValue + \"\\\\b\");\r\n");
      out.write("\r\n");
      out.write("                    // Tạo danh sách mới chỉ chứa các CLB card phù hợp với tìm kiếm\r\n");
      out.write("                    var filteredList = [];\r\n");
      out.write("                    for (var i = 0; i < clbCards.length; i++) {\r\n");
      out.write("                        var card = clbCards[i];\r\n");
      out.write("                        var position = card.querySelector(\".clb-card-position\");\r\n");
      out.write("                        var district = position.textContent.trim();\r\n");
      out.write("\r\n");
      out.write("                        if (selectedValue === \"\" || regex.test(district)) {\r\n");
      out.write("                            card.style.display = \"block\"; // Hiển thị thẻ clb-card\r\n");
      out.write("                            filteredList.push(card); // Thêm vào danh sách phù hợp\r\n");
      out.write("                        } else {\r\n");
      out.write("                            card.style.display = \"none\"; // Ẩn thẻ clb-card\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    // Cập nhật danh sách phân trang với danh sách đã lọc\r\n");
      out.write("                    updatePagination(filteredList);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                function updatePagination(filteredList) {\r\n");
      out.write("                    let thisPage = 1;\r\n");
      out.write("                    let limit = 6;\r\n");
      out.write("                    let list = filteredList;\r\n");
      out.write("\r\n");
      out.write("                    function loadItem() {\r\n");
      out.write("                        let beginGet = limit * (thisPage - 1);\r\n");
      out.write("                        let endGet = limit * thisPage - 1;\r\n");
      out.write("\r\n");
      out.write("                        list.forEach((item, key) => {\r\n");
      out.write("                            if (key >= beginGet && key <= endGet) {\r\n");
      out.write("                                item.style.display = \"block\";\r\n");
      out.write("                            } else {\r\n");
      out.write("                                item.style.display = \"none\";\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        listPage();\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    loadItem();\r\n");
      out.write("\r\n");
      out.write("                    function listPage() {\r\n");
      out.write("                        let count = Math.ceil(list.length / limit);\r\n");
      out.write("                        document.querySelector(\".listPage\").innerHTML = \"\";\r\n");
      out.write("\r\n");
      out.write("                        if (thisPage != 1) {\r\n");
      out.write("                            let prev = document.createElement(\"li\");\r\n");
      out.write("                            prev.innerText = \"PREV\";\r\n");
      out.write("                            prev.addEventListener(\"click\", function () {\r\n");
      out.write("                                changePage(thisPage - 1);\r\n");
      out.write("                            });\r\n");
      out.write("                            document.querySelector(\".listPage\").appendChild(prev);\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        for (let i = 1; i <= count; i++) {\r\n");
      out.write("                            let newPage = document.createElement(\"li\");\r\n");
      out.write("                            newPage.innerText = i;\r\n");
      out.write("\r\n");
      out.write("                            if (i == thisPage) {\r\n");
      out.write("                                newPage.classList.add(\"actived\");\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            newPage.addEventListener(\"click\", function () {\r\n");
      out.write("                                changePage(i);\r\n");
      out.write("                            });\r\n");
      out.write("                            document.querySelector(\".listPage\").appendChild(newPage);\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        if (thisPage != count) {\r\n");
      out.write("                            let next = document.createElement(\"li\");\r\n");
      out.write("                            next.innerText = \"NEXT\";\r\n");
      out.write("                            next.addEventListener(\"click\", function () {\r\n");
      out.write("                                changePage(thisPage + 1);\r\n");
      out.write("                            });\r\n");
      out.write("                            document.querySelector(\".listPage\").appendChild(next);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    function changePage(i) {\r\n");
      out.write("                        thisPage = i;\r\n");
      out.write("                        loadItem();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\r\n");
      out.write("                let thisPage = 1;\r\n");
      out.write("                let limit = 6;\r\n");
      out.write("                let list = document.querySelectorAll(\".form-content .clb-card\");\r\n");
      out.write("\r\n");
      out.write("                function loadItem() {\r\n");
      out.write("                    let beginGet = limit * (thisPage - 1);\r\n");
      out.write("                    let endGet = limit * thisPage - 1;\r\n");
      out.write("\r\n");
      out.write("                    list.forEach((item, key) => {\r\n");
      out.write("                        if (key >= beginGet && key <= endGet) {\r\n");
      out.write("                            item.style.display = \"block\";\r\n");
      out.write("                        } else {\r\n");
      out.write("                            item.style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    listPage();\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                loadItem();\r\n");
      out.write("\r\n");
      out.write("                function listPage() {\r\n");
      out.write("                    let count = Math.ceil(list.length / limit);\r\n");
      out.write("                    document.querySelector(\".listPage\").innerHTML = \"\";\r\n");
      out.write("\r\n");
      out.write("                    if (thisPage != 1) {\r\n");
      out.write("                        let prev = document.createElement(\"li\");\r\n");
      out.write("                        prev.innerText = \"PREV\";\r\n");
      out.write("                        prev.addEventListener(\"click\", function () {\r\n");
      out.write("                            changePage(thisPage - 1);\r\n");
      out.write("                        });\r\n");
      out.write("                        document.querySelector(\".listPage\").appendChild(prev);\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    for (let i = 1; i <= count; i++) {\r\n");
      out.write("                        let newPage = document.createElement(\"li\");\r\n");
      out.write("                        newPage.innerText = i;\r\n");
      out.write("\r\n");
      out.write("                        if (i == thisPage) {\r\n");
      out.write("                            newPage.classList.add(\"actived\");\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        newPage.addEventListener(\"click\", function () {\r\n");
      out.write("                            changePage(i);\r\n");
      out.write("                        });\r\n");
      out.write("                        document.querySelector(\".listPage\").appendChild(newPage);\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if (thisPage != count) {\r\n");
      out.write("                        let next = document.createElement(\"li\");\r\n");
      out.write("                        next.innerText = \"NEXT\";\r\n");
      out.write("                        next.addEventListener(\"click\", function () {\r\n");
      out.write("                            changePage(thisPage + 1);\r\n");
      out.write("                        });\r\n");
      out.write("                        document.querySelector(\".listPage\").appendChild(next);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function changePage(i) {\r\n");
      out.write("                    thisPage = i;\r\n");
      out.write("                    loadItem();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script> \r\n");
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
          out.write("                    <div class=\"clb-card\">\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"clb-card-img\"><img src=\"data:image;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.dataImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></div>\r\n");
          out.write("                        <div class=\"clb-card-content\">\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"clb-card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.clubName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                            <div class=\"clb-card-position\">\r\n");
          out.write("                                <span> <i class=\"fas fa-map-marker-alt\"></i></span>\r\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"clb-card-phone\">\r\n");
          out.write("                                <span><i class=\"fas fa-phone-alt\"></i>\r\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.hotline}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
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
