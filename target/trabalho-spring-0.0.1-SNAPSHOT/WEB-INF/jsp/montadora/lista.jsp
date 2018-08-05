<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Montadoras</title>
</head>
<body>
	<a href="/montadora/novo"><button>Add Montadora</button></a>
	<br><br>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Cidade</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${montadoras}" var="montadora">
				<tr>
					<td>${montadora.codigo}</td>
					<td>${montadora.nome}</td>
					<td><a href="/cidade/visualizar/${montadora.cidade.codigo}">${montadora.cidade.nome}</a></td>
					<td><a href="/montadora/visualizar/${montadora.codigo}">Visualizar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>