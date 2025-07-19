package models;

import java.util.ArrayList;

public class Workout {
	public String wname;
	public int duration;
	public String date;
	public int caloriesBurnt=0;
	public ArrayList<Workout> wk=new ArrayList<>();
	
	public Workout(String wname,int duration,String date)
	{
		this.wname=wname;
		this.duration=duration;
		this.date=date;
	}
	public int evaluateCalorie(String work)
	{  String w=work.toLowerCase();
		if(w.equals("running"))
		{
			caloriesBurnt+=10*duration;
		}
		else if(w.equals("walking"))
		{
			caloriesBurnt+=5*duration;
		}
		else if(w.equals("cycling"))
		{
			caloriesBurnt+=7*duration;
		}
		else if(w.equals("yoga"))
		{
			caloriesBurnt+=8*duration;
		}
		else
		{
			caloriesBurnt+=0;
		}
		
		return caloriesBurnt;
	}
	
	public String toString()
	{
		return "Workout Name:"+wname+"Duration:"+duration+"Date:"+date;
	}

}
