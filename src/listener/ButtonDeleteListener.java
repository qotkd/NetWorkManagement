package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PeopleAdder;
import gui.PeopleDeleter;
import gui.PeopleViewer;
import gui.WindowFrame;

public class ButtonDeleteListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PeopleDeleter deleter = frame.getPeopleDeleter();
		frame.setupPanel(deleter);
	}

}
