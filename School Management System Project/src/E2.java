import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class E2 extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField principal1_Txt,principal2_Txt,principal3_Txt,principal4_Txt;
	JLabel title_Label,T1_Label,Employee_Label;
	JButton back_Btn1,reg_Btn,min_Btn,close_Btn,back_Btn;
	
	public E2() {
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
        Font font4 = new Font("Arial",Font.BOLD,15);
        Font font5 = new Font("Arial",Font.BOLD,35);
        Font font6 = new Font("Arial",Font.BOLD,23);
        Font font7 = new Font("Arial",Font.BOLD,18);
        Font font8 = new Font("Arial",Font.BOLD,15);
        Font font9 = new Font("Arial",Font.BOLD,16);
		
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
 			  new Employee1_Page();
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
       
        Employee_Label = new JLabel("Employee",JLabel.CENTER);
        Employee_Label.setFont(font5);
        Employee_Label.setForeground(new Color(255,255,255));
        Employee_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\t.png"));
        Employee_Label.setBounds(0,0,500,50);//52,30,80,32
        input_Panel.add(Employee_Label);
        
        ImageIcon icon = new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\b.png");
        T1_Label = new JLabel(icon,JLabel.LEFT);
        T1_Label.setBounds(40,80,140,140);//52,30,80,32
        input_Panel.add(T1_Label);

        principal1_Txt = new JTextField("Name: Md Rubel Ahmed",JTextField.LEFT); 
        principal1_Txt.setBounds(207, 80, 300, 20);//335, 163, 110, 40//190, 163, 110, 40
        principal1_Txt.setFont(font6);
        principal1_Txt.setBorder(emptyBorder);
        principal1_Txt.setEditable(false);
        principal1_Txt.setBackground(new Color(135,206,250));
        input_Panel.add(principal1_Txt);
        
        principal2_Txt = new JTextField("Position: Driver");
        principal2_Txt.setFont(font6);
        principal2_Txt.setEditable(false);
        principal2_Txt.setBorder(emptyBorder);
        principal2_Txt.setBackground(new Color(135,206,250));
        principal2_Txt.setBounds(180,110,300,20);
        input_Panel.add(principal2_Txt);
        
        principal3_Txt = new JTextField("Contact: +88 01617-777777");
        principal3_Txt.setFont(font9);
        principal3_Txt.setEditable(false);
        principal3_Txt.setBorder(emptyBorder);
        principal3_Txt.setBackground(new Color(135,206,250));
        principal3_Txt.setBounds(212,140,300,20);
        input_Panel.add(principal3_Txt);
        
        principal4_Txt = new JTextField("driver@abcschool.com");
        principal4_Txt.setFont(font9);
        principal4_Txt.setEditable(false);
        principal4_Txt.setBorder(emptyBorder);
        principal4_Txt.setBackground(new Color(135,206,250));
        principal4_Txt.setBounds(281,170,330,20);
        input_Panel.add(principal4_Txt);
                
		setVisible(true);
	}

	public static void main(String[] args) {
		new T1();
	}
}


