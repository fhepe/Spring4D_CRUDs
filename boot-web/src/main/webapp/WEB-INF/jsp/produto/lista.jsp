<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de produtos</title>
</head>
<body>
	<a href="/">Inicio</a><BR>
	<a href="/produto/novo">Novo produto</a>	

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
				<th>Tipo produto</th>
				<th>Marca</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td><a href="/produto/visualizar/${produto.codigo}">${produto.codigo}</a></td>
					<td>${produto.descricao}</td>
					<td>${produto.tipoProduto.descricao}</td>
					<td>${produto.marca.descricao}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>