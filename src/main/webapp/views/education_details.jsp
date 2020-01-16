<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Details || Passport Seva</title>
</head>
<body  style="background-image: url('images/edu_bg.jpg');background-size: cover;">
	<form:form action="eduNextBtn" method="POST" modelAttribute="eduDtls">

     <h2 style="color:teal;text-align: center;">Educational Details</h2>

		<table  align="center">

			<form:hidden path= "pid" />
			<form:hidden path="eid" />
			<tr>
				<td style="font: fantasy;color: white;">Highest Degree</td>
				<td><form:select path="highest_degree">
						<form:option value="">-Select A Degree-</form:option>
						<form:options items="${degrees}" />
					</form:select></td>
			</tr>

			<tr>
				<td style="font: fantasy;color: white;">University</td>
				<td><form:select path="university">
						<form:option value="">-Select A University-</form:option>
						<form:options items="${universities}" />
					</form:select></td>
			</tr>
			<tr>
				<td style="font: fantasy;color: white;">PassOut Year</td>
				<td><form:select path="passout_year">
						<form:option value="">-Select A Year-</form:option>
						<form:options items="${years}" />
					</form:select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="/?pid=${pid}" style="text-align: left;color: white;">Previous</a> <input
					type="submit" value="Next" style="align-items: right: ;"></td>
			</tr>


			</form:form>
		</table>
</body>
</html>