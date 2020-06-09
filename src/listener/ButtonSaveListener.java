package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.MenuSelection;
import gui.PeopleViewer;
import gui.WindowFrame;

public class ButtonSaveListener implements ActionListener {

	WindowFrame frame;
	JTextField fieldName;
	JTextField fieldBirth;
	JTextField fieldPhone;
	JTextField fieldEmail;
	
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
		//peoples.setName(fieldName.getText());
		//peoples.setBirth(fieldBirth.getText());
		//peoples.setPhone(fieldPhone.getText());
		//peoples.setEmail(fieldEmail.getText());
		MenuSelection menuselection = new MenuSelection(frame);
		frame.setupPanel(menuselection);
	}

}
