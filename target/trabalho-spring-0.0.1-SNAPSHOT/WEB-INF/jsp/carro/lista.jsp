<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Carros</title>
</head>
<body>
	<a href="/carro/novo"><button>Add Carro</button></a>
	<br><br>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Ano</th>
				<th>Montadora</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${carros}" var="carro">
				<tr>
					<td>${carro.codigo}</td>
					<td>${carro.nome}</td>
					<td>${carro.ano}</td>
					<td><a href="/montadora/visualizar/${carro.montadora.codigo}">${carro.montadora.nome}</a></td>
					<td><a href="/carro/visualizar/${carro.codigo}">Visualizar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>