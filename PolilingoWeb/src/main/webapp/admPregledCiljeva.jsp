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
<body class="page-admPregledCiljeva">
    <h1>Pregled ciljeva</h1>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Naziv</th>
              
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cilj" items="${ciljevi}">
                <tr>
                    <td>${cilj.naziv}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    		<a href="/Polilingo/admUnesiCilj.jsp" class="button add-language-button">Dodaj cilj</a>
    		<a href="/Polilingo/admIzbrisiCilj.jsp" class="button add-language-button">Izbrisi cilj</a>
</body>
</html>
