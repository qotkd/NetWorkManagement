package gui;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ButtonCancelListener;
import listener.ButtonRemoveListener;
import listener.ButtonSaveListener;
import manager.PeopleManager;
import people.PeopleInput;

public class PeopleDeleter extends JPanel {

	WindowFrame frame;
	PeopleManager peopleManager;
	
	public PeopleDeleter(WindowFrame frame, PeopleManager peopleManager) {
		this.frame = frame;
		this.peopleManager = peopleManager;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
	
		JButton remove = new JButton("remove");
		JButton cancel = new JButton("cancel");
		panel.add(remove);
		panel.add(cancel);
		remove.addActionListener(new ButtonRemoveListener(frame, fieldName, peopleManager));
		cancel.addActionListener(new ButtonCancelListener(frame));
		
		SpringUtilities.makeCompactGrid(panel,  2, 2, 6, 6, 6, 6);
		
		this.add(panel);
	}
}
