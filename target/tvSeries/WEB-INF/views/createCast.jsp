<%--
  Created by IntelliJ IDEA.
  User: Hatake
  Date: 8/7/2017
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/Cast/postCart" method="Post">
    <table border="1">
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>BirthPlace:</td>
            <td><input type="text" name="birthPlace"/>
        </tr>
        <tr>
            <td>CharacterName:</td>
            <td><input type="text" name="characterName"/>
        </tr>
        <tr>
            <td> Biography:</td>
            <td><input type="text" name="biography"/>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>
