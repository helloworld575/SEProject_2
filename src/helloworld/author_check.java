package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class author_check {
	private int author;
	private Boolean has_author;
	public String index(){
		Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root","");  
			 stmt=conn.createStatement();
			 rs = stmt.executeQuery("select * from lab2.author where AuthorID="+author);
			 System.out.println("connect author!");
			 if(rs.next()){
				 System.out.println(rs.getInt(1));
				 has_author=true;
			 }
			 else
				 has_author=false;
			 rs.close();
			 stmt.close();
			 conn.close();
		 	}catch(Exception e){
		  System.out.print("Á¬½Ó´íÎó£¡");
		  e.printStackTrace();
	  	}
		return "success";
	}
	public Boolean getHas_author() {
		return has_author;
	}
	public void setHas_author(Boolean has_author) {
		this.has_author = has_author;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}

}

