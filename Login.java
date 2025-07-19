package services;

import models.User;
import java.util.ArrayList;

public class Login {
	
		public ArrayList<User> reguser=new ArrayList<>();


public void registeruser(String Name,String username,String password,int height,int weight,int age)
{
	User u=new User(Name,username,password,height,weight,age);
	reguser.add(u);
	
}
public void display_regusers()

{
	for(User i:reguser)
	{
		System.out.println(i.toString());
	}
}
}



