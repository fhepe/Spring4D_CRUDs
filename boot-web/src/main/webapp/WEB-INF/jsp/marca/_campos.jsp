<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="descricao">Descricao</label>
<input type="text" name="descricao" id="descricao" value="${marca.descricao}">
<form:errors path="marca.descricao" />