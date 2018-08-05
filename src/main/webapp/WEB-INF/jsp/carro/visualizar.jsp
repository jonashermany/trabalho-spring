<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Carro</title>
</head>
<body>
	<form action="/carro/alterar" method="post">

		<input type="hidden" name="codigo" value="${carro.codigo}">
		<c:import url="_campos.jsp"></c:import>
		<br><br>
		<button type="submit">Salvar</button>
		<a href="/carro/listar"><button>Voltar</button></a>
		<a href="/carro/deletar/${carro.codigo}">Deletar</a>
	</form>
</body>
</html>