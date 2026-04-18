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
<body class="page-admIzbrisiCilj">
    <h1>Izbrisi Cilj</h1>
    
    <form action="/Polilingo/cilj/deleteCilj" method="post">
        <label for="naziv">Naziv cilja</label>
        <input type="text" id="naziv" name="naziv" required>

        <button type="submit">Izbrisi jezik</button>
    </form>
</body>
</html>

