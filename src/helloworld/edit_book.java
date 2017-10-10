package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class edit_book {
	private String ISBN;
	private Book book;
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
				 setBook(new Book(getISBN(), rs.getString(2), rs.getString(4), rs.getDate(5),rs.getFloat(6), rs.getInt(3)));
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
}
