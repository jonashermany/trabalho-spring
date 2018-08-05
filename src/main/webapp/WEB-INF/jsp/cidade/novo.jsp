<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Cidade</title>
</head>
<body>
	<form action="/cidade/salvar" method="post">
		<c:import url="_campos.jsp"></c:import>
		<br><br>
		<button type="submit">Salvar</button>
		<a href="/cidade/listar"><button>Voltar</button></a>
	</form>
</body>
</html>