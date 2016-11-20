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

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

    double ultNota =0;
    double media = 0;
    String nome = "";
    int a = 0;
    Database d = new Database();
    if (request.getParameter("começar") != null) {
            nome = request.getParameter("nome");
            Usuario u = new Usuario();
            u.setNome(nome);
            for (Usuario usuario : d.getUsuarios()) {
                    if(usuario.getNome().equals(nome)){
                        a = 1;
                        break;
                    }
                }
            if(a!=1){
                 d.adicionarUsuario(u);
            }
            //out.println(a);
        }
        if(request.getParameter("user-test") != null){
            String[] answers = {
                request.getParameter("0")
                ,request.getParameter("1")
                ,request.getParameter("2")
                ,request.getParameter("3")
                ,request.getParameter("4")
                ,request.getParameter("5")
                ,request.getParameter("6")
                ,request.getParameter("7")
                ,request.getParameter("8")
                ,request.getParameter("9")
            };
            Quiz.validateTest(answers);
            ultNota = Quiz.getLastGrade();
            media = Quiz.getGradesAverage();
        }
        

      out.write('\n');
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
      out.write("\t<nav class=\"navbar navbar-default \" style=\"background-color: #000000; border: none\">\n");
      out.write("\t  <div class=\"container-fluid\">\n");
      out.write("\t    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t        <span class=\"sr-only\"></span>\n");
      out.write("\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t      </button>\n");
      out.write("\t      <a class=\"navbar-brand\" style=\"color: #f6f6f6\" href=\"index.html\">Novo Usuário</a>\n");
      out.write("\t    </div>\n");
      out.write("            \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("\t      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t        <span class=\"sr-only\"></span>\n");
      out.write("\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t      </button>\n");
      out.write("\t      <a class=\"navbar-brand\" style=\"color: #f6f6f6\" href=\"home.php\">Home</a>\n");
      out.write("\t    </div>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("       <div class=\"container\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Web Quiz - TP5 - POO</title>\n");
      out.write("        \n");
      out.write("    <style>\n");
      out.write("            \n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-color:#9DC079;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer\n");
      out.write("{\n");
      out.write("background-color:#000000;\n");
      out.write("color:#FFFFFF;\n");
      out.write("font-size:12px;\n");
      out.write("text-align:center;\n");
      out.write("padding:7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a:hover\n");
      out.write("{\n");
      out.write("color:#000000;\n");
      out.write("background-color:#9AC148;\n");
      out.write("padding:16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron-span \n");
      out.write("{\n");
      out.write("  background-color: #C8E2AD !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron-description {\n");
      out.write("  position: relative;\n");
      out.write("  top: 35%;\n");
      out.write("  bottom: 65%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <span>\n");
      out.write("\t  <div class=\"jumbotron text-center jumbotron-span\" >\n");
      out.write("\t    <div class='jumbotron-description'>\n");
      out.write("\t       <h1>Teste - Web Quiz</h1>\n");
      out.write("\t      \n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</span>\n");
      out.write("        <h2><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>Usuário: ");
      out.print( d.getUsuarios().get(d.getUsuarios().size()-1).getNome() );
      out.write("</h2>\n");
      out.write("            ");
 /*
               for (Usuario usuario : d.getUsuarios()) {
                    out.println(usuario.getNome());
                }*/
            
      out.write("\n");
      out.write("        <hr><h3>Última Nota</h3>\n");
      out.write("           ");
      out.print( ultNota + "%");
      out.write("\n");
      out.write("        <hr><h3>Média</h3>\n");
      out.write("           ");
      out.print( media + "%");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <a href=\"test.jsp\">\n");
      out.write("            <button>Inciar Teste</button>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("\t<p>2016 Web Quiz - FATEC PRAIA GRANDE</p>\n");
      out.write("\t</footer>\n");
      out.write("    </body>\n");
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
