<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Piloto</title>
</head>
<body>
	<form action="/piloto/alterar" method="post">

		<input type="hidden" name="codigo" value="${piloto.codigo}">
		<c:import url="_campos.jsp"></c:import>
		<br><br>
		<button type="submit">Salvar</button>
		<a href="/piloto/listar"><button>Voltar</button></a>
		<a href="/piloto/deletar/${piloto.codigo}">Deletar</a>
	</form>
</body>
</html>