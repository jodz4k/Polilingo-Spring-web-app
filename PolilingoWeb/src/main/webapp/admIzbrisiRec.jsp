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
<body class="page-admIzbrisiRec">
    <h1>Izbrisi Rec</h1>
    
    <form action="/Polilingo/rec/deleteRec" method="post">
        <label for="naziv">Naziv reci</label>
        <input type="text" id="naziv" name="naziv" required>

        <button type="submit">Izbrisi rec</button>
        
        <!--  -->
    </form>
</body>
</html>

