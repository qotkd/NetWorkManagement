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

import gui.MenuSelection;
import gui.WindowFrame;
import manager.PeopleManager;
import people.PeopleInput;

public class ButtonRemoveListener implements ActionListener {

	WindowFrame frame;
	PeopleManager peopleManager;
	JTextField text;
	
	public ButtonRemoveListener(WindowFrame frame, JTextField text, PeopleManager peopleManager) {
		this.frame = frame;
		this.text = text;
		this.peopleManager = peopleManager;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		String name = text.getText();
		System.out.println(name);
		int index = peopleManager.findIndex(name);
		peopleManager.removePeople(index, name);
		putObject(peopleManager,"peopleManager.ser");
		WindowFrame frame = new WindowFrame(peopleManager);
		
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