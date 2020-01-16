<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUBMISSION</title>
</head>
<body>
<form:form  action="#" modelAttribute="passportNo">
Thank You For Applying Passport. <br><br>
Your Application Submitted Successfully.<br>
Passport No : ${passportNo}
</form:form>
</body>
</html>