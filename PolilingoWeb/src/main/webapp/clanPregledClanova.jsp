<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Profilna Stranica</title>
<link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clanPregledClanova">
	<h1>Clanovi</h1>

	<table>
		<thead>
			<tr>
				<th>Korisnicko ime</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="clan" items="${clanovi}">
				<tr>
					<td>${clan.korisnickoIme}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="search-bar">
		<form action="/Polilingo/clan/pretraziClana" method="get">
			<input type="text" id="korisnickoIme2" name="korisnickoIme2"
				placeholder="Pretrazi clanove...">
			<button type="submit">Pretrazi</button>
		</form>
	</div>

</body>
</html>

