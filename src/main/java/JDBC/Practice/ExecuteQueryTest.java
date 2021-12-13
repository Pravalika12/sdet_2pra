package JDBC.Practice;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;



public class ExecuteQueryTest {
@Test
public void executequerytest() throws SQLException
{
	 Driver dr=new Driver();
	 DriverManager.registerDriver(dr);
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
	 Statement stmt = con.createStatement();
	ResultSet result = stmt.executeQuery("select*from students_info");
	while(result.next())
	{
		System.out.println(result.getString(1)+""+result.getString(1));
	}
	con.close();
}
}
 