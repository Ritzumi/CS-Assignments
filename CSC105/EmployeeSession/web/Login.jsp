<%--
  Created by IntelliJ IDEA.
  User: YuukiFeya
  Date: 2020-04-01
  Time: 03:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="LoginServlet" method="post">
    <p>Username: <input type="text" required name="username"></p>
    <p>Password: <input type="text" required name="password"></p>
    <input type="submit">
</form>
</body>
</html>
