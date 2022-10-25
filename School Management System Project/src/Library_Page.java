import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Library_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField resource1_Txt,resource2_Txt,resource3_Txt,facilites1_LTxt,facilites2_LTxt,facilites3_Txt,time1_Txt,time2_Txt;
	JLabel title_Label,library_Label,resources_Label,facilites_Label,time_Label;
	JButton back_Btn1,min_Btn,close_Btn,back_Btn;
	
	public Library_Page() {
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
        Font font3 = new Font("Arial",Font.BOLD,35);
        Font font4 = new Font("Arial",Font.BOLD,20);
        Font font5 = new Font("Arial",Font.BOLD,15);
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
        
        add(title_Panel);
        title_Panel.add(back_Btn);
        title_Panel.add(min_Btn);
        title_Panel.add(close_Btn);
        title_Panel.add(title_Label);
        
        //*********************************Panel2**********************************//
        
        input_Panel = new JPanel();
        input_Panel.setBounds(0,100,500,300);
        input_Panel.setBackground(new Color(135,206,250));
        input_Panel.setLayout(null);
        add(input_Panel);
        
        library_Label = new JLabel("Library",JLabel.CENTER);
        library_Label.setFont(font3); 
        library_Label.setForeground(new Color(255,255,255));
        library_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\li.png"));
        library_Label.setBounds(0,5,500,40);//52,30,80,32
        input_Panel.add(library_Label);
        
        //****************************
        
        resources_Label = new JLabel("⦿Resources :",JLabel.LEFT);
        resources_Label.setFont(font4);
        resources_Label.setForeground(new Color(255,255,255));
        resources_Label.setBounds(25,50,135,40);//52,30,80,32
        input_Panel.add(resources_Label);
        
        resource1_Txt = new JTextField("► 5000+ Books");
        resource1_Txt.setFont(font5);
        resource1_Txt.setBounds(140,80,330,17);
        resource1_Txt.setBackground(new Color(135,206,250));
        resource1_Txt.setEditable(false);
        resource1_Txt.setBorder(emptyBorder);
        input_Panel.add(resource1_Txt);
        
        resource2_Txt = new JTextField("► E-Journal");
        resource2_Txt.setFont(font5);
        resource2_Txt.setBounds(140,95,330,17);
        resource2_Txt.setBackground(new Color(135,206,250));
        resource2_Txt.setEditable(false);
        resource2_Txt.setBorder(emptyBorder);
        input_Panel.add(resource2_Txt);
        
        resource3_Txt = new JTextField("► E-Book");
        resource3_Txt.setFont(font5);
        resource3_Txt.setBounds(140,110,330,17);
        resource3_Txt.setBackground(new Color(135,206,250));
        resource3_Txt.setEditable(false);
        resource3_Txt.setBorder(emptyBorder);
        input_Panel.add(resource3_Txt);
        
        //************************************************************
        facilites_Label = new JLabel("⦿Services and Facilites :",JLabel.LEFT);
        facilites_Label.setFont(font4);
        facilites_Label.setForeground(new Color(255,255,255));
        facilites_Label.setBounds(25,120,240,40);//52,30,80,32
        input_Panel.add(facilites_Label);
        
        facilites1_LTxt = new JTextField("► Student Can Borrow 1 Book for 7 Days");
        facilites1_LTxt.setFont(font5);
        facilites1_LTxt.setBounds(140,155,330,17);
        facilites1_LTxt.setBackground(new Color(135,206,250));
        facilites1_LTxt.setEditable(false);
        facilites1_LTxt.setBorder(emptyBorder);
        input_Panel.add(facilites1_LTxt);
        
        facilites2_LTxt = new JTextField("► Teacher Can Borrow 2 Books for 7 Days");
        facilites2_LTxt.setFont(font5);
        facilites2_LTxt.setBounds(140,170,330,17);
        facilites2_LTxt.setBackground(new Color(135,206,250));
        facilites2_LTxt.setEditable(false);
        facilites2_LTxt.setBorder(emptyBorder);
        input_Panel.add(facilites2_LTxt);
        
        facilites3_Txt = new JTextField("► Others Can Borrow 1 Books for 5 Days");
        facilites3_Txt.setFont(font5);
        facilites3_Txt.setBounds(140,185,330,17);
        facilites3_Txt.setBackground(new Color(135,206,250));
        facilites3_Txt.setEditable(false);
        facilites3_Txt.setBorder(emptyBorder);
        input_Panel.add(facilites3_Txt);
        
        //************************************************************
        time_Label = new JLabel("⦿library Time :",JLabel.LEFT);
        time_Label.setFont(font4);
        time_Label.setForeground(new Color(255,255,255));
        time_Label.setBounds(25,190,230,40);//52,30,80,32
        input_Panel.add(time_Label);
        
        time1_Txt = new JTextField("► Saturday - Thursday : 9:00 A.M. - 4:00 P.M.");
        time1_Txt.setFont(font5);
        time1_Txt.setBounds(140,220,330,17);
        time1_Txt.setBackground(new Color(135,206,250));
        time1_Txt.setEditable(false);
        time1_Txt.setBorder(emptyBorder);
        input_Panel.add(time1_Txt);
        
        time2_Txt = new JTextField("► Friday : Off ");
        time2_Txt.setFont(font5);
        time2_Txt.setBounds(140,235,330,17);
        time2_Txt.setBackground(new Color(135,206,250));
        time2_Txt.setEditable(false);
        time2_Txt.setBorder(emptyBorder);
        input_Panel.add(time2_Txt); 

		setVisible(true);
	}

}


