<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<title>Alterar tipo de produto</title>
</head>
<body>
	<form action="/tipoProduto/alterar" method="post">
	
		<input type="hidden" name="codigo" value="${tipoProduto.codigo}">
		<c:import url="_campos.jsp" />

		<button type="submit">Salvar</button>
		<a href="/tipoProduto/listar">Cancelar</a>
		<a href="/tipoProduto/deletar/${tipoProduto.codigo}">Deletar</a>
	</form>
</body>
</html>