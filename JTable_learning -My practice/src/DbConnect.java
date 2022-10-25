import java.sql.*;
import javax.swing.*;

public class DbConnect{
	private Connection con;
	private Statement st;
	
	ResultSet rs;
	int flag = 0;
	public DbConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admintest","root","");
			st=con.createStatement();
		    }
		catch(Exception e) {  
			//TODO: handle exception
		}
	}
}