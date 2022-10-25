import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Notice2_Page extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField resource1_Txt,resource2_Txt,resource3_Txt,facilites1_LTxt,facilites2_LTxt,facilites3_Txt,time1_Txt,time2_Txt;
	JLabel title_Label,library_Label,resources_Label,facilites_Label,time_Label;
	JButton back_Btn1,previous_Btn,next_Btn,min_Btn,close_Btn,back_Btn;
	
	public Notice2_Page() {
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
        Font font3 = new Font("Arial",Font.BOLD,30);
        Font font4 = new Font("Arial",Font.BOLD,20);
        Font font5 = new Font("Arial",Font.BOLD,15);
        Font font6 = new Font("Arial",Font.BOLD+Font.ITALIC,12);
        
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
 			  new Notice1_Page();
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
        
        library_Label = new JLabel("Update Notice",JLabel.CENTER);
        library_Label.setFont(font3);
        library_Label.setForeground(new Color(255,255,255));
        library_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\notice.png"));
        library_Label.setBounds(0,0,500,40);//52,30,80,32
        input_Panel.add(library_Label);
        
        JLabel notice1_Label = new JLabel("⦿ Taking a brake:",JLabel.LEFT);
        notice1_Label.setBounds(30,50,500,30);
        notice1_Label.setFont(font4);
        input_Panel.add(notice1_Label);
        
        JTextArea notice1_Txt = new JTextArea("Event Date : 2020-01-05\n"
        		                            + "\n"
        		                            + "Event Time : 06:30\n"
        		                            + "\n"
        		                            + "Event Venue : Meghbari Resort, Gajipur\n"
        		                            + "\n"
        		                            + "Students are reqested to contact with class teacher for\n"
        		                            + "participating school annual picnic on 5th january, 2020.\n"
        		                            + "\n");
        notice1_Txt.setBounds(50,100,500,150);
        notice1_Txt.setFont(font5);
        notice1_Txt.setBackground(new Color(135,206,250));
        input_Panel.add(notice1_Txt);
        
        previous_Btn = new JButton("<PREVIOUS"); 
        previous_Btn.setBounds(30,255,80,25);//335, 163, 110, 40//190, 163, 110, 40
        previous_Btn.setFont(font6);
        previous_Btn.setBorder(emptyBorder);
        previous_Btn.setBackground(new Color(135,206,250)); 
        input_Panel.add(previous_Btn);
        previous_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
				new Notice1_Page();
            }
        });

		setVisible(true);
	}
}


