package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	PeopleAdder peopleAdder;
	PeopleDeleter peopleDeleter;
	PeopleEditer peopleEditer;
	PeopleViewer peopleviewer;
	
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.peopleAdder = new PeopleAdder(this);
		this.peopleDeleter = new PeopleDeleter(this);
		this.peopleEditer = new PeopleEditer(this);
		this.peopleviewer = new PeopleViewer(this);
		
		this.setSize(500, 300);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.setupPanel(menuselection);
		
		this.setVisible(true);

	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PeopleAdder getPeopleAdder() {
		return peopleAdder;
	}

	public void setPeopleAdder(PeopleAdder peopleAdder) {
		this.peopleAdder = peopleAdder;
	}

	public PeopleDeleter getPeopleDeleter() {
		return peopleDeleter;
	}

	public void setPeopleDeleter(PeopleDeleter peopleDeleter) {
		this.peopleDeleter = peopleDeleter;
	}

	public PeopleEditer getPeopleEditer() {
		return peopleEditer;
	}

	public void setPeopleEditer(PeopleEditer peopleEditer) {
		this.peopleEditer = peopleEditer;
	}

	public PeopleViewer getPeopleviewer() {
		return peopleviewer;
	}

	public void setPeopleviewer(PeopleViewer peopleviewer) {
		this.peopleviewer = peopleviewer;
	}

	
}