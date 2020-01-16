<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review Details || Passport Seva</title>
</head>
<body background="images/passport_cnf.jpg"  >

	<form:form action="confirmBtn" method="POST" modelAttribute="pInfo">

 <h2><u>Person Details</u></h2>

        
        <input type="hidden" value="${prsnDtls.pid}"/>
        First Name: ${prsnDtls.FName}<br>
        Last Name : ${prsnDtls.LName}<br>
        Gender    : ${prsnDtls.gender}<br>
        Dob     : ${prsnDtls.dob}<br>
        Email     : ${prsnDtls.email}<br>
        
  <h2><u>Education Details</u></h2> 
         
        Highest Degree : ${eduDtls.highest_degree}<br>
        University     :  ${eduDtls.university}<br>
        Passout Year   :  ${eduDtls.passout_year}<br><br>
           &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Confirm">
		
	</form:form>

	
</body>
</html>