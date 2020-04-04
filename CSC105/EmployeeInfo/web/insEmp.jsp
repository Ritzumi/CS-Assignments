<%--
  Created by IntelliJ IDEA.
  User: YuukiFeya
  Date: 2020-03-26
  Time: 03:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert New Employee Page</title>

</head>
<body>
<h2>Insert New Employee Tool</h2>
<form action="InsertEmployeeServlet" method="get">
    <p>Employee Number</p>
    <input type="number" id="empno" name="empno" placeholder="100001">
    <p>First Name</p>
    <input type="text" id="fname" placeholder="Leeroy" name="fname">
    <p>Last Name</p>
    <input type="text" id="lname" placeholder="Jenkins" name="lname">
    <p>Gender</p>
    <select name="gender" id="gender">
        <option value="M">Male</option>
        <option value="F">Female</option>
    </select>
    <p>Birth Date</p>
    <input type="date" id="bdate" name="bdate">
    <p>Hire Date</p>
    <input type="date" id="hdate" name="hdate">
    <input type="submit">
</form>
<p id="result"></p>
<p id="Qsubmit" style="display: none">Input Query: ${param.empno}, ${param.fname}, ${param.lname}, ${param.gender}, ${param.hdate}, ${param.bdate}</p>
<form action="empSearch.jsp"><input type="submit" value="Employee Search"></form>
</body>
<script>
    let success = !!'${result}';
    check();
    function check() {
        let link = window.location.href;
        if(success) {
            document.getElementById('result').innerHTML = "Operation successful!";
            document.getElementById('Qsubmit').style = "display: block;";
        }
        if (!success && link.toString().includes("empno")){
            document.getElementById('result').innerHTML = "Operation unsuccessful! Check your empty input or error log";
            document.getElementById('Qsubmit').style = "display: block;";
            }
    }
</script>
</html>
