package com.IPLService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.IplDaoImplement.IplDaoImplement;
import com.entity.Ipl;

public class IplService {
public List<Ipl> ViewAll()throws ClassNotFoundException,SQLException
{
	List<Ipl> li=new IplDaoImplement().findAll(); 
	for(Ipl i:li)
	{
		System.out.println(i);
		
	}
	return li;
}

public void insertipl()throws ClassNotFoundException,SQLException
{
	Ipl ipl=new Ipl();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int Id=sc.nextInt();
	System.out.println("enter the name");
	String Name=sc.next();
	System.out.println("enter the city");
	String City=sc.next();
	System.out.println("enter the state");
	String State=sc.next();
	ipl.setId(Id);
	ipl.setName(Name);
	ipl.setCity(City);
	ipl.setState(State);
	new IplDaoImplement().insertipl(ipl);;

}
public void updateipl()throws ClassNotFoundException,SQLException
{
	Ipl ipl=new Ipl();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the name");
	String Name=sc.next();
	System.out.println("enter the city");
	String City=sc.next();
	System.out.println("enter the state");
	String State=sc.next();
	System.out.println("enter the id");
	int Id=sc.nextInt();
	
	ipl.setName(Name);
	ipl.setCity(City);
	ipl.setState(State);
	ipl.setId(Id);
	new IplDaoImplement().updateipl(ipl);

}
public void deleteeipl()throws ClassNotFoundException,SQLException
{
	Ipl ipl=new Ipl();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the id");
	int Id=sc.nextInt();
	
	ipl.setId(Id);
	new IplDaoImplement().deleteipl(ipl);

}
}
