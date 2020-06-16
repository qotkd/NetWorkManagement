package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		int index = findIndex(name);
		removePeople(index, name);
		MenuSelection menuselection = new MenuSelection(frame);
		frame.setupPanel(menuselection);
		for(int i=0; i<peopleManager.size();i++) {
			System.out.println(peopleManager.get(i).getName());
		}
	}

	public int removePeople(int index, String name) {
		if(index >= 0) {
			PeopleInput pi = peopleManager.get(index);
			//???????pi.remove(index);
			//지우는 방법을 모르겠습니다.
			System.out.println(name +" is deleted!!\n");
			return 1;
		}
		else {
			System.out.println("Not Found");
			return -1;
		}
	}

	public int findIndex(String name) {
		int index = -1;
		for (int i = 0; i<peopleManager.size(); i++) {
			if (name.equals(peopleManager.get(i).getName() )) {

				index = i;
				break;
			}
		}
		return index;
	}
	public PeopleInput get(int index) {
		return peopleManager.get(index);
	}
	public int size() {
		return peopleManager.size();
	}

}