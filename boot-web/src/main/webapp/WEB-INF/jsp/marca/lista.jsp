<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de marcas</title>
</head>
<body>
	<a href="/">Inicio</a><BR>
	<a href="/marca/novo">Novo marca</a>	

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${marcas}" var="marca">
				<tr>
					<td><a href="/marca/visualizar/${marca.codigo}">${marca.codigo}</a></td>
					<td>${marca.descricao}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>