<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>   

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><titles:insertAttribute name="title"/></title>
</head>
<body>
	<!-- Header -->
	<tiles:insertAttribute name="header"/>
	
	<!-- Content -->
	<tiles:insertAttribute name="content"/>
	
</body>
</html>