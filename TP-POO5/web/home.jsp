<%-- 
    Document   : index
    Created on : Nov 11, 2016, 8:30:48 AM
    Author     : Fatec
--%>

<!DOCTYPE html>
<%
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
        
%>
<%@ include file="header.jsp" %>
    <head>
        <title>Web Quiz - TP5 - POO</title>
        
    <style>
            
body
{
background-color:#B2DC9B;
}

footer
{
background-color:#000000;
color:#FFFFFF;
font-size:12px;
text-align:center;
padding:7px;
position: absolute; 
width: 100%;
margin-top: 10px;
}

nav a:hover
{
color:#000000;
background-color:#9AC148;
padding:16px;
}

.jumbotron-span 
{
  background-color: #C8E2AD !important;
}
    </style>
    </head>
    
        
        <span>
	  <div class="jumbotron text-center jumbotron-span" >
	    <div class='jumbotron-description'>
	       <h1>Teste - Web Quiz</h1>
	      
	    </div>
	  </div>
	</span>
        <h2><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Usuário: <%= d.getUsuarios().get(d.getUsuarios().size()-1).getNome() %></h2>
            <% /*
               for (Usuario usuario : d.getUsuarios()) {
                    out.println(usuario.getNome());
                }*/
            %>
        <hr><h3><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> Última Nota</h3>
           <%= ultNota + "%"%>
        <hr><h3><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> Média</h3>
           <%= media + "%"%>
        <br><br>
        <center>
        <a href="test.jsp">
            <button type="button" class="btn btn-default">Inciar Teste </button>
        </a>
        </center>
    </div>
    <footer>
	<p>2016 Web Quiz - FATEC PRAIA GRANDE</p>
	</footer>
    </body>
</html>
