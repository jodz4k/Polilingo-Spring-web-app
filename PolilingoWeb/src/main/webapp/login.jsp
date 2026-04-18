<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-login">
    <h1>Login</h1>
    
    <form action="/Polilingo/korisnik/nakonLogin" method="get">
        <label for="korisnickoIme">Username:</label>
        <input type="text" id="korisnickoIme" name="korisnickoIme" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Login</button>
    </form>
</body>
</html>
