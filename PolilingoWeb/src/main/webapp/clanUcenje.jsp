<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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

        .table {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
        }

        .table th, .table td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        .table th {
            background-color: #4caf50;
            color: white;
        }

        .button-container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            margin-top: 20px;
        }

        .button {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        .add-word-button {
            background-color: #4caf50; /* zelena boja za dodavanje reci */
            color: white;
        }

        .remove-words-button {
            background-color: #4caf50; /* zelena boja za izbacivanje reci */
            color: white;
        }

        .view-stats-button {
            background-color: #4caf50; /* zelena boja za statistike */
            color: white;
        }

        .add-language-button {
            background-color: #4caf50; /* zelena boja za dodavanje jezika */
            color: white;
        }

        .button:hover {
            background-color: #34495e; /* tamnija nijansa na hover efektu */
        }
    </style>
</head>
<body>
    <h1>Pregled jezika</h1>

    <form action="/Polilingo/clan/cuvanjeSesije" method="post">
        <label for="odabraniJezik">Izaberite jezik:</label>
        <select name="odabraniJezik" id="odabraniJezik">
            <c:forEach var="jezik" items="${jezici}">
                <option value="${jezik.idJezik}">${jezik.naziv} - ${jezik.nivo}</option>
            </c:forEach>
        </select>

        <button type="submit" class="button add-language-button">Kreni</button>
    </form>
</body>
</html>