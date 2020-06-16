package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.MenuSelection;
import gui.PeopleViewer;
import gui.WindowFrame;
import manager.PeopleManager;

public class ButtonExitListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		System.exit(0);
	}

}
