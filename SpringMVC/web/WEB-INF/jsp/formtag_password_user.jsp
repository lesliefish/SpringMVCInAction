<%--
  Created by IntelliJ IDEA.
  User: lesliefish
  Date: 2019/8/1
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>User Information</h2>
<form:form method = "POST" action = "/passwordAddUser">
    <table>
        <tr>
            <td><form:label path = "userName">User Name</form:label></td>
            <td><form:input path = "userName" /></td>
        </tr>
        <tr>
            <td><form:label path = "password">Password</form:label></td>
            <td><form:password path = "password" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
