<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Cidade</title>
</head>
<body>
	<form action="/cidade/alterar" method="post">

		<input type="hidden" name="codigo" value="${cidade.codigo}">
		<c:import url="_campos.jsp"></c:import>
		<br><br>
		<button type="submit">Salvar</button>
		<a href="/cidade/listar"><button>Voltar</button></a>
		<a href="/cidade/deletar/${cidade.codigo}">Deletar</a>
	</form>
</body>
</html>