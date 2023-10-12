<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    
<h1>CD list</h1>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <th>Description</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>
  <c:forEach var="product" items="${products}">
    <tr>
        <td><c:out value='${product.description}'/></td>
        <td class="right">$${product.price}</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="productCode" value="<c:out value='${product.code}'/>">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    </c:forEach>
</table>
    <form style="margin-top: 8px" action="cart" method="post">
        <input type="hidden" name="productCode" value="">
        <input type="submit" value="Your Cart">
    </form>
            
    <button style="margin-top: 8px;">
        <a style=' color : #000;text-decoration: none;margin-left : 0;' class="margin_left btn-link" href="https://profile-102x.onrender.com/WebProfile">Back Home</a>
    </button>        
</body>
</html>