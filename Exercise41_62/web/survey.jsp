<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1>Thanks for taking our survey!</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>BirthDay:</label>
    <span>${user.birthDay}</span><br>
    <label>Heard From:</label>
    <span>${user.heardFrom}</span><br>
    <label>Like That :</label>
    <span>${user.like}</span><br>    
    <label>Updates:</label>
    <span>${user.wantsUpdates}</span><br>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:if test="${user.wantsUpdates == 'Yes'}">
        <label>Contact Via:</label>
        <span>${user.contactVia}</span>
    </c:if>   

    <form action="survey" method="post">
        <input type="hidden" name="action" value="back">
        <input style="padding : 10px 10px;margin-left : -95px; margin-top: 10px" type="submit" value="Back">
    </form>
        
    
</body>
</html>