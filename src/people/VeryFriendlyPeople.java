package people;

import java.util.Scanner;

public class VeryFriendlyPeople extends People {
	
	public VeryFriendlyPeople(PeopleKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner sc) {
		setPeopleName(sc);
		setPeopleBirthday(sc);
		setPeoplePhone(sc);
		setPeopleEmail(sc);
		recievePresents(sc);	
	}	
}

