package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import people.FriendlyPeople;
import people.LittleFriendlyPeople;
import people.PeopleInput;
import people.PeopleKind;
import people.VeryFriendlyPeople;
public class PeopleManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9119855603504010733L;
	ArrayList<PeopleInput> peoples = new ArrayList<PeopleInput>();
	transient Scanner sc;

	PeopleManager(Scanner sc) {
		this.sc = sc;
	}

	public void addNetWork() {
		PeopleInput peopleInput;
		while(true) {
			try {
				System.out.println("** Add NetWork Menu **");
				setKind();
				int knum = sc.nextInt();

				switch(knum) {
				case 1:
					peopleInput = new VeryFriendlyPeople(PeopleKind.VeryFriendly);
					peopleInput.getUserInput(sc);
					break;
				case 2:
					peopleInput = new FriendlyPeople(PeopleKind.Friendly);
					peopleInput.getUserInput(sc);
					break;
				case 3:
					peopleInput = new LittleFriendlyPeople(PeopleKind.LittleFriendly);
					peopleInput.getUserInput(sc);
					break;
				default :
					System.out.println("Select 1 - 3");
					continue;
				}
			peoples.add(peopleInput);
			break;
		}
			catch(InputMismatchException e) {
				System.out.println("Please select number from 1 to 3 !!");
				if(sc.hasNext()) {
					sc.next();
				}
			}
		}
	}





	public void deleteNetWork() {
		System.out.println("** Delete NetWork Menu **");
		System.out.print("Enter Name : ");
		String name = sc.next();
		int index = findIndex(name);
		removePeople(index, name);
	}
	
	public int removePeople(int index, String name) {
		if(index >= 0) {
			peoples.remove(index);
			System.out.println(name +" is deleted!!\n");
			return 1;
		}
		else {
			System.out.println("Not Found");
			return -1;
		}
	}
	
	public int findIndex(String name) {
		int index = -1;
		for (int i = 0; i<peoples.size(); i++) {
			if (name.equals(peoples.get(i).getName() )) {

				index = i;
				break;
			}
		}
		return index;
	}

	public void editNetWork() {
		System.out.println("** Edit NetWork Menu **");
		System.out.print("Enter Name : ");
		String EN = sc.next();
		for (int i = 0; i<peoples.size(); i++) {
			PeopleInput people = peoples.get(i);
			if(EN.equals(people.getName())) {

				while(true) {
					try {
						showEditMenu();
						int num = sc.nextInt();

						switch(num) {
						case 1:
							people.setPeopleName(sc);
							break;
						case 2:
							people.setPeopleBirthday(sc);
							break;
						case 3:
							people.setPeoplePhone(sc);
							break;
						case 4:
							people.setPeopleEmail(sc);
							break;
						case 5:
							break;
						default :
							System.out.println("Please select number from 1 to 5 !!");
							continue;
						}
						break;
					} catch (InputMismatchException e) {
						System.out.println("Please select number from 1 to 5 !!");
						if(sc.hasNext()) {
							sc.next();
						}
					}
				}
			}
		}
	}
	public void viewAllNetWork() {
		System.out.println("The number of People : " + peoples.size() );
		for (int i = 0; i<peoples.size(); i++) {
			peoples.get(i).printInfo();

		}
	}
	
	public void setKind() {
		System.out.println("--Select Kind--");
		System.out.println("1. VeryFriendly");
		System.out.println("2. Friendly");
		System.out.println("3. LittleFriendly");
	}
	
	public void showEditMenu() {
		System.out.println(" 1. edit Name ");
		System.out.println(" 2. edit Birthday ");
		System.out.println(" 3. edit Phone ");
		System.out.println(" 4. edit Email");
		System.out.println(" 5. Exit");
	}

	public void setScanner(Scanner sc) {
		this.sc = sc;
	}
}
