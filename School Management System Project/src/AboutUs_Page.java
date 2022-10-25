import javax.swing.*;   
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*; 

public class AboutUs_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField email_Txt,pass_Txt;
	JLabel bgImage_label,title_Label,aboutUs_Label;
	JButton back_Btn1,student_Activity_Btn,academic_Council_Btn,administration_Btn,principal_Msg_Btn,min_Btn,close_Btn,back_Btn,back_To_Home_Btn;
	
	public AboutUs_Page() { 
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
        Font font4 = new Font("Arial",Font.BOLD+Font.ITALIC,20);
        Font font5 = new Font("Arial",Font.BOLD,25);
        Font font6 = new Font("Arial",Font.BOLD,12);
		
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

        aboutUs_Label = new JLabel("About Us",JLabel.CENTER);
        aboutUs_Label.setFont(font5);
        aboutUs_Label.setForeground(new Color(255,255,255));
        aboutUs_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\a.png"));
        aboutUs_Label.setBounds(0,5,500,40);//52,30,80,32
        
//        bgImage_label = new JLabel();//"About Us",JLabel.CENTER
////        bgImage_label.setBackground(new Color(135,206,250));
//        bgImage_label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\school.png"));
//        bgImage_label.setBounds(135,33,230,217);//52,30,80,32
//        input_Panel.add(bgImage_label);
        
        
        //..........................Administration Button..................................//
       
        administration_Btn = new JButton("Administration"); 
        administration_Btn.setBounds(150, 60, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        administration_Btn.setFont(font4);
        administration_Btn.setBorder(emptyBorder);
        //administration_Btn.setBackground(new Color(135,206,250));
        administration_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Administration_Page(); 
            }
        });
        
        //..........................Academic Council Button..................................//
        
        academic_Council_Btn = new JButton("Academic Council"); 
        academic_Council_Btn.setBounds(150, 110, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        academic_Council_Btn.setFont(font4);
        academic_Council_Btn.setBorder(emptyBorder);
        //Academic_Council_Btn.setBackground(new Color(135,206,250));
        academic_Council_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Academic_Council_Page();
            }
        });
        
        principal_Msg_Btn = new JButton("Principal's Message"); 
        principal_Msg_Btn.setBounds(150, 160, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        principal_Msg_Btn.setFont(font4);
        principal_Msg_Btn.setBorder(emptyBorder);
        //principal_Msg_Btn.setBackground(new Color(135,206,250));
        principal_Msg_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Principals_Message_Page(); 
            }
        });
        
        student_Activity_Btn = new JButton("Student's Activity"); 
        student_Activity_Btn.setBounds(150, 210, 200, 40);//335, 163, 110, 40//190, 163, 110, 40
        student_Activity_Btn.setFont(font4);
        student_Activity_Btn.setBorder(emptyBorder);
        //principal_Msg_Btn.setBackground(new Color(135,206,250));
        student_Activity_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Student_Activity_Page();
            }
        });
       
//        back_To_Home_Btn = new JButton("< Home"); 
//        back_To_Home_Btn.setBounds(420, 260, 50, 20);//335, 163, 110, 40//190, 163, 110, 40
//        back_To_Home_Btn.setFont(font6);
//        back_To_Home_Btn.setBorder(emptyBorder);
//        back_To_Home_Btn.setBackground(new Color(135,206,250)); 
//        back_To_Home_Btn.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Home_Page();
//            }
//        });
//        input_Panel.add(back_To_Home_Btn);
        
        //..........................Adding all JFrame Components........................//
        add(title_Panel);
        title_Panel.add(back_Btn);
        title_Panel.add(min_Btn);
        title_Panel.add(close_Btn);
        title_Panel.add(title_Label);
        
        add(input_Panel);
        input_Panel.add(administration_Btn);
        input_Panel.add(academic_Council_Btn); 
        input_Panel.add(student_Activity_Btn);
        input_Panel.add(principal_Msg_Btn);
        input_Panel.add(aboutUs_Label);
//        input_Panel.add(login_Label);
        
        
		setVisible(true);
	}

}


