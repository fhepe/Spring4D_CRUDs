<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<title>Alterar marca</title>
</head>
<body>
	<form action="/marca/alterar" method="post">
	
		<input type="hidden" name="codigo" value="${marca.codigo}">
		<c:import url="_campos.jsp" />

		<button type="submit">Salvar</button>
		<a href="/marca/listar">Cancelar</a>
		<a href="/marca/deletar/${marca.codigo}">Deletar</a>
	</form>
</body>
</html>