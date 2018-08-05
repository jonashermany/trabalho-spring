<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Nome</label>
<input type="text" name="nome" id="nome" value="${montadora.nome}">
<form:errors path="montadora.nome" />
<label for="cidade">Cidade</label>
<select name="cidade.codigo">
	<c:forEach items="${cidades}" var="cidade">
		<option></option>
		<c:set var="selecionado" value=""></c:set>
		<c:if test="${cidade.codigo eq montadora.cidade.codigo}">
			<c:set var="selecionado" value="selected"></c:set>
		</c:if>
		<option value="${cidade.codigo}" ${selecionado}>${cidade.nome}</option>
	</c:forEach>
</select>