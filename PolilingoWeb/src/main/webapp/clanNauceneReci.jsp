<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Administrator</title>
<style>
body {
	background-color: #f0f8f7; /* svetlozelena boja pozadine */
	font-family: Arial, sans-serif;
	text-align: center;
	margin: 0;
	padding: 0;
	height: 100vh;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}

h1 {
	color: #4caf50;
}

.table {
	width: 80%;
	margin-top: 20px;
	border-collapse: collapse;
}

.table th, .table td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

.table th {
	background-color: #4caf50;
	color: white;
}

.button-container {
	display: flex;
	flex-wrap: wrap;
	gap: 20px;
	margin-top: 20px;
}

.button {
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	border: none;
	border-radius: 5px;
	transition: background-color 0.3s;
}

.add-word-button {
	background-color: #4caf50; /* zelena boja za dodavanje reci */
	color: white;
}

.remove-words-button {
	background-color: #4caf50; /* zelena boja za izbacivanje reci */
	color: white;
}

.view-stats-button {
	background-color: #4caf50; /* zelena boja za statistike */
	color: white;
}

.add-language-button {
	background-color: #4caf50; /* zelena boja za dodavanje jezika */
	color: white;
}

.button:hover {
	background-color: #34495e; /* tamnija nijansa na hover efektu */
}
</style>
</head>
<body>
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