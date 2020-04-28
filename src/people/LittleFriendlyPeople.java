package people;

import java.util.Scanner;

public class LittleFriendlyPeople extends People {
	public LittleFriendlyPeople(PeopleKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner sc) {
		super.getUserInput(sc);
	}
	
	public void printInfo() {
		super.printInfo();
	}
}
