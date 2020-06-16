package gui;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import listener.ButtonCancelListener;
import manager.PeopleManager;
import people.PeopleInput;

public class PeopleViewer extends JPanel{

	WindowFrame frame;
	
	PeopleManager peopleManager;
	
	
	public PeopleViewer(WindowFrame frame, PeopleManager peopleManager) {
		this.frame = frame;
		this.peopleManager = peopleManager;
		peopleManager = getObject("peoplemanager.ser");
		
		System.out.println("***"+peopleManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("BIRTHDAY");
		model.addColumn("PHONE");
		model.addColumn("E-MAIL");
		
		for(int i=0; i<peopleManager.size(); i++) {
			Vector row = new Vector();
			PeopleInput pi = peopleManager.get(i);
			row.add(pi.getName());
			row.add(pi.getBirthday());
			row.add(pi.getPhone());
			row.add(pi.getEmail());
			model.addRow(row);;
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		this.add(panel, BorderLayout.EAST);
		JButton cancel = new JButton("Go Menu");
		panel.add(cancel);
		
		cancel.addActionListener(new ButtonCancelListener(frame));
	}
	public static PeopleManager getObject(String fileName) {
		PeopleManager peopleManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			peopleManager = (PeopleManager) in.readObject();
			
			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return peopleManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return peopleManager;
	}
}
