package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class delete_book {
	private String ISBN;
	private String Msg;
	public String index(){
		Connection conn = null;
		 ResultSet rs = null;
		 Statement stmt = null;
		 String DBDriver = "com.mysql.jdbc.Driver";
		 try{
			 Class.forName(DBDriver);
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8", "root", "");  
			 stmt=conn.createStatement();
			 System.out.println("�������ӣ�");
			 rs = stmt.executeQuery("select * from lab2.book where ISBN='"+ISBN+"'");
			 if(rs.next()){
				 PreparedStatement pst=conn.prepareStatement("delete from lab2.book where ISBN=?");
				 pst.setString(1, ISBN);
				 pst.executeUpdate();
				 Msg="ɾ���ɹ�";
			 }
			 else
				 Msg="ɾ��ʧ��";
			 rs.close();
			 stmt.close();
			 conn.close();
	  }catch(Exception e){
		  System.out.print("���Ӵ���");
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
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	
}
