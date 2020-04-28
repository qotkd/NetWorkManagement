package manager;
import java.util.ArrayList;
import java.util.Scanner;

import people.LittleFriendlyPeople;
import people.People;
import people.PeopleKind;
import people.VeryFriendlyPeople;
public class PeopleManager {
	ArrayList<People> peoples = new ArrayList<People>();
	Scanner sc;

	PeopleManager(Scanner sc) {
		this.sc = sc;
	}

	public void addNetWork() {
		People people;
		while(true) {
			System.out.println("** Add Birthday Menu **");
			System.out.println("--Select Kind--");
			System.out.println("1. VeryFriendly");
			System.out.println("2. Friendly");
			System.out.println("3. LittleFriendly");

			int kind = sc.nextInt();

			if (kind == 1) {
				people = new VeryFriendlyPeople(PeopleKind.VeryFriendly);
				people.getUserInput(sc);
				break;
			}
			else if (kind == 2) {
				people = new People(PeopleKind.Friendly);
				people.getUserInput(sc);
				break;
			}

			else if (kind == 3) {
				people = new LittleFriendlyPeople(PeopleKind.LittleFriendly);
				people.getUserInput(sc);
				break;
			}
			else {
				System.out.println("Select 1 - 3");
				continue;
			}
		}
		peoples.add(people);
	}





	public void deleteNetWork() {
		System.out.println("** Delete Birthday Menu **");
		System.out.print("Enter Name : ");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i<peoples.size(); i++) {
			if (name.equals(peoples.get(i).getName() )) {

				index = i;
				break;
			}
		}
		if(index >= 0) {
			peoples.remove(index);
			System.out.println(name +" is deleted!!\n");
		}
		else {
			System.out.println("Not Found");
			return;
		}
	}

	public void editNetWork() {
		System.out.println("** Edit Birthday Menu **");
		System.out.print("Enter Name : ");
		String EN = sc.next();
		for (int i = 0; i<peoples.size(); i++) {
			People people = peoples.get(i);
			if(EN.equals(people.getName())) {


				while(true) {
					System.out.println(" 1. edit Name ");
					System.out.println(" 2. edit Birthday ");
					System.out.println(" 3. edit Phone ");
					System.out.println(" 4. edit Email");
					System.out.println(" 5. Exit");
					int num = sc.nextInt();

					if (num == 1) {
						System.out.print("Enter Name : ");
						String name = sc.next();
						people.setName(name);
					}
					else if (num == 2) {
						System.out.print("Enter Birthday : ");
						String birthday = sc.next();
						people.setBirthday(birthday);
					}
					else if (num == 3) {
						System.out.print("Enter Phone : ");
						String phone = sc.next();
						people.setPhone(phone);
					}
					else if (num == 4) {
						System.out.print("Enter Email : ");
						String email = sc.next();
						people.setEmail(email);
					}
					else if (num == 5)
						break;
					else {
						System.out.println("Please select number from 1 to 5 !!");
						continue;
					}
				}
			}
			break;
		}

	}
	public void viewAllNetWork() {
		System.out.println("The number of People : " + peoples.size() );
		for (int i = 0; i<peoples.size(); i++) {
			peoples.get(i).printInfo();

		}
	}
}
