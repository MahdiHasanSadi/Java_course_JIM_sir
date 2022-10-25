import javax.swing.*;
import javax.swing.table.*;

public class MyTable extends JFrame{
	JTable table;
	public MyTable()
	{
		JFrame frame = new JFrame();
	    
	    frame.setSize(600,570);
	    //frame.setUndecorated(true);
	    frame.setDefaultCloseOperation(3);
	    frame.setLocationRelativeTo(null);
	    frame.setResizable(false);
	    
	    Object data[][] = {{1,"Abir",1122},{1,"Hasan",2222},{1,"Wasim",3333},{1,"Wasim",3333},{1,"Wasim",3333},{1,"Wasim",3333}};
	    String columnNames[] = {"Serial","name","id","test"};
	    
	    DefaultTableModel model = new DefaultTableModel(data,columnNames);
	    
	    table = new JTable();
	    
	    add(new JScrollPane(table));
	    
	    frame.setVisible(true);
	}
}
