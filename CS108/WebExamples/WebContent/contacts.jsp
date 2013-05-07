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
	<h1>Enter Contact Name</h1>
	<form action="AddContact" method="post">
		<p>
			Enter Name: <input type="text" name="name" /> 
			<input type="submit" value="Add"/>
		</p>
	</form>
	
	<%
		ArrayList<String> contacts = (ArrayList<String>)application.getAttribute("contacts");
		for (String name : contacts) {
			out.println(name);
			out.println("<br />");
		}
	
	%>
</body>

</html>