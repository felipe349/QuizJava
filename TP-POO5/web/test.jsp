<%-- 
    Document   : test
    Created on : Nov 11, 2016, 8:30:57 AM
    Author     : Fatec
--%>

<%@ include file="header.jsp" %>
    <head>
        <meta charset="UTF-8">
        <title>Teste - TP5 - POO</title>
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
    <body>
        <span>
	  <div class="jumbotron text-center jumbotron-span" >
	    <div class='jumbotron-description'>
	       <h1>Teste - Web Quiz</h1>
	      
	    </div>
	  </div>
	</span>
        
        <hr>
        <form action="home.jsp">
            <%ArrayList<Question> test = Quiz.getTest();
            Collections.shuffle(test);
            for(Question q: Quiz.getTest()){ %>
            <h3>Questão <%= test.indexOf(q) + 1%>:<br>
                <%=q.getQuestion() %></h3>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[0]%>"/>
            <%= q.getAlternative()[0] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[1]%>"/>
            <%= q.getAlternative()[1] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[2]%>"/>
            <%= q.getAlternative()[2] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[3]%>"/>
            <%= q.getAlternative()[3] %>
            <hr>
            <%}%>
            <center> <input type="submit" name="user-test" value="Confirmar" class="btn btn-default"></center>
        </form>
    </div>
    <footer>
	<p>2016 Web Quiz - FATEC PRAIA GRANDE</p>
	</footer>
    </body>
</html>
