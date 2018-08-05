<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Nome</label>
<input type="text" name="nome" id="nome" value="${carro.nome}">
<form:errors path="carro.nome" />
<label for="ano">Ano</label>
<input type="number" name="ano" id="ano" value="${carro.ano}">
<form:errors path="carro.ano" />
<label for="montadora">Montadora</label>
<select name="montadora.codigo">
	<c:forEach items="${montadoras}" var="montadora">
		<option></option>
		<c:set var="selecionado" value=""></c:set>
		<c:if test="${montadora.codigo eq carro.montadora.codigo}">
			<c:set var="selecionado" value="selected"></c:set>
		</c:if>
		<option value="${montadora.codigo}" ${selecionado}>${montadora.nome}</option>
	</c:forEach>
</select>
<label for="piloto">Piloto</label>
<select name="piloto.codigo">
	<c:forEach items="${pilotos}" var="piloto">
		<option></option>
		<c:set var="selecionado" value=""></c:set>
		<c:if test="${piloto.codigo eq carro.piloto.codigo}">
			<c:set var="selecionado" value="selected"></c:set>
		</c:if>
		<option value="${piloto.codigo}" ${selecionado}>${piloto.nome}</option>
	</c:forEach>
</select>