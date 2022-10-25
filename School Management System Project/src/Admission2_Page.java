import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Admission2_Page extends JFrame{
	JPanel title_Panel,input_Panel,input_Panel2,input_Panel3;
	JTextField school_Week_Txt,Curriculum4_Txt,Curriculum3_Txt,Curriculum1_Txt,Curriculum2_Txt,Academic_Session1_Txt,Academic_Session2_Txt;
	JLabel school_Week_Label,Curriculum_Label,Academic_Session_Label,principal8_Label,principal7_Label,principal6_Label,principal4_Label,principal5_Label,principal3_Label,title_Label,email_Label,password_Label,login_Label,Admission_Label,employee1_Label1,employee1_Label,employee2_Label,principal1_Label,principal2_Label;
	JButton back_Btn1,principal8_Button,principal7_Button,principal6_Button,principal4_Button,principal5_Button,principal3_Button,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,employee1_Button,employee2_Button,previous_Btn,principal1_Button,principal2_Button;
	
	public Admission2_Page() {
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
        Font font5 = new Font("Arial",Font.BOLD,25);
        Font font6 = new Font("Arial",Font.BOLD,20);
        Font font7 = new Font("Arial",Font.BOLD,16);
		
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
 			  new Admission1_Page();
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
        
        //.................................................................................................................
        Admission_Label = new JLabel("Admission",JLabel.CENTER);
        Admission_Label.setFont(font5);
        Admission_Label.setForeground(new Color(255,255,255));
        Admission_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        Admission_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(Admission_Label);
        
        //...................................................................................................................
        school_Week_Label = new JLabel("⦿School Hours:");
        school_Week_Label.setFont(font6);
        school_Week_Label.setForeground(new Color(255,255,255));
//        school_Week_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\50.png"));
        school_Week_Label.setBounds(30,35,500,50);//52,30,80,32
        input_Panel.add(school_Week_Label);

        school_Week_Txt = new JTextField("Class I         ————     8:30am – 01:00pm");
        school_Week_Txt.setBounds(45,75,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt);
        
        school_Week_Txt = new JTextField("Class II        ————     8:30am – 01:10pm");
        school_Week_Txt.setBounds(45,100,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt); 
        
        school_Week_Txt = new JTextField("Class III       ————     8:30am – 01:40pm");
        school_Week_Txt.setBounds(45,125,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt);
        
        school_Week_Txt = new JTextField("Class IV       ————     8:30am – 02:20pm");
        school_Week_Txt.setBounds(45,150,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt);
        
        school_Week_Txt = new JTextField("Class V        ————     8:30am – 02:20 pm");
        school_Week_Txt.setBounds(45,175,500,15);
        school_Week_Txt.setFont(font7);
        school_Week_Txt.setBorder(emptyBorder);
        school_Week_Txt.setBackground(new Color(135,206,250));
        school_Week_Txt.setEditable(false);
        input_Panel.add(school_Week_Txt);
      
        previous_Btn = new JButton("<PREVIOUS"); 
        previous_Btn.setBounds(20,255,80,25);//335, 163, 110, 40//190, 163, 110, 40
        previous_Btn.setFont(font3);
        previous_Btn.setBorder(emptyBorder);
        previous_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(previous_Btn);
        previous_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
  				new Admission1_Page();
            }
        }); 
        
		setVisible(true);
	}
}


