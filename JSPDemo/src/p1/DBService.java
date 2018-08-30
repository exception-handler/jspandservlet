package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DBService {
	Connection con ;
	String password;
	PreparedStatement ps;
	 String s="";
	public DBService()
			throws SQLException,NamingException
	{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)
		ctx.lookup("java:comp/env/jdbc/myTestDBCP");	
		con = ds.getConnection();
		System.out.println(" ------>con "+con);
	}
	
	public void getEmployeeSalary()throws Exception
	{
		ps = con.prepareStatement("select salary from Employees where first_name='Steven'");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			int salary = rs.getInt("salary");
			System.out.println("\n\n\n ----->> salary :"+salary );
		}
		
	}
	public ResultSet getAllEmployee()throws Exception
	{
		System.out.println(" ------>. Inside getAllEmployees ");
		ps = con.prepareStatement("select * from Employees");
		ResultSet rs = ps.executeQuery();
		
		System.out.println("------>> Resturn from All Employees  "+rs);
		return rs;
	}
	
	
	
}
