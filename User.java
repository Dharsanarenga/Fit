package models;

public class User {

	public String Name;
	public String username;
	public String password;
	public int height;
	public int weight;
	public int age;
	
	public User(String Name,String username,String password,int height,int weight,int age)
	{
		this.Name=Name;
		this.username=username;
		this.password=password;
		this.height=height;
		this.weight=weight;
		this.age=age;
	}
	public String toString()
	{
		return "Name:"+ Name+"\n Username:"+username+"\npassword"+ password+"\nheight:"+height+"\nweight"+weight+"\nage:"+age;
	}
}
