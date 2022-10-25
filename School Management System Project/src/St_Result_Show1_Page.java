import javax.swing.*;
import javax.swing.border.Border;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class St_Result_Show1_Page extends JFrame implements ActionListener {
	JPanel title_Panel, input_Panel;
	JTextField ID_Txt, gpa_Txt, grade_Txt, cls_Txt, mid_term_Txt, total_Grade_Txt, st_ID_Txt, name_Txt;
	JLabel ID_Label, gpa_Label, grade_Label, cls_Label, mid_term_Label, total_Grade_Label, title_Label, st_ID_Label,
			name_Label, login_Label, signIn_Label;
	JButton details_Btn, fetch_Btn, reg_Btn, min_Btn, close_Btn, back_Btn, back_Btn1;

	// ***************************Border****************************//
	Border emptyBorder = BorderFactory.createEmptyBorder();

	// ***************************FONTS****************************//
	Font font0 = new Font("Arial", Font.BOLD, 35);
	Font font1 = new Font("Arial", Font.BOLD, 18);
	Font font2 = new Font("Arial", Font.BOLD, 15);
	Font font3 = new Font("Arial", Font.BOLD, 20);
	Font font4 = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
	Font font5 = new Font("Arial", Font.BOLD, 13);
	Font font6 = new Font("Arial", Font.ITALIC + Font.BOLD, 22);
	Font font7 = new Font("Arial", Font.BOLD, 20);
	Font font8 = new Font("Arial", Font.BOLD, 30);
	Font font9 = new Font("Arial", Font.ITALIC + Font.BOLD, 15);// 237, 227, 48, 20
	Font font90 = new Font("Arial", Font.ITALIC + Font.BOLD, 13);// 237, 227, 48, 20

	public St_Result_Show1_Page() {

		setSize(500, 400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		// ********************************Panel1**********************************//
		title_Panel = new JPanel();
		title_Panel.setBounds(0, 0, 500, 100);
		title_Panel.setBackground(new Color(70, 130, 180));// 51,153,255//0,255,255
		title_Panel.setLayout(null);
		add(title_Panel);

//..............................BACK BUTTON................................//

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
// 			  new St_Result_Show2_Page();
			}
		});
		title_Panel.add(back_Btn1);

		// ..........................Minimize Button...........................//
		min_Btn = new JButton("-");
		min_Btn.setBounds(450, 0, 25, 25);
		min_Btn.setBackground(new Color(70, 130, 180));
		min_Btn.setFont(font3);
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

		// *********************************Panel2**********************************//

		input_Panel = new JPanel();
		input_Panel.setBounds(0, 100, 500, 300);
		input_Panel.setBackground(new Color(135, 206, 250));
		input_Panel.setLayout(null);
		add(input_Panel);

		// *****************************Image**************************************//
		signIn_Label = new JLabel("Result", JLabel.CENTER);// "Login",JLabel.CENTER
		signIn_Label.setFont(font8);
		signIn_Label.setForeground(new Color(255, 255, 255));
		signIn_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\Smark.png"));
		signIn_Label.setBounds(0, 5, 500, 30);// 52,30,80,32
		input_Panel.add(signIn_Label);

