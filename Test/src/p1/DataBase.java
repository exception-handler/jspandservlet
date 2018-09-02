package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataBase {
	Connection con;
	PreparedStatement ps;

	public DataBase() throws SQLException, NamingException {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
		con = ds.getConnection();
		System.out.println("database");
		
	}
		public ResultSet databaseMethod()throws Exception
		{
			ps = con.prepareStatement("select distinct skill from skills");
			ResultSet rs = ps.executeQuery();
			return rs;
		}
		
		public ResultSet databaseMethod1(String skill) throws SQLException{
			
			ps = con.prepareStatement("select distinct username from skills where skill=?");
			ps.setString(1, skill);
			ResultSet rs = ps.executeQuery();
			return rs;
		}
		
		public boolean insertUser(User u)throws Exception
		{
			boolean isInserted = false;
			
			ps = con.prepareStatement("insert into JOB_APPLICATION values(?,?,?,?)");
			ps.setString(1,u.getUsername());
			ps.setInt(2,u.getExperience());
			ps.setInt(3,u.getCurrentsalary());
			ps.setInt(4, u.getExpectedsalary());
			int x = ps.executeUpdate();
			if(x>0)isInserted = true;
			return isInserted;
		}
		
		public boolean insertUser1(User u)throws Exception
		{
			boolean isInserted = false;
			
			ps = con.prepareStatement("insert into skills values(?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2,u.getSkill());
			int x = ps.executeUpdate();
			if(x>0)isInserted = true;
			return isInserted;
		}
}

