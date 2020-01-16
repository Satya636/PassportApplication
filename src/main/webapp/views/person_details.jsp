<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration || Passport Seva</title>
</head>
<body background="images/passport.jpeg">

	<form:form action="nextBtn" method="POST" modelAttribute="pInfo">

		<h2 style="color: white; text-align: center;">Applicant Details</h2>

		<center>
			<font color="green">${success}</font>
		</center>
		<center>
			<font color="green">${failure}</font>
		</center>

		<center>
			<table style="width: 200px; height: 150px: align="center">
				<tr>
					<td><form:hidden path="pid"/></td>
				</tr>
				<tr>
					<td style="width: 171px;color: white" >First Name</td>
					<td><form:input path="fName" /></td>
				</tr>

				<tr>
					<td style="color: white;">Last Name</td>
					<td><form:input path="lName" /></td>
				</tr>

				<tr>
					<td style="color: white;">Email</td>
					<td><form:input path="email" /></td>
				</tr>


				<tr>
					<td style="color: white;">Dob</td>
					<td><form:input path="dob" type="date" /></td>
				</tr>

				<tr>
					<td style="color: white;">Gender</td>
					<td><form:radiobutton path="gender" value="Male" /><font color="white">Male</font><form:radiobutton
							path="gender" value="Female" /><font color="white">Female</font></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Next"></td>
				</tr>
			</table>
	</form:form>

</body>
</html>