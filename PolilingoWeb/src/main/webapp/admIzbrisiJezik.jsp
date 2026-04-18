<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-admIzbrisiJezik">
    <h1>Izbrisi Jezik</h1>
    
    <form action="/Polilingo/jezik/obrisiJezik" method="post">
        <label for="jezikId">ID Jezika:</label>
        <input type="number" id="jezikId" name="jezikId" required>

        <button type="submit">Izbrisi jezik</button>
    </form>
</body>
</html>

