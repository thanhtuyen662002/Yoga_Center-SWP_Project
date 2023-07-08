package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      type=\"text/css\"\n");
      out.write("      href=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/AboutUs.css\" />\n");
      out.write("\n");
      out.write("    <title>Document</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"nav-background\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"nav\">\n");
      out.write("          <div class=\"nav-logo\">\n");
      out.write("            <a href=\"./home.html\">YO<span>GA</span> </a>\n");
      out.write("          </div>\n");
      out.write("          <input type=\"checkbox\" id=\"toggler\" />\n");
      out.write("          <label for=\"toggler\"><i class=\"fas fa-bars fa-2xl\"></i></label>\n");
      out.write("          <div class=\"nav-menu\">\n");
      out.write("            <ul class=\"nav-menu-list\">\n");
      out.write("              <li class=\"nav-menu-item\">\n");
      out.write("                <a class=\"nav-menu-link\" href=\"#\">CLB</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-menu-item\">\n");
      out.write("                <a class=\"nav-menu-link\" href=\"#\">D?CH V?</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-menu-item\">\n");
      out.write("                <a class=\"nav-menu-link\" href=\"#\">L?CH H?C</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-menu-item\">\n");
      out.write("                <a class=\"nav-menu-link\" href=\"#\">KHUY?N MÃI</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-menu-item\">\n");
      out.write("                <a class=\"nav-menu-link\" href=\"#\">TIN T?C</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"btn_contact\">??NG NH?P</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"banner\">\n");
      out.write("      <div class=\"title-bg\">ABOUT US</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"about wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("          <div class=\"col-lg-5 col-md-6\">\n");
      out.write("            <div class=\"about-img\">\n");
      out.write("              <img src=\"./../image/about2.png\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-7 col-md-6\">\n");
      out.write("            <div class=\"section-header text-left\">\n");
      out.write("              <p>Learn About Us</p>\n");
      out.write("              <h2>Welcome to Yooga</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"about-text\">\n");
      out.write("              <p>\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Phasellus nec pretium mi. Curabitur facilisis ornare velit non\n");
      out.write("                vulputate. Aliquam metus tortor, auctor id gravida condimentum,\n");
      out.write("                viverra quis sem.\n");
      out.write("              </p>\n");
      out.write("              <p>\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Phasellus nec pretium mi. Curabitur facilisis ornare velit non\n");
      out.write("                vulputate. Aliquam metus tortor, auctor id gravida condimentum,\n");
      out.write("                viverra quis sem. Curabitur non nisl nec nisi scelerisque\n");
      out.write("                maximus.\n");
      out.write("              </p>\n");
      out.write("              <a class=\"btn\" href=\"\">Learn More</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"feedback wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"section-header text-center\">\n");
      out.write("          <p>FEEDBACK</p>\n");
      out.write("          <h2>Our Client Say!</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feedback-list\">\n");
      out.write("          <div class=\"feedback-item\">\n");
      out.write("            <div class=\"feedback-img\">\n");
      out.write("              <img src=\"./../image/avatar.webp\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"feedback-text\">\n");
      out.write("              <p>\n");
      out.write("                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums\n");
      out.write("                lacus eget velit tincid, quis suscip justo dictum.Lorem ipsum\n");
      out.write("                dolor sit amet consec adipis elit. Etiam accums lacus eget velit\n");
      out.write("                tincid, quis suscip justo dictum.\n");
      out.write("              </p>\n");
      out.write("              <h3>Customer Name</h3>\n");
      out.write("              <h4>Profession</h4>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"feedback-item\">\n");
      out.write("            <div class=\"feedback-img\">\n");
      out.write("              <img src=\"./../image/avatar.webp\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"feedback-text\">\n");
      out.write("              <p>Lorem ipsum dolor sit amet consec adipis elit. Etiam accums</p>\n");
      out.write("              <h3>Customer Name</h3>\n");
      out.write("              <h4>Profession</h4>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"feedback-item\">\n");
      out.write("            <div class=\"feedback-img\">\n");
      out.write("              <img src=\"./../image/avatar.webp\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"feedback-text\">\n");
      out.write("              <p>\n");
      out.write("                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums\n");
      out.write("                lacus eget velit tincid, quis suscip justo dictum.\n");
      out.write("              </p>\n");
      out.write("              <h3>Customer Name</h3>\n");
      out.write("              <h4>Profession</h4>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"feedback-item\">\n");
      out.write("            <div class=\"feedback-img\">\n");
      out.write("              <img src=\"./../image/avatar.webp\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"feedback-text\">\n");
      out.write("              <p>\n");
      out.write("                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums\n");
      out.write("                lacus eget velit tincid, quis suscip justo dictum.\n");
      out.write("              </p>\n");
      out.write("              <h3>Customer Name</h3>\n");
      out.write("              <h4>Profession</h4>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"feedback-form\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- <div class=\"feedback-form-content\">\n");
      out.write("          <h1>Chào B?n,</h2>\n");
      out.write("          <h2>Hãy ?? l?i bình lu?n c?a b?n bên d??i</h2>\n");
      out.write("          <div class=\"feedback-form-content-form\">\n");
      out.write("            <label for=\"message\">Bình Lu?n</label>\n");
      out.write("            <textarea class=\"form-control\" id=\"message\" cols=\"5\" rows=\"7\"></textarea>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"feedback-btn\"><button>G?i</button></div>\n");
      out.write("        </div> -->\n");
      out.write("        <div class=\"feedback-form-content2\">\n");
      out.write("          <div class=\"feedback-form-content-login\">\n");
      out.write("            <img src=\"../image/notice.png\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <h2 style=\"font-weight: 700\">B?n Ph?i ??ng Nh?p Tr??c</h2>\n");
      out.write("          <div class=\"feedback-btn2\"><button>??ng Nh?p</button></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feedback-form-right\">\n");
      out.write("          <div class=\"feedback-form-right-img\">\n");
      out.write("            <img\n");
      out.write("              src=\"http://127.0.0.1:5501/free-yoga-website-template/img/blog-1.jpg\"\n");
      out.write("              alt=\"\"\n");
      out.write("            />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"feedback-form-right-content\">POST COMMENT</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- FOOTER -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("          <div class=\"footer-content-col\">\n");
      out.write("            <div class=\"footer-title\">Y O G A</div>\n");
      out.write("            <div class=\"footer-block\">\n");
      out.write("              <ul>\n");
      out.write("                <li>\n");
      out.write("                  <span> <i class=\"fas fa-phone-alt\"></i></span>\n");
      out.write("                  <a href=\"tel:1900633638\">1900 633 638</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <span>\n");
      out.write("                    <i class=\"fas fa-map-marker-alt\"></i> 151-155 B?n Vân ??n,\n");
      out.write("                    Ph??ng 6, Qu?n 4, TP.HCM</span\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <span>\n");
      out.write("                    <i class=\"fas fa-clock\"></i> Th? Hai - Ch? Nh?t: 6:00 -\n");
      out.write("                    22:00</span\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"footer-content-col\">\n");
      out.write("            <div class=\"footer-title\"></div>\n");
      out.write("            <div class=\"footer-block middle\">\n");
      out.write("              <div class=\"footer-between-left\">\n");
      out.write("                <ul>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#\">Ph??ng th?c thanh toán</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\"> D?ch V?</a></li>\n");
      out.write("\n");
      out.write("                  <li><a href=\"#\"> Chính sách giá</a></li>\n");
      out.write("                  <li><a href=\"#\">Chính sách b?o m?t</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"footer-between-right\">\n");
      out.write("                <ul>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#\">Tuy?n D?ng</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\">Tin T?c</a></li>\n");
      out.write("\n");
      out.write("                  <li><a href=\"#\">Liên h?</a></li>\n");
      out.write("                  <li><a href=\"#\">Câu L?c b?</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"footer-content-col\">\n");
      out.write("            <div class=\"footer-title\">M?NG XÃ H?I</div>\n");
      out.write("            <div class=\"footer-block right\">\n");
      out.write("              <li><i class=\"fab fa-instagram-square\"></i></li>\n");
      out.write("              <li><i class=\"fab fa-facebook-square\"></i></li>\n");
      out.write("              <li><i class=\"fab fa-youtube\"></i></li>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("    <script\n");
      out.write("      type=\"text/javascript\"\n");
      out.write("      src=\"//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"\n");
      out.write("    ></script>\n");
      out.write("    <script src=\"./js/aboutUs.js\"></script>\n");
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
}
