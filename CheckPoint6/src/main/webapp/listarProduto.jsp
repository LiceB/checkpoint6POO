<%@page import="br.fiap.dao.ProdutoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.fiap.entidade.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Início</title>
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js"></script>
</head>
<body>
	<% List<Produto> listaProd = new ProdutoDAO().listar(); %>
	<div class="container">
		<h2>Lista de Produtos</h2>
		<table class="striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Preço</th>
					<th>Categoria</th>
				</tr>
			</thead>
			<tbody>
				<% for(Produto produto : listaProd) { %>
					<tr>
						<td><%= produto.getNome() %></td>
						<td><%= produto.getDescricao() %></td>
						<td><%= produto.getPreco() %></td>
						<td><%= produto.getCategoria().getCategoria() %></td>
					</tr>
				<% } %>
			</tbody>
		</table>
		<div class="row">
			<a href="index.jsp" class="waves-effect waves-light btn">Sair</a>
		</div>
	</div>
</body>
</html>