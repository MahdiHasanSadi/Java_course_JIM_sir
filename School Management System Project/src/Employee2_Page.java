import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Employee2_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JLabel title_Label,email_Label,password_Label,login_Label,faculty_Label,employee3_Label1,employee3_Label,employee4_Label;
	JButton back_Btn1,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,employee3_Button,employee4_Button,previous_Btn;
	
	public Employee2_Page() {
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
        Font font3 = new Font("Arial",Font.BOLD,12);
        Font font4 = new Font("Arial",Font.BOLD + Font.ITALIC,12);
        Font font5 = new Font("Arial",Font.BOLD,35);
        Font font6 = new Font("Arial",Font.BOLD,23);
        Font font7 = new Font("Arial",Font.BOLD,18);
        Font font8 = new Font("Arial",Font.BOLD,15);
		
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
 			  new Employee1_Page();
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
        //input_Panel.JScrollPane("");
        add(input_Panel);
        
        //ImageIcon icon = new ImageIcon("D:\\\\10_1.png");
        //faculty_Label = new JLabel(icon,JLabel.CENTER);//"Login",JLabel.CENTER
        faculty_Label = new JLabel("Employee",JLabel.CENTER);
        faculty_Label.setFont(font5);
        faculty_Label.setForeground(new Color(255,255,255));
        faculty_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\e.png"));
        faculty_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(faculty_Label);
        
        employee3_Button = new JButton("Md Kabir Mia"); 
        employee3_Button.setBounds(165, 85, 180, 20);//335, 163, 110, 40//190, 163, 110, 40
        employee3_Button.setFont(font6);
        employee3_Button.setBorder(emptyBorder);
        employee3_Button.setBackground(new Color(135,206,250));
        employee3_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new E3();
            }
        });
        
        employee3_Label = new JLabel("Electrician",JLabel.CENTER);
        employee3_Label.setFont(font7);
        employee3_Label.setForeground(new Color(255,255,255));
        employee3_Label.setBounds(0,100,500,50);
        
        input_Panel.add(employee3_Label);
        input_Panel.add(employee3_Button);
        
        //*****************************************
        
        employee4_Button = new JButton("Md Akkas Ali"); 
        employee4_Button.setBounds(148, 175, 210, 20);//335, 163, 110, 40//190, 163, 110, 40
        employee4_Button.setFont(font6);
        employee4_Button.setBorder(emptyBorder);
        employee4_Button.setBackground(new Color(135,206,250));
        employee4_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new E4();
            }
        });
       
        employee4_Label = new JLabel("Cleaner",JLabel.CENTER);
        employee4_Label.setFont(font7);
        employee4_Label.setForeground(new Color(255,255,255));
        employee4_Label.setBounds(0,190,500,50);
        
        input_Panel.add(employee4_Label);
        input_Panel.add(employee4_Button);
        
        previous_Btn = new JButton("<PREVIOUS"); 
        previous_Btn.setBounds(5,255,125,25);//335, 163, 110, 40//190, 163, 110, 40
        previous_Btn.setFont(font4);
        previous_Btn.setBorder(emptyBorder);
        previous_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(previous_Btn);
        previous_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Employee1_Page();
            }
        });
        
		setVisible(true);
	}

}


