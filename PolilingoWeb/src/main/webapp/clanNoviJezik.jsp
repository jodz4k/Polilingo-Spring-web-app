<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator - Unesi Novi Jezik</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clanNoviJezik">
    <h1>Unesi Novi Jezik</h1>
    
    <form action="/Polilingo/clan/saveJezik" method="post">
        <label for="naziv">Naziv:</label>
        <input type="text" id="naziv" name="naziv" required>

        <label for="nivo">Nivo:</label>
        <input type="text" id="nivo" name="nivo" required>

        <button type="submit">Dodaj Jezik</button>
    </form>
</body>
</html>
