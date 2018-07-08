package com.ITDepartment.java;
public class Teaching
{	String subject;
	String fname;
	int year;
	public Teaching()
	{
	}
	public Teaching(String subject,String fname,int year)
	{
		this.fname=fname;
		this.year=year;
		this.subject=subject;
	}
	
	public void setname(String fname)
	{	this.fname=fname;
	}
	public void setyear(int year)
	{	this.year=year;
	}
	public void setsubject(String subject)
	{	this.subject=subject;
	}
	public int getyear()
	{	return year;
	}
	public String getfname()
	{	return fname;
	}
	
	public String getsubject()
	{	return subject;
	}
	
}