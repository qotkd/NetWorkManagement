package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.MenuSelection;
import gui.PeopleViewer;
import gui.WindowFrame;
import people.PeopleInput;

public class ButtonSaveListener implements ActionListener {

	WindowFrame frame;
	JTextField fieldName;
	JTextField fieldBirth;
	JTextField fieldPhone;
	JTextField fieldEmail;
	ArrayList<PeopleInput> peoples = new ArrayList<PeopleInput>();
	
	public ButtonSaveListener(WindowFrame frame, JTextField fieldName, JTextField fieldBirth, JTextField fieldPhone, JTextField fieldEmail) {
		this.frame = frame;
		this.fieldName = fieldName;
		this.fieldBirth = fieldBirth;
		this.fieldPhone = fieldPhone;
		this.fieldEmail = fieldEmail;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		MenuSelection menuselection = new MenuSelection(frame);
		frame.setupPanel(menuselection);
	}

}
