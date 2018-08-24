import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.*;
import org.apache.catalina.connector.Connector;

public class JDBC {

public void jdbcCode(User user)
{
	Connection con=utility.Connector.connection();
	String query = "insert into jdbc values(?,?,?,?,?)";
	try {

		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1,user.getEmailId() );
		stmt.setString(2, user.getName());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getGender());
		stmt.setInt(5, user.getAge());
		int i = stmt.executeUpdate();
		System.out.println(i + " records inserted");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
