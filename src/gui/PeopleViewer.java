package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PeopleViewer extends JFrame{

	public PeopleViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("BIRTHDAY");
		model.addColumn("PHONE");
		model.addColumn("E-MAIL");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setVisible(true);
	}
}
