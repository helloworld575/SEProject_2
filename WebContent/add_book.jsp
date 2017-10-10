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
            	<div class="col-md-10">
                	<div class="text-center" id="Book_text">
                    	请完成书籍信息
                	</div><br/>
                	<form class="form-horizontal" action="add_book">
                    	<div class="form-group">
                        	<label for="book_title" class="col-sm-2 control-label">名称</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_title" name="book_title" placeholder="请输入书籍名称">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_ISBN" class="col-sm-2 control-label">ISBN</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_ISBN" name="book_ISBN" placeholder="请输入书籍ISBN">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_publisher" class="col-sm-2 control-label">出版社</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_publisher"  name="book_publisher" placeholder="请输入书籍发布者名称">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_publishdate" class="col-sm-2 control-label">发布日期</label>
                        	<div class="col-sm-10">
                            	<input type="date" class="form-control" id="book_publishdate" name="book_publishdate"placeholder="请输入书籍发布日期">
                        	</div>
                    	</div>
                    	<div class="form-group">
                        	<label for="book_price" class="col-sm-2 control-label">价格</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="book_price"  name="book_price" placeholder="请输入书籍价格">
                        	</div>
                    	</div>
                    	                    <div class="form-group">
                        	<label for="author_id" class="col-sm-2 control-label">作者ID</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="author_id"  name="author_id" value="<s:property value="author"/>"readonly="readonly">
                        	</div>	
                    	</div>
                    	<s:if test="has_author==false">
                	<div class="text-center" id="Author_text">
                    	作者信息
                	</div><br/>
                    	<div class="form-group">
                        	<label for="author_name" class="col-sm-2 control-label">名称</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="author_name" placeholder="请输入作者名称" name="author_name">
                        	</div>	
                    	</div>
                    	<div class="form-group">
                        	<label for="author_age" class="col-sm-2 control-label">年龄</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="author_age"  name="author_age" placeholder="请输入作者年龄">
                        	</div>	
                    	</div>
                    	<div class="form-group">
                        	<label for="author_country" class="col-sm-2 control-label">国籍</label>
                        	<div class="col-sm-10">
                            	<input type="text" class="form-control" id="author_country" name="author_country" placeholder="请输入作者国籍">
                        	</div>
                    	</div>
                    	</s:if>
                    	<div class="text-center">
                        	<input type="submit" class="btn btn-default" placeholder="提交">
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