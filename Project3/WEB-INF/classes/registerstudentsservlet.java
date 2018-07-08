import java.io.*;
import com.ITDepartment.jdbc.ModelComponent;
import com.ITDepartment.javaclasses.Students;
public class registerfacultyservlet extends HttpServlet  
{
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		ModelComponent modelcomponent=new ModelComponent();
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String fid=req.getParameter("fid");
		String pw=req.getParameter("password");
		String s1=req.getParameter("subject1");
		long ph1=Long.parseLong(ph);
		Faculty f=new Faculty(fn,ph1,em,id,,pw,s1,s2);
		int x =modelcomponent.registerfaculty(f);
		HttpSession session=req.getSession();
		String result="";
		if(x==1)
		{
			session.setAttribute("UN",un);
			result="Facultyinfo.jsp";
		}
		else
		{
			String msg="Registration Failed Try Again!!!";
			req.setAttribute("MSG",msg);
			result="register.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,resp);

	}
}