package services;
import models.User;
import java.io.FileWriter;

public class Generatefile{

	
	public void addtofile(User obj,LogWorkout a)
	{
	
		  try {
			FileWriter f=new FileWriter("report.txt",true);
			f.write(obj.toString());
			f.write("Weekly progress\n");
			f.write(String.valueOf(a.calweeklycalories(obj.username)));
			f.close();
			}
		  catch (Exception e)
		  {
			 System.out.print(e);
		  }
		  System.out.println("file written");
	}
}
	
