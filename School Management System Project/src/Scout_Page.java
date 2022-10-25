import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Scout_Page extends JFrame{
	JPanel title_Panel,input_Panel,input_Panel2,input_Panel3;
	JTextField email_Txt,pass_Txt;
	JLabel Science_Lab_Label1,title_Label,email_Label,password_Label,login_Label,Science_Lab_Label,employee1_Label1,employee1_Label,employee2_Label;
	JButton back_Btn1,teacherLogin_Btn,studentLogin_Btn,reg_Btn,min_Btn,close_Btn,back_Btn,next_Btn,employee1_Button,employee2_Button,previous_Btn;
	
	public Scout_Page() {
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
        Font font3 = new Font("Arial",Font.BOLD,14);
        Font font4 = new Font("Arial",Font.BOLD+Font.ITALIC,12);
        Font font5 = new Font("Arial",Font.BOLD,30);
        Font font6 = new Font("Arial",Font.BOLD,25);
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
 			  new Student_Activity_Page();
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

        Science_Lab_Label1 = new JLabel("SCOUT",JLabel.CENTER); 
        Science_Lab_Label1.setFont(font5);
        Science_Lab_Label1.setForeground(new Color(255,255,255));
        Science_Lab_Label1.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\scout.png"));
        Science_Lab_Label1.setBounds(0,10,500,35);//52,30,80,32
        //Science_Lab_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\2.png"));
        input_Panel.add(Science_Lab_Label1);
        
        JTextArea txt = new JTextArea("Scout of ABC School was established in 2004.There is a platoons\n"
                                    + "of Scout at present.\n"
                                    + "\r\n"
                                    + "ABC School Platoon includes the students of Class IV and V.\n"
                                    + "\r\n"
                                    + "An Assistant teacher has been assigned with the duty of Scout.\n");
        txt.setBounds(28,50,442,220);
        txt.setBackground(null);
        txt.setFont(font3);
        txt.setVisible(true);
        input_Panel.add(txt);
        
        
        previous_Btn = new JButton("<PREVIOUS"); 
        previous_Btn.setBounds(20,263,80,25);//335, 163, 110, 40//190, 163, 110, 40
        previous_Btn.setFont(font4);
        previous_Btn.setBorder(emptyBorder);
        previous_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(previous_Btn);
        previous_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
  				new Student_Activity_Page();
            }
        });
          
//        next_Btn = new JButton("NEXT>"); 
//        next_Btn.setBounds(425,255,50,25);//335, 163, 110, 40//190, 163, 110, 40
//        next_Btn.setFont(font4);
//        next_Btn.setBorder(emptyBorder);
//        next_Btn.setBackground(new Color(135,206,250)); 
//        input_Panel.add(next_Btn);
//        next_Btn.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//  				new Employee2_Page();
//            }
//        });
//       
//        employee1_Button = new JButton("Science Lab"); 
//        employee1_Button.setBounds(153, 90, 206, 40);//335, 163, 110, 40//190, 163, 110, 40
//        employee1_Button.setFont(font6);
//        //employee1_Button.setBorder(emptyBorder);
//        //employee1_Button.setBackground(new Color(135,206,250));
//        employee1_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Science_Lab_Page();
//            }
//        });
//        input_Panel.add(employee1_Button);
//        
//        //*****************************************
//        
//        employee2_Button = new JButton("Computer Lab"); //150, 110, 200, 40
//        employee2_Button.setBounds(153, 165, 206, 40);//335, 163, 110, 40//190, 163, 110, 40
//        employee2_Button.setFont(font6);
//        //employee2_Button.setBorder(emptyBorder);
//        //employee2_Button.setBackground(new Color(135,206,250));
//        employee2_Button.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Computer_Lab_Page();
//            }
//        });
//        input_Panel.add(employee2_Button);
        
//        previous_Btn = new JButton("<PREVIOUS"); 
//        previous_Btn.setBounds(20,250,125,25);//335, 163, 110, 40//190, 163, 110, 40
//        previous_Btn.setFont(font4);
//        //previous_Btn.setBorder(emptyBorder);
//        //previous_Btn.setBackground(new Color(135,206,250)); 
//        input_Panel.add(previous_Btn);
//        previous_Btn.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Lab_Page();
//            }
//        });
        
////        ************************************************************************************
//        next_Btn = new JButton("<Home"); 
//        next_Btn.setBounds(375,250,125,25);//335, 163, 110, 40//190, 163, 110, 40
//        next_Btn.setFont(font4);
//        next_Btn.setBorder(emptyBorder);
//        next_Btn.setBackground(new Color(135,206,250)); 
//        input_Panel.add(next_Btn);
//        next_Btn.addActionListener(new ActionListener() {
//        	@Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//				new Home_Page();
//            }
//        });
        
        
        
		setVisible(true);
	}
}


