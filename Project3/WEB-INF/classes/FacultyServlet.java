package com.ITDepartment.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.ITDepartment.jdbc.ModelComponent;
public class FacultyServlet  extends HttpServlet
{	public void Service(HttpServletRequest req,HttpServletResponse resp)throws ServeltException ,IOExpection
	{	String loginid=req.getParameter("lid");
		Stirng password=req.getParameter("password");
		int result=ModelComponent.Facultytlogin(loginid,password);
		String target=NULL;
		if(result!=0)
		{	target="Facultyhome.jsp";
		}
		else
		{	req.setAttribute("MSG","Invalid loginod or password");
			target="Facultylogin.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(target);
		rd.forward(req,resp);
	}
}