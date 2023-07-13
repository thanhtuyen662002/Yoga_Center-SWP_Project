package org.apache.jsp.view_service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            />\r\n");
      out.write("\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../../css/editProfile.css\" />\r\n");
      out.write("        <title>Header</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!-- Content ? ?ây -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div class=\"container bootstrap snippets bootdey\">\r\n");
      out.write("                <h1 class=\"text-primary\">Edit Profile</h1>\r\n");
      out.write("                <hr />\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- left column -->\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                            <img\r\n");
      out.write("                                src=\"https://bootdey.com/img/Content/avatar/avatar7.png\"\r\n");
      out.write("                                class=\"avatar img-circle img-thumbnail\"\r\n");
      out.write("                                alt=\"avatar\"\r\n");
      out.write("                                />\r\n");
      out.write("                            <h3 style=\"font-weight: 700;\">SERVICE MANAGER</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- edit form column -->\r\n");
      out.write("                    <div class=\"col-md-9 personal-info\">\r\n");
      out.write("                        <h2>Personal Information</h2>\r\n");
      out.write("\r\n");
      out.write("                        <form id=\"frm-edit\" method=\"post\" action=\"editProfileAdmin\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <h4>Information</h4>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Name :</label>\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" oninput=\"validateFullName()\" id=\"input-fullname\" placeholder=\"Enter full name\" name=\"fullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <span id=\"error-fullname\" class=\"error-message\" style=\"color: red;\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\r\n");
      out.write("                                           >Phone :</label\r\n");
      out.write("                                    >\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input type=\"tel\" class=\"form-control\" oninput=\"validatePhone()\" maxlength=\"10\" id=\"input-phone\" placeholder=\"Enter Phone\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Address :</label>\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <h4>Security Information</h4>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\r\n");
      out.write("                                           >Old Password :\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input id=\"oldPwd\" class=\"form-control\" type=\"password\" name=\"oldPwd\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\r\n");
      out.write("                                           >New Password :\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input type=\"password\" oninput=\"validatePassword()\" class=\"form-control\" id=\"input-pwd\" placeholder=\"Enter Password\" name=\"newPwd\" required>\r\n");
      out.write("                                        <span id=\"errorText\" class=\"error-message\" style=\"color: red\"></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group-item\">\r\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\r\n");
      out.write("                                           >Confirm Password :\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"confirmPwd\" oninput=\"confirmPasswords()\" placeholder=\"Enter Password\" required>\r\n");
      out.write("                                        <span id=\"passwordError\" style=\"color: red;\"></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-btn d-flex justify-content-start\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <button type=\"button\" onclick=\"submitForm()\" class=\"btn-outline-success rounded-pill border ml-4\" style=\"font-size: 20px\">Save</button></br>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr />\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"./../../courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/main.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/popper.js\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("                                    var checkFullName = true;\r\n");
      out.write("                                    function validatePhone() {\r\n");
      out.write("                                        var input = document.getElementById('input-phone');\r\n");
      out.write("                                        var value = input.value;\r\n");
      out.write("\r\n");
      out.write("                                        // Remove any non-numeric characters\r\n");
      out.write("                                        var numericValue = value.replace(/[^0-9]/g, '');\r\n");
      out.write("\r\n");
      out.write("                                        // Truncate the value if it exceeds the maximum length\r\n");
      out.write("                                        if (numericValue.length > 10) {\r\n");
      out.write("                                            numericValue = numericValue.substring(0, 10);\r\n");
      out.write("                                        }\r\n");
      out.write("\r\n");
      out.write("                                        // Update the input value\r\n");
      out.write("                                        input.value = numericValue;\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                    var pwd = true;\r\n");
      out.write("                                    var confirmPwd = true;\r\n");
      out.write("\r\n");
      out.write("                                    function validateFullName() {\r\n");
      out.write("                                        var input = document.getElementById('input-fullname');\r\n");
      out.write("                                        var value = input.value;\r\n");
      out.write("                                        var isValid = /^[a-zA-Z\\s]+$/.test(value); // Check for only alphabet characters and blank spaces\r\n");
      out.write("                                        if (!isValid) {\r\n");
      out.write("                                            checkFullName = false;\r\n");
      out.write("                                            // Invalid input\r\n");
      out.write("                                            document.getElementById('error-fullname').textContent = \"Input must contain only alphabet characters and blank space\";\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            checkFullName = true;\r\n");
      out.write("                                            // Clear the error message\r\n");
      out.write("                                            document.getElementById('error-fullname').textContent = \"\";\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                    function submitForm() {\r\n");
      out.write("                                        if (checkFullName) {\r\n");
      out.write("                                            if (document.getElementById('oldPwd').value !== '') {\r\n");
      out.write("                                                if (document.getElementById('input-pwd').value !== '') {\r\n");
      out.write("                                                    if (pwd && confirmPwd) {\r\n");
      out.write("                                                        document.getElementById('frm-edit').submit();\r\n");
      out.write("                                                    } else {\r\n");
      out.write("                                                        alert(\"Please check your information again!\");\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                } else {\r\n");
      out.write("                                                    alert(\"Please input your new password!\");\r\n");
      out.write("                                                }\r\n");
      out.write("                                            } else {\r\n");
      out.write("                                                document.getElementById('frm-edit').submit();\r\n");
      out.write("                                            }\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            alert(\"Please check your information again!\");\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                    var password = document.getElementById('input-pwd').value;\r\n");
      out.write("                                    function validatePassword() {\r\n");
      out.write("                                        var input = document.getElementById('input-pwd');\r\n");
      out.write("                                        var value = input.value;\r\n");
      out.write("                                        var btnSubmit = document.getElementById('btn-submit');\r\n");
      out.write("                                        var hasNumber = /\\d/.test(value); // Check for at least one digit\r\n");
      out.write("                                        var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter\r\n");
      out.write("\r\n");
      out.write("                                        if (value.length < 8 || !hasNumber || !hasUppercase) {\r\n");
      out.write("                                            // Invalid input\r\n");
      out.write("                                            document.getElementById('errorText').textContent = \"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\";\r\n");
      out.write("                                            pwd = false;\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            // Clear the error message\r\n");
      out.write("                                            document.getElementById('errorText').textContent = \"\";\r\n");
      out.write("                                            pwd = true;\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                    var confirmPassword = document.getElementById('confirmPwd').value;\r\n");
      out.write("                                    function confirmPasswords()\r\n");
      out.write("                                    {\r\n");
      out.write("                                        var password = document.getElementById('input-pwd').value;\r\n");
      out.write("                                        var confirmPassword = document.getElementById('confirmPwd').value;\r\n");
      out.write("                                        var passwordError = document.getElementById('passwordError');\r\n");
      out.write("                                        var btnSubmit = document.getElementById('btn-submit');\r\n");
      out.write("\r\n");
      out.write("                                        if (password !== confirmPassword) {\r\n");
      out.write("                                            passwordError.textContent = 'Passwords do not match.';\r\n");
      out.write("                                            confirmPwd = false;\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            passwordError.textContent = ''; // Clear the error message\r\n");
      out.write("                                            confirmPwd = true;\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("./view.service/service_header.jsp");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oldPwd == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <span id=\"passwordError\" style=\"color: red;\">Can't update profile because wrong old password</span>\r\n");
        out.write("                                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isSuccess == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <span id=\"passwordError\" style=\"color: green;\">Update Succesfull!</span>\r\n");
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
}
