<%@page import="java.util.Calendar"%>
<%@page import="seg.bean.PremiumCalc"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is a test</title>
</head>
<body bgcolor=burlywood text=maroon>


<%
int mYear=Integer.parseInt(request.getParameter("modelYear"));
int sPrice = Integer.parseInt(request.getParameter("price"));
int year = Calendar.getInstance().get(Calendar.YEAR);
double amount = 0;

int yearDiff = year - mYear;

if(yearDiff <= 1)
	 amount = sPrice * 0.05;	
else if(yearDiff == 2)
	amount = sPrice * 0.1;
else if(yearDiff <= 4)
	amount = sPrice * 0.2;
else
	amount = sPrice * 0.3;

%>
<!-- <html>
<body> -->
Model year : <%=mYear%>	CurrentDate : <%=year %><br>
Difference : <%=yearDiff %><br>
Premium value : <%=(sPrice - amount)%>
<!-- </body>
</html>

 --><%

	//System.out.println("hello");	

%>

</body>
</html>