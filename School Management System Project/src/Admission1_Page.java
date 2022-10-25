import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Admission1_Page extends JFrame{
	JPanel title_Panel,input_Panel,input_Panel2,input_Panel3;
	JTextField school_Week_Txt,Curriculum4_Txt,Curriculum3_Txt,Curriculum1_Txt,Curriculum2_Txt,Academic_Session1_Txt,Academic_Session2_Txt;
	JLabel school_Week_Label,Curriculum_Label,Academic_Session_Label,principal8_Label,principal7_Label,principal6_Label,principal4_Label,principal5_Label,principal3_Label,title_Label,email_Label,password_Label,login_Label,Admission_Label,employee1_Label1,employee1_Label,employee2_Label,principal1_Label,principal2_Label;
	JButton back_Btn1,principal8_Button,principal7_Button,principal6_Button,principal4_Button,principal5_Button,principal3_Button,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,employee1_Button,employee2_Button,previous_Btn,principal1_Button,principal2_Button;
	
	public Admission1_Page() {
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
        Font font5 = new Font("Arial",Font.BOLD,25);
        Font font6 = new Font("Arial",Font.BOLD,20);
        Font font7 = new Font("Arial",Font.BOLD,13);
        Font font8 = new Font("Arial",Font.BOLD+Font.ITALIC,12);
		
        //********************************Panel1**********************************//
        title_Panel = new JPanel();
        title_Panel.setBounds(0, 0, 500, 100);
        title_Panel.setBackground(new Color(70,130,180));//51,153,255//0,255,255
        title_Panel.setLayout(null);
        add(title_Panel);
        
       ///..............................BACK BUTTON................................//
        
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
          	  dispose();
 			  new Admission2_Page();
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
        
        //.................................................................................................................
        Admission_Label = new JLabel("Admission",JLabel.CENTER);
        Admission_Label.setFont(font5);
        Admission_Label.setForeground(new Color(255,255,255));
        Admission_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        Admission_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(Admission_Label); 
        
        //...................................................................................................................
        Academic_Session_Label = new JLabel("⦿Academic Session:");
        Academic_Session_Label.setFont(font6);
        Academic_Session_Label.setForeground(new Color(255,255,255));
//        Academic_Session_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        Academic_Session_Label.setBounds(30,35,500,50);//52,30,80,32
        input_Panel.add(Academic_Session_Label);
        
        Academic_Session1_Txt = new JTextField("The Academic Session runs from January to December and is");
        Academic_Session1_Txt.setBounds(45,75,500,15);
        Academic_Session1_Txt.setFont(font7);
        Academic_Session1_Txt.setBorder(emptyBorder);
        Academic_Session1_Txt.setBackground(new Color(135,206,250));
        Academic_Session1_Txt.setEditable(false);
        input_Panel.add(Academic_Session1_Txt);
        
        Academic_Session2_Txt = new JTextField("divided into twoTerms. Each Term comprises of two quarters.");
        Academic_Session2_Txt.setBounds(45,90,500,15);
        Academic_Session2_Txt.setFont(font7);
        Academic_Session2_Txt.setBorder(emptyBorder);
        Academic_Session2_Txt.setBackground(new Color(135,206,250));
        Academic_Session2_Txt.setEditable(false);
        input_Panel.add(Academic_Session2_Txt);
        
        //..............................................................................................................................
        Curriculum_Label = new JLabel("⦿Curriculum: ");
        Curriculum_Label.setFont(font6);
        Curriculum_Label.setForeground(new Color(255,255,255));
//        Curriculum_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        Curriculum_Label.setBounds(30,95,500,50);//52,30,80,32
        input_Panel.add(Curriculum_Label);
        
        Curriculum1_Txt = new JTextField("The Curriculum at ABC School is based on Edexcel (Pearson,");
        Curriculum1_Txt.setBounds(45,135,500,15);
        Curriculum1_Txt.setFont(font7);
        Curriculum1_Txt.setBorder(emptyBorder);
        Curriculum1_Txt.setBackground(new Color(135,206,250));
        Curriculum1_Txt.setEditable(false);
        input_Panel.add(Curriculum1_Txt);
        
        Curriculum2_Txt = new JTextField("London) prescribed academic guidance.We also incorporate local ");
        Curriculum2_Txt.setBounds(45,150,500,15);
        Curriculum2_Txt.setFont(font7);
        Curriculum2_Txt.setBorder(emptyBorder);
        Curriculum2_Txt.setBackground(new Color(135,206,250));
        Curriculum2_Txt.setEditable(false);
        input_Panel.add(Curriculum2_Txt);
        
        Curriculum3_Txt = new JTextField("syllabus for informing students about our ways of life,socio");
        Curriculum3_Txt.setBounds(45,165,500,15);
        Curriculum3_Txt.setFont(font7);
        Curriculum3_Txt.setBorder(emptyBorder);
        Curriculum3_Txt.setBackground(new Color(135,206,250));
        Curriculum3_Txt.setEditable(false);
        input_Panel.add(Curriculum3_Txt);
        
        Curriculum4_Txt = new JTextField("economic and cultural patterns.");
        Curriculum4_Txt.setBounds(45,180,500,15);
        Curriculum4_Txt.setFont(font7);
        Curriculum4_Txt.setBorder(emptyBorder);
        Curriculum4_Txt.setBackground(new Color(135,206,250));
        Curriculum4_Txt.setEditable(false);
        input_Panel.add(Curriculum4_Txt);
        
        school_Week_Label = new JLabel("⦿School Week:");
        school_Week_Label.setFont(font6);
        school_Week_Label.setForeground(new Color(255,255,255));
//        school_Week_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        school_Week_Label.setBounds(30,185,500,50);//52,30,80,32
        input_Panel.add(school_Week_Label);
        
        school_Week_Txt = new JTextField("Our school week is from Sunday to Thursday.");
        school_Week_Txt.setBounds(45,225,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt);
        
        next_Btn = new JButton("NEXT>"); 
        next_Btn.setBounds(410,255,50,25);//335, 163, 110, 40//190, 163, 110, 40
        next_Btn.setFont(font8);
        next_Btn.setBorder(emptyBorder);
        next_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(next_Btn);
        next_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Admission2_Page(); 
            }
        });
        
//        next_Btn = new JButton("NEXT>"); 
//        next_Btn.setBounds(345,245,125,25);//335, 163, 110, 40//190, 163, 110, 40
//        next_Btn.setFont(font2);
//        //next_Btn.setBorder(emptyBorder);
//        //next_Btn.setBackground(new Color(135,206,250)); 
//        input_Panel.add(next_Btn);
//        next_Btn.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Admission2_Page();
//            }
//        });
        
		setVisible(true);
	}
}


