<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
            	<form action="search">
                	<input class="form-control input-lg" placeholder="请输入作者" name="Author">
                    	<div class="form-group has-error">
                        	<div class="help-block"><s:property value="Msg"/></div>
                    	</div>
                    	<div class="pull-right">
                        	<a href="add" class="a_class">
                            	<span class="glyphicon glyphicon-plus"></span>
                            	&nbsp;add book
                        	</a>
                    	</div>
            	</form>
            	<table class="table table-striped table-hover" id="book_list">
                 	<tr>
                	<th>
                    	<span class="col-md-5">题目</span>
                    	<span class="pull-right col-md-2 text-center">功能</span>
	
                    	<span class="pull-right col-md-1 text-center">价格</span>
                    	<span class="pull-right col-md-4 text-center">出版社</span>
	
                	</th>
                	</tr>
            		<s:iterator value="books">
                		<tr>
	                    	<td>
                        	<span class="col-md-5"><a href="book_detail?ISBN=<s:property value='ISBN'/>" class="a_class"><s:property value="Title"/></a></span>
                        	<span class="pull-right col-md-2 text-center">
								<a href="edit_book?ISBN=<s:property value="ISBN"/>" class="a_class">编辑</a>
								<a class="a_class"  href="delete_book?ISBN=<s:property value="ISBN"/>">删除</a>
							</span>
                        	
                        	<span class="pull-right col-md-1 text-center"><s:property value="price"/></span>
							<span class="pull-right col-md-4 text-center"><s:property value="Publisher"/></span>
                        	
                    	</td>
                	</tr>
                	</s:iterator>
	            	</table>
        		</div>	
    		</div>
	</div>
	<script src="static/js/jquery-3.1.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>
