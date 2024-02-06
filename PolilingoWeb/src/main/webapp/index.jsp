<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login/Register Page</title>
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

        .button-container {
            display: flex;
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

        .login-button {
            background-color: #4caf50; /* zelena boja za login */
            color: white;
        }

        .register-button {
            background-color: #45a049; /* tamnija nijansa zelene za register */
            color: white;
        }

        .button:hover {
            background-color: #3e8e41; /* tamnija nijansa na hover efektu */
        }
    </style>
</head>
<body>
    <h1>Welcome to Polilingo</h1>
    
    <div class="button-container">
        <a href="login.jsp" class="button login-button">LOGIN</a>
        <a href="register.jsp" class="button register-button">REGISTER</a>
    </div>
</body>
</html>
