<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>vols</title>
</head>
<body>
<h3>vols</h3>
<form action="volserv" method="post">
<table border="1" width="50%">
	<tr>
		<td>depart</td>
		<td><input type="text" name="depart"/></td>
	</tr>
	<tr>
		<td>destination</td>
		<td><input type="text" name="dest"/></td>
	</tr>
	<tr>
		<td>date</td>
		<td><input type="text" name="date"/></td>
	</tr>
	<tr>
		<td>nombre de personne</td>
		<td><input type="text" name="nbrperso"/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="valider"/></td>
	</tr>
</table>
</form>
</body>
</html>