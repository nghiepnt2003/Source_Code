<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Download registration</h1>

<p>To register for our downloads, enter your name and email
   address below. Then, click on the Submit button.</p>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="download" method="post">
    <input type="hidden" name="action" value="registerUser">        
    <label class="pad_top">Email:</label>
    <input type="email" name="email" value="${user.email}" required><br>
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}" required><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}" required><br>        
    <label>&nbsp;</label>
    <input type="submit" value="Register" class="margin_left">
    <button>
    <a style ="color : #000; text-decoration: none; margin-left : 0;" class="margin_left btn-link" href="/Exercise91">Back</a>
    </button> 
</form>

</body>

</html>
