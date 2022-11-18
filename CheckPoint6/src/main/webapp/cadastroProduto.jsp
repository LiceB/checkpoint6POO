<%@page import="br.fiap.dao.CategoriaDAO"%>
<%@page import="br.fiap.entidade.Categoria"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Cadastrar Produto</title>
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js"></script>
    <script type="text/javascript">
		$(document).ready(function() {
			$('select').material_select('destroy');	
		});
	</script>
</head>
<body>
	<% List<Categoria> lista = new CategoriaDAO().listar(); %>
	<div class="countainer">
		<h2>Cadastrar Produto</h2>
		<div class="row">
		<form class="col s12" action="cadastroProduto" method="post">
			<div class="row">
				<label>Categoria</label>
				<select name="categoria">
					<option value="" disabled selected>Escolha a categoria</option>
					<% for(Categoria categoria : lista) { %>
						<option value="<%= categoria.getCategoria_id()%>"><%= categoria.getCategoria() %></option>
					<% } %>
			
				</select>
			</div>
			<div class="row">
				<div class="input-field col s6">
					<input id="nome" name="nome" type="text">
					<label for="nome">Nome</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s6">
					<input id="descricao" name="descricao" type="text">
					<label for="descricao">Descrição</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s6">
					<input id="preco" name="preco" type="number"  min="0" step="any">
					<label for="preco">Preço</label>
				</div>
			</div>
			<div class="row">
				<button class="btn waves-effect waves-teal" type="submit">Cadastrar<i class="material-icons right">send</i></button>
				<a href="index.jsp" class="waves-effect waves-light btn">Sair</a>
			</div>
		</form>
		</div>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
	    	$('select').material_select();
	    	$('.modal').modal();
		});
	</script>
</body>
</html>