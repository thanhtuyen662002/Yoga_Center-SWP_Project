package org.apache.jsp.views.Admin_005fNhat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;

public final class ListSchedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/views/Admin_Nhat/Header_Admin.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_step_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_step_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_step_end_begin.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/updateCourse.css\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <title>Insert Course</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            .a-page {\r\n");
      out.write("                background-color: #00FFFF;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 5px 10px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                margin: 2px;\r\n");
      out.write("            }\r\n");
      out.write("            #snackbar {\r\n");
      out.write("                visibility: hidden;\r\n");
      out.write("                min-width: 250px;\r\n");
      out.write("                margin-left: -125px;\r\n");
      out.write("                background-color: #333;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                padding: 16px;\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                left: 50%;\r\n");
      out.write("                top: 30px; /* Change bottom to top and adjust the distance from the top */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #snackbar.show {\r\n");
      out.write("                visibility: visible;\r\n");
      out.write("                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;\r\n");
      out.write("                animation: fadein 0.5s, fadeout 0.5s 2.5s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @-webkit-keyframes fadein {\r\n");
      out.write("                from {\r\n");
      out.write("                    top: 0;\r\n");
      out.write("                    opacity: 0;\r\n");
      out.write("                }\r\n");
      out.write("                to {\r\n");
      out.write("                    top: 30px;\r\n");
      out.write("                    opacity: 1;\r\n");
      out.write("                } /* Change bottom to top and adjust the distance from the top */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @keyframes fadein {\r\n");
      out.write("                from {\r\n");
      out.write("                    top: 0;\r\n");
      out.write("                    opacity: 0;\r\n");
      out.write("                }\r\n");
      out.write("                to {\r\n");
      out.write("                    top: 30px;\r\n");
      out.write("                    opacity: 1;\r\n");
      out.write("                } /* Change bottom to top and adjust the distance from the top */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @-webkit-keyframes fadeout {\r\n");
      out.write("                from {\r\n");
      out.write("                    top: 30px;\r\n");
      out.write("                    opacity: 1;\r\n");
      out.write("                }\r\n");
      out.write("                to {\r\n");
      out.write("                    top: 0;\r\n");
      out.write("                    opacity: 0;\r\n");
      out.write("                } /* Change bottom to top and adjust the distance from the top */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @keyframes fadeout {\r\n");
      out.write("                from {\r\n");
      out.write("                    top: 30px;\r\n");
      out.write("                    opacity: 1;\r\n");
      out.write("                }\r\n");
      out.write("                to {\r\n");
      out.write("                    top: 0;\r\n");
      out.write("                    opacity: 0;\r\n");
      out.write("                } /* Change bottom to top and adjust the distance from the top */\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/Header_Admin.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/staffDropdown.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/courseStaff.css\" />\r\n");
      out.write("        <title>Header</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\"> \r\n");
      out.write("            <nav id=\"sidebar\">\r\n");
      out.write("                <div\r\n");
      out.write("                    class=\"img bg-wrap text-center py-4\"\r\n");
      out.write("                    style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/bg_1.jpg)\"\r\n");
      out.write("                    >\r\n");
      out.write("                    <div class=\"user-logo\">\r\n");
      out.write("                        <div\r\n");
      out.write("                            class=\"img\"\r\n");
      out.write("                            style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/image/logo-yoga.jpg)\"\r\n");
      out.write("                            ></div>\r\n");
      out.write("                        <h3>YOGA CENTER</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"views/Admin_Nhat/DashBoard.jsp\"\r\n");
      out.write("                           ><span class=\"fa-solid fa-chart-line mr-3\"></span>Dashboard\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"editProfileAdmin\"\r\n");
      out.write("                           ><span class=\"fa-solid fa-pen-to-square mr-3\"></span> Edit\r\n");
      out.write("                            Profile</a\r\n");
      out.write("                        >\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"listStaff\"\r\n");
      out.write("                           ><span class=\"fa-solid fa-person fa-xl mr-3\"></span>Staff</a\r\n");
      out.write("                        >\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"listTeacher\">\r\n");
      out.write("                            <span class=\"fa-solid fa-person fa-xl mr-3\"></span>Teacher</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"showListServiceManager\">\r\n");
      out.write("                            <span class=\"fa-solid fa-person fa-xl mr-3\"></span>Service Manager</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"listService\"\r\n");
      out.write("                           ><span class=\"fa-solid fa-person fa-xl mr-3\"></span> Service</a\r\n");
      out.write("                        >\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"listScheduleAdmin\"\r\n");
      out.write("                           ><span class=\"fa-solid fa-calendar-days mr-3\"></span> Schedule</a\r\n");
      out.write("                        >\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li onmouseover=\"showDropdown('listStaff')\" onmouseout=\"hideDropdown('listStaff')\">\r\n");
      out.write("                        <a><span class=\"fa-solid fa-people-group mr-3\"></span> Human</a>\r\n");
      out.write("                        <ul id=\"showhuman\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"listStaff\">Danh sách staff</a></li>\r\n");
      out.write("                            <li><a href=\"listTeacher\">Danh sách Teacher</a></li>\r\n");
      out.write("                            <li><a href=\"listService\">Danh sách Service</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li onmouseover=\"showDropdown('showclass')\" onmouseout=\"hideDropdown('showclass')\">\r\n");
      out.write("                        <a href=\"mainController?action=showclass\"><span class=\"fa-solid fa-people-group mr-3\"></span> LỚP HỌC</a>\r\n");
      out.write("                        <ul id=\"showclass\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"createClass\">Tạo lớp học</a></li>\r\n");
      out.write("                            <li><a href=\"showDeleteClass\">Lớp học đã xóa</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li onmouseover=\"showDropdown('showclub')\" onclick=\"hideDropdown('showclub')\">\r\n");
      out.write("                        <a href=\"mainController?action=club\"><span class=\"fa-solid fa-house-chimney mr-3\"></span> CÂU LẠC BỘ</a>\r\n");
      out.write("                        <ul id=\"showclub\" class=\"dropdown\">\r\n");
      out.write("                            <li><a href=\"insertClub\">Tạo câu lạc bộ</a></li>\r\n");
      out.write("                            <li><a href=\"showDeleteClub\">Câu lạc bộ đã xóa</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li onmouseover=\"showDropdown('learner')\" onclick=\"hideDropdown('learner')\">\r\n");
      out.write("                        <a href=\"mainController?action=learner\"><span class=\"fa-solid fa-user-graduate mr-3\"></span> HỌC VIÊN</a>\r\n");
      out.write("                    </li>                 \r\n");
      out.write("                    <li onmouseover=\"showDropdown('bill')\" onclick=\"hideDropdown('bill')\">\r\n");
      out.write("                        <a href=\"mainController?action=bill\"><span class=\"fa-solid fa-money-bill-1-wave mr-3\"></span> HÓA ĐƠN</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"logout\"><span class=\"fa fa-sign-out mr-3\"></span> Logout</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/staffDropdown.js\"></script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section class=\"table-section vw-100\" style=\"padding: 40px\">\r\n");
      out.write("            <p style=\"text-align: center; font-size: 24px; font-style: italic;font-weight: bold\" >Schedule List</p>\r\n");
      out.write("            <div style=\"width: 100%; display: block\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <table class=\"table \">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr style=\"background-color: #6b90d9;\">\r\n");
      out.write("                        <th rowspan=\"2\" class=\"select-year-custom\" style=\"max-width: 50px;\">\r\n");
      out.write("                            <div class=\"d-flex gap-2 align-items-center\">\r\n");
      out.write("                                <h8 class=\"text-danger mb-0\">YEAR</h8>\r\n");
      out.write("                                <select class=\"form-select\" style=\"height: fit-content;\"\r\n");
      out.write("                                        aria-label=\"Default select example\">\r\n");
      out.write("                                    <option selected>2023</option>\r\n");
      out.write("                                    <option >2024</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"d-flex gap-2 align-items-center\">\r\n");
      out.write("                                <h8 class=\"mb-0\">Week</h8>\r\n");
      out.write("                                <form id=\"myForm\" action=\"listScheduleAdmin\" method=\"post\">\r\n");
      out.write("                                    <select id=\"mySelect\" name=\"currentDay\"\r\n");
      out.write("                                            class=\"form-select\" style=\"height: fit-content;margin-top: 3%\"\r\n");
      out.write("                                            aria-label=\"Default select example\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            MON\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            TUE\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            WED\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            THU\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            FRI\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>\r\n");
      out.write("                            SAT\r\n");
      out.write("                        </th>\r\n");
      out.write("                        <th>SUN</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr style=\"background-color: #6b90d9;\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/8d39de38b8.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                        // Get the select element\r\n");
      out.write("                        var selectElement = document.getElementById(\"mySelect\");\r\n");
      out.write("\r\n");
      out.write("                        // Add an event listener for the change event\r\n");
      out.write("                        selectElement.addEventListener(\"change\", function () {\r\n");
      out.write("                            // Submit the form when the option changes\r\n");
      out.write("                            document.getElementById(\"myForm\").submit();\r\n");
      out.write("                        });\r\n");
      out.write("                        function goBack() {\r\n");
      out.write("                            window.history.back();\r\n");
      out.write("                        }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mondays}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("monday");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            <option ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(monday eq currentMonday)?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${monday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${monday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" to ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sunday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("sunday");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${monday.plusDays(6)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("day");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.week}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <th>\r\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${day}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                            </th>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("sche");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${schedule}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("day");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${week}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("slot");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slots}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("slotsSize");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(slots)}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("i");
    _jspx_th_c_forEach_2.setBegin(0);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slotsSize-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setStep(1);
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr style=\"background-color: white;\">\r\n");
          out.write("                            <th>Slot ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slot[i].id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slot[i].startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slot[i].endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")</th>\r\n");
          out.write("                                ");
          if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                    </tr>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_3.setVar("j");
    _jspx_th_c_forEach_3.setBegin(0);
    _jspx_th_c_forEach_3.setEnd(6);
    _jspx_th_c_forEach_3.setStep(1);
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <form id=\"frm");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" action=\"mainController\" method=\"get\">\r\n");
          out.write("                            <input type=\"hidden\" name=\"id\" id=\"id");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                            <input type=\"hidden\" name=\"action\" value=\"ViewDetails\"/>\r\n");
          out.write("                        </form>\r\n");
          out.write("                        <th id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div id='div-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' style=\"display: none\">\r\n");
          out.write("                                <form id=\"frm-details-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" action=\"listScheduleClass\" method=\"post\">\r\n");
          out.write("                                    <input type=\"hidden\" name=\"slotID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slot[i].id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                                    <input type=\"hidden\" name=\"day\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${day[j]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                                    <button type=\"submit\" class=\"badge-pill badge-light btn-outline-info border-0\">\r\n");
          out.write("                                        View Slot Schedule\r\n");
          out.write("                                    </button>\r\n");
          out.write("                                </form>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </th>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("sc");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${schedule}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                    <script>\r\n");
          out.write("                        var header = document.getElementById('div-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${column}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\r\n");
          out.write("                        header.style.display = \"block\";\r\n");
          out.write("                    </script>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_forEach_5.setVar("i");
    _jspx_th_c_forEach_5.setBegin(0);
    _jspx_th_c_forEach_5.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slotsSize-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_5.setStep(1);
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sc.slot.id eq slot[i].id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
          return true;
        out.write("\r\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_5.setVar("row");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_forEach_6.setVar("j");
    _jspx_th_c_forEach_6.setBegin(0);
    _jspx_th_c_forEach_6.setEnd(6);
    _jspx_th_c_forEach_6.setStep(1);
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sc.date eq day[j]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_6.setVar("column");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${j}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }
}
