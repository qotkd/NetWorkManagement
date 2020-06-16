package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.PeopleManager;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	PeopleManager peopleManager;
	PeopleAdder peopleAdder;
	PeopleDeleter peopleDeleter;
	PeopleEditer peopleEditer;
	PeopleViewer peopleviewer;
	
	public WindowFrame(PeopleManager peopleManager) {
		this.menuselection = new MenuSelection(this);
		this.peopleManager = peopleManager;
		
		this.peopleAdder = new PeopleAdder(this, this.peopleManager);
		this.peopleDeleter = new PeopleDeleter(this, this.peopleManager);
		this.peopleEditer = new PeopleEditer(this, this.peopleManager);
		this.peopleviewer = new PeopleViewer(this, this.peopleManager);
		
		this.setSize(500, 500);	
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
