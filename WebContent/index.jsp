<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloStruts2</title>
</head>
<body>
<h1>Please Enter Your Name</h1>

<form action="HelloAction">
	<label for="name">Please input your name</label>
	<input type="text" name="name">
	<input type="submit" value="say hello">
</form>
</body>
</html>