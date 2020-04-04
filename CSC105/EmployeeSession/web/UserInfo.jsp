<%--
  Created by IntelliJ IDEA.
  User: YuukiFeya
  Date: 2020-04-01
  Time: 04:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
<h2>Welcome ${param.username}</h2>
<p>Firstname: ${result.getFirstname()}</p>
<p>Lastname: ${result.getLastname()}</p>
<p>Hire Date: ${result.getHiredate()}</p>
<p>Department: ${result.getDeptname()}</p>
<p>Salary: ${result.getSalary()}</p>
<form action="LogOutServlet" method="post"><button type="submit">Log Out</button></form>
</body>
</html>
