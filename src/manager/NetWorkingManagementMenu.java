package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class NetWorkingManagementMenu {
	static EventLogger Logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PeopleManager peopleManager = getObject("peoplemanager.ser");
		if (peopleManager == null) {
			peopleManager = new PeopleManager(sc);
		}
		else {
			peopleManager.setScanner(sc);
		}

		selectMenu(sc, peopleManager);
		putObject(peopleManager, "peoplemanager.ser");
	}
	
	public static void selectMenu(Scanner sc, PeopleManager peopleManager) {
		int number=-1;
		while (number != 5) {
			try {
				showMenu();
				number = sc.nextInt();
				switch(number) {
				case 1:
					peopleManager.addNetWork();
					Logger.log("add people");
					break;
					
				case 2:
					peopleManager.deleteNetWork();
					Logger.log("delete people");
					
					break;
				case 3:
					peopleManager.editNetWork();
					Logger.log("edit people");

					break;
				case 4:
					peopleManager.viewAllNetWork();
					Logger.log("view people");

					break;
				case 5:
					break;
				default :
					System.out.println("Please select number from 1 to 5 !!");
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please select number from 1 to 5 !!");
				if(sc.hasNext()) {
					sc.next();
				}
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
		System.out.println(" Select number from 1 to 5 :");
	}
	
	public static PeopleManager getObject(String fileName) {
		PeopleManager peopleManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			peopleManager = (PeopleManager) in.readObject();
			
			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return peopleManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return peopleManager;
	}
	
	public static void putObject(PeopleManager peopleManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(peopleManager);
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	