import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class Teacher_Register_1_Page extends JFrame {

	JPanel title_Panel, input_Panel;
	JTextField name_Txt, email_Txt, ID_Txt, password_Txt, conPass_Txt;
	JLabel title_Label, name_Label, ID_Label, email_Label, password_Label, conPass_Label, login_Label, signUp_Label,
			imgTxt_Label;
	JButton back_Btn, back_Btn1, login_Btn, reg_Btn, min_Btn, close_Btn, btnBack;

	public Teacher_Register_1_Page() {
		setSize(500, 400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);

		// ***************************Border****************************//
		Border emptyBorder = BorderFactory.createEmptyBorder();

		// ***************************FONTS****************************//
		Font font0 = new Font("Arial", Font.BOLD, 35);
		Font font1 = new Font("Arial", Font.BOLD, 17);
		Font font2 = new Font("Arial", Font.BOLD, 20);
		Font font3 = new Font("Arial", Font.BOLD, 20);
		Font font4 = new Font("Arial", Font.BOLD, 15);
		Font font5 = new Font("Arial", Font.BOLD, 13);
		Font font6 = new Font("Arial", Font.ITALIC + Font.BOLD, 22);
		Font font8 = new Font("Arial", Font.BOLD, 30);
		Font font9 = new Font("Arial", Font.ITALIC + Font.BOLD, 20);// 218, 258, 48, 20
		Font font12 = new Font("Arial", Font.BOLD, 15);

		// ********************************Panel1**********************************//
		title_Panel = new JPanel();
		title_Panel.setBounds(0, 0, 500, 100);
		title_Panel.setBackground(new Color(70, 130, 180));// 51,153,255//0,255,255
		title_Panel.setLayout(null);

		// ..............................BACK BUTTON................................//

		back_Btn = new JButton("<");
		back_Btn.setBounds(0, 0, 25, 25);
		back_Btn.setBackground(new Color(70, 130, 180));
		back_Btn.setFont(font12);
		back_Btn.setBorder(emptyBorder);
		back_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login_Page();
			}
		});
		title_Panel.add(back_Btn);

		// ..............................BACK BUTTON................................//

		back_Btn1 = new JButton(">");
		back_Btn1.setBounds(25, 0, 25, 25);
		back_Btn1.setBackground(new Color(70, 130, 180));
		back_Btn1.setFont(font12);
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
		close_Btn.setFont(font12);
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

		// ...............................Image Label..............................//
		signUp_Label = new JLabel("SignUp", JLabel.CENTER);
		signUp_Label.setFont(font8);
		signUp_Label.setForeground(new Color(255, 255, 255));
		signUp_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\t.png"));
		signUp_Label.setBounds(0, 20, 500, 32);// 52,30,80,32

		// .......................ID............................//
		ID_Label = new JLabel("Index No.: ", JLabel.RIGHT);
		ID_Label.setFont(font1);
		ID_Label.setForeground(new Color(255, 255, 255));
		ID_Label.setBounds(5, 45, 180, 70);

		ID_Txt = new JTextField(50);
		ID_Txt.setFont(font4);
		ID_Txt.setBounds(205, 70, 275, 25);
		ID_Txt.setBorder(emptyBorder);

		// .........................Name..............................//
		name_Label = new JLabel("Name: ", JLabel.RIGHT);
		name_Label.setFont(font1);
		name_Label.setForeground(new Color(255, 255, 255));
		name_Label.setBounds(5, 80, 180, 70);

		name_Txt = new JTextField(50);
		name_Txt.setFont(font4);
		name_Txt.setBounds(205, 105, 275, 25);
		name_Txt.setBorder(emptyBorder);

		// .......................Email............................//
		email_Label = new JLabel("Email: ", JLabel.RIGHT);
		email_Label.setFont(font1);
		email_Label.setForeground(new Color(255, 255, 255));
		email_Label.setBounds(5, 115, 180, 70);

		email_Txt = new JTextField(50);
		email_Txt.setFont(font4);
		email_Txt.setBounds(205, 140, 275, 25);
		email_Txt.setBorder(emptyBorder);

		// .......................Password............................//
		password_Label = new JLabel("Password: ", JLabel.RIGHT);
		password_Label.setFont(font1);
		password_Label.setForeground(new Color(255, 255, 255));
		password_Label.setBounds(5, 150, 180, 70);

		password_Txt = new JPasswordField(50);
		password_Txt.setFont(font4);
		password_Txt.setBounds(205, 175, 275, 25);
		password_Txt.setBorder(emptyBorder);

		// .......................Confirm Password............................//
		conPass_Label = new JLabel("Confirm Password: ", JLabel.RIGHT);
		conPass_Label.setFont(font1);
		conPass_Label.setForeground(new Color(255, 255, 255));
		conPass_Label.setBounds(5, 185, 180, 70);

		conPass_Txt = new JPasswordField(50);
		conPass_Txt.setFont(font4);
		conPass_Txt.setBounds(205, 210, 275, 25);
		conPass_Txt.setBorder(emptyBorder);

		// ..........................Login Button..................................//

		login_Label = new JLabel("Already Have an Account?Click", JLabel.LEFT);
		login_Label.setBounds(20, 255, 200, 30);
		login_Label.setFont(font5);

		login_Btn = new JButton("Here");
		login_Btn.setBounds(218, 258, 48, 20);// 335, 163, 110, 40//190, 163, 110, 40
		login_Btn.setFont(font9);
		login_Btn.setBorder(emptyBorder);
		login_Btn.setBackground(new Color(135, 206, 250));
		login_Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Teacher_Login_1_Page();
			}
		});

		// ..........................Register Button..............................//
		reg_Btn = new JButton("Register");
		reg_Btn.setBounds(390, 253, 90, 30);// 53,163,110,40//373, 240, 98, 30//359, 240, 110,40//370, 240, 110,40
		reg_Btn.setFont(font2);
		reg_Btn.setBorder(emptyBorder);
		reg_Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = ID_Txt.getText();
				String Name = name_Txt.getText();
				String Email = email_Txt.getText();
				String Password = password_Txt.getText();
				String conPassword = conPass_Txt.getText();

				//// *******************************************************************************
				String IDRegex = "\\d{1,10}";
				String NameRegex = "^[a-zA-Z .]+$";
				String emailRegex = "^[a-z0-9]+@[a-z]+.[a-z]+$";
				String passWordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+-]).{6,20}";

				if (!Pattern.matches(IDRegex, ID)) {
					JOptionPane.showMessageDialog(null, "Invalid ID");
				}

				else if (!Pattern.matches(NameRegex, Name)) {
					JOptionPane.showMessageDialog(null, "Invalid Name");
				}

				else if (!Pattern.matches(emailRegex, Email)) {
					JOptionPane.showMessageDialog(null, "Invalid Email");
				}

				else if (!Pattern.matches(passWordRegex, Password)) {
					JOptionPane.showMessageDialog(null, "Invalid Password");
				}

				else if (!conPassword.equals(Password)) {
					JOptionPane.showMessageDialog(null, "Password don't match");
				}

				else {
					String insertQuery = "INSERT INTO `teacher_register`(`ID`, `Name`, `Email`, `Password`) VALUES ('"
							+ ID + "','" + Name + "','" + Email + "','" + Password + "')";
					// String insertQuery = "UPDATE `registration` SET
					// `Name`='"++userName++"',`Email`='"+email+"',`Password`='"+password+"',`Mobile`='"+phone+"',`Address`='"+address+"'
					// WHERE 1";
					DbConnect db = new DbConnect();
					db.insertRegister(insertQuery);
					// *******************Clearing Text Field*******************//
					ID_Txt.setText("");
					name_Txt.setText("");
					email_Txt.setText("");
					password_Txt.setText("");
					conPass_Txt.setText("");
				}
			}
		});

		// ..........................Adding all JFrame
		// Components........................//
		add(title_Panel);
//        title_Panel.add(btnBack);
		title_Panel.add(min_Btn);
		title_Panel.add(close_Btn);
		title_Panel.add(title_Label);

		add(input_Panel);
		input_Panel.add(signUp_Label);
		// input_Panel.add(imgTxt_Label);
		input_Panel.add(ID_Label);
		input_Panel.add(ID_Txt);
		input_Panel.add(name_Label);
		input_Panel.add(name_Txt);
		input_Panel.add(email_Label);
		input_Panel.add(email_Txt);
		input_Panel.add(password_Label);
		input_Panel.add(password_Txt);
		input_Panel.add(conPass_Label);
		input_Panel.add(conPass_Txt);
		input_Panel.add(reg_Btn);
		input_Panel.add(login_Btn);
		input_Panel.add(login_Label);

		setVisible(true);
	}

}
