import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Administration_Page extends JFrame{
	JPanel title_Panel,input_Panel,input_Panel2,input_Panel3;
	JTextField email_Txt,pass_Txt;
	JLabel principal4_Label,principal5_Label,principal3_Label,title_Label,email_Label,password_Label,login_Label,faculty_Label,employee1_Label1,employee1_Label,employee2_Label,principal1_Label,principal2_Label;
	JButton back_Btn1,principal4_Button,principal5_Button,principal3_Button,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,employee1_Button,employee2_Button,previous_Btn,principal1_Button,principal2_Button;
	
	public Administration_Page() {
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
        Font font5 = new Font("Arial",Font.BOLD,35);
        Font font6 = new Font("Arial",Font.BOLD,15);
        Font font7 = new Font("Arial",Font.BOLD,18);
		
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
 			  new AboutUs_Page();
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
        
        faculty_Label = new JLabel("Administration",JLabel.CENTER);
        faculty_Label.setFont(font5);
        faculty_Label.setForeground(new Color(255,255,255));
        faculty_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        faculty_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(faculty_Label);
        
        //...................................................................................................................
        
        principal1_Button = new JButton("Md Abdul Kadir");
        principal1_Button.setFont(font7);
        principal1_Button.setBackground(new Color(135,206,250));
        //principal1_Button.setForeground(new Color(255,255,255));
        //principal1_Button.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal1_Button.setBorder(emptyBorder);
        principal1_Button.setBounds(182,70,136,25);//52,30,80,32
//        principal1_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new T1();
//            }
//        });
        input_Panel.add(principal1_Button);
        
        principal1_Label = new JLabel("Principal",JLabel.CENTER);
        principal1_Label.setFont(font6);
        //principal1_Label.setForeground(new Color(255,255,255));
        //principal1_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal1_Label.setBounds(0,80,500,50);//52,30,80,32
        input_Panel.add(principal1_Label);
        
        //....................................................................................................................
        
        principal2_Button = new JButton("Md Rumel Hossain");
        principal2_Button.setFont(font7);
        principal2_Button.setBackground(new Color(135,206,250));
        //principal2_Button.setForeground(new Color(255,255,255));
        //principal2_Button.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal2_Button.setBorder(emptyBorder);
        principal2_Button.setBounds(44,130,166,25);//52,30,80,32
        input_Panel.add(principal2_Button);
//        principal2_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new T1();
//            }
//        });
        
        
        principal2_Label = new JLabel("Vice Principal",JLabel.CENTER);
        principal2_Label.setFont(font6);
        //principal2_Label.setForeground(new Color(255,255,255));
        //principal2_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal2_Label.setBounds(73,140,104,50);//52,30,80,32
        input_Panel.add(principal2_Label);
        
        //....................................................................................................................
        
        principal3_Button = new JButton("Sakur Majid");
        principal3_Button.setFont(font7);
        principal3_Button.setBackground(new Color(135,206,250));
        //principal3_Button.setForeground(new Color(255,255,255));
        //principal3_Button.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal3_Button.setBorder(emptyBorder);
        principal3_Button.setBounds(323,130,102,25);//52,30,80,32
//        principal3_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new T1();
//            }
//        });
        input_Panel.add(principal3_Button);
        
        principal3_Label = new JLabel("Assistant Teacher");
        principal3_Label.setFont(font6);
        //principal3_Label.setForeground(new Color(255,255,255));
        //principal3_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal3_Label.setBounds(306,140,138,50);//52,30,80,32
        input_Panel.add(principal3_Label);
        
        //....................................................................................................................
        
        principal4_Button = new JButton("Sadikur Rahman");
        principal4_Button.setFont(font7);
        principal4_Button.setBackground(new Color(135,206,250));
        //principal4_Button.setForeground(new Color(255,255,255));
        //principal4_Button.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal4_Button.setBorder(emptyBorder);
        principal4_Button.setBounds(52,200,146,25);//52,30,80,32
//        principal5_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new T1();
//            }
//        });
        input_Panel.add(principal4_Button);
        
        principal4_Label = new JLabel("Assistant Teacher");
        principal4_Label.setFont(font6);
        //principal4_Label.setForeground(new Color(255,255,255));
        //principal4_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal4_Label.setBounds(56,210,138,50);//52,30,80,32
        input_Panel.add(principal4_Label);
        
        //.......................................................................................................................
        principal5_Button = new JButton("Fahima Begum");
        principal5_Button.setFont(font7);
        principal5_Button.setBackground(new Color(135,206,250));
        //principal5_Button.setForeground(new Color(255,255,255));
        //principal5_Button.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal5_Button.setBorder(emptyBorder);
        principal5_Button.setBounds(307,200,136,25);//52,30,80,32
//        principal5_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new T1();
//            }
//        });
        input_Panel.add(principal5_Button);
        
        principal5_Label = new JLabel("Librarian");
        principal5_Label.setFont(font6);
        //principal5_Label.setForeground(new Color(255,255,255));
        //principal5_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\120.png"));
        principal5_Label.setBounds(341,210,68,50);//52,30,80,32
        input_Panel.add(principal5_Label);
     
		setVisible(true);
	}
}


