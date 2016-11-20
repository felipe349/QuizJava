<%-- 
    Document   : header
    Created on : 14/11/2016, 22:43:42
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatecpg.quiz.Quiz"%>
<%@page import="br.com.fatecpg.quiz.Usuario"%>
<%@page import="br.com.fatecpg.quiz.Database"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="br.com.fatecpg.quiz.Question"%>

<!DOCTYPE html>
<html>
   <head>
    	<title>Listar Produtos - TP LPIV</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/estilo.css">
                
   </head>
   <body>

	<nav class="navbar navbar-default " style="background-color: #000000; border: none">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" style="color: #f6f6f6" href="index.html">Trocar Usuário</a>
	    </div>
            
            <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" style="color: #f6f6f6" href="home.jsp">Home</a>
	    </div>
        </div>
        </nav>
       <div class="container">
