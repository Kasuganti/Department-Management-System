
import java.sql.*;
import javax.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.ITDepartment.java.Faculty;
import com.ITDepartment.java.Studentlist;
import com.ITDepartment.java.Teaching;
public class ModelComponent 
{	public static int Studentlogin(String lid, String password)throws SQLException, ClassNotFoundException
	{	int x=0;
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
		String sqlQuery="select * from students where rollno=? and password=?";
		PreparedStatement ps=con.prepareStatement(sqlQuery);
		ps.setString(1,lid);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{	x=rs.getInt(1);
		}
		con.close();
		return x;
	}
	public static int Facultylogin(String lid, String password)throws SQLException,ClassNotFoundException
	{	int x=0;
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
		String sqlQuery="select * from faculty where id=? and password=?";
		PreparedStatement ps=con.prepareStatement(sqlQuery);
		ps.setString(1,lid);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{	x=rs.getInt(1);
		}
		con.close();
		return x;
	}
	public static List<Faculty> Facultyinfo()throws SQLException, ClassNotFoundException
	{	List<Faculty> list=new ArrayList<Faculty>();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
		String sqlQuery="select * from faculty";
		PreparedStatement ps=con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{	int id=rs.getInt(1);
			String name=rs.getString(2);
			long phnumber=rs.getLong(3);
			String mailid=rs.getString(4);
			String subject1=rs.getString(5);
			String subject2=rs.getString(6);
			Faculty f=new Faculty();
			f.setid(id);
			f.setname(name);
			f.setphnumber(phnumber);
			f.setmailid(mailid);
			f.setsubject1(subject1);
			f.setsubject2(subject2);
			list.add(f);
		}
		return list;
	}
	public static List<Studentlist> Studentsinfo()throws SQLException,ClassNotFoundException
	{	List<Studentlist> list=new ArrayList<Studentlist>();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
		String sqlQuery="select * from students";
		PreparedStatement ps=con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{	int rollno=rs.getInt(1);
			String name=rs.getString(2);
			long phnumber=rs.getLong(3);
			String mailid=rs.getString(4);
			int yearofstudy=rs.getInt(5);
			Studentlist s=new Studentlist();
			s.setrollno(rollno);
			s.setname(name);
			s.setphnumber(phnumber);
			s.setmailid(mailid);
			s.setyearofstudy(yearofstudy);
			list.add(s);
		}
		return list;
	}
	public int registerfaculty(Faculty f )throws SQLException,ClassNotFoundException
	{
		int x=0;
		PreparedStatement ps=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
			String sql="insert into durgausers values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,f.getname());
			ps.setLong(2,f.getphnumber());
			ps.setString(3,f.getmailid());
			ps.setInt(4,f.getid());
			ps.setString(5,f.getpassword());
			ps.setString(6,f.getsubject1());
			ps.setString(5,f.getsubject2());
			x=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return x;
	}
	public static List<Teaching> teachings()throws SQLException,ClassNotFoundException
	{	List<Teaching> list=new ArrayList<Teaching>();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","<user>","<password>");
		String sqlQuery="select * from teaching";
		PreparedStatement ps=con.prepareStatement(sqlQuery);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{	String name=rs.getString(1);
			int year=rs.getInt(2);
			String subject=rs.getString(3);
			Teaching t=new Teaching();
			t.setname(name);
			t.setyear(year);
			t.setsubject(subject);
			list.add(t);
		}
		return list;
	}
	
}