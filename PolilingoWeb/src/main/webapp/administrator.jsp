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
    <h1>Administrator</h1>

    <div class="button-container">
		<a href="/Polilingo/admUnosNovihReci.jsp" class="button add-word-button">Unesi reci</a>
		<a href="/Polilingo/admIzbrisiRec.jsp" class="button remove-words-button">Izbaci reci</a>
		<a href="/Polilingo/jezik/ispisiJezike" class="button view-stats-button">Prikaz jezika</a>
		<a href="/Polilingo/admUnesiJezik.jsp" class="button add-language-button">Unesi novi jezik</a>
		<a href="/Polilingo/cilj/ispisiCiljeve" class="button add-language-button">Pregled ciljeva</a>
    </div>
</body>

</html>