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
            	<div class="col-md-8 col-md-offset-2">
                	<div class="text-center" id="Book_text">
                    	书籍信息
                	</div><br/>
                	<table class="table table-striped table-hover" id="book_detail">
                    	<tr>
                        	<td><span class="col-md-4 text-center">书籍名称：</span><span class="pull-right col-md-4 text-center"><s:property value="book.Title"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">书籍ISBN：</span><span class="pull-right col-md-4 text-center"><s:property value="book.ISBN"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">出版社：</span><span class="pull-right col-md-4 text-center"><s:property value="book.Publisher"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">出版日期：</span><span class="pull-right col-md-4 text-center"><s:property value="book.PublishDate"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">书籍价格：</span><span class="pull-right col-md-4 text-center"><s:property value="book.price"/></span></td>
                    	</tr>
                	</table>
                	<div class="text-center" id="Author_text">
                    	作者：<s:property value="author.Name"/>
                	</div><br/>
                	<table class="table table-striped table-hover" id="author_detail">
                    	<tr>
                        	<td><span class="col-md-4 text-center">作者ID：</span><span class="pull-right col-md-4 text-center"><s:property value="author.AuthorID"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">作者年龄：</span><span class="pull-right col-md-4 text-center"><s:property value="author.Age"/></span></td>
                    	</tr>
                    	<tr>
                        	<td><span class="col-md-4 text-center">作者国籍：</span><span class="pull-right col-md-4 text-center"><s:property value="author.Country"/></span></td>
                    	</tr>
	
                	</table>
                	<div class="text-center">
					<a href="home" class="btn btn-default">返回</a>
    			</div>
            	</div>
            	                         
        	</div>
    	</div>
	
	</div>
	<script src="static/js/jquery-3.1.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	</body>
	</html>