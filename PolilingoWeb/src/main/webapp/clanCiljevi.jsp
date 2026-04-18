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
<body class="page-clanCiljevi">
	<h1>Pregled jezika</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Naziv</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cilj" items="${nazivi}">
				<tr>
					<td class="checkbox-column"><input type="checkbox"
						name="selectedCiljs" value="${cilj.idCilj}"></td>
					<td>${cilj.naziv}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<a href="/Polilingo/clan/sacuvajCiljClana"
		class="button add-language-button">Ciljamo!</a>

</body>
</html>
