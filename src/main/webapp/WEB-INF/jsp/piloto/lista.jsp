<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pilotos</title>
</head>
<body>
	<a href="/piloto/novo"><button>Add Piloto</button></a>
	<br><br>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Idade</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pilotos}" var="piloto">
				<tr>
					<td>${piloto.codigo}</td>
					<td>${piloto.nome}</td>
					<td>${piloto.idade}</td>
					<td><a href="/piloto/visualizar/${piloto.codigo}">Visualizar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<a href="/"><button>Página Inicial</button></a>
</body>
</html>