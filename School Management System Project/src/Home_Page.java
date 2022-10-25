import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home_Page extends JFrame{
	JPanel input_Panel,Title_Bar_3_Panel,title_Panel,inputPanel;
	JLabel bgImage_label,Title_Bar_1_Label,Title_Bar_2_Label,inputLabel,Title_Bar_3_Label;
	JTextArea Title_Bar_3_Txt;
	JButton Lab_Btn,Staff_Btn,min_Btn,close_Btn,reg_Btn,login_Btn,home_Btn,about_Btn,admission_Btn,faculty_Btn,library_Btn;

	Home_Page(){
		setSize(500,400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		 
		//Image set in the title bar
        //Image icon = Toolkit.getDefaultToolkit().getImage("D:\\download.jpg");    
        //setIconImage(icon);
		
		//***************************Border****************************//
        Border emptyBorder = BorderFactory.createEmptyBorder();
       
        //***************************FONTS****************************//
        Font font0 = new Font("Arial",Font.BOLD,35);
        Font font1 = new Font("Arial",Font.BOLD,20);
        Font font2 = new Font("Arial",Font.BOLD,15);
        Font font3 = new Font("Arial",Font.BOLD,15);
        Font font4 = new Font("Arial",Font.BOLD,15);
        Font font9 = new Font("Arial",Font.BOLD,13);
        
        //********************************Panel1**********************************//
        
        title_Panel = new JPanel();
        title_Panel.setBounds(0, 0, 500, 110);
        title_Panel.setBackground(new Color(70,130,180));//51,153,255//0,255,255
        title_Panel.setLayout(null);
        add(title_Panel);
     
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
        Title_Bar_1_Label = new JLabel("ABC SCHOOL",JLabel.CENTER);
        Title_Bar_1_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\00.png"));
        Title_Bar_1_Label.setBounds(0,10,500,80);//140,10,500,80
        //Title_Bar_1_Label.setBackground(new Color(70,130,180));
        Title_Bar_1_Label.setFont(font0);
        Title_Bar_1_Label.setLayout(null);
        title_Panel.add(Title_Bar_1_Label);
        
        //.........................Task Bar Label................................//
        Title_Bar_2_Label = new JLabel();
        Title_Bar_2_Label.setBounds(0,80,500,40);
        //Title_Bar_2_Label.setBackground(new Color(135,206,235));//setBackground(new Color(51,153,255));//51,153,255//70,130,180
        Title_Bar_2_Label.setLayout(null);
        title_Panel.add(Title_Bar_2_Label);
        
        //.........................Home Button................................//
        home_Btn = new JButton("Home");
        home_Btn.setBounds(10, 12, 45, 15);
        home_Btn.setForeground(new Color(224,255,255));//224,255,255
        home_Btn.setBackground(new Color(70,130,180));
        home_Btn.setFont(font3);
        home_Btn.setBorder(emptyBorder);
//        home_Btn.addActionListener(new ActionListener(){
//    	       @Override
//    	       public void actionPerformed(ActionEvent e)
//    	       {
//    	    	   dispose();
//    			   new Principals_Message_Page();
//    	       }
//    		});
        Title_Bar_2_Label.add(home_Btn);
        
        //.........................About Button................................//
        about_Btn = new JButton("About Us");
        about_Btn.setBounds(65, 12, 70, 15);
        about_Btn.setForeground(new Color(224,255,255));
        about_Btn.setBackground(new Color(70,130,180));
        about_Btn.setFont(font3);
        about_Btn.setBorder(emptyBorder);
        about_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new AboutUs_Page();
            }
        });
        Title_Bar_2_Label.add(about_Btn);
        
        //.........................Admission Button................................//
        admission_Btn = new JButton("Admission");
        admission_Btn.setBounds(145, 12, 80, 15);
        admission_Btn.setForeground(new Color(224,255,255));
        admission_Btn.setBackground(new Color(70,130,180));
        admission_Btn.setFont(font3);
        admission_Btn.setBorder(emptyBorder);
        admission_Btn.addActionListener(new ActionListener(){
    	       @Override
    	       public void actionPerformed(ActionEvent e)
    	       {
    	    	   dispose();
    			   new Admission1_Page();
    	       }
    		});

        Title_Bar_2_Label.add(admission_Btn);
        
        //.........................Notice Button................................//
        faculty_Btn = new JButton("Notice");
        faculty_Btn.setBounds(235, 12, 50, 15);
        faculty_Btn.setForeground(new Color(224,255,255));
        faculty_Btn.setBackground(new Color(70,130,180));
        faculty_Btn.setFont(font3);
        faculty_Btn.setBorder(emptyBorder);
        faculty_Btn.addActionListener(new ActionListener(){
   	       @Override
   	       public void actionPerformed(ActionEvent e)
   	       {
   	    	   dispose();
   	    	   new Notice1_Page();
   	       }
   		});
        Title_Bar_2_Label.add(faculty_Btn);
        
        //.........................Faculty Button................................//
        Staff_Btn = new JButton("Staff");
        Staff_Btn.setBounds(295, 12, 35, 15);
        Staff_Btn.setForeground(new Color(224,255,255));
        Staff_Btn.setBackground(new Color(70,130,180));
        Staff_Btn.setFont(font3);
        Staff_Btn.setBorder(emptyBorder);
        Staff_Btn.addActionListener(new ActionListener(){
   	       @Override
   	       public void actionPerformed(ActionEvent e)
   	       {
   	    	   dispose();
   			   new Staff_Page();
   	       }
   		});
        Title_Bar_2_Label.add(Staff_Btn);
        
      //.........................Lab Button................................//
        Lab_Btn = new JButton("Lab");
        Lab_Btn.setBounds(340, 12, 30, 15);
        Lab_Btn.setForeground(new Color(224,255,255));
        Lab_Btn.setBackground(new Color(70,130,180));
        Lab_Btn.setFont(font3);
        Lab_Btn.setBorder(emptyBorder);
        Lab_Btn.addActionListener(new ActionListener(){
   	       @Override
   	       public void actionPerformed(ActionEvent e)
   	       {
   	    	   dispose();
   	    	   new Lab_Page();
   	       }
   		});
        Title_Bar_2_Label.add(Lab_Btn);
        
        //.........................Library Button................................//
        library_Btn = new JButton("Library");
        library_Btn.setBounds(380, 12, 52, 15);
        library_Btn.setForeground(new Color(224,255,255));
        library_Btn.setBackground(new Color(70,130,180));
        library_Btn.setFont(font3);
        library_Btn.setBorder(emptyBorder);
        library_Btn.addActionListener(new ActionListener(){
    	       @Override
    	       public void actionPerformed(ActionEvent e)
    	       {
    	    	   dispose();
    			   new Library_Page();
    	       }
    		});
        Title_Bar_2_Label.add(library_Btn);
        
        //.........................Login Button................................//
        login_Btn = new JButton("Login");
        login_Btn.setBounds(444, 12, 44, 15);
        login_Btn.setForeground(new Color(224,255,255));
        login_Btn.setBackground(new Color(70,130,180));
        login_Btn.setFont(font3);
        login_Btn.setBorder(emptyBorder);
        login_Btn.addActionListener(new ActionListener(){
  	       @Override
  	       public void actionPerformed(ActionEvent e)
  	       {
  	    	   dispose();
  			   new Login_Page();
  	       }
  		});
        Title_Bar_2_Label.add(login_Btn);
        
        //*********************************Panel2**********************************//
        
        input_Panel = new JPanel();
        input_Panel.setBounds(0,100,500,300);
        input_Panel.setBackground(new Color(135,206,250));
        input_Panel.setLayout(null);
        add(input_Panel);

        bgImage_label = new JLabel();//"About Us",JLabel.CENTER
        bgImage_label.setBackground(new Color(135,206,250));
        bgImage_label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\school.png"));
        bgImage_label.setBounds(135,33,230,217);//52,30,80,32
        input_Panel.add(bgImage_label);
        
		setVisible(true);
	}

}
