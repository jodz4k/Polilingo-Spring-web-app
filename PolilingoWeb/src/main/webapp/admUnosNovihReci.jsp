<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator - Unos Novih Reci</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-admUnosNovihReci">
    <h1>Unos Novih Reci</h1>
    
    <form action="/Polilingo/administrator/saveRec" method="post">
        <label for="naziv">Naziv:</label>
        <input type="text" id="naziv" name="naziv" required>

        <label for="tezina">Tezina:</label>
        <input type="text" id="tezina" name="tezina" required>

        <label for="opis">Opis:</label>
        <textarea id="opis" name="opis" rows="4" required></textarea>

        <label for="kontekst">Kontekst:</label>
        <textarea id="kontekst" name="kontekst" rows="4" required></textarea>

        <label for="idJezik">Jezik ID:</label>
        <input type="number" id="idJezik" name="idJezik" required>

        <button type="submit">Dodaj Rec</button>
    </form>
</body>
</html>

