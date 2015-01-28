package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAL.Wijntypetbl;
import ViewModels.LijstWijntypeViewModel;

public final class lijstWijntypes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/header2.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    LijstWijntypeViewModel vm
            = (LijstWijntypeViewModel) session.getAttribute("ViewModel3");


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>De - Druiwekorrel</title>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .footer{ position:fixed; bottom:0; width:100%; text-align:center; background-color:#CCC; margin:0; padding:5px 0;}\n");
      out.write("            body{margin:0;}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <BODY style=\"background-color: #ffffcc\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<img src=\"Banner01.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("<img src=\"Banner02.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("<img src=\"Banner03.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("<img src=\"Banner04.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("<img src=\"Banner05.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("\n");
      out.write("<ul class=\"nav nav-tabs\" style=\"background-color: #ffffcc\">\n");
      out.write("    <li class=\"active\"><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"menu\">Home</a></li>\n");
      out.write("\n");
      out.write("    <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijntypeController\">Wijntypes</a></li>\n");
      out.write("    <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijnhuisController\">Wijnhuizen</a></li>\n");
      out.write("    <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijnController\">Wijnen</a></li>\n");
      out.write("    <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"lijstFotos.jsp\">Foto's</a></li>\n");
      out.write("    <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("</ul>");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Lijst wijntypes</h1>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <a href=\"KiesWijntypes.jsp\" class=\"btn btn-default\">Kies Wijntype</a>\n");
      out.write("        <br>\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Naam</th>\n");
      out.write("                <th>Omschrijving</th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            ");
                for (Wijntypetbl wijntype : vm.getWijntype()) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( wijntype.getNaam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( wijntype.getWijntbls());
      out.write("</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                Er zijn ");
      out.print(vm.getAantal());
      out.write(" records gevonden\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-9\">\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                Copyright © 2015   't Wijnhuisje BVBA - Provinciesteenweg 442   2530 Boechout - Gsm: 0485/63.86.37\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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
