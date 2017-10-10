package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class search {
	private String Author;
	private String Msg;
	private Book[] books={};
	private boolean flag=false;
	public String index(){
		int[] AuthorIDs=getAuthorID(Author);
		flag=false;
		if(AuthorIDs==null){
			Msg="作者不存在！";
			return "success";
		}
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
			 for(int AuthorID:AuthorIDs){
				 rs = stmt.executeQuery("select * from lab2.book where AuthorID='"+AuthorID+"'");
				 while(rs.next()){
					 books=Arrays.copyOf(books, books.length+1);
					 books[books.length-1]=new Book(rs.getString(1),rs.getString(2),rs.getString(4),rs.getDate(5),rs.getFloat(6),rs.getInt(3));
					 flag=true;
					 System.out.println("true or false");
				 }
			 }
			 stmt.close();
			 conn.close();
	  }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		 if(flag==false){
			 Msg="这里空空如也~";
		 }	
		return "success";
	}
	
	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public int[] getAuthorID(String Author){
		flag=false;
		int[] authorIDs={};
		Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root", "");  
			 stmt=conn.createStatement();
			 rs = stmt.executeQuery("select * from lab2.author where Name='"+Author+"'");
			 System.out.println("connect author!");
			 while(rs.next()){
				 authorIDs=Arrays.copyOf(authorIDs, authorIDs.length+1);
				 authorIDs[authorIDs.length-1]=rs.getInt(1);
				 flag=true;
			 }
			 rs.close();
			 stmt.close();
			 conn.close();
	  }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		 if(flag)
			 return authorIDs; 
		 else
			 return null;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
}
