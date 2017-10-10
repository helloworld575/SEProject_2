package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;

public class homepage extends ActionSupport{
	private Book[] books={};
	public String index(){
		Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 System.out.println("1");
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root", "");  
			 stmt=conn.createStatement();
			 System.out.println("测试连接！");
			 rs = stmt.executeQuery("select * from lab2.book");
			 while(rs.next()){
				 books=Arrays.copyOf(books, books.length+1);
				 books[books.length-1]=new Book(rs.getString(1),rs.getString(2),rs.getString(4),rs.getDate(5),rs.getFloat(6),rs.getInt(3));
			 }
			 rs.close();
			 stmt.close();
			 conn.close();
	  }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		return "success";
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
}

