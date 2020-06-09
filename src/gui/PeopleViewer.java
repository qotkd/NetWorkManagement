package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PeopleViewer extends JPanel{

	WindowFrame frame;
	
	public PeopleViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("BIRTHDAY");
		model.addColumn("PHONE");
		model.addColumn("E-MAIL");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		

	}
}
