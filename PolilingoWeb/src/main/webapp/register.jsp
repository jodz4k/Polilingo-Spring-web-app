<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8f7; /* svetlozelena boja pozadine */
            text-align: center;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        h1 {
            color: #4caf50; /* zelena boja za naslov */
        }

        form {
            background-color: #ffffff; /* bela boja pozadine za formu */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* senka za efekat pop-up-a */
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #333; /* tamnosiva boja za labelu */
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc; /* siva boja granice input polja */
            border-radius: 4px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50; /* zelena boja za dugme */
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #45a049; /* tamnija nijansa zelene na hover efektu */
        }
    </style>
</head>
<body>
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