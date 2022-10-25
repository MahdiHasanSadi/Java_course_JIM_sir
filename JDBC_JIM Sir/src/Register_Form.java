import javax.swing.*;
import java.util.*;
import java.util.regex.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;

public class Register_Form extends JFrame{
	
	Register_Form()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(600,570);//600,580//600,520//600,570
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        //Image set in the title bar
        //Image icon = Toolkit.getDefaultToolkit().getImage("D:\\download.jpg");    
        //frame.setIconImage(icon); 
        
        frame.setLayout(null);
        
        //***************************Border****************************//
        Border emptyBorder = BorderFactory.createEmptyBorder();
       
        //***************************FONTS****************************//
        Font font0 = new Font("Arial",Font.BOLD,35);
        Font font1 = new Font("Arial",Font.BOLD,18);
        //Font font2 = new Font("Arial",Font.BOLD,30);
        Font font3 = new Font("Arial",Font.BOLD,30);
        Font font4 = new Font("Arial",Font.BOLD,15);
        
        //********************************Panel1**********************************//
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 600, 100);
        panel1.setBackground(new Color(70,130,180));
        panel1.setLayout(null);
        
        JLabel label1 = new JLabel("Registration");
        label1.setBounds(205,10,500,80);
        label1.setFont(font0);
        label1.setLayout(null);
        panel1.add(label1);
        frame.add(panel1);
        
        //..........................Minimize Button...........................//
        JButton minBtn = new JButton("-");
        minBtn.setBounds(525, 0, 45, 35);
        minBtn.setBackground(new Color(70,130,180));
        minBtn.setFont(font3);
        minBtn.setBorder(emptyBorder);
        panel1.add(minBtn);
        minBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.setExtendedState(JFrame.ICONIFIED);
            }
        });
        
        //..........................Close Button...........................//
        JButton closeBtn = new JButton("X");
        closeBtn.setBounds(555, 0, 45, 40);
        closeBtn.setBackground(new Color(70,130,180));
        closeBtn.setFont(font4);
        closeBtn.setBorder(emptyBorder);
        panel1.add(closeBtn);
        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        
        //************************************Panel2***************************//
        
        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0,100,600,500);
        inputPanel.setBackground(new Color(135,206,250));
        inputPanel.setLayout(null);
        frame.add(inputPanel);
        
        //.....................User Name..............................//
        
        JLabel userNameLabel = new JLabel("User Name:",JLabel.RIGHT);
        userNameLabel.setFont(font1);
        userNameLabel.setBounds(40,20,170,70);
		 
	    JTextField userNameTxt = new JTextField(25);
	    userNameTxt.setFont(font4);
	    userNameTxt.setBounds(230,42,320,30);
	    userNameTxt.setBorder(emptyBorder);
	    
		
	    inputPanel.add(userNameLabel);
	    inputPanel.add(userNameTxt);
        
        //.......................Email...............................//
        
        JLabel emailLabel = new JLabel("Email:",JLabel.RIGHT);
        emailLabel.setFont(font1);
        emailLabel.setBounds(40,80,170,70);
		 
	    JTextField emailTxt = new JTextField(25);
	    emailTxt.setFont(font4);
	    emailTxt.setBounds(230,102,320,30);
	    emailTxt.setBorder(emptyBorder);
        
	    inputPanel.add(emailLabel);
	    inputPanel.add(emailTxt);
        
        //........................Mobile............................//
        
        JLabel mobileLabel = new JLabel("Mobile:",JLabel.RIGHT);
        mobileLabel.setFont(font1);
        mobileLabel.setBounds(40,140,170,70);
		 
	    JTextField phnTxt = new JTextField(25);
	    //phnTxt.setText("Enter username: "); //->for watermark in textfield
	    phnTxt.setBounds(230,162,320,30);
	    phnTxt.setFont(font4);
	    phnTxt.setBorder(emptyBorder);
        
	    inputPanel.add(mobileLabel);
	    inputPanel.add(phnTxt);
        
        //........................Password.........................//
        
        JLabel passLabel = new JLabel("Password:",JLabel.RIGHT);
        passLabel.setFont(font1);
        passLabel.setBounds(40,200,170,70);
		 
	    JPasswordField passTxt = new JPasswordField(25);
	    passTxt.setFont(font4);
	    passTxt.setBounds(230,222,320,30);
	    passTxt.setBorder(emptyBorder);
        
	    inputPanel.add(passLabel);
	    inputPanel.add(passTxt);
        
        //....................Confirm Password......................//
        
        JLabel conPassLabel = new JLabel("Confirm Password:",JLabel.RIGHT);
        conPassLabel.setFont(font1);
        conPassLabel.setBounds(40,260,170,70);
        
	    JPasswordField conPassTxt = new JPasswordField(25);
	    conPassTxt.setFont(font4);
	    conPassTxt.setBounds(230,282,320,30);
	    conPassTxt.setBorder(emptyBorder);
        
	    inputPanel.add(conPassLabel);
	    inputPanel.add(conPassTxt);
        
        //.........................Address........................//
        
        JLabel addressLabel = new JLabel("Address:",JLabel.RIGHT);
        addressLabel.setFont(font1);
        addressLabel.setBounds(40,320,170,70);
		 
	    JTextField addressTxt = new JTextField(25);
	    addressTxt.setFont(font4);
	    addressTxt.setBounds(230,342,320,30);
	    addressTxt.setBorder(emptyBorder);
        
	    inputPanel.add(addressLabel);
	    inputPanel.add(addressTxt);
        
        //..........................Login Button..............................//
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(45, 400, 115, 40);//40, 400, 115, 40//40, 342, 115, 40
        loginBtn.setFont(font1);
        inputPanel.add(loginBtn);
        loginBtn.addActionListener(new ActionListener(){
 	       @Override
 	       public void actionPerformed(ActionEvent e)
 	       {
 	    	   frame.dispose();
 			   new Login_Form();
 	       }
 		});
        
        //..........................Register Button...........................//
        JButton regBtn = new JButton("Register");
        regBtn.setBounds(436,400,115,40);//430,400,115,40//430, 342, 115, 40
        regBtn.setFont(font1);
        inputPanel.add(regBtn);
        regBtn.addActionListener(new ActionListener(){
        	       @Override
        	       public void actionPerformed(ActionEvent e)
        	       {
        	    	   String userName = userNameTxt.getText();
        	    	   String email = emailTxt.getText();
        	    	   String phone = phnTxt.getText();
        	    	   String password = passTxt.getText();
        	    	   String confirmPassword = conPassTxt.getText();
        	    	   String address = addressTxt.getText();
        	    	   
        	    	   //*******************************Validation****************************//
        	    	   
        	    	   String userNameRegex = "^[a-zA-Z .]+$";            //^->anchor sign
        	    	   String emailRegex = "^[a-z0-9]+@[a-z]+.[a-z]+$";
        	    	   String phnRegex = "(\\88)?-?01[3-9]\\d{8}";
        	    	   String passWordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+-]).{6,20}";
        	    	   
        	    	   if(!Pattern.matches(userNameRegex, userName))
        	    	   {
            	    		   JOptionPane.showMessageDialog(null,"Invalid User Name");
        	    	   }
        	    	   
        	    	   else if(!Pattern.matches(emailRegex, email))
        	    	   {
            	    		   JOptionPane.showMessageDialog(null,"Invalid Email");
        	    	   }
        	    	   
        	    	   else if(!Pattern.matches(phnRegex, phone))
        	    	   {
        	    		   JOptionPane.showMessageDialog(null,"Invalid Mobile Number");
        	    	   }
        	    	   
        	    	   else if(!Pattern.matches(passWordRegex, password))
        	    	   {
        	    		   JOptionPane.showMessageDialog(null,"Invalid Password");
        	    	   }
        	    	   
        	    	   else if(!confirmPassword.equals(password))
        	    	   {
        	    		   JOptionPane.showMessageDialog(null,"Password don't match");
        	    	   }
        	    	   
        	    	   else if(address.equals(""))
        	    	   {
        	    		   JOptionPane.showMessageDialog(null,"Add Address");
        	    	   }
        	    	   
        	    	   else
        	    	   {
        	    		   String insertQuery = "INSERT INTO `student`(`Name`, `Email`,`Password`, `Mobile`, `Address`) VALUES ('"+userName+"','"+email+"','"+password+"','"+phone+"','"+address+"')";
            	    	   //String insertQuery = "UPDATE `registration` SET `Name`='"++userName++"',`Email`='"+email+"',`Password`='"+password+"',`Mobile`='"+phone+"',`Address`='"+address+"' WHERE 1";
        	    		   DbConnect db = new DbConnect();
            	    	   db.InsertRegister(insertQuery);
            	    	   
            	    	   //*******************Clearing Text Field*******************//
            	    	   userNameTxt.setText("");
            	    	   emailTxt.setText("");
            	    	   phnTxt.setText("");
            	    	   passTxt.setText("");
            	    	   conPassTxt.setText("");
            	    	   addressTxt.setText("");
        	    	   }
        	       }
        		});    
        
        frame.setVisible(true);
    }
}