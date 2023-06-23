package org.apache.jsp.views.Admin_005fNhat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/editProfile.css\" />\n");
      out.write("    <title>Header</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      <!-- Content ? ?ây -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("        <div class=\"container bootstrap snippets bootdey\">\n");
      out.write("          <h1 class=\"text-primary\">Edit Profile</h1>\n");
      out.write("          <hr />\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <!-- left column -->\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("              <div class=\"text-center\">\n");
      out.write("                <img\n");
      out.write("                  src=\"https://bootdey.com/img/Content/avatar/avatar7.png\"\n");
      out.write("                  class=\"avatar img-circle img-thumbnail\"\n");
      out.write("                  alt=\"avatar\"\n");
      out.write("                />\n");
      out.write("                <h3 style=\"font-weight: 700;\">ADMIN</h3>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- edit form column -->\n");
      out.write("            <div class=\"col-md-9 personal-info\">\n");
      out.write("              <h2>Personal Information</h2>\n");
      out.write("\n");
      out.write("              <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <h4>Information</h4>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\">Name :</label>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                      <input class=\"form-control\" type=\"text\" />\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                      >Phone :</label\n");
      out.write("                    >\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                        <input class=\"form-control\" type=\"tel\" pattern=\"^0\\d{9}$\" title=\"Invalid phone number\" required />\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\">Address :</label>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                      <input class=\"form-control\" type=\"text\" value=\"\" />\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <h4>Security Information</h4>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                      >Old Password :\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                      <input\n");
      out.write("                        id=\"password-input\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        type=\"password\"\n");
      out.write("                        required\n");
      out.write("                        style=\"background-color: #e8f0fe\"\n");
      out.write("                      />\n");
      out.write("                      <span\n");
      out.write("                        id=\"toggle-password\"\n");
      out.write("                        class=\"password-toggle\"\n");
      out.write("                        onclick=\"togglePasswordVisibility()\"\n");
      out.write("                      >\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                      >New Password :\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                      <input\n");
      out.write("                        id=\"new-password\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        type=\"password\"\n");
      out.write("                        pattern=\"^(?=.*[!@#$%^&*])(?=.*[A-Z]).{8}$\"\n");
      out.write("                        title=\"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\"\n");
      out.write("                        required\n");
      out.write("                        style=\"background-color: #e8f0fe\"\n");
      out.write("                      />\n");
      out.write("                      <span\n");
      out.write("                      id=\"toggle-password-new\"\n");
      out.write("                      class=\"password-toggle\"\n");
      out.write("                      onclick=\"togglePasswordNew()\"\n");
      out.write("                    >\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group-item\">\n");
      out.write("                    <label class=\"col-lg-3 control-label\"\n");
      out.write("                      >Confirm Password :\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                      <input\n");
      out.write("                        id=\"confirm-password\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        type=\"password\"\n");
      out.write("                        pattern=\"^(?=.*[!@#$%^&*])(?=.*[A-Z]).{8}$\"\n");
      out.write("                        title=\"Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter\"\n");
      out.write("                        required\n");
      out.write("                        style=\"background-color: #e8f0fe\"\n");
      out.write("                        oninput=\"checkPasswordMatch()\"\n");
      out.write("                      />\n");
      out.write("                      <div id=\"password-match-status\"></div>\n");
      out.write("                        <span\n");
      out.write("                      id=\"toggle-password-again\"\n");
      out.write("                      class=\"password-toggle\"\n");
      out.write("                      onclick=\"togglePasswordAgain()\"\n");
      out.write("                    >\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("              <div class=\"form-btn\"><button>Save</button></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <hr />\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
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
      out.write("      function checkPasswordMatch() {\n");
      out.write("        var newPassword = document.getElementById(\"new-password\").value;\n");
      out.write("        var confirmPassword = document.getElementById(\"confirm-password\").value;\n");
      out.write("        var passwordMatchStatus = document.getElementById(\n");
      out.write("          \"password-match-status\"\n");
      out.write("        );\n");
      out.write("\n");
      out.write("        if (newPassword === confirmPassword) {\n");
      out.write("          passwordMatchStatus.innerHTML = \"password correct\";\n");
      out.write("          passwordMatchStatus.style.color = \"green\";\n");
      out.write("        } else {\n");
      out.write("          passwordMatchStatus.innerHTML = \"password incorrect\";\n");
      out.write("          passwordMatchStatus.style.color = \"red\";\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      function togglePasswordVisibility() {\n");
      out.write("        var passwordInput = document.getElementById(\"password-input\");\n");
      out.write("        var togglePassword = document.getElementById(\"toggle-password\");\n");
      out.write("\n");
      out.write("        if (passwordInput.type === \"password\") {\n");
      out.write("          passwordInput.type = \"text\";\n");
      out.write("          togglePassword.classList.add(\"show-password\");\n");
      out.write("        } else {\n");
      out.write("          passwordInput.type = \"password\";\n");
      out.write("          togglePassword.classList.remove(\"show-password\");\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      function togglePasswordNew() {\n");
      out.write("        var passwordInput = document.getElementById(\"new-password\");\n");
      out.write("        var togglePassword = document.getElementById(\"toggle-password-new\");\n");
      out.write("\n");
      out.write("        if (passwordInput.type === \"password\") {\n");
      out.write("          passwordInput.type = \"text\";\n");
      out.write("          togglePassword.classList.add(\"show-password\");\n");
      out.write("        } else {\n");
      out.write("          passwordInput.type = \"password\";\n");
      out.write("          togglePassword.classList.remove(\"show-password\");\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      function togglePasswordAgain() {\n");
      out.write("        var passwordInput = document.getElementById(\"confirm-password\");\n");
      out.write("        var togglePassword = document.getElementById(\"toggle-password-again\");\n");
      out.write("\n");
      out.write("        if (passwordInput.type === \"password\") {\n");
      out.write("          passwordInput.type = \"text\";\n");
      out.write("          togglePassword.classList.add(\"show-password\");\n");
      out.write("        } else {\n");
      out.write("          passwordInput.type = \"password\";\n");
      out.write("          togglePassword.classList.remove(\"show-password\");\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
}
