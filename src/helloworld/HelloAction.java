package helloworld;

public class HelloAction {
	private String name;
	public String index() throws Exception{
		return "success";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
