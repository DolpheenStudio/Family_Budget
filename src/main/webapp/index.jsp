<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Witaj podrozniku</title>
</head>
<body>
<h1>Witaj podrozniku!</h1>
<h2>Dolacz do druzyny Javy!</h2>
<form action="/Family_Budget/Family_Budget_Servlet" method = "GET">
	<label for="fname">Imie:</label><br>
  	<input type="text" id="fname" name="fname"><br>
  	<label for="lname">Nazwisko:</label><br>
  	<input type="text" id="lname" name="lname"><br><br>
  	<input type="submit" value="Dolacz!">
</form>
</body>
</html>