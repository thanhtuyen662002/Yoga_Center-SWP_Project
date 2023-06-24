package org.apache.jsp.views.Admin_005fNhat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- <link\r\n");
      out.write("    href=\"vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("    rel=\"stylesheet\"\r\n");
      out.write("    type=\"text/css\"\r\n");
      out.write("  /> -->\r\n");
      out.write("  <link\r\n");
      out.write("  href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("  rel=\"stylesheet\"\r\n");
      out.write("/>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/dashboard.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/Header_Admin.css\" />\r\n");
      out.write("    <title>Header</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("      ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <!-- Content ? ?ây -->\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("       <!-- Topbar -->\r\n");
      out.write("       <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("       <!-- Topbar Search -->\r\n");
      out.write("       <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("         <div class=\"input-group\">\r\n");
      out.write("           <input\r\n");
      out.write("             type=\"text\"\r\n");
      out.write("             class=\"form-control bg-light border-0 small\"\r\n");
      out.write("             placeholder=\"Search for...\"\r\n");
      out.write("             aria-label=\"Search\"\r\n");
      out.write("             aria-describedby=\"basic-addon2\"\r\n");
      out.write("           />\r\n");
      out.write("           <div class=\"input-group-append\">\r\n");
      out.write("             <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("               <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("             </button>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("       </form>\r\n");
      out.write("\r\n");
      out.write("       <!-- Topbar Navbar -->\r\n");
      out.write("       <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("         <!-- Nav Item - User Information -->\r\n");
      out.write("         <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("             <span class=\"mr-2 d-none d-lg-inline text-gray-600 \">Douglas McGee</span>\r\n");
      out.write("         </li>\r\n");
      out.write("       </ul>\r\n");
      out.write("     </nav>\r\n");
      out.write("     <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("     <!-- Begin Page Content -->\r\n");
      out.write("     <div class=\"container-fluid\">\r\n");
      out.write("       <!-- Page Heading -->\r\n");
      out.write("       <div\r\n");
      out.write("         class=\"d-sm-flex align-items-center justify-content-between mb-4\"\r\n");
      out.write("       >\r\n");
      out.write("         <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\r\n");
      out.write("         <a\r\n");
      out.write("           href=\"#\"\r\n");
      out.write("           class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"\r\n");
      out.write("           ><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate\r\n");
      out.write("           Report</a\r\n");
      out.write("         >\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <!-- Content Row -->\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("           <div class=\"card border-left-primary shadow h-100 py-2\">\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                 <div class=\"col mr-2\">\r\n");
      out.write("                   <div\r\n");
      out.write("                     class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\"\r\n");
      out.write("                   >\r\n");
      out.write("                     Earnings (Monthly)\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\r\n");
      out.write("                     $40,000\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-auto\">\r\n");
      out.write("                   <i class=\"fas fa-calendar fa-2x text-gray-300\"></i>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("           <div class=\"card border-left-success shadow h-100 py-2\">\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                 <div class=\"col mr-2\">\r\n");
      out.write("                   <div\r\n");
      out.write("                     class=\"text-xs font-weight-bold text-success text-uppercase mb-1\"\r\n");
      out.write("                   >\r\n");
      out.write("                     Earnings (Annual)\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\r\n");
      out.write("                     $215,000\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-auto\">\r\n");
      out.write("                   <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("           <div class=\"card border-left-info shadow h-100 py-2\">\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                 <div class=\"col mr-2\">\r\n");
      out.write("                   <div\r\n");
      out.write("                     class=\"text-xs font-weight-bold text-info text-uppercase mb-1\"\r\n");
      out.write("                   >\r\n");
      out.write("                     Tasks\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                     <div class=\"col-auto\">\r\n");
      out.write("                       <div\r\n");
      out.write("                         class=\"h5 mb-0 mr-3 font-weight-bold text-gray-800\"\r\n");
      out.write("                       >\r\n");
      out.write("                         50%\r\n");
      out.write("                       </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col\">\r\n");
      out.write("                       <div class=\"progress progress-sm mr-2\">\r\n");
      out.write("                         <div\r\n");
      out.write("                           class=\"progress-bar bg-info\"\r\n");
      out.write("                           role=\"progressbar\"\r\n");
      out.write("                           style=\"width: 50%\"\r\n");
      out.write("                           aria-valuenow=\"50\"\r\n");
      out.write("                           aria-valuemin=\"0\"\r\n");
      out.write("                           aria-valuemax=\"100\"\r\n");
      out.write("                         ></div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-auto\">\r\n");
      out.write("                   <i\r\n");
      out.write("                     class=\"fas fa-clipboard-list fa-2x text-gray-300\"\r\n");
      out.write("                   ></i>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <!-- Pending Requests Card Example -->\r\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("           <div class=\"card border-left-warning shadow h-100 py-2\">\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                 <div class=\"col mr-2\">\r\n");
      out.write("                   <div\r\n");
      out.write("                     class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\"\r\n");
      out.write("                   >\r\n");
      out.write("                     Pending Requests\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\r\n");
      out.write("                     18\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-auto\">\r\n");
      out.write("                   <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <!-- Content Row -->\r\n");
      out.write("\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("         <!-- Này là chart bên trái -->\r\n");
      out.write("         <div class=\"col-xl-8 col-lg-7\">\r\n");
      out.write("           <div class=\"card shadow mb-4\">\r\n");
      out.write("             <!-- Card Header - Dropdown -->\r\n");
      out.write("             <div\r\n");
      out.write("               class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\"\r\n");
      out.write("             >\r\n");
      out.write("               <h6 class=\"m-0 font-weight-bold text-primary\">\r\n");
      out.write("                 Earnings Overview\r\n");
      out.write("               </h6>\r\n");
      out.write("               <div class=\"dropdown no-arrow\">\r\n");
      out.write("                 <a\r\n");
      out.write("                   class=\"dropdown-toggle\"\r\n");
      out.write("                   href=\"#\"\r\n");
      out.write("                   role=\"button\"\r\n");
      out.write("                   id=\"dropdownMenuLink\"\r\n");
      out.write("                   data-toggle=\"dropdown\"\r\n");
      out.write("                   aria-haspopup=\"true\"\r\n");
      out.write("                   aria-expanded=\"false\"\r\n");
      out.write("                 >\r\n");
      out.write("                   <i\r\n");
      out.write("                     class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"\r\n");
      out.write("                   ></i>\r\n");
      out.write("                 </a>\r\n");
      out.write("                 <div\r\n");
      out.write("                   class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\r\n");
      out.write("                   aria-labelledby=\"dropdownMenuLink\"\r\n");
      out.write("                 >\r\n");
      out.write("                   <div class=\"dropdown-header\">Dropdown Header:</div>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                   <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\"\r\n");
      out.write("                     >Something else here</a\r\n");
      out.write("                   >\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <!-- Card Body -->\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"chart-area\">\r\n");
      out.write("                 <canvas id=\"myAreaChart\"></canvas>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <!-- Này là  Pie Chart bên ph?i -->\r\n");
      out.write("         <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("           <div class=\"card shadow mb-4\">\r\n");
      out.write("             <!-- Card Header - Dropdown -->\r\n");
      out.write("             <div\r\n");
      out.write("               class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\"\r\n");
      out.write("             >\r\n");
      out.write("               <h6 class=\"m-0 font-weight-bold text-primary\">\r\n");
      out.write("                 Revenue Sources\r\n");
      out.write("               </h6>\r\n");
      out.write("               <div class=\"dropdown no-arrow\">\r\n");
      out.write("                 <a\r\n");
      out.write("                   class=\"dropdown-toggle\"\r\n");
      out.write("                   href=\"#\"\r\n");
      out.write("                   role=\"button\"\r\n");
      out.write("                   id=\"dropdownMenuLink\"\r\n");
      out.write("                   data-toggle=\"dropdown\"\r\n");
      out.write("                   aria-haspopup=\"true\"\r\n");
      out.write("                   aria-expanded=\"false\"\r\n");
      out.write("                 >\r\n");
      out.write("                   <i\r\n");
      out.write("                     class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"\r\n");
      out.write("                   ></i>\r\n");
      out.write("                 </a>\r\n");
      out.write("                 <div\r\n");
      out.write("                   class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\r\n");
      out.write("                   aria-labelledby=\"dropdownMenuLink\"\r\n");
      out.write("                 >\r\n");
      out.write("                   <div class=\"dropdown-header\">Dropdown Header:</div>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                   <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\"\r\n");
      out.write("                     >Something else here</a\r\n");
      out.write("                   >\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <!-- Card Body -->\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("               <div class=\"chart-pie pt-4 pb-2\">\r\n");
      out.write("                 <canvas id=\"myPieChart\"></canvas>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"mt-4 text-center small\">\r\n");
      out.write("                 <span class=\"mr-2\">\r\n");
      out.write("                   <i class=\"fas fa-circle text-primary\"></i> Direct\r\n");
      out.write("                 </span>\r\n");
      out.write("                 <span class=\"mr-2\">\r\n");
      out.write("                   <i class=\"fas fa-circle text-success\"></i> Social\r\n");
      out.write("                 </span>\r\n");
      out.write("                 <span class=\"mr-2\">\r\n");
      out.write("                   <i class=\"fas fa-circle text-info\"></i> Referral\r\n");
      out.write("                 </span>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("    <script src=\"./../../courseNav/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/main.js\"></script>\r\n");
      out.write("    <script src=\"./../../courseNav/popper.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("        $(\"#course\").DataTable();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <!-- Page level plugins -->\r\n");
      out.write("      <script src=\"./../../js/Chart.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("      <!-- Page level custom scripts -->\r\n");
      out.write("      <script src=\"./../../js/chart-area-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <script src=\"./../../js/chart-pie-demo.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
