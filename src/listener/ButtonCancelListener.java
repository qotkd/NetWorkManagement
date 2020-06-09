package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MenuSelection;
import gui.PeopleViewer;
import gui.WindowFrame;

public class ButtonCancelListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuSelection menuselection = new MenuSelection(frame);
		frame.setupPanel(menuselection);
	}

}
