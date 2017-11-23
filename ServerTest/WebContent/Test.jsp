<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="NewPack.Facebook" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FaceBook Testing</title>
</head>
<body>

<%!  int a=10; %>
<%! public int sum(int b){
	return a+b; 
	}
	%>
	<%= "Sum of a and b is=" +sum(23) %>

<%="value of a is=" +a %>
  <%-- Hello!--%>
     <br>

<input type="button", value="Facebook">
 </body>
</html>
