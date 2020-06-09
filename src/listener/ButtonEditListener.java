package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PeopleAdder;
import gui.PeopleEditer;
import gui.PeopleViewer;
import gui.WindowFrame;

public class ButtonEditListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PeopleEditer editer = frame.getPeopleEditer();
		frame.setupPanel(editer);
	}

}
