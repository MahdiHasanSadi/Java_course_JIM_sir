import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Student_Activity_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	//JTextField email_Txt,pass_Txt;
	JLabel title_Label,activity_Label,computer_club_Label,debating_club_Label,bncc_Label,scout_Label,social_club_Label;
	JButton back_Btn1,min_Btn,close_Btn,back_Btn,here_Btn,computer_club_Button,debating_club_Button,bncc_Button,scout_Button,social_club_Button;
	
	public Student_Activity_Page() {
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
        Font font4 = new Font("Arial",Font.BOLD,22);
        Font font5 = new Font("Arial",Font.BOLD,18);
        Font font6 = new Font("Arial",Font.BOLD,30);
        Font font7 = new Font("Arial",Font.BOLD+Font.ITALIC,15);

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
        add(input_Panel);
       
        activity_Label = new JLabel("Student Activity",JLabel.CENTER);
        activity_Label.setFont(font6);
        activity_Label.setForeground(new Color(255,255,255));
        activity_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\110.png"));
        activity_Label.setBounds(0,20,500,40);//52,30,80,32
        input_Panel.add(activity_Label);
        
        //............................................................................
        
        computer_club_Label = new JLabel("► ABC School Computer Club");
        computer_club_Label.setFont(font5);
        //computer_club_Label.setForeground(new Color(255,255,255));
        computer_club_Label.setBounds(40,80,500,25);//52,30,80,32
        input_Panel.add(computer_club_Label);
        
        computer_club_Button = new JButton("Click");
        computer_club_Button.setFont(font7);
        //computer_club_Button.setForeground(new Color(255,255,255));
        computer_club_Button.setBounds(380,80,75,25);//52,30,80,32
        computer_club_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Computer_Club_Page();
            }
        });
        input_Panel.add(computer_club_Button);
        
        //............................................................................
        
        debating_club_Label = new JLabel("► ABC School Debating Club");
        debating_club_Label.setFont(font5);
        //debating_club_Label.setForeground(new Color(255,255,255));
        debating_club_Label.setBounds(40,120,500,25);//52,30,80,32
        input_Panel.add(debating_club_Label);
        
        debating_club_Button = new JButton("Click");
        debating_club_Button.setFont(font7);
        //debating_club_Button.setForeground(new Color(255,255,255));
        debating_club_Button.setBounds(380,120,75,25);//52,30,80,32
        debating_club_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Debate_Club1_Page();
            }
        });
        input_Panel.add(debating_club_Button);
        
        //.................................................................
        
        social_club_Label = new JLabel("► ABC School Social Services Club");
        social_club_Label.setFont(font5);
        //social_club_Label.setForeground(new Color(255,255,255));
        social_club_Label.setBounds(40,160,500,25);//52,30,80,32
        input_Panel.add(social_club_Label);
        
        social_club_Button = new JButton("Click");
        social_club_Button.setFont(font7);
        //social_club_Button.setForeground(new Color(255,255,255));
        social_club_Button.setBounds(380,160,75,25);//52,30,80,32
        social_club_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Social_Service_Club1_Page();
            }
        });
        input_Panel.add(social_club_Button);
        
        //...........................................................................
        
        bncc_Label = new JLabel("► BNCC ABC School Platoon");
        bncc_Label.setFont(font5);
        //bncc_Label.setForeground(new Color(255,255,255));
        bncc_Label.setBounds(40,200,500,25);//52,30,80,32
        input_Panel.add(bncc_Label);
        
        bncc_Button = new JButton("Click");
        bncc_Button.setFont(font7);
        //bncc_Button.setForeground(new Color(255,255,255));
        bncc_Button.setBounds(380,200,75,25);//52,30,80,32
        bncc_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new BNCC_Page();
            }
        });
        input_Panel.add(bncc_Button);
        
        //............................................................................
        
        scout_Label = new JLabel("► SCOUT ABC School Platoon");
        scout_Label.setFont(font5);
        //scout_Label.setForeground(new Color(255,255,255));
        scout_Label.setBounds(40,240,500,25);//52,30,80,32
        input_Panel.add(scout_Label);
        
        scout_Button = new JButton("Click");
        scout_Button.setFont(font7);
        //scout_Button.setForeground(new Color(255,255,255));
        scout_Button.setBounds(380,240,75,25);//52,30,80,32
        scout_Button.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Scout_Page();
            }
        });
        input_Panel.add(scout_Button);

		setVisible(true);
	}

}


