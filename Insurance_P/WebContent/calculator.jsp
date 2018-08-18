<%@page import="java.util.Calendar"%>
<%@page import="seg.bean.PremiumCalc"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Premium Calculator</title>

</head>
<body>
<form action="profile.jsp">
<!-- <form onSubmit="MyFunction();"> -->

	<table width="400" align="center">
	<tr><th colspan="2">Premium Calculator</th></tr>
	<tr><td>Model Name: </td><td><input type="text" name="modelName" required></td></tr>
	<tr><td>Showroom Price:</td><td><input type="number" name="price" required></td></tr>
	<tr><td>Model Year:</td><td><select name="modelYear">
									<% for(int a=2000; a <= 2018; a++) { %>
										<option value= "<%=a%>"><%=a%></option>
										<%} %>
								</select></td></tr>
	<tr><td>Registration No:</td><td><input type="text" name="regNo" required></td></tr>
	<tr><th colspan="2"><input type="submit" value="Calculate Premium"></th></tr>
	</table>
	</form>

</body>
</html>