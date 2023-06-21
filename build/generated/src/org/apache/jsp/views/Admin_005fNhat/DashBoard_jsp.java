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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <!-- <link\n");
      out.write("    href=\"vendor/fontawesome-free/css/all.min.css\"\n");
      out.write("    rel=\"stylesheet\"\n");
      out.write("    type=\"text/css\"\n");
      out.write("  /> -->\n");
      out.write("  <link\n");
      out.write("  href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/Header_Admin.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../css/dashboard.css\">\n");
      out.write("    <title>Header</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      <!-- Content ? ?ây -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("       <!-- Topbar -->\n");
      out.write("       <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("       <!-- Topbar Search -->\n");
      out.write("       <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("         <div class=\"input-group\">\n");
      out.write("           <input\n");
      out.write("             type=\"text\"\n");
      out.write("             class=\"form-control bg-light border-0 small\"\n");
      out.write("             placeholder=\"Search for...\"\n");
      out.write("             aria-label=\"Search\"\n");
      out.write("             aria-describedby=\"basic-addon2\"\n");
      out.write("           />\n");
      out.write("           <div class=\"input-group-append\">\n");
      out.write("             <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("               <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("             </button>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </form>\n");
      out.write("\n");
      out.write("       <!-- Topbar Navbar -->\n");
      out.write("       <ul class=\"navbar-nav ml-auto\">\n");
      out.write("         <!-- Nav Item - User Information -->\n");
      out.write("         <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("             <span class=\"mr-2 d-none d-lg-inline text-gray-600 \">Douglas McGee</span>\n");
      out.write("         </li>\n");
      out.write("       </ul>\n");
      out.write("     </nav>\n");
      out.write("     <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("     <!-- Begin Page Content -->\n");
      out.write("     <div class=\"container-fluid\">\n");
      out.write("       <!-- Page Heading -->\n");
      out.write("       <div\n");
      out.write("         class=\"d-sm-flex align-items-center justify-content-between mb-4\"\n");
      out.write("       >\n");
      out.write("         <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("         <a\n");
      out.write("           href=\"#\"\n");
      out.write("           class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"\n");
      out.write("           ><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate\n");
      out.write("           Report</a\n");
      out.write("         >\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <!-- Content Row -->\n");
      out.write("       <div class=\"row\">\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("           <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\n");
      out.write("                 <div class=\"col mr-2\">\n");
      out.write("                   <div\n");
      out.write("                     class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\"\n");
      out.write("                   >\n");
      out.write("                     Earnings (Monthly)\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\n");
      out.write("                     $40,000\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-auto\">\n");
      out.write("                   <i class=\"fas fa-calendar fa-2x text-gray-300\"></i>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("           <div class=\"card border-left-success shadow h-100 py-2\">\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\n");
      out.write("                 <div class=\"col mr-2\">\n");
      out.write("                   <div\n");
      out.write("                     class=\"text-xs font-weight-bold text-success text-uppercase mb-1\"\n");
      out.write("                   >\n");
      out.write("                     Earnings (Annual)\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\n");
      out.write("                     $215,000\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-auto\">\n");
      out.write("                   <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <!-- Earnings (Monthly) Card Example -->\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("           <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\n");
      out.write("                 <div class=\"col mr-2\">\n");
      out.write("                   <div\n");
      out.write("                     class=\"text-xs font-weight-bold text-info text-uppercase mb-1\"\n");
      out.write("                   >\n");
      out.write("                     Tasks\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"row no-gutters align-items-center\">\n");
      out.write("                     <div class=\"col-auto\">\n");
      out.write("                       <div\n");
      out.write("                         class=\"h5 mb-0 mr-3 font-weight-bold text-gray-800\"\n");
      out.write("                       >\n");
      out.write("                         50%\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"col\">\n");
      out.write("                       <div class=\"progress progress-sm mr-2\">\n");
      out.write("                         <div\n");
      out.write("                           class=\"progress-bar bg-info\"\n");
      out.write("                           role=\"progressbar\"\n");
      out.write("                           style=\"width: 50%\"\n");
      out.write("                           aria-valuenow=\"50\"\n");
      out.write("                           aria-valuemin=\"0\"\n");
      out.write("                           aria-valuemax=\"100\"\n");
      out.write("                         ></div>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-auto\">\n");
      out.write("                   <i\n");
      out.write("                     class=\"fas fa-clipboard-list fa-2x text-gray-300\"\n");
      out.write("                   ></i>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <!-- Pending Requests Card Example -->\n");
      out.write("         <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("           <div class=\"card border-left-warning shadow h-100 py-2\">\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"row no-gutters align-items-center\">\n");
      out.write("                 <div class=\"col mr-2\">\n");
      out.write("                   <div\n");
      out.write("                     class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\"\n");
      out.write("                   >\n");
      out.write("                     Pending Requests\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"h5 mb-0 font-weight-bold text-gray-800\">\n");
      out.write("                     18\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-auto\">\n");
      out.write("                   <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <!-- Content Row -->\n");
      out.write("\n");
      out.write("       <div class=\"row\">\n");
      out.write("         <!-- Này là chart bên trái -->\n");
      out.write("         <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("           <div class=\"card shadow mb-4\">\n");
      out.write("             <!-- Card Header - Dropdown -->\n");
      out.write("             <div\n");
      out.write("               class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\"\n");
      out.write("             >\n");
      out.write("               <h6 class=\"m-0 font-weight-bold text-primary\">\n");
      out.write("                 Earnings Overview\n");
      out.write("               </h6>\n");
      out.write("               <div class=\"dropdown no-arrow\">\n");
      out.write("                 <a\n");
      out.write("                   class=\"dropdown-toggle\"\n");
      out.write("                   href=\"#\"\n");
      out.write("                   role=\"button\"\n");
      out.write("                   id=\"dropdownMenuLink\"\n");
      out.write("                   data-toggle=\"dropdown\"\n");
      out.write("                   aria-haspopup=\"true\"\n");
      out.write("                   aria-expanded=\"false\"\n");
      out.write("                 >\n");
      out.write("                   <i\n");
      out.write("                     class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"\n");
      out.write("                   ></i>\n");
      out.write("                 </a>\n");
      out.write("                 <div\n");
      out.write("                   class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\n");
      out.write("                   aria-labelledby=\"dropdownMenuLink\"\n");
      out.write("                 >\n");
      out.write("                   <div class=\"dropdown-header\">Dropdown Header:</div>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                   <div class=\"dropdown-divider\"></div>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\"\n");
      out.write("                     >Something else here</a\n");
      out.write("                   >\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("             <!-- Card Body -->\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"chart-area\">\n");
      out.write("                 <canvas id=\"myAreaChart\"></canvas>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <!-- Này là  Pie Chart bên ph?i -->\n");
      out.write("         <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("           <div class=\"card shadow mb-4\">\n");
      out.write("             <!-- Card Header - Dropdown -->\n");
      out.write("             <div\n");
      out.write("               class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\"\n");
      out.write("             >\n");
      out.write("               <h6 class=\"m-0 font-weight-bold text-primary\">\n");
      out.write("                 Revenue Sources\n");
      out.write("               </h6>\n");
      out.write("               <div class=\"dropdown no-arrow\">\n");
      out.write("                 <a\n");
      out.write("                   class=\"dropdown-toggle\"\n");
      out.write("                   href=\"#\"\n");
      out.write("                   role=\"button\"\n");
      out.write("                   id=\"dropdownMenuLink\"\n");
      out.write("                   data-toggle=\"dropdown\"\n");
      out.write("                   aria-haspopup=\"true\"\n");
      out.write("                   aria-expanded=\"false\"\n");
      out.write("                 >\n");
      out.write("                   <i\n");
      out.write("                     class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"\n");
      out.write("                   ></i>\n");
      out.write("                 </a>\n");
      out.write("                 <div\n");
      out.write("                   class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\n");
      out.write("                   aria-labelledby=\"dropdownMenuLink\"\n");
      out.write("                 >\n");
      out.write("                   <div class=\"dropdown-header\">Dropdown Header:</div>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                   <div class=\"dropdown-divider\"></div>\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\"\n");
      out.write("                     >Something else here</a\n");
      out.write("                   >\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("             <!-- Card Body -->\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("               <div class=\"chart-pie pt-4 pb-2\">\n");
      out.write("                 <canvas id=\"myPieChart\"></canvas>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"mt-4 text-center small\">\n");
      out.write("                 <span class=\"mr-2\">\n");
      out.write("                   <i class=\"fas fa-circle text-primary\"></i> Direct\n");
      out.write("                 </span>\n");
      out.write("                 <span class=\"mr-2\">\n");
      out.write("                   <i class=\"fas fa-circle text-success\"></i> Social\n");
      out.write("                 </span>\n");
      out.write("                 <span class=\"mr-2\">\n");
      out.write("                   <i class=\"fas fa-circle text-info\"></i> Referral\n");
      out.write("                 </span>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("    <script src=\"./../../courseNav/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/jquery.min.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/main.js\"></script>\n");
      out.write("    <script src=\"./../../courseNav/popper.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function () {\n");
      out.write("        $(\"#course\").DataTable();\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\n");
      out.write("      <!-- Page level plugins -->\n");
      out.write("      <script src=\"./../../js/Chart.min.js\"></script>\n");
      out.write("  \n");
      out.write("      <!-- Page level custom scripts -->\n");
      out.write("      <script src=\"./../../js/chart-area-demo.js\"></script>\n");
      out.write("\n");
      out.write("      <script src=\"./../../js/chart-pie-demo.js\"></script>\n");
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
