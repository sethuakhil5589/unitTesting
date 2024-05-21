<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greetings</title>
</head>
<body>

<h1 style='color:red'><marquee>Hey! ${greet} </marquee></h1>

<h1 style='color:blue'>${message}</h1>
<form action="/GreetingsApp/tourist-post" method="post">
<button>getTourist</button>
</form>
</body>
</html>