package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.quiz.Quiz;
import br.com.fatecpg.quiz.Usuario;
import br.com.fatecpg.quiz.Database;
import java.util.ArrayList;
import java.util.Collections;
import br.com.fatecpg.quiz.Question;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("    \t<title>Listar Produtos - TP LPIV</title>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("                \n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t  <div class=\"container-fluid\">\n");
      out.write("\t    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t        <span class=\"sr-only\"></span>\n");
      out.write("\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t      </button>\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"index.html\">Novo Usuário</a>\n");
      out.write("\t    </div>\n");
      out.write("            \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("\t      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t        <span class=\"sr-only\"></span>\n");
      out.write("\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t      </button>\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"home.php\">Home</a>\n");
      out.write("\t    </div>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("       <div class=\"container\">\n");
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
