import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;

import com.mysql.cj.xdevapi.Statement;

public class TableOp extends JFrame{
	
	JTable table;
	JPanel tablePanel, OperationPanel;
	JTextField serialText, nameText, idText;
	JButton addBtn, updateBtn, deleteBtn;
	String serial, name,id;
	DefaultTableModel model;
	
	JPanel title_Panel,input_Panel;
	JTextField email_Txt,pass_Txt;
	JLabel title_Label,aboutUs_Label;
	JButton back_Btn1,student_Activity_Btn,academic_Council_Btn,administration_Btn,principal_Msg_Btn,min_Btn,close_Btn,back_Btn,back_To_Home_Btn;
	
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
    
    
	public TableOp() {
		
		setSize(500,400);
		setDefaultCloseOperation(3);
		setUndecorated(true);
		//setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		
		//********************************************************************************************************
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
//          	  dispose();
// 			  new Home_Page();
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
		
		//*********************************************************************************************************
		
		tablePanel = new JPanel();
		tablePanel.setBounds(0,100,500,150);
		tablePanel.setBackground(new Color(135,206,250));
		tablePanel.setLayout(null);
		add(tablePanel);
		
		aboutUs_Label = new JLabel("Table",JLabel.CENTER);
        aboutUs_Label.setFont(font5);
        aboutUs_Label.setForeground(new Color(255,255,255));
        aboutUs_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\table.jpg"));
        aboutUs_Label.setBounds(0,5,500,40);//52,30,80,32
        tablePanel.add(aboutUs_Label);
        
		Object data[][]= {{"1","Abir","112233"},{"1","Hasan","112233"},{"1","Wasim","112233"}};
		String columnNames[]= {"Serial","Name","id"};
		//Creating table model
		model = new DefaultTableModel(data,columnNames);
		//Adding
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10,50,480,280);
		tablePanel.add(sp);
		
		//*********************************************************************************************************
		
		OperationPanel = new JPanel();
		OperationPanel.setBounds(0,250,500,200);
		OperationPanel.setLayout(null);
		OperationPanel.setBackground(new Color(135,206,250));
		add(OperationPanel);
		
		serialText = new JTextField("serial");
		serialText.setBounds(150,10,200,25);
		serialText.setBorder(emptyBorder);
		OperationPanel.add(serialText);
		
		nameText = new JTextField("Name");
		nameText.setBounds(150,40,200,25);
		nameText.setBorder(emptyBorder);
		OperationPanel.add(nameText);
		
		idText = new JTextField("ID");
		idText.setBounds(150,70,200,25);
		idText.setBorder(emptyBorder);
		OperationPanel.add(idText);
	
		//*****************************************************************************************************
		
		addBtn = new JButton("Add");
		addBtn.setBounds(110,110,80,30);
		addBtn.setBorder(emptyBorder);
		OperationPanel.add(addBtn);
		
		updateBtn = new JButton("Update");
		updateBtn.setBounds(210,110,80,30);
		table.setBorder(emptyBorder);
		OperationPanel.add(updateBtn);
		
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(310,110,80,30);
		deleteBtn.setBorder(emptyBorder);
		OperationPanel.add(deleteBtn);
		
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 serial = serialText.getText();
				 name = nameText.getText();
				 id = idText.getText();
				
				Object newRow[]= {serial,name,id};
				model.addRow(newRow);
				
			}
		});
		
		//Update
		//Mouse Adapter Class
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowIndex = table.getSelectedRow();
				//System.out.println(rowIndex);
				serial = (String) model.getValueAt(rowIndex, 0);//row, column
				name = (String) model.getValueAt(rowIndex, 1);
				id = (String) model.getValueAt(rowIndex, 2);
				
				serialText.setText(serial);
				nameText.setText(name);
				idText.setText(id);
			}
		});
		
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 serial = serialText.getText();
				 name = nameText.getText();
				 id = idText.getText();
				
				 int row = table.getSelectedRow();
				
				model.setValueAt(serial, row, 0);
				model.setValueAt(name, row, 1);
				model.setValueAt(id, row, 2);
				
			}
		});
		
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.removeRow(table.getSelectedRow());
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//*****************************************************
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
////            String URL = "jdbc:mysql://localhost:3306/admintest";
//
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admintest", "root", "");
//
//            Statement st = (Statement) con.createStatement();
//
//            String query = "Select * from hsc_2022";
//
//            ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
//            model.setRowCount(0);
//            while (rs.next()) {
//                String ID = rs.getString(1);
//                String institute = rs.getString(2);
//                Object row[] = {ID, institute};
//                model.addRow(row);
//            }
//            ((Connection) st).close();
//            con.close();
//
//        } catch (Exception ex) {
//            System.out.println("Error");
//        }
//		//*******************************************************
		
		setVisible(true);
	
		
		
	}
}
