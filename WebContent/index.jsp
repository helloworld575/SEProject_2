<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloStruts2</title>
<link href="static/css/bootstrap.min.css"  type="stylesheet">
</head>
<body>
<h1>Please Enter Your Name</h1>
<a href="HelloAction">helloworld</a>
<form action="HelloAction" >
	<label for="name">Please input your name</label>
	<input type="text" name="name"><br>
	<label for="password">Please input your password</label>
	<input type="text" name="password">
	<input type="submit" value="登录"  class="btn btn-default">
	<input type="reset" value="重置">
</form>
</body>
</html>