import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;

public class T_Table_Page extends JFrame {

	private static Connection con;
	private static Statement st;
	ResultSet rs;

	JLabel title_Label, aboutUs_Label;
	JPanel tablePanel1, tablePanel, OperationPanel, title_Panel, input_Panel;
	JTextField serialText, nameText, idText, email_Txt, pass_Txt;
	JButton addBtn, updateBtn, deleteBtn, back_Btn1, student_Activity_Btn, academic_Council_Btn, administration_Btn,
			principal_Msg_Btn, min_Btn, close_Btn, back_Btn, back_To_Home_Btn;
	String serial, name, id;
	JTable table;
	DefaultTableModel model;

	// ***************************Border****************************//
	Border emptyBorder = BorderFactory.createEmptyBorder();

	// ***************************FONTS****************************//
	Font font0 = new Font("Arial", Font.BOLD, 35);
	Font font1 = new Font("Arial", Font.BOLD, 20);
	Font font2 = new Font("Arial", Font.BOLD, 15);
	Font font3 = new Font("Arial", Font.BOLD, 12);
	Font font4 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
	Font font5 = new Font("Arial", Font.BOLD, 25);
	Font font6 = new Font("Arial", Font.BOLD, 12);

	public T_Table_Page() {
		setSize(500, 450);
		setDefaultCloseOperation(3);
		setUndecorated(true);
		// setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);

		// ********************************Panel1**********************************//
		title_Panel = new JPanel();
		title_Panel.setBounds(0, 0, 500, 100);
		title_Panel.setBackground(new Color(70, 130, 180));// 51,153,255//0,255,255
		title_Panel.setLayout(null);
		add(title_Panel);

		// ..............................BACK BUTTON................................//
		back_Btn = new JButton("<");
		back_Btn.setBounds(0, 0, 25, 25);
		back_Btn.setBackground(new Color(70, 130, 180));
		back_Btn.setFont(font2);
		back_Btn.setBorder(emptyBorder);
		back_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//          	  dispose();
// 			  new Home_Page();
			}
		});
		title_Panel.add(back_Btn);

		// ..............................BACK BUTTON................................//
		back_Btn1 = new JButton(">");
		back_Btn1.setBounds(25, 0, 25, 25);
		back_Btn1.setBackground(new Color(70, 130, 180));
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

		// ..........................Minimize Button...........................//
		min_Btn = new JButton("-");
		min_Btn.setBounds(450, 0, 25, 25);
		min_Btn.setBackground(new Color(70, 130, 180));
		min_Btn.setFont(font1);
		min_Btn.setBorder(emptyBorder);
		min_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		title_Panel.add(min_Btn);

		// ..........................Close Button...........................//
		close_Btn = new JButton("X");
		close_Btn.setBounds(475, 0, 25, 25);
		close_Btn.setBackground(new Color(70, 130, 180));
		close_Btn.setFont(font2);
		close_Btn.setBorder(emptyBorder);
		close_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		title_Panel.add(close_Btn);

		// .........................Title Bar Label................................//
		title_Label = new JLabel("ABC SCHOOL", JLabel.CENTER);
		title_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\00.png"));
		title_Label.setBounds(0, 10, 500, 80);// 140,10,500,80
		// title_Label.setBackground(new Color(70,130,180));
		title_Label.setFont(font0);
		title_Label.setLayout(null);
		title_Panel.add(title_Label);

		// ***********************************************************************************************************
		tablePanel = new JPanel();
		tablePanel.setBounds(0, 100, 500, 50);
		tablePanel.setBackground(new Color(135, 206, 250));
		tablePanel.setLayout(null);
		add(tablePanel);

		aboutUs_Label = new JLabel("Table", JLabel.CENTER);
		aboutUs_Label.setFont(font5);
		aboutUs_Label.setForeground(new Color(255, 255, 255));
		aboutUs_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\table.jpg"));
		aboutUs_Label.setBounds(0, 5, 500, 40);// 52,30,80,32
		tablePanel.add(aboutUs_Label);

		// *********************************************************************************************************
		tablePanel1 = new JPanel();
		tablePanel1.setBounds(0, 150, 500, 150);
		tablePanel1.setBackground(new Color(135, 206, 250));
		tablePanel1.setLayout(null);
		add(tablePanel1);

		Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" } };
		// array to hold column names
		Object columnNames[] = { "ID", "Name", "Email"};
		// Creating table model
		model = new DefaultTableModel(rowData, columnNames);

		// Adding
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(15, 0, 470, 150);
		tablePanel1.add(sp);

		// *********************************************************************************************************
		OperationPanel = new JPanel();
		OperationPanel.setBounds(0, 300, 500, 170);
		OperationPanel.setLayout(null);
		OperationPanel.setBackground(new Color(135, 206, 250));
		add(OperationPanel);

		serialText = new JTextField("serial");
		serialText.setBounds(150, 15, 200, 25);
		serialText.setBorder(emptyBorder);
		OperationPanel.add(serialText);

		nameText = new JTextField("Name");
		nameText.setBounds(150, 45, 200, 25);
		nameText.setBorder(emptyBorder);
		OperationPanel.add(nameText);

		idText = new JTextField("ID");
		idText.setBounds(150, 75, 200, 25);
		idText.setBorder(emptyBorder);
		OperationPanel.add(idText);

		// try and connect to the database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
			st = con.createStatement();
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}

		// run the desired query
		try {
			String query = "SELECT * FROM teacher_register";
			// make a statement with the server

			// execute the query and return the result
			rs = st.executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// remove the temp row
		model.removeRow(0);

		// create a temporary object array to hold the result for each row
		Object[] rows;
		// for each row returned

		try {
			while (rs.next()) {
				// add the values to the temporary row
				rows = new Object[] { rs.getString(1), rs.getString(2), rs.getString(3)};
				// add the temp row to the table
				model.addRow(rows);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// *****************************************************************************************************

		addBtn = new JButton("Retrive");
		addBtn.setBounds(10, 110, 80, 30);
		addBtn.setBorder(emptyBorder);
		OperationPanel.add(addBtn);

		addBtn = new JButton("Add");
		addBtn.setBounds(110, 110, 80, 30);
		addBtn.setBorder(emptyBorder);
		OperationPanel.add(addBtn);

		updateBtn = new JButton("Update");
		updateBtn.setBounds(210, 110, 80, 30);
		table.setBorder(emptyBorder);
		OperationPanel.add(updateBtn);

		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(310, 110, 80, 30);
		deleteBtn.setBorder(emptyBorder);
		OperationPanel.add(deleteBtn);

		deleteBtn = new JButton("Clear");
		deleteBtn.setBounds(410, 110, 80, 30);
		deleteBtn.setBorder(emptyBorder);
		OperationPanel.add(deleteBtn);

		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				serial = serialText.getText();
				name = nameText.getText();
				id = idText.getText();

				Object newRow[] = { serial, name, id };
				model.addRow(newRow);

			}
		});

		// Update
		// Mouse Adapter Class
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowIndex = table.getSelectedRow();
				// System.out.println(rowIndex);
				serial = (String) model.getValueAt(rowIndex, 0);// row, column
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

		setVisible(true);
	}

}
