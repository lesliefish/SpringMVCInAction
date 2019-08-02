<%--
  Created by IntelliJ IDEA.
  User: yulei10
  Date: 2019/8/2
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset = UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>File Upload Example</title>
</head>

<body>
<form:form method="POST" action="/fileUploadPage" enctype="multipart/form-data">
    Please select a file to upload :
    <input type="file" name="file"/>
    <input type="submit" value="upload"/>
</form:form>
</body>
</html>