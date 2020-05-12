package manager;
import java.util.Scanner;

public class NetWorkingManagementMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PeopleManager peopleManager = new PeopleManager(sc) ;

		while (true) {
			showMenu();
			int number = sc.nextInt();
			switch(number) {
			case 1:
				peopleManager.addNetWork();
				break;
			case 2:
				peopleManager.deleteNetWork();
				break;
			case 3:
				peopleManager.editNetWork();
				break;
			case 4:
				peopleManager.viewAllNetWork();
				break;
			case 5:
				break;
			default :
				System.out.println("Please select number from 1 to 5 !!");
				continue;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("** NetWork Management System Menu **");
		System.out.println(" 1. Add NetWork ");
		System.out.println(" 2. Delete NetWork ");
		System.out.println(" 3. Edit NetWork ");
		System.out.println(" 4. View NetWorks");
		System.out.println(" 5. Exit ");
		System.out.print(" Select number from 1 to 5 :");
	}
}
	