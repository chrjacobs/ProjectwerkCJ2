package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
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
      out.write("            .footer{ position:absolute; bottom:0; width:100%; text-align:center; background-color:#CCC; margin:0; padding:5px 0;}\n");
      out.write("            body{margin:0;}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <BODY style=\"background-color: #ffffcc\">\n");
      out.write("\n");
      out.write("        <img src=\"Banner01.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner02.png\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner03.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner04.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("        <img src=\"Banner05.jpg\" alt=\"DeDruiwekorrel\"> \n");
      out.write("\n");
      out.write("        <ul class=\"nav nav-tabs\" style=\"background-color: #ffffcc\">\n");
      out.write("            <li class=\"active\"><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"menu\">Home</a></li>\n");
      out.write("\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijntypeController\">Wijntypes</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijnhuisController\">Wijnhuizen</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"WijnController\">Wijnen</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"lijstFotos.jsp\">Foto's</a></li>\n");
      out.write("            <li><a style=\"border-color: #ffcc66; background-color: #ffffcc\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <p class=\"t2\">Welkom  bij De Druiwekorrel\n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("            De Druiwekorrel, Zuid-Afrikaans voor 1 druif, is een afdeling van Kaapwijn Import De Leeuw.<br/>\n");
      out.write("            Wij bieden u een brede waaier van de heerlijkste Zuid-Afrikaanse wijnen aan verrassend\n");
      out.write("            voordelige prijzen.<br/>\n");
      out.write("            <br/>\n");
      out.write("            <i>In onze wijnkelders vindt U een onovertroffen palet van lekkere wijnen.</i><br/>\n");
      out.write("            <br/>\n");
      out.write("            Wij zijn bijzonder trots op namen zoals \"<b>Rust &amp; Vrede</b>\", \"<b>Ernie Els</b>\",... \n");
      out.write("            al jaren geklasseerd bij de 100 beste wijnen van de wereld, maar evenzeer op onze \n");
      out.write("            huiswijnen zoals \"<b>Oude Kaap</b>\" en \"<b>Schoone Gevel</b>\". Jaarlijks halen veel van onze wijnen\n");
      out.write("            gouden, zilveren en bronzen medailles. Proef ze, en droom weg bij een heerlijk stukje Zuid-Afrika.<br/>\n");
      out.write("            <br/>\n");
      out.write("            <i>GESONDHEID!</i><br/>\n");
      out.write("            <br/>\n");
      out.write("            Marc Franck<br/>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("       <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    Copyright © 2015   't Wijnhuisje BVBA - Provinciesteenweg 442   2530 Boechout - Gsm: 0485/63.86.37\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
