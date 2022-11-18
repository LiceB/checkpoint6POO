<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Cadastrar Categoria</title>
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
	<div class="countainer">
		<h2>Cadastrar Categoria</h2>
		<div class="row">
		<form class="col s12" action="cadastroCategoria" method="post">
			<div class="row">
				<div class="input-field col s6">
					<input id="categoria" name="categoria" type="text">
					<label for="categoria">Categoria</label>
				</div>
			</div>
			<div class="row">
				<button class="btn waves-effect waves-teal" type="submit">Cadastrar<i class="material-icons right">send</i></button>
				<a href="index.jsp" class="waves-effect waves-light btn">Sair</a>
			</div>
		</form>
		</div>
	</div>
</body>
</html>