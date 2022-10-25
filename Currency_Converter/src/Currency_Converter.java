import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Currency_Converter extends JFrame{
	
	 //*********************************************Reference***********************************************// 
	 JPanel panel1,panel2;
	 JLabel label1,inLabel,outLabel;
	 JTextField inputTxt,outputTxt;
	 JButton IND,USA,AUS,back,close,min;
	
     public Currency_Converter()
     {
    	 setSize(400,370);
    	 setDefaultCloseOperation(3);
    	 setUndecorated(true);
    	 setLocationRelativeTo(null);
    	 setLayout(null);
    	 
    	 //*************************Empty Border****************************//
    	 Border emptyBorder = BorderFactory.createEmptyBorder();
    	 
    	 //*************************All Fonts***************************//
    	 Font font0 = new Font("Arial",Font.BOLD,29);
    	 Font font1 = new Font("Arial",Font.BOLD,15);
    	 Font font2 = new Font("Arial",Font.BOLD,20);
         
    	 //********************************PANEL_1*************************************************
    	 panel1 = new JPanel();
         panel1.setBounds(0, 0, 400,100);
         panel1.setBackground(new Color(70,130,180));
         panel1.setLayout(null);
         
         add(panel1);
         
         //*******************************MINIMIZE*****************************************//
         min = new JButton("-");
         min.setBounds(330, 0, 45, 40);
         min.setBackground(new Color(70,130,180));
         min.setFont(font1);
         min.setBorder(emptyBorder);
         panel1.add(min);
         min.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
           	    setExtendedState(JFrame.ICONIFIED);
            }
         }); 
         
        //*******************************CLOSE*****************************************//
         close = new JButton("X");
         close.setBounds(360, 0, 45, 45);
         close.setBackground(new Color(70,130,180));
         close.setFont(font1);
         close.setBorder(emptyBorder);
         panel1.add(close);
         close.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
             	System.exit(0);
             }
         });
         
         JLabel label1 = new JLabel("Currency Converter");
         label1.setBounds(60,15,400,80);
         label1.setFont(font0);
         label1.setLayout(null);
         panel1.add(label1);
        
         //***********************************PANEL_2********************************************
         
         panel2 = new JPanel();
         panel2.setBounds(0, 100, 400,270);
         panel2.setBackground(new Color(135,206,250));
         panel2.setLayout(null);
         add(panel2);
         
         //***************************INPUT LABEL****************************************//
         
         inLabel = new JLabel("Input:",JLabel.RIGHT);
         inLabel.setBounds(20,40,80,40);
         inLabel.setFont(font2);
         inLabel.setLayout(null);
         panel2.add(inLabel);
         
         inputTxt = new JTextField(25);
         inputTxt.setFont(font1);
         inputTxt.setBounds(120,50,245,25);
         inputTxt.setBorder(emptyBorder);
         
 	     panel2.add(inLabel);
 	     panel2.add(inputTxt);
 	     
 	     //***************************OUTPUT LABEL****************************************//
 	     
 	     outLabel = new JLabel("Output:",JLabel.RIGHT);
 	     outLabel.setBounds(20,110,80,40);
 	     outLabel.setFont(font2);
 	     outLabel.setLayout(null);
 	     panel2.add(outLabel);
        
         outputTxt = new JTextField(25);
         outputTxt.setFont(font1);
         outputTxt.setBounds(120,120,245,25);
         outputTxt.setBorder(emptyBorder);
        
	     panel2.add(outLabel);
	     panel2.add(outputTxt);
 	     
 	     //*******************************IND Button***************************************************// 	     
         IND = new JButton("IND");
         IND.setBounds(30, 200, 80, 40);
         IND.setFont(font1);
         panel2.add(IND);
         IND.addActionListener(new ActionListener(){
   	           @Override
   	           public void actionPerformed(ActionEvent e)
   	           {
                  double BDT = Double.parseDouble(inputTxt.getText());
                  double IND = BDT*0.86;
                  String str_ind = String.valueOf(IND);
                  outputTxt.setText(str_ind);
   	           }
   		    });
         
         //*******************************USA Button***************************************************//
         USA = new JButton("USA"); 
         USA.setBounds(160, 200, 80, 40);
         USA.setFont(font1);
         panel2.add(USA);
         USA.addActionListener(new ActionListener(){
     	       @Override
       	       public void actionPerformed(ActionEvent e)
       	       {
 			      double BDT = Double.parseDouble(inputTxt.getText());
                  double USA = BDT*0.012;
                  String str_usa = String.valueOf(USA);
                  outputTxt.setText(str_usa);
       	       }
       		});
 	     
         //*******************************AUS Button***************************************************//
         JButton AUS = new JButton("AUS");
         AUS.setBounds(286, 200, 80, 40);
         AUS.setFont(font1);
         panel2.add(AUS);
         AUS.addActionListener(new ActionListener(){
     	       @Override
       	       public void actionPerformed(ActionEvent e)
       	       {
  			     double BDT = Double.parseDouble(inputTxt.getText());
                 double AUS = BDT*0.016;
                 String str_aus = String.valueOf(AUS);
                 outputTxt.setText(str_aus);
       	       }
       		});
    	   
    	 setVisible(true);
     }
} 

/*//LAB TASK//Md. Jahedul Islam Moni Sir//Mahdi Hasan*/