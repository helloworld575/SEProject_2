<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
	<head>
    	<meta charset="utf-8">
    	<meta http-equiv="x-ua-compatible" content="ie=edge">
    	<meta name="description" content="">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	<link rel="stylesheet" href="static/css/bootstrap.min.css">
    	<link rel="stylesheet" href="static/css/main.css">
    	<title>图书管理系统</title>
	</head>
	<body background="static/img/18589.jpg">
	<div class="container">
    	<div class="row">
        	<div class="col-md-10 col-md-offset-1 jumbotron">
            	<a href="home">
            	<div class="text-center" id="header_text">
                	图书管理系统
            	</div></a>
            	<br/><br/><br/>
            	<div class="alert-danger" id="danger_text">
                	<s:property value="Msg"/><br/>
            	</div>
            	<div class="text-center">
            			<a href="home" class="btn btn-default">返回</a>
            	</div>
        	</div>
    	</div>
	</div>
	<script src="static/js/jquery-3.1.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	</body>
</html>