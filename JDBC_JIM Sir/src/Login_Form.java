import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Login_Form extends JFrame{
    public Login_Form()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(500,335);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        //Image Add In the Title Bar
        //Icon icon = new ImageIcon("subscribe.png");
        //frame.setIconImage(icon);
        
        frame.setLayout(null);
        
        //*********************************Border********************************// 
        Border emptyBorder = BorderFactory.createEmptyBorder();
        
        //**********************************Font*********************************//
       
        Font font0 = new Font("Arial",Font.BOLD,35);
        Font font1 = new Font("Arial",Font.BOLD,18);
        Font font2 = new Font("Arial",Font.BOLD,30);
        Font font3 = new Font("Arial",Font.BOLD,15);
        Font font4 = new Font("Arial",Font.BOLD,15);
        
        //*********************************Panel1**********************************//
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 100);
        panel1.setBackground(new Color(70,130,180));//new Color(70,130,180)//
        panel1.setLayout(null);
        
        JLabel label = new JLabel("Login");
        label.setBounds(200,10,500,80);
        label.setFont(font0);
        label.setLayout(null);
        panel1.add(label);
        frame.add(panel1);
        
        //**********************************BACK BUTTON**********************************//
      
        JButton btnBack = new JButton("<");
        btnBack.setBounds(0, 0, 45, 45);
        btnBack.setBackground(new Color(70,130,180));
        btnBack.setFont(font4);
        btnBack.setBorder(emptyBorder);
        panel1.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          	  frame.dispose();
 			  new Register_Form();
           }
        });
      
        //**********************************MINIMIZE BUTTON**********************************//
      
        JButton btnMin = new JButton("-");
        btnMin.setBounds(425, 0, 45, 40);
        btnMin.setBackground(new Color(70,130,180));
        btnMin.setFont(font2);
        btnMin.setBorder(emptyBorder);
        panel1.add(btnMin);
        btnMin.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
          	    frame.setExtendedState(JFrame.ICONIFIED);  //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);-> for maximize
           }
        }); 
        
        //**********************************CLOSE BUTTON**********************************//
       
        JButton btnClose = new JButton("X");
        btnClose.setBounds(455, 0, 45, 45);
        btnClose.setBackground(new Color(70,130,180));
        btnClose.setFont(font3);
        btnClose.setBorder(emptyBorder);
        panel1.add(btnClose);
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        
        //*********************************Panel2**********************************//
        
        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0,100,500,520);
        inputPanel.setBackground(new Color(135,206,250));
        inputPanel.setLayout(null);
        frame.add(inputPanel);
        
        //.........................Email..............................//
        
        JLabel emailLabel = new JLabel("Email: ",JLabel.RIGHT);
        emailLabel.setFont(font1);
        emailLabel.setBounds(40,20,110,70);
		 
	    JTextField emailTxt = new JTextField(25);
	    emailTxt.setFont(font4);
	    emailTxt.setBounds(165,40,280,30);
	    emailTxt.setBorder(emptyBorder);
        
	    inputPanel.add(emailLabel);
	    inputPanel.add(emailTxt);
        
        //.......................Password............................//
        
        JLabel passwordLabel = new JLabel("Password: ",JLabel.RIGHT);
        passwordLabel.setFont(font1);
        passwordLabel.setBounds(40,80,110,70);
        
	    JPasswordField passTxt = new JPasswordField(25);
	    passTxt.setFont(font4);
	    passTxt.setBounds(165,103,280,30);
	    passTxt.setBorder(emptyBorder);
        
	    inputPanel.add(passwordLabel);
	    inputPanel.add(passTxt);
                
        //..........................Register Button..............................//
        
        JButton regBtn = new JButton("Register");
        regBtn.setBounds(53, 163, 110, 40);
        regBtn.setFont(font1);
        inputPanel.add(regBtn);
        regBtn.addActionListener(new ActionListener(){
 	       @Override
 	       public void actionPerformed(ActionEvent e)
 	       {
 	    	   frame.dispose();
 			   new Register_Form();
 	       }
 		});
        
        //**********************************Log in Button********************************//
        
        JButton logBtn = new JButton("Login"); 
        logBtn.setBounds(335, 163, 110, 40);//335, 163, 110, 40//190, 163, 110, 40
        logBtn.setFont(font1);
        inputPanel.add(logBtn);
        logBtn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
               String email = emailTxt.getText();
               String password = passTxt.getText();
               
               DbConnect db = new DbConnect();
               String querylogin = "Select * FROM `student`";
               //UPDATE `registration` SET `Name`='"++"',`Email`='"++"',`Password`='"++"',`Mobile`='"++"',`Address`='"++"' WHERE 1
               db.Login(querylogin,email,password);
               
               //*******************Clearing Text Field*******************//
	    	   emailTxt.setText("");
	    	   passTxt.setText("");
	    	   
				frame.dispose();
				new Home_Page();
            }
        });

        
        
        frame.setVisible(true);
    }
}