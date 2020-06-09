package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ButtonCancelListener;
import listener.ButtonSaveListener;

public class PeopleEditer extends JPanel {

	WindowFrame frame;
	
	public PeopleEditer(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelBirth = new JLabel("Birthday : ",JLabel.TRAILING);
		JTextField fieldBirth = new JTextField(10);
		labelBirth.setLabelFor(fieldBirth);
		panel.add(labelBirth);
		panel.add(fieldBirth);
		
		JLabel labelPhone = new JLabel("Phone : ",JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelEmail = new JLabel("Email : ",JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelBirth.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JButton save = new JButton("save");
		JButton cancel = new JButton("cancel");
		panel.add(save);
		panel.add(cancel);

		//save.addActionListener(new ButtonSaveListener(frame, fieldName, fieldBirth, fieldPhone, fieldEmail));
		cancel.addActionListener(new ButtonCancelListener(frame));

		
		SpringUtilities.makeCompactGrid(panel,  5, 2, 6, 6, 6, 6);
	
		
		this.add(panel);
	}
}