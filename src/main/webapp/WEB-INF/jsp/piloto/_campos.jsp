<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Nome</label>
<input type="text" name="nome" id="nome" value="${piloto.nome}">
<form:errors path="piloto.nome" />
<label for="idade">Idade</label>
<input type="number" name="idade" id="idade" value="${piloto.idade}">
<form:errors path="piloto.idade" />