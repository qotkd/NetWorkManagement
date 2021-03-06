package gui;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonDeleteListener;
import listener.ButtonEditListener;
import listener.ButtonExitListener;
import listener.ButtonViewListener;
import manager.PeopleManager;

public class MenuSelection extends  JPanel{

	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add People");
		JButton button2 = new JButton("Delete People");
		JButton button3 = new JButton("Edit People");
		JButton button4 = new JButton("View People");
		JButton button5 = new JButton("Exit");

		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonDeleteListener(frame));
		button3.addActionListener(new ButtonEditListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button5.addActionListener(new ButtonExitListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);


		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}
}
