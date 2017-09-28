package helloworld;

public class HelloAction {
	private String name;
	private String password;
	public String index() throws Exception{
		if(this.name.equals("hello")&&this.password.equals("world"))
			return "success";
		return "fail";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}
