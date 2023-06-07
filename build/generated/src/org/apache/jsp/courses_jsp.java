package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courses_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Document</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            type=\"text/css\"\r\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/home.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <div class=\"nav-background\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"nav\">\r\n");
      out.write("                    <div class=\"nav-logo\">\r\n");
      out.write("                        <a href=\"home.jsp\">YO<span>GA</span> </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"checkbox\" id=\"toggler\">\r\n");
      out.write("                    <label for=\"toggler\"><i class=\"fas fa-bars fa-2xl\"></i></label>\r\n");
      out.write("                    <div class=\"nav-menu\">\r\n");
      out.write("                        <form action=\"MainController\" method=\"post\">\r\n");
      out.write("                            <ul class=\"nav-menu-list\">\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"clb.jsp\">CLB</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                     <a class=\"nav-menu-link\" href=\"courses.jsp\">KHÓA HỌC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"listSchedule\">LỊCH HỌC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"event.jsp\">SỰ KIỆN</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-menu-item\">\r\n");
      out.write("                                    <a class=\"nav-menu-link\" href=\"news.jsp\">TIN TỨC</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"btn_contact\" href=\"login.jsp\">ĐĂNG NHẬP</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"service\">\r\n");
      out.write("            <div class=\"service-title\">CÁC KHÓA HỌC CỦA CHÚNG TÔI</div>\r\n");
      out.write("            <div class=\"service-detail\">Luyện tập Yoga sẽ giúp bạn đạt được mục tiêu sức khỏe và hình thể</div>\r\n");
      out.write("            <div class=\"service-choose\">\r\n");
      out.write("                <div class=\"service-option\">\r\n");
      out.write("                    <div class=\"service-img\">\r\n");
      out.write("                        <img src=\"./image/pt.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"service-content\">BASIC</div>\r\n");
      out.write("                    <div class=\"service-overlay\"></div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"service-option\">\r\n");
      out.write("                    <div class=\"service-img\">\r\n");
      out.write("                        <img src=\"./image/yoga.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"service-content\">ADVANCE</div>\r\n");
      out.write("                    <div class=\"service-overlay\"></div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"service-option\">\r\n");
      out.write("                    <div class=\"service-img\">\r\n");
      out.write("                        <img src=\"./image/dotap.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"service-content\">TEACHER</div>\r\n");
      out.write("                    <div class=\"service-overlay\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"service-option\">\r\n");
      out.write("                    <div class=\"service-img\">\r\n");
      out.write("                        <img src=\"./image/xem thêm.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"service-content\">THERAPY</div>\r\n");
      out.write("                    <div class=\"service-overlay\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        <!-- FOOTER -->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"footer-content\">\r\n");
      out.write("                    <div class=\"footer-content-col\">\r\n");
      out.write("                        <div class=\"footer-title\">Y O G A</div>\r\n");
      out.write("                        <div class=\"footer-block\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"fas fa-phone-alt\"></i></span>\r\n");
      out.write("                                    <a href=\"tel:1900633638\">1900 633 638</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"fas fa-map-marker-alt\"></i> 151-155 Bến Vân Đồn, Phường 6, Quận 4,\r\n");
      out.write("                                        TP.HCM</span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"fas fa-clock\"></i> Thứ Hai - Chủ Nhật: 6:00 - 22:00</span>\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer-content-col\">\r\n");
      out.write("                        <div class=\"footer-title\"></div>\r\n");
      out.write("                        <div class=\"footer-block middle\">\r\n");
      out.write("                            <div class=\"footer-between-left\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Phương thức thanh toán</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\"> Dịch Vụ</a></li>\r\n");
      out.write("\r\n");
      out.write("                                    <li><a href=\"#\"> Chính sách giá</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Chính sách bảo mật</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer-between-right\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Tuyển Dụng</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\">Tin Tức</a></li>\r\n");
      out.write("\r\n");
      out.write("                                    <li><a href=\"#\">Liên hệ</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Câu Lạc bộ</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer-content-col\">\r\n");
      out.write("                        <div class=\"footer-title\">MẠNG XÃ HỘI</div>\r\n");
      out.write("                        <div class=\"footer-block right\">\r\n");
      out.write("                            <li><i class=\"fab fa-instagram-square\"></i></li>\r\n");
      out.write("                            <li><i class=\"fab fa-facebook-square\"></i></li>\r\n");
      out.write("                            <li><i class=\"fab fa-youtube\"></i></li>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"./home.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Slide quảng cáo -->\r\n");
      out.write("        <script\r\n");
      out.write("            type=\"text/javascript\"\r\n");
      out.write("            src=\"https://code.jquery.com/jquery-1.11.0.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("        <script\r\n");
      out.write("            type=\"text/javascript\"\r\n");
      out.write("            src=\"https://code.jquery.com/jquery-migrate-1.2.1.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("        <script\r\n");
      out.write("            type=\"text/javascript\"\r\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/remixicon.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"./js/home.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
}
