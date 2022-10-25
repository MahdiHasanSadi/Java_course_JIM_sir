import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Register_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField email_Txt,pass_Txt;
	JLabel title_Label,email_Label,password_Label,login_Label,signIn_Label;
	JButton back_Btn1,teacherSignUp_Btn,studentSignUp_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,here_Btn;
	
	public Register_Page() {
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
        Font font1 = new Font("Arial",Font.BOLD,20);
        Font font2 = new Font("Arial",Font.BOLD,15);
        Font font3 = new Font("Arial",Font.BOLD,13);
        Font font4 = new Font("Arial",Font.ITALIC+Font.BOLD,20);
        Font font5 = new Font("Arial",Font.BOLD,30);
		
        //********************************Panel1**********************************//
        title_Panel = new JPanel();
        title_Panel.setBounds(0, 0, 500, 100);
        title_Panel.setBackground(new Color(70,130,180));//51,153,255//0,255,255
        title_Panel.setLayout(null);
        add(title_Panel);
        
//..............................BACK BUTTON................................//
        
        back_Btn = new JButton("<");
        back_Btn.setBounds(0, 0, 25,25);
        back_Btn.setBackground(new Color(70,130,180));
        back_Btn.setFont(font2);
        back_Btn.setBorder(emptyBorder);
        back_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          	  dispose();
 			  new Home_Page();
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
        min_Btn.setFont(font1);
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
        add(input_Panel);
       
        signIn_Label = new JLabel("SignUp",JLabel.CENTER);
        signIn_Label.setFont(font5);
        signIn_Label.setForeground(new Color(255,255,255));
        signIn_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\r.png"));
        signIn_Label.setBounds(0,30,500,40);//52,30,80,32
        input_Panel.add(signIn_Label);
        
        //..........................Teacher's SignUp Button..................................//
       
        teacherSignUp_Btn = new JButton("Teacher's SignUp"); 
        teacherSignUp_Btn.setBounds(150, 110, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        teacherSignUp_Btn.setFont(font4);
        teacherSignUp_Btn.setBorder(emptyBorder);
        //teacherSignUp_Btn.setBackground(new Color(135,206,250));
        teacherSignUp_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Teacher_Register_2_Page();
            }
        });
        input_Panel.add(teacherSignUp_Btn);
        
        //..........................Student's SignUp Button..................................//
        
        studentSignUp_Btn = new JButton("Student's SignUp"); 
        studentSignUp_Btn.setBounds(150, 180, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        studentSignUp_Btn.setFont(font4);
        studentSignUp_Btn.setBorder(emptyBorder);
        //studentLogin_Btn.setBackground(new Color(135,206,250));
        studentSignUp_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Student_Register_2_Page();
            }
        });
        input_Panel.add(studentSignUp_Btn);
        
        //..........................Here Button..................................//
        
        login_Label = new JLabel("Already Have an Account?Click",JLabel.CENTER);
        login_Label.setBounds(122, 250, 205, 30);
        login_Label.setFont(font3); 
        input_Panel.add(login_Label);
        
        here_Btn = new JButton("Here"); 
        here_Btn.setBounds(322, 253, 48, 20);//335, 163, 110, 40//190, 163, 110, 40
        here_Btn.setFont(font4);
        here_Btn.setBorder(emptyBorder);
        here_Btn.setBackground(new Color(135,206,250));
        here_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Login_Page();
            }
        });
        input_Panel.add(here_Btn);
        
		setVisible(true);
	}

}


