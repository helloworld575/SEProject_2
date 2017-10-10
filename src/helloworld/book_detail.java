package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class book_detail {
	private String ISBN;
	private Book book;
	private Author author;
	public String index(){
		 Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root","");  
			 stmt=conn.createStatement();
			 System.out.println("测试连接！");
			 rs = stmt.executeQuery("select * from lab2.book where ISBN='"+ISBN+"'");
			 if(rs.next()){
				 book=new Book(ISBN, rs.getString(2), rs.getString(4), rs.getDate(5),rs.getFloat(6), rs.getInt(3));
				 System.out.println(rs.getString(4));
				 author=getAuthorDetail(rs.getInt(3));
			 }
			 else
				 return "error";
			 rs.close();
			 stmt.close();
			 conn.close();
	  }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		return "success";
	}
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author getAuthorDetail(int AuthorID){
		Author tmp;
		Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 System.out.println("1");
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "");  
			 stmt=conn.createStatement();
			 System.out.println("测试连接！");
			 rs = stmt.executeQuery("select * from lab2.author where AuthorID='"+AuthorID+"'");
			 if(rs.next()){
				 tmp=new Author(AuthorID, rs.getString(2), rs.getInt(3), rs.getString(4));
				 return tmp;
			 }
			 rs.close();
			 stmt.close();
			 conn.close();
		 }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		 return null;
	}
}
