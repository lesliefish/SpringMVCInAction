<%--
  Created by IntelliJ IDEA.
  User: lesliefish
  Date: 2019/8/1
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Submitted User Information</h2>
<table>
    <tr>
        <td>Username</td>
        <td>${userName}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
</table>
</body>
</html>
