package people;

import java.util.Scanner;

public class FriendlyPeople extends People {

	public FriendlyPeople(PeopleKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner sc) {
		setPeopleName(sc);
		setPeopleBirthday(sc);
		setPeoplePhone(sc);
		setPeopleEmail(sc);
		wantMoreLess(sc);
	}	
}
