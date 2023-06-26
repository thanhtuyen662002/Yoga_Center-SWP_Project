package org.apache.jsp.view_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editprofilecus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vi\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/editProfile.css\" />\n");
      out.write("        \n");
      out.write("        <title>Edit Profile</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("        <!-- Content ? ?ây -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div class=\"container bootstrap snippets bootdey\">\n");
      out.write("                <h1 class=\"text-primary\">Edit Profile</h1>\n");
      out.write("                <hr />\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- left column -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- edit form column -->\n");
      out.write("                    <div class=\"col-md-9 personal-info\">\n");
      out.write("                        <h2>Personal Information</h2>\n");
      out.write("\n");
      out.write("                        <form id=\"frm-edit\" method=\"post\" action=\"editProfileAdmin\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h4>Information</h4>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Name :</label>\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" oninput=\"validateFullName()\" id=\"input-fullname\" placeholder=\"Enter full name\" name=\"fullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span id=\"error-fullname\" class=\"error-message\" style=\"color: red;\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                                           >Phone :</label\n");
      out.write("                                    >\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input type=\"tel\" class=\"form-control\" oninput=\"validatePhone()\" maxlength=\"10\" id=\"input-phone\" placeholder=\"Enter Phone\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\">Address :</label>\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h4>Security Information</h4>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                                           >Old Password :\n");
      out.write("                                    </label>\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input id=\"oldPwd\" class=\"form-control\" type=\"password\" name=\"oldPwd\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                                           >New Password :\n");
      out.write("                                    </label>\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input type=\"password\" oninput=\"validatePassword()\" class=\"form-control\" id=\"input-pwd\" placeholder=\"Enter Password\" name=\"newPwd\" required>\n");
      out.write("                                        <span id=\"errorText\" class=\"error-message\" style=\"color: red\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group-item\">\n");
      out.write("                                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                                           >Confirm Password :\n");
      out.write("                                    </label>\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"confirmPwd\" oninput=\"confirmPasswords()\" placeholder=\"Enter Password\" required>\n");
      out.write("                                        <span id=\"passwordError\" style=\"color: red;\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-btn d-flex justify-content-start\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <button type=\"button\" onclick=\"submitForm()\" class=\"btn-outline-success rounded-pill border ml-4\" style=\"font-size: 20px\">Save</button></br>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"./../../courseNav/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/jquery.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/main.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/popper.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("                                    var checkFullName = true;\n");
      out.write("                                    function validatePhone() {\n");
      out.write("                                        var input = document.getElementById('input-phone');\n");
      out.write("                                        var value = input.value;\n");
      out.write("\n");
      out.write("                                        // Remove any non-numeric characters\n");
      out.write("                                        var numericValue = value.replace(/[^0-9]/g, '');\n");
      out.write("\n");
      out.write("                                        // Truncate the value if it exceeds the maximum length\n");
      out.write("                                        if (numericValue.length > 10) {\n");
      out.write("                                            numericValue = numericValue.substring(0, 10);\n");
      out.write("                                        }\n");
      out.write("\n");
      out.write("                                        // Update the input value\n");
      out.write("                                        input.value = numericValue;\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    var pwd = true;\n");
      out.write("                                    var confirmPwd = true;\n");
      out.write("\n");
      out.write("                                    function validateFullName() {\n");
      out.write("                                        var input = document.getElementById('input-fullname');\n");
      out.write("                                        var value = input.value;\n");
      out.write("                                        var isValid = /^[a-zA-Z\\s]+$/.test(value); // Check for only alphabet characters and blank spaces\n");
      out.write("                                        if (!isValid) {\n");
      out.write("                                            checkFullName = false;\n");
      out.write("                                            // Invalid input\n");
      out.write("                                            document.getElementById('error-fullname').textContent = \"Input must contain only alphabet characters and blank space\";\n");
      out.write("                                        } else {\n");
      out.write("                                            checkFullName = true;\n");
      out.write("                                            // Clear the error message\n");
      out.write("                                            document.getElementById('error-fullname').textContent = \"\";\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    function submitForm() {\n");
      out.write("                                        if (checkFullName) {\n");
      out.write("                                            if (document.getElementById('oldPwd').value !== '') {\n");
      out.write("                                                if (document.getElementById('input-pwd').value !== '') {\n");
      out.write("                                                    if (pwd && confirmPwd) {\n");
      out.write("                                                        document.getElementById('frm-edit').submit();\n");
      out.write("                                                    } else {\n");
      out.write("                                                        alert(\"Please check your information again!\");\n");
      out.write("                                                    }\n");
      out.write("                                                } else {\n");
      out.write("                                                    alert(\"Please input your new password!\");\n");
      out.write("                                                }\n");
      out.write("                                            } else {\n");
      out.write("                                                document.getElementById('frm-edit').submit();\n");
      out.write("                                            }\n");
      out.write("                                        } else {\n");
      out.write("                                            alert(\"Please check your information again!\");\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    var password = document.getElementById('input-pwd').value;\n");
      out.write("                                    function validatePassword() {\n");
      out.write("                                        var input = document.getElementById('input-pwd');\n");
      out.write("                                        var value = input.value;\n");
      out.write("                                        var btnSubmit = document.getElementById('btn-submit');\n");
      out.write("                                        var hasNumber = /\\d/.test(value); // Check for at least one digit\n");
      out.write("                                        var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter\n");
      out.write("\n");
      out.write("                                        if (value.length < 8 || !hasNumber || !hasUppercase) {\n");
      out.write("                                            // Invalid input\n");
      out.write("                                            document.getElementById('errorText').textContent = \"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\";\n");
      out.write("                                            pwd = false;\n");
      out.write("                                        } else {\n");
      out.write("                                            // Clear the error message\n");
      out.write("                                            document.getElementById('errorText').textContent = \"\";\n");
      out.write("                                            pwd = true;\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    var confirmPassword = document.getElementById('confirmPwd').value;\n");
      out.write("                                    function confirmPasswords()\n");
      out.write("                                    {\n");
      out.write("                                        var password = document.getElementById('input-pwd').value;\n");
      out.write("                                        var confirmPassword = document.getElementById('confirmPwd').value;\n");
      out.write("                                        var passwordError = document.getElementById('passwordError');\n");
      out.write("                                        var btnSubmit = document.getElementById('btn-submit');\n");
      out.write("\n");
      out.write("                                        if (password !== confirmPassword) {\n");
      out.write("                                            passwordError.textContent = 'Passwords do not match.';\n");
      out.write("                                            confirmPwd = false;\n");
      out.write("                                        } else {\n");
      out.write("                                            passwordError.textContent = ''; // Clear the error message\n");
      out.write("                                            confirmPwd = true;\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oldPwd == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <span id=\"passwordError\" style=\"color: red;\">Can't update profile because wrong old password</span>\n");
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
        out.write("\n");
        out.write("                            <span id=\"passwordError\" style=\"color: green;\">Update Succesfull!</span>\n");
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
