<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Izveštaji</title>
    <link rel="stylesheet" href="/Polilingo/assets/styles.css">
    <style>
        .reports-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
            max-width: 600px;
        }
        .report-card {
            background: var(--white);
            padding: 20px;
            border-radius: 8px;
            border: 2px solid var(--border);
            box-shadow: var(--shadow);
        }
        .report-card h2 {
            color: var(--green);
            margin-top: 0;
            font-size: 1.3em;
        }
        .report-card p {
            color: var(--text-dark);
            margin: 10px 0;
            font-size: 0.95em;
        }
        .report-buttons {
            display: flex;
            gap: 10px;
            flex-wrap: wrap;
            margin-top: 15px;
        }
        .report-buttons .button {
            background: var(--green);
            padding: 10px 15px;
            border-radius: 5px;
            text-decoration: none;
            color: var(--white);
            border: none;
            cursor: pointer;
            transition: background 0.3s;
            display: inline-block;
            font-size: 0.9em;
        }
        .report-buttons .button:hover {
            background: var(--green-hover);
        }
        .report-input-group {
            display: flex;
            gap: 10px;
            margin-top: 10px;
            align-items: center;
        }
        .report-input-group input {
            padding: 8px 12px;
            border: 1px solid var(--border);
            border-radius: 4px;
            font-size: 0.9em;
        }
        .report-input-group button {
            background: var(--green);
            padding: 8px 15px;
            border-radius: 4px;
            border: none;
            color: var(--white);
            cursor: pointer;
            transition: background 0.3s;
            font-size: 0.9em;
        }
        .report-input-group button:hover {
            background: var(--green-hover);
        }
    </style>
</head>
<body class="page-izvestaji">
    <h1>Izveštaji</h1>

    <div class="reports-container">
        
        <!-- Report: Jezici po članu -->
        <div class="report-card">
            <h2>Jezici po članu</h2>
            <p>Preuzmite PDF izveštaj sa svim jezicima koje uči određeni član.</p>
            <div class="report-input-group">
                <input type="number" id="clanIdInput" placeholder="Unesite ID člana" min="1">
                <button onclick="downloadClanJeziciPDF()" class="button">Preuzmi PDF</button>
            </div>
        </div>

        <!-- Report: Sve članove i jezike -->
        <div class="report-card">
            <h2>Svi članovi i jezici</h2>
            <p>Preuzmite detaljni PDF izveštaj sa svim članovima i jezicima koje uče.</p>
            <div class="report-buttons">
                <a href="/Polilingo/izvestaj/svi-clanovi-pdf" class="button">Preuzmi PDF</a>
            </div>
        </div>

    </div>

    <script>
        function downloadClanJeziciPDF() {
            const clanId = document.getElementById('clanIdInput').value;
            
            if (!clanId) {
                alert('Molimo unesite ID člana');
                return;
            }
            
            if (clanId <= 0) {
                alert('ID člana mora biti pozitivan broj');
                return;
            }
            
            window.location.href = '/Polilingo/izvestaj/jezici-pdf/' + clanId;
        }
        
        // Allow Enter key to trigger download
        document.getElementById('clanIdInput').addEventListener('keypress', function(event) {
            if (event.key === 'Enter') {
                downloadClanJeziciPDF();
            }
        });
    </script>

</body>
</html>
