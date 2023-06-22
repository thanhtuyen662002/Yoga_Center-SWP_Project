package org.apache.jsp.views.Admin_005fNhat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_if_test_nobody.release();
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\">\r\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"./css/updateInsertCourse.css\" />-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../../css/courseStaff.css\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <title>Insert Course</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<!--        <div class=\"wrapper d-flex align-items-stretch h-100\">\r\n");
      out.write("            <nav id=\"sidebar\">\r\n");
      out.write("                <div class=\"img bg-wrap text-center py-2\" style=\"background-image: url(images/bg_1.jpg);\">\r\n");
      out.write("                    <div class=\"user-logo\">\r\n");
      out.write("                        <div class=\"img\" style=\"background-image: url(../../image/logo-yoga.jpg);\"></div>\r\n");
      out.write("                        <h3>YOGA CENTER</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-book mr-3\"></span> KHÓA HỌC</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-gift mr-3\"></span> KHUYẾN MÃI</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-calendar-days mr-3\"></span> LỊCH DẠY</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-newspaper mr-3\"></span> TIN TỨC</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa-solid fa-people-group mr-3\"></span> KHÁCH HÀNG</a>\r\n");
      out.write("                    </li> \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span class=\"fa fa-sign-out mr-3\"></span> Đăng Xuất</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </nav>-->\r\n");
      out.write("            ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <!-- Page Content  -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"course-link\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"listStaff\">Admin</a></li>\r\n");
      out.write("                            <li><a href=\"listStaff\">List Staff</a></li>\r\n");
      out.write("                            <li><a href=\"updateStaff\">View Staff</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"table-name border\" style=\"height: 15%\">\r\n");
      out.write("                        <h4>Update Staff</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"text-center pt-2 d-flex w-100 justify-content-end pr-4\">\r\n");
      out.write("                    <button onclick=\"goBack()\" class=\"btn-primary rounded-2 border-0 pr-2 pl-2\" style=\"font-size: 24px\">Back</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"m-3 parent pl-3\" style=\"height: 60%;background-color: white;border-radius: 10px;padding-top: 2%\">\r\n");
      out.write("                    <div class=\"justify-content-center d-flex\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div> \r\n");
      out.write("                    <form action=\"updateStaff\" method=\"post\" style=\"padding-right: 30%\">\r\n");
      out.write("                        <div class=\"mb-3 row\" >  \r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Phone<i style=\"color: red\">*</i></label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" oninput=\"validatePhone()\" maxlength=\"10\" id=\"input-phone\" placeholder=\"Enter Phone\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required readonly>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3 row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Full Name<i style=\"color: red\">*</i></label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" oninput=\"validateFullName()\" id=\"input-fullname\" placeholder=\"Enter full name\" name=\"fullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span id=\"error-fullname\" class=\"error-message\" style=\"color: red;\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3 row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Address</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Enter address\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Gender</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"Male\" \r\n");
      out.write("                                       ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                           \r\n");
      out.write("                                           /> Male\r\n");
      out.write("                                       <input type=\"radio\" name=\"gender\" value=\"FeMale\"\r\n");
      out.write("                                       ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                       /> FeMale\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Status</label>\r\n");
      out.write("                            <div class=\"col-sm-10\">\r\n");
      out.write("                                <input type=\"radio\" name=\"status\" value=\"true\" \r\n");
      out.write("                                       ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                           checked\r\n");
      out.write("                                           /> Active\r\n");
      out.write("                                       <input type=\"radio\" name=\"status\" value=\"false\"\r\n");
      out.write("                                       ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                       /> Deactive\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-center w-100 mt-2\">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"update\"/>\r\n");
      out.write("                    <button class=\"btn-primary rounded-4 border-0 pr-2 pl-2 mr-2\" id=\"btn-submit\" style=\"font-size: 24px;background-color: grey\">Update</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <form action=\"listStaff\" method=\"post\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"delete\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                        <button class=\"btn-primary rounded-4 border-0 pr-2 pl-2\" id=\"btn-submit\" style=\"font-size: 24px;background-color: grey\" onclick=\"return confirmSubmit()\">Delete</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"/courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"/courseNav/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"/courseNav/main.js\"></script>\r\n");
      out.write("        <script src=\"/courseNav/popper.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                            CKEDITOR.replace(\"myTextarea\");\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"./course.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                            function goBack() {\r\n");
      out.write("                                window.history.back();\r\n");
      out.write("                            }\r\n");
      out.write("                            function confirmPasswords()\r\n");
      out.write("                            {\r\n");
      out.write("                                var password = document.getElementById('input-pwd').value;\r\n");
      out.write("                                var confirmPassword = document.getElementById('confirmPwd').value;\r\n");
      out.write("                                var passwordError = document.getElementById('passwordError');\r\n");
      out.write("                                var btnSubmit = document.getElementById('btn-submit');\r\n");
      out.write("\r\n");
      out.write("                                if (password !== confirmPassword) {\r\n");
      out.write("                                    passwordError.textContent = 'Passwords do not match.';\r\n");
      out.write("                                    btnSubmit.disabled = true;\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    passwordError.textContent = ''; // Clear the error message\r\n");
      out.write("                                    btnSubmit.disabled = false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            function validatePhone() {\r\n");
      out.write("                                var input = document.getElementById('input-phone');\r\n");
      out.write("                                var value = input.value;\r\n");
      out.write("\r\n");
      out.write("                                // Remove any non-numeric characters\r\n");
      out.write("                                var numericValue = value.replace(/[^0-9]/g, '');\r\n");
      out.write("\r\n");
      out.write("                                // Truncate the value if it exceeds the maximum length\r\n");
      out.write("                                if (numericValue.length > 10) {\r\n");
      out.write("                                    numericValue = numericValue.substring(0, 10);\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                // Update the input value\r\n");
      out.write("                                input.value = numericValue;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            function validatePassword() {\r\n");
      out.write("                                var input = document.getElementById('input-pwd');\r\n");
      out.write("                                var value = input.value;\r\n");
      out.write("                                var btnSubmit = document.getElementById('btn-submit');\r\n");
      out.write("                                var hasNumber = /\\d/.test(value); // Check for at least one digit\r\n");
      out.write("                                var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter\r\n");
      out.write("\r\n");
      out.write("                                if (value.length < 8 || !hasNumber || !hasUppercase) {\r\n");
      out.write("                                    // Invalid input\r\n");
      out.write("                                    document.getElementById('errorText').textContent = \"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\";\r\n");
      out.write("                                    btnSubmit.disabled = true;\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    // Clear the error message\r\n");
      out.write("                                    document.getElementById('errorText').textContent = \"\";\r\n");
      out.write("                                    btnSubmit.disabled = false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            function validateUserName() {\r\n");
      out.write("                                var input = document.getElementById('input-pwd');\r\n");
      out.write("                                var value = input.value;\r\n");
      out.write("                                var btnSubmit = document.getElementById('btn-submit');\r\n");
      out.write("                                var hasNumber = /\\d/.test(value); // Check for at least one digit\r\n");
      out.write("                                var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter\r\n");
      out.write("\r\n");
      out.write("                                if (value.length < 8 || !hasNumber || !hasUppercase) {\r\n");
      out.write("                                    // Invalid input\r\n");
      out.write("                                    document.getElementById('errorText').textContent = \"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\";\r\n");
      out.write("                                    btnSubmit.disabled = true;\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    // Clear the error message\r\n");
      out.write("                                    document.getElementById('errorText').textContent = \"\";\r\n");
      out.write("                                    btnSubmit.disabled = false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            function validateUserName() {\r\n");
      out.write("                                var input = document.getElementById('input-username');\r\n");
      out.write("                                var value = input.value;\r\n");
      out.write("\r\n");
      out.write("                                var isValid = /^[a-zA-Z]+$/.test(value); // Check for only alphabet characters\r\n");
      out.write("\r\n");
      out.write("                                if (!isValid) {\r\n");
      out.write("                                    // Invalid input\r\n");
      out.write("                                    document.getElementById('error-username').textContent = \"Input must contain only alphabet characters\";\r\n");
      out.write("                                    btnSubmit.disabled = true;\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    // Clear the error message\r\n");
      out.write("                                    document.getElementById('error-username').textContent = \"\";\r\n");
      out.write("                                    btnSubmit.disabled = false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            function validateFullName() {\r\n");
      out.write("                                var input = document.getElementById('input-fullname');\r\n");
      out.write("                                var value = input.value;\r\n");
      out.write("\r\n");
      out.write("                                var isValid = /^[a-zA-Z\\s]+$/.test(value); // Check for only alphabet characters and blank spaces\r\n");
      out.write("\r\n");
      out.write("                                if (!isValid) {\r\n");
      out.write("                                    // Invalid input\r\n");
      out.write("                                    document.getElementById('error-fullname').textContent = \"Input must contain only alphabet characters and blank space\";\r\n");
      out.write("                                    btnSubmit.disabled = true;\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    // Clear the error message\r\n");
      out.write("                                    document.getElementById('error-fullname').textContent = \"\";\r\n");
      out.write("                                    btnSubmit.disabled = false;\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            function confirmSubmit() {\r\n");
      out.write("                                // Display a confirmation dialog\r\n");
      out.write("                                var confirmation = confirm(\"Are you sure you want to submit the form?\");\r\n");
      out.write("\r\n");
      out.write("                                // If the user confirms, return true to submit the form\r\n");
      out.write("                                // If the user cancels, return false to prevent form submission\r\n");
      out.write("                                return confirmation;\r\n");
      out.write("                            }\r\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("Header_Admin.jsp");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(msgError) >= 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <span id=\"error-fullname\" class=\"error-message\" style=\"color: red;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.gender.trim() eq 'Male'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.gender.trim() eq 'FeMale'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                           checked\r\n");
        out.write("                                       ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test_nobody.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.status == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test_nobody.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test_nobody.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.status == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                           checked\r\n");
        out.write("                                       ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}
