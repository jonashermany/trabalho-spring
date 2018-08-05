<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cidades</title>
</head>
<body>
	<a href="/cidade/novo"><button>Add Cidade</button></a>
	<br><br>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>UF</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cidades}" var="cidade">
				<tr>
					<td>${cidade.codigo}</td>
					<td>${cidade.nome}</td>
					<td>${cidade.uf}</td>
					<td><a href="/cidade/visualizar/${cidade.codigo}">Visualizar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<a href="/"><button>Página Inicial</button></a>
</body>
</html>