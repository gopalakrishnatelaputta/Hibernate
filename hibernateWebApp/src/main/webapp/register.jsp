<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<%@page import="hibernateWebApp.UserDao" %>

<% out.println("hii");%>
<jsp:useBean id="obj" class="hibernateWebApp.User"/>

<jsp:setProperty property="*" name="obj"/>
<%
int i=UserDao.register(obj);
if(i>0)
	out.print("You have successfully Registered");
%>


</body>
</html>