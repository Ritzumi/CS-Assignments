<%--
  Created by IntelliJ IDEA.
  User: YuukiFeya
  Date: 2020-03-26
  Time: 03:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Search Page</title>
</head>
<body>
<form action="GetEmployeeInfoServlet" method="get">
    <h2>Employee Search Tool</h2>
    <p>First Name:</p>
    <input type="text" name="fname" placeholder="John">
    <p>Last Name:</p>
    <input type="text" name="lname" placeholder="Smith">
    <input type="submit" onclick="update(), check()">
</form>
<table id="output">
    <tr>
        <td>First Name </td>
        <td>${result.getFirstname()}</td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td>${result.getLastname()}</td>
    </tr>
    <tr>
        <td>Department Name</td>
        <td>${result.getDeptname()}</td>
    </tr>
    <tr>
        <td>Hire date</td>
        <td>${result.getHiredate()}</td>
    </tr>
    <tr>
        <td>Salary(Max)</td>
        <td>${result.getSalary()}</td>
    </tr>
</table>
<p id="notFound" style="display: none;">Your query is empty or do not match in database</p>
<form action="insEmp.jsp">
    <input type="submit" value="Insert Employee Tool">
</form>


</body>
<script>
    var isFound= ${result.getSalary()} + "";
    check();
    function check() {
        if(isFound != ""){
            document.getElementById('output').style = "display: block;"
        } else {
            document.getElementById('output').style = "display: none;"
            isFirstTime()
        }
    }
    function isFirstTime() {
        let url = window.location.href;
        if(url.includes("fname")){
            document.getElementById('notFound').style = "display: block;"
        }else {
            document.getElementById('notFound').style = "display: none;"
        }
    }

</script>
<style>
    td{
        border: black solid 1px;
        padding: 4px;
    }
</style>
</html>
