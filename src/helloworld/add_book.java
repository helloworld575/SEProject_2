package helloworld;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class add_book {
	private String book_title;
	private String book_ISBN;
	private String book_publisher;
	private Date book_publishdate;
	private float book_price;
	private String author_name;
	private int author_id;
	private int author_age;
	private String author_country;
	private String Msg;
	public String index(){
		Connection conn = null;
		PreparedStatement pst=null;
		Statement stmt = null;
		ResultSet rs=null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 String sql;
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");  
			 stmt=conn.createStatement();
			 rs = stmt.executeQuery("select * from lab2.author where AuthorID="+author_id);
			 System.out.println(author_id);

			 if(!rs.next()){
				 sql="insert into lab2.author values(?,?,?,?)";
				 pst=conn.prepareStatement(sql);
				 pst.setInt(1, author_id);
				 pst.setString(2, author_name);
				 pst.setInt(3, author_age);
				 pst.setString(4, author_country);
				 pst.executeUpdate();
			 }
			 sql="insert into lab2.book values(?,?,?,?,?,?)";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1, book_ISBN);
			 pst.setString(2, book_title);
			 pst.setInt(3, author_id);
			 pst.setString(4, book_publisher);
			 pst.setDate(5, book_publishdate);
			 pst.setFloat(6, getBook_price());
			 pst.executeUpdate();
			 stmt.close();
			 conn.close();
			 Msg="创建成功！";
		 	}catch(Exception e){
		  System.out.print("连接错误！");
		  Msg="创建失败！";
		  e.printStackTrace();
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
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getAuthor_country() {
		return author_country;
	}
	public void setAuthor_country(String author_country) {
		this.author_country = author_country;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public int getAuthor_age() {
		return author_age;
	}
	public void setAuthor_age(int author_age) {
		this.author_age = author_age;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
}
