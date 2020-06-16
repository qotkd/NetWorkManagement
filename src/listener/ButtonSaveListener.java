package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import exception.EmailFormatException;
import gui.MenuSelection;
import gui.PeopleViewer;
import gui.WindowFrame;
import manager.PeopleManager;
import people.PeopleInput;

public class ButtonSaveListener implements ActionListener {

	WindowFrame frame;
	JTextField fieldName;
	JTextField fieldBirth;
	JTextField fieldPhone;
	JTextField fieldEmail;
	PeopleManager peopleManager;
	public ButtonSaveListener(WindowFrame frame, PeopleManager peopleManager, JTextField fieldName, JTextField fieldBirth, JTextField fieldPhone, JTextField fieldEmail) {
		this.frame = frame;
		this.peopleManager = peopleManager;
		this.fieldName = fieldName;
		this.fieldBirth = fieldBirth;
		this.fieldPhone = fieldPhone;
		this.fieldEmail = fieldEmail;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PeopleInput pi = peopleManager.get(peopleManager.size());
		pi.setName(fieldName.getText());
		pi.setBirthday(fieldBirth.getText());
		pi.setPhone(fieldPhone.getText());
		try {
			pi.setEmail(fieldEmail.getText());
		} catch (EmailFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MenuSelection menuselection = new MenuSelection(frame);
		frame.setupPanel(menuselection);
	}
	//뭔가 빠진 것 같은데 뭔지 잘 모르겠습니다.
	
	public PeopleInput get(int index) {
		return peopleManager.get(index);
	}
	public int size() {
		return peopleManager.size();
	}

}
