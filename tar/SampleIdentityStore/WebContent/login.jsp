<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Login Page</title>
</head>

<h2>Please log in:</h2>
<br><br>
<form action="j_security_check" method=post>
    <p><strong>Enter Your User Name: </strong>
    <input type="text" name="j_username" size="25">
    <p><p><strong>Enter Your Password: </strong>
    <input type="password" size="25" name="j_password">
    <p><p>
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
</html>