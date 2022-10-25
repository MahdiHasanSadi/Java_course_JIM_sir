import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Student_Login_2_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField email_Txt,pass_Txt;
	JLabel title_Label,email_Label,password_Label,login_Label,signIn_Label;
	JButton login_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,back_Btn1;
	
	public Student_Login_2_Page() {
		setSize(500,400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		
		//***************************Border****************************//
        Border emptyBorder = BorderFactory.createEmptyBorder();
       
        //***************************FONTS****************************//
        Font font0 = new Font("Arial",Font.BOLD,35);
        Font font1 = new Font("Arial",Font.BOLD,18); 
        Font font2 = new Font("Arial",Font.BOLD,15); 
        Font font3 = new Font("Arial",Font.BOLD,20);
        Font font4 = new Font("Arial",Font.BOLD,15);
        Font font5 = new Font("Arial",Font.BOLD,13); 
        Font font6 = new Font("Arial",Font.ITALIC+Font.BOLD,22);
        Font font7 = new Font("Arial",Font.BOLD,20);
        Font font8 = new Font("Arial",Font.BOLD,30);
        Font font9 = new Font("Arial",Font.ITALIC+Font.BOLD,20);//237, 227, 48, 20
        
        //********************************Panel1**********************************//
        title_Panel = new JPanel();
        title_Panel.setBounds(0, 0, 500, 100);
        title_Panel.setBackground(new Color(70,130,180));//51,153,255//0,255,255
        title_Panel.setLayout(null);
        
//..............................BACK BUTTON................................//
        
        back_Btn = new JButton("<");
        back_Btn.setBounds(0, 0, 25,25);
        back_Btn.setBackground(new Color(70,130,180));
        back_Btn.setFont(font2);
        back_Btn.setBorder(emptyBorder);
        back_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          	  dispose();
 			  new Register_Page();
           }
        });
        title_Panel.add(back_Btn);
        
        //..............................BACK BUTTON................................//
        
        back_Btn1 = new JButton(">");
        back_Btn1.setBounds(25, 0,25,25);
        back_Btn1.setBackground(new Color(70,130,180));
        back_Btn1.setFont(font2);
//        back_Btn1.setHorizontalAlignment(SwingConstants.LEFT);
        back_Btn1.setBorder(emptyBorder);
        back_Btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//          	  dispose();
// 			  new Admission2_Page();
           }
        });
        title_Panel.add(back_Btn1);
        
        //..........................Minimize Button...........................//
        min_Btn = new JButton("-");
        min_Btn.setBounds(450, 0, 25, 25);
        min_Btn.setBackground(new Color(70,130,180));
        min_Btn.setFont(font3);
        min_Btn.setBorder(emptyBorder);
        min_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setExtendedState(JFrame.ICONIFIED);
            }
        });
        title_Panel.add(min_Btn);
        
        //..........................Close Button...........................//
        close_Btn = new JButton("X");
        close_Btn.setBounds(475, 0, 25, 25);
        close_Btn.setBackground(new Color(70,130,180));
        close_Btn.setFont(font2);
        close_Btn.setBorder(emptyBorder);
        close_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        title_Panel.add(close_Btn);
        
        //.........................Title Bar Label................................//
        title_Label = new JLabel("ABC SCHOOL",JLabel.CENTER);
        title_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\00.png"));
        title_Label.setBounds(0,10,500,80);//140,10,500,80
        //title_Label.setBackground(new Color(70,130,180));
        title_Label.setFont(font0);
        title_Label.setLayout(null);
        title_Panel.add(title_Label);
        
        //*********************************Panel2**********************************//
        
        input_Panel = new JPanel();
        input_Panel.setBounds(0,100,500,300);
        input_Panel.setBackground(new Color(135,206,250));
        input_Panel.setLayout(null);
        
        //*****************************Image**************************************//
        signIn_Label = new JLabel("Login",JLabel.CENTER);
        signIn_Label.setFont(font8);
        signIn_Label.setForeground(new Color(255,255,255));
        signIn_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\s.png"));
        signIn_Label.setBounds(0,25,500,32);//52,30,80,32
        
        //.........................Email..............................//
        
        email_Label = new JLabel("Email: ",JLabel.RIGHT);
        email_Label.setFont(font1);
        email_Label.setForeground(new Color(255,255,255));
        email_Label.setBounds(40,70,110,70);
		 
	    email_Txt = new JTextField(50);
	    email_Txt.setFont(font4);
	    email_Txt.setBounds(165,95,280,25);
	    email_Txt.setBorder(emptyBorder);
        
        //.......................Password............................//    
        password_Label = new JLabel("Password: ",JLabel.RIGHT);
        password_Label.setFont(font1);
        password_Label.setForeground(new Color(255,255,255));
        password_Label.setBounds(40,130,110,70);//40,130,110,70
        
	    pass_Txt = new JPasswordField(50);
	    pass_Txt.setFont(font4); 
	    pass_Txt.setBounds(165,155,280,25);//165,150,280,30
	    pass_Txt.setBorder(emptyBorder);
	    
        //..........................Here Button..................................//
        
        login_Label = new JLabel("Don't Have an Account?Click",JLabel.LEFT);
        login_Label.setBounds(52, 225, 200, 30);
        login_Label.setFont(font5);
        
        login_Btn = new JButton("Here"); 
        login_Btn.setBounds(237, 227, 48, 20);//335, 163, 110, 40//190, 163, 110, 40
        login_Btn.setFont(font9);
        login_Btn.setBorder(emptyBorder);
        login_Btn.setBackground(new Color(135,206,250));
        login_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Student_Register_2_Page();
            }
        });
        
        //..........................Login Button..............................//
        reg_Btn = new JButton("Login");
        reg_Btn.setBounds(355,225,90,30);//53,163,110,40//345, 180, 98, 30//335, 163, 110, 40
        reg_Btn.setFont(font7);
        reg_Btn.setBorder(emptyBorder);
        reg_Btn.addActionListener(new ActionListener(){
 	       @Override
 	       public void actionPerformed(ActionEvent e)
 	       {
 	    	  String Email = email_Txt.getText();
 	    	  String Password = pass_Txt.getText(); 
 	    	  
 	    	  DbConnect db = new DbConnect();
 	    	  String queryLogin = "SELECT * FROM `student_register`";
 	    	  db.St_Login(queryLogin,Email,Password);
	    	   
 	    	  email_Txt.setText("");
	    	  pass_Txt.setText("");
 	       }
 		});
         
        //..........................Adding all JFrame Components........................//
        add(title_Panel);
        title_Panel.add(title_Label);
        
        add(input_Panel);
        input_Panel.add(signIn_Label);
        input_Panel.add(email_Label);
	    input_Panel.add(email_Txt);
	    input_Panel.add(password_Label);
	    input_Panel.add(pass_Txt);
	    input_Panel.add(reg_Btn);
        input_Panel.add(login_Btn);
        input_Panel.add(login_Label);
        
		setVisible(true);
	}
	
}
