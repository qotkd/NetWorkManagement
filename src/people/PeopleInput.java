package people;

import java.util.Scanner;

public interface PeopleInput {
	
	public String getName();

	public void getUserInput(Scanner sc);

	public void setName(String name);

	public void setBirthday(String birthday);

	public void setPhone(String phone);

	public void setEmail(String email);

	public void printInfo();
	
	public void setPeopleName(Scanner sc); 
		
	public void setPeopleBirthday(Scanner sc); 
	
	public void setPeoplePhone(Scanner sc); 
		
	public void setPeopleEmail(Scanner sc);
}
