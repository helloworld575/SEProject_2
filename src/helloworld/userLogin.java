package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class userLogin extends ActionSupport {
	 private String name;
	 private String password;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 public String index(){
		 boolean flag=Login(this.name,this.password);
		 if(flag)
			 return SUCCESS;
		 else {
			 this.addFieldError("password", "password wrong or no user");
			 this.addFieldError("password", "wrong???");
			 return "login";
		 }
			 
	 }
	 
	  /*验证登录是否成功*/
	 public boolean Login(String name,String password){
		 boolean flag=false;
		 Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 try{
			 System.out.println("1");
			 Class.forName(DBDriver);
			 System.out.println("2");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");  
			 System.out.println("3");
			 stmt=conn.createStatement();
			 System.out.println("测试连接！");
			 System.out.println(this.name);
			 System.out.println(this.password);
			 rs = stmt.executeQuery("select * from users.user where name ='" + name +"' and password = '"+ password+"'");
			 if(rs.next()){
				 System.out.println("登录成功！");
				 flag=true; 
			 }
	  }catch(Exception e){
		  System.out.print("连接错误！");
		  e.printStackTrace();
	  	}
		 return flag;
	 } 
}
