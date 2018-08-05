<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="descricao">Descricao</label>
<input type="text" name="descricao" id="descricao" value="${produto.descricao}">
<form:errors path="produto.descricao" />

<label for="tipoProduto">Tipo do produto</label>
<select id="tipoProduto" name="tipoProduto.codigo">
    <option></option>
	<c:forEach items="${tiposProduto}" var="tipoProduto">
	    <c:set var="selecionado" value=""></c:set>
		<c:if test="${tipoProduto.codigo eq produto.tipoProduto.codigo}">
			<c:set var="selecionado" value="selected"></c:set>
		</c:if>
		<option value="${tipoProduto.codigo}" ${selecionado}>${tipoProduto.descricao}</option>
	</c:forEach>
</select>

<label for="marca">Marca</label>
<select id="marca" name="marca.codigo">
    <option></option>
	<c:forEach items="${marcas}" var="marca">
	    <c:set var="selecionado" value=""></c:set>
		<c:if test="${marca.codigo eq produto.marca.codigo}">
			<c:set var="selecionado" value="selected"></c:set>
		</c:if>
		<option value="${marca.codigo}" ${selecionado}>${marca.descricao}</option>
	</c:forEach>
</select>