<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
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
            	<div class="col-md-6 col-md-offset-2">
                	<div class="text-center" id="Book_text">
                    	编辑书籍信息
                	</div><br/>
                	<form class="form-horizontal" action="edit">
                	<div class="form-group">
                        	<label for="book_title" class="col-sm-2 control-label">名称</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_title" name="book_title" value="<s:property value='book.title'/>">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_ISBN" class="col-sm-2 control-label">书籍ISBN</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_ISBN" name="book_ISBN" value="<s:property value='book.ISBN'/>" readonly="readonly">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="author_id" class="col-sm-2 control-label">作者ID</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="author_id" name="author_id"  value="<s:property value='book.AuthorID'/>" readonly="readonly">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_publisher" class="col-sm-2 control-label">出版社</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_publisher"  name="book_publisher"  value="<s:property value='book.Publisher'/>" >
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_publishdate" class="col-sm-2 control-label">发布日期</label>
                        	<div class="col-sm-10">
                            	<input type="date" class="form-control" id="book_publishdate" name="book_publishdate"  value="<s:date format="yyyy-MM-dd" name='book.PublishDate'/>" >
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_price" class="col-sm-2 control-label">价格</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_price"  name="book_price"  value="<s:property value='book.price'/>" >
                        	</div>
                    	</div>
                	<div class="text-center">
                        	<input type="submit" class="btn btn-default" value="提交">
                    	</div>
                	</form>
            	</div>
        	</div>
    	</div>
    	<div class="row">
	
    	</div>
	</div>
	<script src="static/js/jquery-3.1.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	</body>
</html>