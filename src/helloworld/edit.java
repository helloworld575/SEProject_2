package helloworld;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class edit {
	private String book_title;
	private String book_ISBN;
	private String book_publisher;
	private Date book_publishdate;
	private float book_price;
	private int author_id;
	private String Msg;
	public String index(){
		Connection conn = null;
		PreparedStatement pst=null;
		Statement stmt = null;
		ResultSet rs=null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 String sql;
		 System.out.println("what's wrong?");
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root", "");  
			 stmt=conn.createStatement();
			 rs = stmt.executeQuery("select * from lab2.book where ISBN='"+book_ISBN+"'");
			 System.out.println("here?");
			 if(rs.next()){
				 sql="update lab2.book set Title=?,Publisher=?,PublishDate=?,Price=? where ISBN=?";
				 pst=conn.prepareStatement(sql);
				 pst.setString(1, book_title);
				 pst.setString(2, book_publisher);
				 pst.setDate(3, book_publishdate);
				 pst.setFloat(4, getBook_price());
				 pst.setString(5, book_ISBN);
				 pst.executeUpdate();
			 }
			 else
				 return "error";
			 stmt.close();
			 conn.close();
			 setMsg("创建成功！");
		 	}catch(Exception e){
		  System.out.print("连接错误！");
		  setMsg("创建失败！");
		  e.printStackTrace();
		  return "error";
	  	}
		return "success";
	}
	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_ISBN() {
		return book_ISBN;
	}

	public void setBook_ISBN(String book_ISBN) {
		this.book_ISBN = book_ISBN;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public Date getBook_publishdate() {
		return book_publishdate;
	}

	public void setBook_publishdate(Date book_publishdate) {
		this.book_publishdate = book_publishdate;
	}

	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
}
