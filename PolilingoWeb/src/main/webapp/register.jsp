<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-register">
    <h1>Register</h1>
    
    <form action="/Polilingo/korisnik/saveKorisnik" method="post">
        <label for="korisnickoIme">Username:</label>
        <input type="text" id="korisnickoIme" name="korisnickoIme" required>

        <label for="mail">Email:</label>
        <input type="text" id="mail" name="mail" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>

        <button type="submit">Register</button>
    </form>
</body>
</html>
