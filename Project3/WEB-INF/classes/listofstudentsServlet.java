package com.ITDepartment.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.ITDepartment.jdbc.ModelComponent;
public class listofstudentsServlet extends HttpServlet
{	public void Service(HttpServletRequest req,HttpServletResponse resp)throws ServeltException ,IOExpection
	{	List<Students> list=ModelComponent.Studentsinfo()
		String target=NULL;
		if(list.size()=0)
		{	target="Hodhome.jsp";
			req.setAttribute("MSG","No Students Information Available");
		}
		else
		{	targe"Studentsinfo.jsp";
			req.setAttribute("result",list);
		}
		RequestDispatcher rd=req.getRequestDispatcher(target);
		rd.forward(req,resp);
	}
}