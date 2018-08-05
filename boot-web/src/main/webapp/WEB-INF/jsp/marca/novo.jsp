<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de marcas</title>
</head>
<body>
	<form action="/marca/salvar" method="post">
		<c:import url="_campos.jsp" />

		<button type="submit">Salvar</button>
		<a href="/marca/listar">Cancelar</a>
	</form>
</body>
</html>