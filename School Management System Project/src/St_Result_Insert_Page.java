
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;

public class St_Result_Insert_Page extends JFrame {

	Connection con;
	Statement st;
	ResultSet rs;

	JLabel title_Label, aboutUs_Label;
	JPanel tablePanel1, tablePanel, OperationPanel, title_Panel, input_Panel;
	JTextField GradeText, GPAText, IDText, nameText, clsText, email_Txt, pass_Txt;
	JButton clrBtn, retriveBtn, addBtn, updateBtn, deleteBtn, back_Btn1, student_Activity_Btn, academic_Council_Btn,
			administration_Btn, principal_Msg_Btn, min_Btn, close_Btn, back_Btn, back_To_Home_Btn;

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

	public St_Result_Insert_Page() {
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
				dispose();
				new After_T_Login_Page();
			}
		});
		title_Panel.add(back_Btn);

		// ..............................BACK BUTTON................................//
		back_Btn1 = new JButton(">");
		back_Btn1.setBounds(25, 0, 25, 25);
		back_Btn1.setBackground(new Color(70, 130, 180));
		back_Btn1.setFont(font2);
		back_Btn1.setBorder(emptyBorder);
		back_Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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

		Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column5", "Row1-Column6", "Row1-Column7" } };
		Object columnNames[] = { "ID", "Name", "Class", "GPA", "Grade" };
		model = new DefaultTableModel(rowData, columnNames);

		// Adding
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(15, 0, 470, 150);
		tablePanel1.add(sp);

		// *********************************Operation**********************************
		// **********************************Panel********************************
		OperationPanel = new JPanel();
		OperationPanel.setBounds(0, 300, 500, 170);
		OperationPanel.setLayout(null);
		OperationPanel.setBackground(new Color(135, 206, 250));
		add(OperationPanel);

		IDText = new JTextField("ID");
		IDText.setBounds(15, 15, 200, 25);
		IDText.setBorder(emptyBorder);
		OperationPanel.add(IDText);

		nameText = new JTextField("Name");
		nameText.setBounds(285, 15, 200, 25);
		nameText.setBorder(emptyBorder);
		OperationPanel.add(nameText);

		clsText = new JTextField("Class");
		clsText.setBounds(15, 45, 200, 25);
		clsText.setBorder(emptyBorder);
		OperationPanel.add(clsText);

		GPAText = new JTextField("GPA");
		GPAText.setBounds(285, 45, 200, 25);
		GPAText.setBorder(emptyBorder);
		OperationPanel.add(GPAText);

		GradeText = new JTextField("Grade");
		GradeText.setBounds(150, 75, 200, 25);
		GradeText.setBorder(emptyBorder);
		OperationPanel.add(GradeText);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
			st = con.createStatement();
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
		try {
			String query = "SELECT * FROM student_register";
			rs = st.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.removeRow(0);

		Object[] rows;

		try {
			while (rs.next()) {
				rows = new Object[] { rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(6),
						rs.getString(7) };
				model.addRow(rows);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// *****************************************************************************************************

		retriveBtn = new JButton("Retrive");
		retriveBtn.setBounds(10, 110, 80, 30);
		retriveBtn.setBorder(emptyBorder);
		OperationPanel.add(retriveBtn);

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

		clrBtn = new JButton("Clear");
		clrBtn.setBounds(410, 110, 80, 30);
		clrBtn.setBorder(emptyBorder);
		OperationPanel.add(clrBtn);

		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
//					int rowIndex = table.getSelectedRow();
//					String id = (String) model.getValueAt(rowIndex, 0);// row, column
//					String name = (String) model.getValueAt(rowIndex, 1);
//					String cls = (String) model.getValueAt(rowIndex, 2);
//					String gpa = (String) model.getValueAt(rowIndex, 3);// row, column
//					String grade = (String) model.getValueAt(rowIndex, 4);

					String ID = IDText.getText();
					String Name = nameText.getText();
					String Cls = clsText.getText();
					String gpa = GPAText.getText();
					String grade = GradeText.getText();

					String query = "INSERT INTO `student_register`(`ID`, `Name`, `Class`, `GPA`, `Grade`) VALUES ('"
							+ ID + "','" + Name + "','" + Cls + "','" + gpa + "','" + grade + "')";

					st.executeUpdate(query);

					JOptionPane.showMessageDialog(null, "Information has been added");

					st.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		// Update
		// Mouse Adapter Class
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowIndex = table.getSelectedRow();
//				 System.out.println(rowIndex);
				String id = (String) model.getValueAt(rowIndex, 0);// row, column
				String name = (String) model.getValueAt(rowIndex, 1);
				String cls = (String) model.getValueAt(rowIndex, 2);
				String gpa = (String) model.getValueAt(rowIndex, 3);// row, column
				String grade = (String) model.getValueAt(rowIndex, 4);

				IDText.setText(id);
				nameText.setText(name);
				clsText.setText(cls);
				GPAText.setText(gpa);
				GradeText.setText(grade);
			}
		});

		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String ID = IDText.getText();
					String Name = nameText.getText();
					String Cls = clsText.getText();
					String gpa = GPAText.getText();
					String grade = GradeText.getText();

					int row = table.getSelectedRow();

//					System.out.println(row);

					model.setValueAt(ID, row, 0);
					model.setValueAt(Name, row, 1);
					model.setValueAt(Cls, row, 2);
					model.setValueAt(gpa, row, 3);
					model.setValueAt(grade, row, 4);

					String query = "DELETE FROM `student_register` WHERE id='" + ID + "'";
					st.executeUpdate(query);
					// ----------------------------------------DialogBox----------------------------------
					JOptionPane.showMessageDialog(null, "Information has been deleted");

					st.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String ID = IDText.getText();
					String Name = nameText.getText();
					String Cls = clsText.getText();
					String gpa = GPAText.getText();
					String grade = GradeText.getText();

					int row = table.getSelectedRow();

//					System.out.println(row);

					model.setValueAt(ID, row, 0);
					model.setValueAt(Name, row, 1);
					model.setValueAt(Cls, row, 2);
					model.setValueAt(gpa, row, 3);
					model.setValueAt(grade, row, 4);

					String query = "UPDATE `student_register` SET `Name`='" + Name + "',`Class`='" + Cls + "',`GPA`='"
							+ gpa + "',`Grade`='" + grade + "' WHERE ID ='" + ID + "'";
					st.executeUpdate(query);

					// ----------------------------------------DialogBox----------------------------------
					JOptionPane.showMessageDialog(null, "Information has been Updated");

					st.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		retriveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

				try {
					
					DefaultTableModel dm = new DefaultTableModel();
					dm.addColumn("ID");
					dm.addColumn("Name");
					dm.addColumn("Class");
					dm.addColumn("GPA");
					dm.addColumn("Grade");

					// SQL STATEMENT
					String sql = "SELECT * FROM student_register";
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");

					Statement s = con.prepareStatement(sql);
					ResultSet rs = s.executeQuery(sql);
					while (rs.next()) {
						// GET VALUES
						String id = rs.getString(1);
						String name = rs.getString(2);
						String cls = rs.getString(3);
						String gpa = rs.getString(4);
						String grade = rs.getString(5);

						dm.addRow(new String[] { id, name, cls, gpa, grade });
					}
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});

		clrBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) throws SQLException {
		new St_Result_Insert_Page();
	}
}