//.........................Student ID..............................//

		st_ID_Label = new JLabel("Student ID: ", JLabel.RIGHT);
		st_ID_Label.setFont(font1);
		st_ID_Label.setForeground(new Color(255, 255, 255));
		st_ID_Label.setBounds(30, 38, 104, 50);
		input_Panel.add(st_ID_Label);

		st_ID_Txt = new JTextField(50);
		st_ID_Txt.setFont(font4);
		st_ID_Txt.setBounds(140, 54, 240, 20);
		st_ID_Txt.setBorder(emptyBorder);
		input_Panel.add(st_ID_Txt);

		fetch_Btn = new JButton("FETCH");
		fetch_Btn.setBounds(390, 53, 80, 22);// 335, 163, 110, 40//190, 163, 110, 40
		fetch_Btn.setFont(font90);
		fetch_Btn.addActionListener(this);
		input_Panel.add(fetch_Btn);

		// .......................ID............................//

		ID_Label = new JLabel("ID: ", JLabel.RIGHT);
		ID_Label.setFont(font1);
		ID_Label.setForeground(new Color(255, 255, 255));
		ID_Label.setBackground(new Color(135, 206, 250));
		ID_Label.setBounds(30, 94, 190, 70);// 40,130,110,70
		input_Panel.add(ID_Label);

		ID_Txt = new JTextField(100);
		ID_Txt.setFont(font4);
		ID_Txt.setBounds(225, 120, 270, 20);// 165,150,280,30//140,120,330,20
		ID_Txt.setBackground(new Color(135, 206, 250));
		ID_Txt.setBorder(emptyBorder);
		ID_Txt.setEditable(false);
		input_Panel.add(ID_Txt);

		// .......................Name............................//

		name_Label = new JLabel("Name: ", JLabel.RIGHT);
		name_Label.setFont(font1);
		name_Label.setForeground(new Color(255, 255, 255));
		name_Label.setBackground(new Color(135, 206, 250));
		name_Label.setBounds(30, 124, 190, 70);// 40,130,110,70//30,124,104,70
		input_Panel.add(name_Label);

		name_Txt = new JTextField(100);
		name_Txt.setFont(font4);
		name_Txt.setBounds(225, 150, 270, 20);// 165,150,280,30//140,150,330,20
		name_Txt.setBackground(new Color(135, 206, 250));
		name_Txt.setBorder(emptyBorder);
		name_Txt.setEditable(false);
		input_Panel.add(name_Txt);

		// .......................Class............................//

		cls_Label = new JLabel("Class: ", JLabel.RIGHT);
		cls_Label.setFont(font1);
		cls_Label.setForeground(new Color(255, 255, 255));
		cls_Label.setBackground(new Color(135, 206, 250));
		cls_Label.setBounds(30, 154, 190, 70);// 40,130,110,70//30,154,104,70
		input_Panel.add(cls_Label);

		cls_Txt = new JTextField(100);
		cls_Txt.setFont(font4);
		cls_Txt.setBounds(225, 180, 270, 20);// 165,150,280,30//140,180,330,20
		cls_Txt.setBackground(new Color(135, 206, 250));
		cls_Txt.setBorder(emptyBorder);
		cls_Txt.setEditable(false);
		input_Panel.add(cls_Txt);

		// ............................Grade...........................//

		grade_Label = new JLabel("GPA: ", JLabel.RIGHT);
		grade_Label.setFont(font1);
		grade_Label.setForeground(new Color(255, 255, 255));
		grade_Label.setBackground(new Color(135, 206, 250));
		grade_Label.setBounds(30, 184, 190, 70);// 40,130,110,70//30,184,104,70
		input_Panel.add(grade_Label);

		grade_Txt = new JTextField(100);
		grade_Txt.setFont(font4);
		grade_Txt.setBounds(225, 210, 270, 20);// 165,150,280,30//140,210,330,20
		grade_Txt.setBackground(new Color(135, 206, 250));
		grade_Txt.setBorder(emptyBorder);
		grade_Txt.setEditable(false);
		input_Panel.add(grade_Txt);

		// ...........................Grade...............................//

		gpa_Label = new JLabel("Grade: ", JLabel.RIGHT);
		gpa_Label.setFont(font1);
		gpa_Label.setForeground(new Color(255, 255, 255));
		gpa_Label.setBackground(new Color(135, 206, 250));
		gpa_Label.setBounds(30, 214, 190, 70);// 40,130,110,70//30,215,104,70
		input_Panel.add(gpa_Label);

		gpa_Txt = new JTextField(100);
		gpa_Txt.setFont(font4);
		gpa_Txt.setBounds(225, 240, 270, 20);// 165,150,280,30//140,240,330,20
		gpa_Txt.setBackground(new Color(135, 206, 250));
		gpa_Txt.setBorder(emptyBorder);
		gpa_Txt.setEditable(false);
		input_Panel.add(gpa_Txt);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Function f = new Function();
		ResultSet rs = null;

		String id = "ID";
		String name = "Name";
		String cls = "Class";
		String gpa = "GPA";
		String grade = "Grade";

		rs = f.find(st_ID_Txt.getText());
		try {
			if (rs.next()) {
				ID_Txt.setText(rs.getString("ID"));
				name_Txt.setText(rs.getString("Name"));
				cls_Txt.setText(rs.getString("Class"));
				gpa_Txt.setText(rs.getString("GPA"));
				grade_Txt.setText(rs.getString("Grade"));
			} else {
				JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

	public class Function {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		public ResultSet find(String s) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "");
				ps = con.prepareStatement("select ID,Name,Class,GPA,Grade from student_register where id = ?");
				ps.setString(1, s);
				rs = ps.executeQuery();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			return rs;
		}

	}

	public static void main(String[] args) {
		new St_Result_Show1_Page();
	}

}
