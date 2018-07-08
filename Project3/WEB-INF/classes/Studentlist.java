package com.ITDepartment.java;
public class Studentlist
{	int rollno;
	String name;
	long phnumber;
	String mailid;
	int yearofstudy;
	public Studentlist()
	{}
	public Studentlist(int rollno,String name,long phnumber,String mailid,int yearofstudy)
	{	this.rollno=rollno;
		this.name=name;
		this.phnumber=phnumber;
		this.mailid=mailid;
		this.yearofstudy=yearofstudy;
	}
		
	public void setrollno(int rollno)
	{	this.rollno=rollno;
	}
	public void setname(String name)
	{	this.name=name;
	}
	public void setphnumber(long phnumber)
	{	this.phnumber=phnumber;
	}
	public void setmailid(String mailid)
	{	this.mailid=mailid;
	}
	public void setyearofstudy(int yearofstudy)
	{	this.yearofstudy=yearofstudy;
	}
	
	public int getrollno()
	{	return rollno;
	}
	public String getname()
	{	return name;
	}
	public long getphnumber()
	{	return phnumber;
	}
	public String getmailid()
	{	return mailid;
	}
	public int getyearofstudy()
	{	return yearofstudy;
	}
}