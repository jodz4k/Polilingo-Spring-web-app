<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Profilna Stranica</title>
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
	margin-bottom: 20px;
}

.profile-container {
	background-color: #ffffff; /* bela boja pozadine za profilnu sekciju */
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* senka za efekat pop-up-a */
	width: 50%; /* prilagodi sirinu profila prema potrebama */
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	align-items: flex-start;
}

.search-bar {
	margin-top: 20px;
	display: flex;
	align-items: center;
}

#search-input {
	flex-grow: 1;
	padding: 10px;
	border: 1px solid #ccc; /* siva boja granice input polja */
	border-radius: 4px;
	box-sizing: border-box;
}

#search-button {
	background-color: #4caf50; /* zelena boja za dugme */
	color: white;
	padding: 10px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
	margin-left: 10px;
	transition: background-color 0.3s;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #4caf50;
	color: white;
}

.action-buttons {
	margin-top: 20px;
	display: flex;
	justify-content: flex-end;
	align-items: flex-end;
}

.action-button {
	background-color: #4caf50; /* zelena boja za dugme */
	color: white;
	padding: 15px 30px;
	border: none;
	border-radius: 8px;
	cursor: pointer;
	font-size: 16px;
	margin-left: 10px;
	transition: background-color 0.3s;
}

#countdown-section {
	margin-top: 20px;
}

#word-count-section {
	margin-top: 20px;
}
</style>
</head>
<body>
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
