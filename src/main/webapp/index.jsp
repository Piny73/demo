<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <ul>
        <c:forEach items="${demo.accounts()}" var="acc">
        <li><c:out value="${acc.lname(), acc.fname()}"></c:out></li>
        </c:forEach>
    </ul>
</body>
</html>
