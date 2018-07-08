package com.ITDepartment.java;
public class Faculty
{	String name;
	long phnumber;
	String mailid;
	int id;
	String password;
	String subject1;
	String subject2;
	public Faculty()
	{}
	public Faculty(String name,long phnumber,String mailid,int id,String password,String subject1,String subject2)
	{
		this.id=id;
		this.name=name;
		this.mailid=mailid;
		this.phnumber=phnumber;
		this.subject1=subject1;
		this.password=password;
		this.subject2=subject2;
	}
	public void setid(int id)
	{	this.id=id;
	}
	public void setname(String name)
	{	this.name=name;
	}
	public void setpassword(String password)
	{	this.password=password;
	}
	public void setphnumber(long phnumber)
	{	this.phnumber=phnumber;
	}
	public void setmailid(String mailid)
	{	this.mailid=mailid;
	}
	public void setsubject1(String subject1)
	{	this.subject1=subject1;
	}
	public void setsubject2(String subject2)
	{	this.subject2=subject2;
	}
	public int getid()
	{	return id;
	}
	public String getname()
	{	return name;
	}
	public String getpassword()
	{	return password;
	}
	public long getphnumber()
	{	return phnumber;
	}
	public String getmailid()
	{	return mailid;
	}
	public String getsubject1()
	{	return subject1;
	}
	public String getsubject2()
	{	return subject2;
	}
}