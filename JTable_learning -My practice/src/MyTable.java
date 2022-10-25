import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JFrame{
	JTable table;
	public MyTable() {
		setSize(500,300);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		
		Object data[][]= {{1,"Abir",1122},{2,"Hasan",2233,"test"},{1,"Wasim",3344},{3,"Wasim",3344}};
		String columnNames[]= {"Serial","Name","id","test"};
		
		DefaultTableModel model = new DefaultTableModel(data,columnNames);
		
		//table = new JTable(data,columnNames);
		table = new JTable(model);
		
		add(new JScrollPane(table));
		
		setVisible(true);
	}
}
