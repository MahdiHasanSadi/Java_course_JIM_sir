import javax.swing.*;   
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*; 

public class Routine extends JFrame{
	JPanel title_Panel,input_Panel;
	JTextField email_Txt,pass_Txt;
	JLabel title_Label,aboutUs_Label;
	JButton Routine,Result,back_Btn1,student_Activity_Btn,academic_Council_Btn,administration_Btn,principal_Msg_Btn,min_Btn,close_Btn,back_Btn,back_To_Home_Btn;
	
	public Routine() { 
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
        Font font50 = new Font("Arial",Font.BOLD+Font.ITALIC,25);

		
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
 			  new After_S_Login_Page();
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
        
        aboutUs_Label = new JLabel("Routine",JLabel.CENTER);
        aboutUs_Label.setFont(font5);
        aboutUs_Label.setForeground(new Color(255,255,255));
        aboutUs_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\s.png"));
        aboutUs_Label.setBounds(0,0,500,40);//52,30,80,32
        input_Panel.add(aboutUs_Label);
        
//        Result = new JButton("Result");
//        Result.setFont(font50);
////        Result.setForeground(new Color(255,255,255));
//        Result.setBounds(175,80,150,40);//52,30,80,32
//        input_Panel.add(Result);
//        Result.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            	dispose();
//            	new St_Result_Show1_Page();
//            }
//        });
//        
//        Routine = new JButton("Routine");
//        Routine.setFont(font50);
////        Routine.setForeground(new Color(255,255,255));
//        Routine.setBounds(175,80,150,40);//52,30,80,32
//        input_Panel.add(Routine);
//        Routine.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            	dispose();
//            	new St_Result_Show1_Page();
//            }
//        });
        
        
		setVisible(true);
	}
  public static void main(String[] args) {
	  new Routine();
  }
}

