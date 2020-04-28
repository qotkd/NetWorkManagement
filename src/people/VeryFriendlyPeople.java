package people;

import java.util.Scanner;

public class VeryFriendlyPeople extends People {
	
	public VeryFriendlyPeople(PeopleKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner sc) {
		super.getUserInput(sc);
		while(true) {
			System.out.print("Did he/she give me birthday presents?? Anwser (Y/N)");
			char answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				this.tag = "Very important";
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				break;
			}
			else {
				System.out.println("Please answer (Y/N)");
				continue;
			}
		}
		
	}
	public void printInfo() {
		super.printInfo();
	}
		
}

