package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
	public ButtonSaveListener(WindowFrame frame,PeopleManager peopleManager, JTextField fieldName, JTextField fieldBirth, JTextField fieldPhone, JTextField fieldEmail) {
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
		PeopleInput peopleInput = null;
		peopleInput.setName(fieldName.getText());//에러 발생!!!
//		peopleInput.setBirthday(fieldBirth.getText());
//		peopleInput.setPhone(fieldPhone.getText());
//		try {
//			peopleInput.setEmail(fieldEmail.getText());
//		} catch (EmailFormatException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		//peopleManager.add(pi);
		//putObject(peopleManager,"peopleManager.ser");
		WindowFrame windowFrame = new WindowFrame(peopleManager);
	}
	
	public PeopleInput get(int index) {
		return peopleManager.get(index);
	}
	public int size() {
		return peopleManager.size();
	}

	public static void putObject(PeopleManager peopleManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(peopleManager);
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
