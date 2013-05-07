<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>

<body>
	<%!String getComment(java.util.Date date) {
		String comment = "";
		switch (date.getMonth()) {
		case 0:
		case 1:
			comment = "very cold";
			break;
		case 2:
		case 3:
		case 4:
			comment = "getting warmer";
			break;
		case 5:
		case 6:
		case 7:
			comment = "summer!";
			break;
		case 8:
			comment = "school time";
			break;
		case 9:
			comment = "getting colder";
			break;
		case 10:
			comment = "Thanksgiving";
			break;
		case 11:
			comment = "break time";
			break;
		}
		;
		return comment;
	}%>
	<%
		Date now = new Date();
		out.println("It is " + getComment(now));
	%>
	
	<%
		for (int i=0; i<10; i++) {
			out.println("<br><input type=\"text\" name=\"age\" /> ");
		}	
	%>
	
</body>
</html>