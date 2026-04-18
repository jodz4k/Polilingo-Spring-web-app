<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Administrator</title>
<link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clanNauceneReci">
	<h1>Pregled jezika</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Naziv</th>
				<th scope="col">Tezina</th>
				<th scope="col">Opis</th>
				<th scope="col">Kontekst</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="rec" items="${neNauceneReci}">
				<tr>
					<td class="checkbox-column"><input type="checkbox"
						name="selectedRecs" value="${rec.idRec}"></td>
					<td>${rec.naziv}</td>
					<td>${rec.tezina}</td>
					<td>${rec.opis}</td>
					<td>${rec.kontekst}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/Polilingo/clan/profilnaStranica" class="button add-language-button">Reci
		treba ponoviti!</a>

</body>
</html>
