<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator - Unesi Novi Cilj</title>
    <style>
        body {
            background-color: #f0f8f7; /* svetlozelena boja pozadine */
            font-family: Arial, sans-serif;
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
            color: #4caf50;
        }

        form {
            background-color: #ffffff; /* bela boja pozadine za formu */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* senka za efekat pop-up-a */
            width: 300px; /* prilagodi sirinu forme prema potrebama */
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #333; /* tamnosiva boja za labelu */
            text-align: left;
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
    <h1>Unesi Novi Jezik</h1>
    
    <form action="/Polilingo/cilj/saveCilj" method="post">
        <label for="naziv">Naziv:</label>
        <input type="text" id="naziv" name="naziv" required>

        <button type="submit">Dodaj cilj</button>
    </form>
</body>
</html>