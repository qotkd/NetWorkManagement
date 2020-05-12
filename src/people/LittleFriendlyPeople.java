package people;

import java.util.Scanner;

public class LittleFriendlyPeople extends People {
	public LittleFriendlyPeople(PeopleKind kind) {
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
