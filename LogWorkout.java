package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Workout;

public class LogWorkout {
	
	public HashMap<String,List<Workout>> hm=new HashMap<>();
	
	public void addlog(String username,Workout workout)
	{
		  hm.putIfAbsent(username, new ArrayList<>());
	      hm.get(username).add(workout);
	      if(hm.get(username).size()>7)
	      {
	    	  hm.get(username).remove(0);
	      }
    }
	public int calweeklycalories(String username)
	{  int weekcal=0;
	 if(hm.containsKey(username))
		{List<Workout> tempal=hm.get(username);
		
		for(Workout j:tempal)
		{ 
		  weekcal+=j.evaluateCalorie(j.wname);
		}
		}
		
		return weekcal;
	}
	
	public void rateprogress(String username)
	{
	int ans=calweeklycalories(username);
	
	if(ans<100)
	{
		System.out.println("Increase your activity"+" "+username);
	}
	else if(ans<300)
	{
		System.out.println("Good progress"+" "+username);
	}
	else if(ans>300)
	{
		System.out.println("Excellent progress"+" "+username);
	}
	}
}

	
