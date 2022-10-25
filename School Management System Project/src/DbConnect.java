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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			st=con.createStatement();
		    }
		catch(Exception e) {  
			//TODO: handle exception
		}
	}
	
	
	
	
	//********************************************Register**************************************************//
	public void insertRegister(String insertQuery) {
//		System.out.println(insertQuery);
		
		try {
			st.executeUpdate(insertQuery); 
			
			JOptionPane.showMessageDialog(null, "Successful");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Not Successful");
		}
		
	}

	
	
	
	//****************************Student's Login*************************************************
	public void St_Login(String queryLogin, String email, String password) {
		try {
			rs = st.executeQuery(queryLogin);
			
			while(rs.next()) {
//				System.out.println(rs.getString(1)); //->ID
//				System.out.println(rs.getString(2)); //->Name
//				System.out.println(rs.getString(3)); //->Email
//				System.out.println(rs.getString(4)); //->Password
//				System.out.println(rs.getString(5)); //->Class
				
				String TEmail = rs.getString(3);
				String TPassword = rs.getString(4);
				
				if(email.equals(TEmail) && password.equals(TPassword)) {
					JOptionPane.showMessageDialog(null,"Valid");
					flag = 1;
					
					After_S_Login_Page SL1 = new After_S_Login_Page();
					SL1.dispose();
					new St_Result_Show1_Page();
					
					After_S_Login_Page SL2 = new After_S_Login_Page();
					SL2.dispose();
					new St_Result_Show1_Page();
					
					break;
				}
			}
			
			if(flag==0) {
				JOptionPane.showMessageDialog(null,"InValid");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	//****************************Teacher's Login*************************************************
	public void T_Login(String queryLogin, String email, String password) {
		try {
			rs = st.executeQuery(queryLogin);
			
			while(rs.next()) {
//				System.out.println(rs.getString(1)); //->ID
//				System.out.println(rs.getString(2)); //->Name
//				System.out.println(rs.getString(3)); //->Email
//				System.out.println(rs.getString(4)); //->Password
//				System.out.println(rs.getString(5)); //->Class
				
				String TEmail = rs.getString(3);
				String TPassword = rs.getString(4);
				
				if(email.equals(TEmail) && password.equals(TPassword)) {
					JOptionPane.showMessageDialog(null,"Valid");
					flag = 1;

					After_T_Login_Page TL1 = new After_T_Login_Page();
					TL1.dispose();
					new St_Result_Insert_Page();
					
					After_T_Login_Page TL2 = new After_T_Login_Page();
					TL2.dispose();
					new St_Result_Insert_Page();
					
					break;
				}
			}
			
			if(flag==0) {
				JOptionPane.showMessageDialog(null,"InValid");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	public void Fetch(String queryLogin, String id) {
		try {
			rs = st.executeQuery(queryLogin);
			
			while(rs.next()) {
//				System.out.println(rs.getString(1)); //->ID
//				System.out.println(rs.getString(2)); //->Name
//				System.out.println(rs.getString(3)); //->Email
//				System.out.println(rs.getString(4)); //->Password
//				System.out.println(rs.getString(5)); //->Class
				
				String TEmail = rs.getString(3);
				String TPassword = rs.getString(4);
				
				
				
				
				
//				if(email.equals(TEmail) && password.equals(TPassword)) {
//					JOptionPane.showMessageDialog(null,"Valid");
//					flag = 1;
//
//					Teacher_Login_1_Page TL1 = new Teacher_Login_1_Page();
//					TL1.dispose();
//					new St_Result_Insert_Page();
//					
//					Teacher_Login_2_Page TL2 = new Teacher_Login_2_Page();
//					TL2.dispose();
//					new St_Result_Insert_Page();
//					
//					break;
//				}
			}
			
			if(flag==0) {
				JOptionPane.showMessageDialog(null,"Not Found ANything");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

/*CREATE TABLE student_register(
    serial int(50) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    ID int(50),
    Name varchar(100),
    Email varchar(100),
    Password varchar(100)
);

CREATE TABLE teacher_register(
    serial int(50) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    ID int(50),
    Name varchar(100),
    Email varchar(100),
    Password varchar(100)
);*/

