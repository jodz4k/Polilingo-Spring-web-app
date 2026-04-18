<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Prikaz Clana</title>
<link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clanPrikazClana">
	<h1>
		Clan:
		<c:out value="${korisnickoIme2}" />
	</h1>

	<div class="profile-container">
		
		<div class="info-section">
			<label for="username">Polilinger: </label> 
			<p>@${korisnickoIme2}</p>

		  	<label for="friends">Prijatelji:</label> 
			<p>${brPrijatelja}</p>  

			<label for="languages">Jezici:</label>
			<p>${ispisaniJeziciKojeUci}</p>

			<label for="completed-goals">Broj ispunjenih ciljeva:</label>
			<p>${ispunjenihCiljeva}</p>
		</div>
	</div>

	<div class="action-buttons">
    <form action="/Polilingo/clan/dodajClana" method="get">
        <input type="text" id="korisnickoIme2" name="korisnickoIme2">
        <button type="submit" class="action-button">Dodaj za prijatelja</button>
    </form>
</div>

</body>
</html>
