<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator</title>
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
            margin-top: 20px;
        }

        label {
            margin-right: 10px;
        }

        input {
            padding: 8px;
            margin-bottom: 10px;
        }

        button {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            background-color: #4caf50 
            color: white;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #c0392b; /* tamnija nijansa na hover efektu */
        }
    </style>
</head>
<body>
    <h1>Izbrisi Jezik</h1>
    
    <form action="/Polilingo/jezik/obrisiJezik" method="post">
        <label for="jezikId">ID Jezika:</label>
        <input type="number" id="jezikId" name="jezikId" required>

        <button type="submit">Izbrisi jezik</button>
    </form>
</body>
</html>