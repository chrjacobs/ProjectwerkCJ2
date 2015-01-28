package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    int pageCount = 0;

    void addCount() {
        pageCount++;
    }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');
 addCount();
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>The include Directive Example</title>\n");
      out.write("  \n");
      out.write("        <img src=\"Banner01.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner02.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner03.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner04.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner05.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("\n");
      out.write("        <ul class=\"nav nav-tabs\" style=\"background-color: #ffffcc\">\n");
      out.write("            <li class=\"active\"><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"index\">Home</a></li>\n");
      out.write("\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"LandController\">Landen</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"LandstreekController\">Landstreken</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijnController\">Wijnen</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"lijstGerechten.jsp\">Gerechten</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"lijstFotos.jsp\">Foto's</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <h2>The include Directive Example</h2>\n");
      out.write("    <p>This site has been visited ");
      out.print( pageCount);
      out.write(" times.</p>\n");
      out.write("</center>\n");
      out.write("<br/><br/>");
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
