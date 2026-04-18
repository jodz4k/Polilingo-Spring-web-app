<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Profilna Stranica</title>
<link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clan">
	<h1>
		Dobrodosli,
		<c:out value="${korisnickoIme}" />
	</h1>

	<div class="profile-container">
		
		<div class="info-section">
			<label for="username">Polilinger: </label> 
			<p>@${korisnickoIme}</p>

		  	<label for="friends">Prijatelji:</label> 
			<p>${brPrijatelja}</p>  

			<label for="languages">Jezici:</label>
			<p>${ispisaniJeziciKojeUci}</p>

			<label for="completed-goals">Broj ispunjenih ciljeva:</label>
			<p>${ispunjenihCiljeva}</p>
		</div>
	</div>

	<div class="action-buttons">
		<a href="/Polilingo/clan/ucenjeJezikaZaClana" class="action-button">Uci</a>
		<a href="/Polilingo/jezik/ispisiJezikeZaClanove"class="action-button">Pregled jezika</a>
		<a href="/Polilingo/clan/ispisiCiljeve"class="action-button">Pregled ciljeva</a>
		<a href="/Polilingo/clan/pregledClanova"class="action-button">Pregled clanova</a>	
	</div>

	<div id="countdown-section">
		<!-- Countdown do isteka cilja -->
	</div>

	<div id="word-count-section">
		<!-- Koliko je reÄŤi nauceno -->
	</div>
</body>
</html>
