<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrator</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
</head>
<body class="page-clanUcenje">
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
