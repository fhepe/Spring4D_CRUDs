<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de tipos de produto</title>
</head>
<body>
	<a href="/">Inicio</a><BR>
	<a href="/tipoProduto/novo">Novo tipo de produto</a>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${tiposProduto}" var="tipoProduto">
				<tr>
					<td><a href="/tipoProduto/visualizar/${tipoProduto.codigo}">${tipoProduto.codigo}</a></td>
					<td>${tipoProduto.descricao}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>