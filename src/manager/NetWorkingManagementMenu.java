package manager;
import java.util.Scanner;

public class NetWorkingManagementMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PeopleManager peopleManager = new PeopleManager(sc) ;

		while (true) {
			System.out.println("** Birthday Management System Menu **");
			System.out.println(" 1. Add Birthday ");
			System.out.println(" 2. Delete Birthday ");
			System.out.println(" 3. Edit Birthday ");
			System.out.println(" 4. View Birthday");
			System.out.println(" 5. Exit ");
			System.out.print(" Select number from 1 to 5 :");
			int number = sc.nextInt();

			if (number == 1)
				peopleManager.addNetWork();
			else if (number == 2)
				peopleManager.deleteNetWork();
			else if (number == 3)
				peopleManager.editNetWork();
			else if (number == 4)
				peopleManager.viewAllNetWork();

			else if (number == 5)
				break;
			else {
				System.out.println("Please select number from 1 to 5 !!");
				continue;
			}
		}
	}
}
	