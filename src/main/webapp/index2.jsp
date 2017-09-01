<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <jsp:useBean id="calcu" scope="request" class="com.za.tutorial.calculadora.Calculadora"/>
<html>
<head>
<meta htt-equiv="Content-Type" content="text/html"; charset=ISO-8859-1">
<title>MVC Hands-on Tutorial 01</title>
</head>
<body>
	Numero a: <jsp:getProperty property="a" name="calcu"/>
	<br>
	Numero b: <jsp:getProperty property="b" name="calcu"/>
	<br>
	Suma: <jsp:getProperty property="suma" name="calcu"/>
	<br>
	Resta: <jsp:getProperty property="resta" name="calcu"/>
	
</body>
</html>
