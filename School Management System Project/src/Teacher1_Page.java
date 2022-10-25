import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Teacher1_Page extends JFrame{
	JPanel title_Panel,input_Panel,input_Panel2,input_Panel3;
	JTextField email_Txt,pass_Txt;
	JLabel title_Label,email_Label,password_Label,login_Label,faculty_Label,principal_Label1,principal_Label,assistant_Principal_Label;
	JButton back_Btn1,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,principal_Button,assistant_Principal_Button;
	
	public Teacher1_Page() {
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
        Font font3 = new Font("Arial",Font.BOLD+Font.ITALIC,12);
        Font font4 = new Font("Arial",Font.BOLD,15);
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
 			  new Staff_Page();
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
          	  dispose();
 			  new Teacher2_Page();
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
        faculty_Label = new JLabel("Teacher",JLabel.CENTER);
        faculty_Label.setFont(font5);
        faculty_Label.setForeground(new Color(255,255,255));
        faculty_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\\src\\Photos\\t.png"));
        faculty_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(faculty_Label);
        
        principal_Button = new JButton("Md Abdul Matin"); 
        principal_Button.setBounds(165, 85, 180, 20);//335, 163, 110, 40//190, 163, 110, 40
        principal_Button.setFont(font6);
        principal_Button.setBorder(emptyBorder);
        principal_Button.setBackground(new Color(135,206,250));
        principal_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new T1();
            }
        });
        
        principal_Label = new JLabel("Principal",JLabel.CENTER);
        principal_Label.setFont(font7);
        principal_Label.setForeground(new Color(255,255,255));
        principal_Label.setBounds(0,100,500,50);
        
        input_Panel.add(principal_Label);
        input_Panel.add(principal_Button);
        
        //*****************************************
        
        assistant_Principal_Button = new JButton("Md Rumel Hossain"); 
        assistant_Principal_Button.setBounds(148, 175, 210, 20);//335, 163, 110, 40//190, 163, 110, 40
        assistant_Principal_Button.setFont(font6);
        assistant_Principal_Button.setBorder(emptyBorder);
        assistant_Principal_Button.setBackground(new Color(135,206,250));
        assistant_Principal_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new T2();
            }
        });
       
        assistant_Principal_Label = new JLabel("Vice Principal",JLabel.CENTER);
        assistant_Principal_Label.setFont(font7);
        assistant_Principal_Label.setForeground(new Color(255,255,255));
        assistant_Principal_Label.setBounds(0,190,500,50);
        
        input_Panel.add(assistant_Principal_Label);
        input_Panel.add(assistant_Principal_Button);
        
        next_Btn = new JButton("NEXT>"); 
        next_Btn.setBounds(425,255,50,25);//335, 163, 110, 40//190, 163, 110, 40
        next_Btn.setFont(font3);
        next_Btn.setBorder(emptyBorder);
        next_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(next_Btn);
        next_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Teacher2_Page();
            }
        });
        
		setVisible(true);
	}

}


