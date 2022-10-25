import java.sql.*;
import javax.swing.*;

public class Function{
	private Connection con;
	private Statement st;
	
	ResultSet rs;
	int flag = 0;
	public Function()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			st=con.createStatement();
		    }
		catch(Exception e) {  
			//TODO: handle exception
		}
	}
	public ResultSet find(String text) {
		// TODO Auto-generated method stub
		return null;
	}
}