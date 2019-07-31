<%--
  Created by IntelliJ IDEA.
  User: lesliefish
  Date: 2019/7/31
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring Page Redirection</title>
</head>
<body>
<h2>Spring Page Redirection</h2>
<p>Click below button to redirect the result to new page</p>
<form:form method = "GET" action = "/pageRedirect">
    <table>
        <tr>
            <td>
                <input type = "submit" value = "Redirect Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
