import java.sql.*;

import javax.swing.JOptionPane;

public class DbConnect{
	private Connection con;
	private Statement st;
	
	ResultSet rs;
	int flag = 0;
	public DbConnect()
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
	
	public void InsertRegister(String insertQuery)
	{
		//System.out.println(insertQuery);
		try {
			st.executeUpdate(insertQuery);
			JOptionPane.showMessageDialog(null,"Successfully Registered");
		}
		catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Not Registered");
		}
	}
	
	public void Login(String querylogin,String email,String password)
	{
		try {
			rs = st.executeQuery(querylogin);
			while(rs.next())
				{
				String tableEmail = rs.getString(3);
				String tablePassword = rs.getString(5);
				
				if(email.equals(tableEmail) && password.equals(tablePassword)) {
					JOptionPane.showMessageDialog(null,"You are a valid user!!");
					flag = 1;
					
					Login_Form login_form = new Login_Form();
					login_form.dispose();
					new Home_Page();
					//dispose();
					//new HomePage();
					
					break;
				}
			}
			if(flag == 0)
			{
				JOptionPane.showMessageDialog(null,"You are not a valid user!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

