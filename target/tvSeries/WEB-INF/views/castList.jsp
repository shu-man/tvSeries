
<%--
  Created by IntelliJ IDEA.
  User: Hatake
  Date: 8/8/2017
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>CastList</title>
</head>
<body>
<h1>Cast Information</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>BirthPlace</th>
        <th>CharacterName</th>
        <th>Biography</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="cast" items="${castList}">
        <tr>
            <td>${cast.name}</td>
            <td>${cast.birthPlace}</td>
            <td>${cast.characterName}</td>
            <td>${cast.biography}</td>
            <td><a href="castEdit/${cast.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<a href="create"> Add a Cast</a>
</body>
</html>
